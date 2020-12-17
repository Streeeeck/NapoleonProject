package com.example.napoleonproject

import java.io.Serializable


data class OneNews(
    val date: String,
    val res: String,
    val head: String,
    val text: String,
    var checked : Boolean = false

) : Serializable
{

    override fun toString(): String {
        return if (checked) "$date $res $head $checked"
        else "$date $res $head "
    }
}