package com.travel.controller;

import com.travel.service.ISysLogService;
import com.travel.service.domain.SysLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Date;

@Component
@Aspect
public class LogAop {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ISysLogService sysLogService;

    private Date visitTime;
    private Class clazz;
    private Method exemethod;

    @Before("execution(* com.travel.controller.*.*(..))")
    public void doBefore(JoinPoint jp) throws NoSuchMethodException {
        visitTime=new Date();
        clazz=jp.getTarget().getClass();
        String methodName=jp.getSignature().getName();
        Object[] args = jp.getArgs();
        if(args==null || args.length==0){
            exemethod = clazz.getMethod(methodName);
        }else {
            Class[] classeArgs=new Class[args.length];
            for(int i = 0 ; i < args.length;i++){
                classeArgs[i] = args[i].getClass();
            }
            exemethod = clazz.getMethod(methodName,classeArgs);
        }


    }

    @After("execution(* com.travel.controller.*.*(..))")
    public void doAfter(JoinPoint jp) throws Exception {
        long time = new Date().getTime()-visitTime.getTime();
        String url = "";
        if(clazz!=null && exemethod!=null && clazz != LogAop.class){
            RequestMapping classAnnotation = (RequestMapping)clazz.getAnnotation(RequestMapping.class);
            if(classAnnotation!=null){
                String[] classValue = classAnnotation.value();
                RequestMapping methodAnnotation = exemethod.getAnnotation(RequestMapping.class);
                if(methodAnnotation!=null){
                    String[] methodValue = methodAnnotation.value();
                    url = classValue[0]+methodValue[0];
                    String ip = request.getRemoteAddr();
                    SecurityContext context= SecurityContextHolder.getContext();
                    User user = (User)context.getAuthentication().getPrincipal();
                    String username = user.getUsername();

                    SysLog sysLog=new SysLog();
                    sysLog.setExecutionTime(time);
                    sysLog.setIp(ip);
                    sysLog.setMethod("[Class Name] "+clazz.getName()+" [Method Name] "+exemethod.getName());
                    sysLog.setUrl(url);
                    sysLog.setUsername(username);
                    sysLog.setVisitTime(visitTime);

                    sysLogService.save(sysLog);
                }

            }

        }


    }
}
