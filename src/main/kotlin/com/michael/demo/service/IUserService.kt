package com.michael.demo.service

import com.michael.demo.domain.User


/**
 * 用户接口
 *
 *@author Michael Chu
 *@since 2020-02-28 10:32
 */
interface IUserService {

    fun getUser(userName: String): User?

    fun createUser(userName: String, password: String)
}