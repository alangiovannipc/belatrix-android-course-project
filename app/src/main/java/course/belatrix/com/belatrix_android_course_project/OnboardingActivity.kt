package course.belatrix.com.belatrix_android_course_project

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        ui();
    }

    fun ui(){
        btnGoSigIn.setOnClickListener({goToSigIn()})
        btnRegister.setOnClickListener({goToFormRegister()})
    }

    fun goToSigIn() {
        startActivity(Intent(this,SigInActivity::class.java))
    }

    fun goToFormRegister() {
        startActivity(Intent(this,FormRegisterActivity::class.java))
    }
}
