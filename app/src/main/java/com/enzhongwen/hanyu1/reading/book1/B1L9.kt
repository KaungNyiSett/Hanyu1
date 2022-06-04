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
fun B1L9(
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
                sentence = "他是谁？",
                pinyin = "Tā shì shéi?",
                definition = R.string.b1l9s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "他是我哥哥。",
                pinyin = "Tā shì wǒ gēgē.",
                definition = R.string.b1l9s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "小华打球。",
                pinyin = "Xiǎo huá dǎqiú.",
                definition = R.string.b1l9s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华打篮球。",
                pinyin = "Xiǎo huá dǎ lánqiú.",
                definition = R.string.b1l9s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "哥哥不打排球。",
                pinyin = "Gēgē bù dǎ páiqiú. ",
                definition = R.string.b1l9s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "姐姐不踢足球。",
                pinyin = "Jiějiě bù tī zúqiú.",
                definition = R.string.b1l9s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "小华打球",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "下课了，同学们打篮球，踢足球。我和小强打乒乓球。小华不打球，她跳绳。",
                    pinyin = "Xiàkèle, tóngxuémen dǎ lánqiú, tī zúqiú. Wǒ hé xiǎoqiáng dǎ pīngpāng qiú. Xiǎo huá bù dǎqiú, tā tiàoshéng.",
                    definition = R.string.b1l9s7,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
            }else{
                Text(
                    text = "      下课了，同学们打篮球，踢足球。我和小强打乒乓球。小华不打球，她跳绳。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB1L9(){
    B1L9(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}