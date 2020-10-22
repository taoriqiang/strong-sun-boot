package org.example.handler;

import org.example.models.UserForm;
import org.example.service.DomeTwoService;
import org.example.service.impl.Dome2Impl;
import strong.sun.framework.annotation.Handler;
import strong.sun.framework.annotation.Inject;
import strong.sun.framework.annotation.PathMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author riqiang.tao
 * @date 10/13/2020 2:08 PM
 */

@Handler
@PathMapping(value = "/dome")
public class DomeHandler {

    @Inject
    private Dome2Impl domeOneService;


    @PathMapping(value = "/test")
    public UserForm dome(HttpServletRequest request, HttpServletResponse response, UserForm userForm) throws IOException {
        domeOneService.Dome2();
        System.out.println("--------" + userForm.getUserName());
        return userForm;
    }


    @PathMapping(value = "/test2")
    public UserForm dome2(UserForm userForm) throws IOException {
        System.out.println("--------2" + userForm.getUserName());
        return userForm;
    }
}
