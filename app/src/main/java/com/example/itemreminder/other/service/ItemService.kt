package com.example.itemreminder.other.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.itemreminder.other.managers.NotificationsManager
import kotlin.concurrent.thread

class ItemService: Service() {

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val notification = NotificationsManager.serviceNotification(this)
        startForeground(1, notification)
        startService()
        return super.onStartCommand(intent, flags, startId)
    }

    private fun startService() {
        thread (start = true) {
            while (true) {
                Thread.sleep(5000)
            }
        }
    }
}