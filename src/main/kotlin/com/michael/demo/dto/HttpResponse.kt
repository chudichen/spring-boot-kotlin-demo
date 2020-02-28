package com.michael.demo.dto

import java.io.Serializable


/**
 *@author Michael Chu
 *@since 2020-02-28 10:58
 */
data class HttpResponse<T>(var data : T?): Serializable