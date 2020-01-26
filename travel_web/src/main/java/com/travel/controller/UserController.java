package com.travel.controller;

import com.github.pagehelper.PageInfo;
import com.travel.service.IUserService;
import com.travel.service.domain.Role;
import com.travel.service.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/addRoleToUser.do")
    public String addRoleToUser(@RequestParam (name = "userId",required = true) String userId, @RequestParam(name = "ids",required = true) String[] roleIds) throws Exception {
        userService.addRoleToUser(userId,roleIds);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1") Integer page,
                                @RequestParam(name = "size",required = true,defaultValue = "5") Integer size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<UserInfo> userList = userService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(userList);
        mv.addObject("userlist",pageInfo);
        mv.setViewName("user-list");
        return mv;

    }

    @RequestMapping("/save.do")
    public String save(UserInfo userInfo) throws Exception{
        userService.save(userInfo);
        return "redirect:findAll.do";
    }
    @RequestMapping("/saveFirst.do")
    public ModelAndView saveFirst(UserInfo userInfo) throws Exception{
        ModelAndView mv = new ModelAndView();
        System.out.println("go");
        userService.save(userInfo);
        System.out.println("to");
        mv.setViewName("login");
        return mv;
    }

    @RequestMapping("/findById.do")
    public ModelAndView findById(String id) throws Exception {
        ModelAndView mv = new ModelAndView(id);
        UserInfo userInfo = userService.findById(id);
        mv.addObject("userInfo",userInfo);
        mv.setViewName("user-show");
        return mv;
    }

    @RequestMapping("/findUserByIdAndAllRole.do")
    public ModelAndView findUserByIdAndAllRole(@RequestParam(name="id",required = true) String userId) throws Exception {
        ModelAndView mv = new ModelAndView();
        UserInfo userInfo = userService.findById(userId);
        List<Role> otherRoles = userService.findOtherRoles(userId);
        mv.addObject("user",userInfo);
        mv.addObject("roleList2",otherRoles);
        mv.setViewName("user-role-add");
        return mv;
    }

}
