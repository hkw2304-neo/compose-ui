package com.hkw.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {
    // 앱이 시작될 때 Hilt가 모든 설정을 초기화합니다.
}