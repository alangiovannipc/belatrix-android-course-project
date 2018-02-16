package course.belatrix.com.belatrix_android_course_project

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.timerTask

class SplashActivity : AppCompatActivity() {

    val SPLAS_TIME = 3000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val timer = Timer()
        timer.schedule(timerTask { goToOnboarding() }, 3000)
    }

    fun goToOnboarding() {
        val onboardingIntent = Intent(this, OnboardingActivity::class.java)
        startActivity(onboardingIntent)
    }
}
