package com.michael.demo.controller

import com.michael.demo.domain.User
import com.michael.demo.dto.HttpResponse
import com.michael.demo.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.xml.ws.Service


/**
 * 控制器
 *
 *@author Michael Chu
 *@since 2020-02-28 10:54
 */
@RestController
@RequestMapping("/user/")
class UserController {

    @Autowired
    lateinit var userService: IUserService

    @GetMapping("getUser")
    fun getUser(@RequestParam("name") userName: String): HttpResponse<User> {
        return HttpResponse(userService.getUser(userName))
    }
}