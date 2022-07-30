package com.olodyn

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int=0)
    fun setTime( time: KevinTime)= setTime(time.hours)
}