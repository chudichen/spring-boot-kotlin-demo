package com.michael.demo.service.impl

import com.michael.demo.domain.User
import com.michael.demo.service.IUserService
import org.springframework.stereotype.Service


/**
 *@author Michael Chu
 *@since 2020-02-28 10:35
 */
@Service
class UserServiceImpl : IUserService {

    private val userMap = mutableMapOf<String, User>()

    override fun getUser(userName: String): User? {
        return userMap[userName]
    }

    override fun createUser(userName: String, password: String) {
        userMap[userName] = User(userName, password)
    }

}