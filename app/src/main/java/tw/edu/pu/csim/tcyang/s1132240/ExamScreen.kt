package tw.edu.pu.csim.tcyang.s1132240

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ExamScreen(screenWidth: Float, screenHeight: Float) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // 圖片
        Image(
            painter = painterResource(id = R.drawable.happy),
            contentDescription = "happy",
            modifier = Modifier.size(200.dp)
        )

        // 文字（姓名）
        Text(text = "瑪利亞基金會服務大考驗", fontSize = 20.sp, color = Color.Black)

        Text(text = "作者:資管二A 王鐸蓁", fontSize = 20.sp, color = Color.Black)

        Text("螢幕大小: ${screenWidth} * ${screenHeight}", fontSize = 20.sp, color = Color.Black)

        Text(text = "成績:0分", fontSize = 20.sp, color = Color.Black)

    }
}

@Composable
fun Main(modifier: Modifier = Modifier) {
    Column {

    }
}
