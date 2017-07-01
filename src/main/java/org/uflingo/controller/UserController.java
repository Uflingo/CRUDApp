package org.uflingo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;
import org.uflingo.model.User;
import org.uflingo.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public ModelAndView listUser(ModelAndView model){
        List<User> listUser = userService.getAllUsers();
        model.addObject("listUser",listUser);
        model.setViewName("home");
        return model;
    }

    @RequestMapping(value = "/newUser", method = RequestMethod.GET)
    public ModelAndView newUser(ModelAndView model){
        User user = new User();
        model.addObject("user", user);
        model.setViewName("UserForm");
        return model;
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public ModelAndView saveUser(@ModelAttribute User user){
        if (user.getId() == 0)
            userService.addUser(user);
        else
            userService.updateUser(user);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public ModelAndView deleteUser(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        userService.deleteUser(userId);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/editUser", method = RequestMethod.GET)
    public ModelAndView editUser(HttpServletRequest request){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUser(userId);
        ModelAndView model = new ModelAndView("UserForm");
        model.addObject("user",user);
        return model;
    }



}
