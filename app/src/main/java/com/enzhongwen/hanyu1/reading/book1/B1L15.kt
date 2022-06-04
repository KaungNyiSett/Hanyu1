package com.enzhongwen.hanyu1.reading.book1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.enzhongwen.hanyu1.R
import com.enzhongwen.hanyu1.ToAnotherApp
import com.enzhongwen.hanyu1.reading.Background
import com.enzhongwen.hanyu1.reading.Space
import com.enzhongwen.hanyu1.reading.TextGp


@Composable
fun B1L15(
    onOff: Boolean,
    darkTheme: Boolean,
    modifier: Modifier,
){
    val textColor = if (darkTheme) {
        Color.White
    } else {
        Color.Black
    }
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(
                state = scrollState
            )
            .background(
                color = if (darkTheme) {
                    Color.Black
                } else {
                    Color.White
                }
            ),
    ) {
        Text(
            text = "我的房间",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "这是我的房间，这儿有一张床，一个书架，一个衣柜，两张桌子和两把椅子。",
                    pinyin = "Zhè shì wǒ de fángjiān, zhè'er yǒuyī zhāng chuáng, yīgè shūjià, yīgè yīguì, liǎng zhāng zhuōzi hé liǎng bǎ yǐzi.",
                    definition = R.string.b1l15s1,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "我的电脑在桌子上边，足球在圆桌下边。",
                    pinyin = "Wǒ de diànnǎo zài zhuōzi shàngbian, zúqiú zài yuánzhuō xiàbian.",
                    definition = R.string.b1l15s2,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      这是我的房间，这儿有一张床，一个书架，一个衣柜，两张桌子和两把椅子。我的电脑在桌子上边，足球在圆桌下边。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }

        Text(
            text = stringResource(id = R.string.levelAdd),
            modifier = Modifier.padding(horizontal = 10.dp)
        )

        ToAnotherApp(darkTheme = darkTheme)
    }
}

@Preview
@Composable
fun PreviewB1L15(){
    B1L15(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}