package con.fire.okcompose.ui.view

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import con.fire.okcompose.base.OKComponentActivity
import con.fire.okcompose.ui.theme.OkComposeTheme

//o基础 https://mp.weixin.qq.com/s/G8cNMJXZJpEpxyEzQE2s1g
//【文末有惊喜！】Jetpack Compose布局优化实践  https://mp.weixin.qq.com/s/udysT9h84ZgXd8pOIbgnzw
//Compose自定义布局的使用 https://mp.weixin.qq.com/s/_K5y35bq2aNEfTocE5ZnLg
//Compose 1.5 发布，性能大幅提升？ https://mp.weixin.qq.com/s/607ClCLEQqFayKtBjLoi2A
class MainActivity : OKComponentActivity() {
    var TAG: String = "Ma2in"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OkComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("ok")
                    greeting1(name = "VSL")
//                    Counter()
                    var number by remember {
                        mutableStateOf(0)
                    }
                    Column() {
                        CounterAdd(number, onClickValue = {
                            number++
                        })
                        CounterAdd(number, onClickValue = {
                            number += 10
                        })
                        greeting1(name = "li12")
                    }
                }
            }
        }
    }
}

@Composable
fun greeting1(name: String) {
    Column() {
        Text(text = "helll $name")
        Text(text = "first Compose De,",
            modifier = Modifier
                .padding(10.dp)
                .background(Color.Red)
                .clickable {

                })
    }

}


@Preview(showBackground = true)
@Composable
fun Greeting(name: String) {
//    Row() {
//        Text(text = "ok compose$name!")
//        Text(text = "First Compose Demo",
//            modifier = Modifier
//                .padding(10.dp)
//                .background(Color.Red)
//                .clickable {
//                    Log.d("okhttp", "1")
//                })R
//    }

//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        for (i in 0..20) {
//            more("第$i 个")
//        }
//    }


//    LazyColumn(content = {
//        item {
//            for (i in 0..100) {
//                more(title = "$i")
//            }
//        }
//    })

//    LazyColumn() {
//        items(items = getData()) { data ->
//            more(title = data)
//        }
//    }
//    Counter()
}


@Composable
fun CounterAdd(number: Int, onClickValue: () -> Unit) {

    Column() {
        Text(text = "当前数值:$number")
        Button(onClick = onClickValue) {
            Text(text = "add")
        }
    }
}

@Composable
fun Counter() {
    var number by remember {
        mutableStateOf(100)
    }
    Column() {
        Text(text = "当前数值：$number")
        Button(onClick = {
            number++
            Log.d("okhttp", "" + number)
        }) {
            Text(text = "add")
        }
    }
}


fun getData(): List<String> {
    return List(20) { " 第${it}个数据" }
}

@Composable
fun more(title: String) {
    Row(
        modifier = Modifier
            .background(Color.Gray)
            .padding(10.dp)
    ) {
        Text(text = "------习吧", fontSize = 16.sp, color = Color.Yellow)
        Button(onClick = {

        }) {
            Text(text = "点击详情$title")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    OkComposeTheme {
        Greeting("Android")
    }
}