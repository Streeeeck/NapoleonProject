package com.example.napoleonproject

import java.io.Serializable


data class OneNews(val date: String, val res: String, val head: String, val text: String){

    override fun toString(): String {
        return "$date $res $head"
    }
} //:Serializable