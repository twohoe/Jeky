package id.aej.jeky.ui.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import id.aej.jeky.ui.presentation.component.TextHeader
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().apply {
            setKeepOnScreenCondition{
                runBlocking { delay(5000L) }
                false
            }
        }
        setContent {
            JekyTheme {
               JekyApps()
            }
        }
    }
}

@Composable fun JekyApps() {
    TextHeader(modifier = Modifier.padding(horizontal = 24.dp).padding(top = 44.dp),
        headerText = "Selamat Datang" ,
        supportText = "Masukkan Email dan Password yang pernah kamu buat sebelumnya")
}