package com.example.myfirsttest.presenter

import io.reactivex.Scheduler

interface SchedulerProvider {
    fun ui():Scheduler
    fun io():Scheduler
}