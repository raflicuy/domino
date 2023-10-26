package com.example.domi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.domi.ui.theme.DomiTheme
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DomiTheme {
                DomiApp()
            }
        }
    }
}

@Preview
@Composable
fun DomiApp() {
    DomiWithButtonAndImage(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun DomiWithButtonAndImage(modifier: Modifier = Modifier) {
    var result by remember {
        mutableStateOf(1)

    }
    val imageResource = when (result) {
        1 -> R.drawable._0
        2 -> R.drawable._1
        3 -> R.drawable._2
        4 -> R.drawable._3
        5 -> R.drawable._4
        6 -> R.drawable._5
        7 -> R.drawable._7
        8 -> R.drawable._8
        9 -> R.drawable._9
        10 -> R.drawable._10
        11 -> R.drawable._11
        12 -> R.drawable._12
        13 -> R.drawable._13
        14 -> R.drawable._14
        15 -> R.drawable._15
        16 -> R.drawable._16
        17 -> R.drawable._17
        18 -> R.drawable._18
        19 -> R.drawable._19
        20 -> R.drawable._20
        21 -> R.drawable._21
        22 -> R.drawable._22
        23 -> R.drawable._23
        24 -> R.drawable._24
        25 -> R.drawable._25
        26-> R.drawable._26
        else -> R.drawable._27
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = painterResource(id = imageResource),contentDescription = result.toString())
        Button(onClick = { result = (1..27).random() }) {
            Spacer(modifier = Modifier.height(4.dp))
            Text(stringResource(R.string.shuffle))
        }
    }

}
