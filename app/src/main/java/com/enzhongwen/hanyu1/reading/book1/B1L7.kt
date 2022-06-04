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
fun B1L7(
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
                sentence = "我们上课。",
                pinyin = "Wǒmen shàngkè.",
                definition = R.string.b1l7s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "老师讲课。",
                pinyin = " Lǎoshī jiǎngkè.",
                definition =  R.string.b1l7s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "同学们听课。",
                pinyin = "Tóngxuémen tīngkè.",
                definition =  R.string.b1l7s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "我们去操场吧。",
                pinyin = "Wǒmen qù cāochǎng ba. ",
                definition = R.string.b1l7s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我们去动物园吧。",
                pinyin = "Wǒmen qù dòngwùyuán ba.",
                definition = R.string.b1l7s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我们上课吧。",
                pinyin = "Wǒmen shàngkè ba.",
                definition = R.string.b1l7s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "我们上课吧",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "上课了,我们进教室吧!老师讲,我们听。老师问,我们回答。",
                    pinyin = "Shàngkèle, wǒmen jìn jiàoshì ba! Lǎoshī jiǎng, wǒmen tīng. Lǎoshī wèn, wǒmen huídá.",
                    definition = R.string.b1l7s7,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
            }else{
                Text(
                    text = "      上课了,我们进教室吧!老师讲,我们听。老师问,我们回答。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB1L7(){
    B1L7(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}