package com.example.napoleonproject

class News {
    var arrayOfNews : MutableList<OneNews> = mutableListOf()



    fun MutableList<OneNews>.sorting(bySort : String){
        when (bySort) {
            "date" -> arrayOfNews.sortBy { it.date }
            "res" -> arrayOfNews.sortBy { it.res }
            "head" -> arrayOfNews.sortBy{ it.head }
        }
    }
    fun addNews(_news: OneNews){
        _news.date
        arrayOfNews.add(_news)
    }
    fun addNews(_date:String, _res: String, _head: String, _text: String){
        arrayOfNews.add(OneNews(_date,_res,_head,_text))
    }

    fun Testinit(){
        addNews("2020.03.02", "Р1", "Кликбайтовые заголовки запрещены", "Сегодня в госдуме прошло 3 слушанье на котором одобрили закон о запрете кликбайтовых заголовков")
        addNews(OneNews("2020.02.02", "РИА", "Всем выплатят пособие в 1000$", "Всем выплатят пособие в 1000$, но не в России "))
        arrayOfNews.sorting("date")

    }
    fun lastNews(): OneNews{
        val tmp = arrayOfNews
        tmp.sorting("date")
        return tmp[tmp.size-1]
    }
    fun searchByString(ob: OneNews): Int {
        return arrayOfNews.indexOf(ob)
    }

    override fun toString(): String {
        var str = ""
        //return super.toString()
        for (i in arrayOfNews){
            str += i.toString() +"\n"
        }
        return str
    }


}