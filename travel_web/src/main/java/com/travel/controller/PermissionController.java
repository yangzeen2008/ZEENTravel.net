package com.travel.controller;

import com.github.pagehelper.PageInfo;
import com.travel.service.IPermissionService;
import com.travel.service.IRoleService;
import com.travel.service.domain.Permission;
import com.travel.service.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private IPermissionService permissionService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1") Integer page,
                                @RequestParam(name = "size",required = true,defaultValue = "5") Integer size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Permission> perList = permissionService.findAll(page, size);
        PageInfo pageInfo = new PageInfo(perList);
        mv.addObject("perList",pageInfo);
        mv.setViewName("permission-list");
        return mv;
    }

    @RequestMapping("/save.do")
    public String save(Permission permission) throws Exception{
        permissionService.save(permission);
        return "redirect:findAll.do";
    }
}
