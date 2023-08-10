package con.fire.okcompose.ui.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import con.fire.okcompose.base.OKComponentActivity
import con.fire.okcompose.ui.theme.OkComposeTheme

class OrderDetailActivity : OKComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OkComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    createDetail()
                }

            }
        }
    }

    @Composable
    fun createDetail() {

    }
}