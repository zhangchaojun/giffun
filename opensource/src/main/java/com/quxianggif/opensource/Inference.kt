package com.quxianggif.opensource

fun main(args: Array<String>) {
    println("hello world")
    /**
     * 智能类型推断,自动推断类型和内存多少
     */
    //冒号可以指定数据类型
    var i:Int = 8
//    i = 99999999999

    var j:Long = 9999999999999

    var s = "haha"

    var a:Int


    val ss="niubi"
    //二进制
    val aInt = 0b11
    //十六进制
    val bInt = 0x1f
    println(aInt)
    println(bInt)


    println(diaryGenerator("皇宫"))
    println(diaryGenerator("天安门"))
}

fun diaryGenerator(placeName:String):String{
    return """
        今天我们去${placeName}玩，首先映入眼帘的是${placeName}${placeName.length}个鎏金大字。
    """.trimIndent()

}