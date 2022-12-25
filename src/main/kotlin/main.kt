package ru.netology

fun main() {
    val time: Int = 86400                //время не в сети в сeкундах
    var result: String = "давно"
    if (time < 61) result = "только что"
    if (time > 60 && time < 3600) result = agoToTextMinutes(time)
    if (time > 3599 && time < (60 * 60 * 24)) result = agoToTextHours(time)
    if (time > (60 * 60 * 24 - 1) && time < (60 * 60 * 24 * 2)) result = "вчера"
    if (time > (60 * 60 * 24 * 2 - 1) && time < (60 * 60 * 24 * 3)) result = "позавчера"
    println("Был(а) в сети $result")
}

fun agoToTextMinutes(itemSecond: Int): String {
    var result: String = "?"
    val secondToMinute: Int = itemSecond / 60
    when (secondToMinute) {
        1, 21, 31, 41, 51 -> result = "$secondToMinute минуту назад"
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> result = "$secondToMinute минуты назад"
        else -> result = "$secondToMinute минут назад"
    }
    return result
}

fun agoToTextHours(itemSecond: Int): String {
    var result: String = "?"
    val secondToHour: Int = itemSecond / 3600
    when (secondToHour) {
        1, 21 -> result = "$secondToHour час назад"
        2, 3, 4, 22, 23 -> result = "$secondToHour часа назад"
        else -> result = "$secondToHour часов назад"
    }
    return result
}
