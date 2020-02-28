package com.michael.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


/**
 * 程序入口
 * 需要注意open的使用，如果不加open会报错，
 * 因为Kotlin的类默认是final的，所以这里
 * 需要使用open关键字
 *
 *@author Michael Chu
 *@since 2020-02-28 10:24
 */
@SpringBootApplication
open class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}