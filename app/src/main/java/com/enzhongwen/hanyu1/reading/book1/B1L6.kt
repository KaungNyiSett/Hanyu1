package com.enzhongwen.hanyu1.reading.book1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.enzhongwen.hanyu1.R
import com.enzhongwen.hanyu1.reading.Background
import com.enzhongwen.hanyu1.reading.Space
import com.enzhongwen.hanyu1.reading.TextGp


@Composable
fun B1L6(
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
            text = stringResource(id = R.string.sentences),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            TextGp(
                sentence = "小华去哪儿？",
                pinyin = "Xiǎo huá qù nǎ\'er?",
                definition = R.string.b1l6s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华去学校。",
                pinyin = "Xiǎo huá qù xuéxiào. ",
                definition = R.string.b1l6s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "小强去厕所。",
                pinyin = "Xiǎoqiáng qù cèsuǒ.",
                definition = R.string.b1l6s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "陈老师去教室。",
                pinyin = "Chén lǎoshī qù jiàoshì.",
                definition = R.string.b1l6s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "爷爷去公园。",
                pinyin = "Yéyé qù gōngyuán.",
                definition = R.string.b1l6s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "哥哥去学校",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "妈妈是医生，早上她去医院。我去幼儿园。哥哥去哪儿？他是学生，他去学校。",
                    pinyin = "Māmā shì yīshēng, zǎoshang tā qù yīyuàn. Wǒ qù yòu'éryuán. Gēgē qù nǎ\'er? Tā shì xuéshēng, tā qù xuéxiào.",
                    definition = R.string.b1l6s6,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
            }else{
                Text(
                    text = "      妈妈是医生，早上她去医院。我去幼儿园。哥哥去哪儿？他是学生，他去学校。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB1L6(){
    B1L6(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}