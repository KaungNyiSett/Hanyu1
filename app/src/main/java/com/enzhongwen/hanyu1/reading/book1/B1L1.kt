package com.enzhongwen.hanyu1.reading.book1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
fun B1L1(
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
        Background(darkTheme = darkTheme, horizontalAlignment = Alignment.CenterHorizontally){
            TextGp(
                sentence = "你好!",
                pinyin = "Nǐ hǎo!",
                definition = R.string.b1l1s1,
                onOff = onOff,
                darkTheme = darkTheme,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "谢谢!",
                pinyin = "Xièxiè!",
                definition = R.string.b1l1s2,
                onOff = onOff,
                darkTheme = darkTheme,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "不客气!",
                pinyin = "Bù kèqì!",
                definition = R.string.b1l1s3,
                onOff = onOff,
                darkTheme = darkTheme,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "再见!",
                pinyin = "Zàijiàn!",
                definition = R.string.b1l1s4,
                onOff = onOff,
                darkTheme = darkTheme,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
        Text(
            text = "你好",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme) {
            TextGp(
                sentence = "小华：你好!",
                pinyin = "Xiǎo huá: Nǐ hǎo!",
                definition = R.string.b1l1s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小红：你好!",
                pinyin = "Xiǎo hóng: Nǐ hǎo!",
                definition = R.string.b1l1s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Background(darkTheme = darkTheme) {
            TextGp(
                sentence = "小强，小红：老师好!",
                pinyin = "Xiǎoqiáng, xiǎo hóng: Lǎoshī hǎo!",
                definition = R.string.b1l1s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "老师：同学们好!",
                pinyin = "Lǎoshī: Tóngxuémen hǎo!",
                definition = R.string.b1l1s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Background(darkTheme = darkTheme) {
            TextGp(
                sentence = "小红：谢谢!",
                pinyin = "Xiǎo hóng: Xièxiè!",
                definition = R.string.b1l1s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "老师：不客气!",
                pinyin = "Lǎoshī: Bù kèqì!",
                definition = R.string.b1l1s10,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Background(darkTheme = darkTheme) {
            TextGp(
                sentence = "小华，小红：老师，再见!",
                pinyin = "Xiǎo huá, xiǎo hóng: Lǎoshī, zàijiàn!",
                definition = R.string.b1l1s11,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "老师：再见!",
                pinyin = "Lǎoshī: Zàijiàn!",
                definition = R.string.b1l1s12,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
    }
}

@Preview
@Composable
fun PreviewB1L1() {
    B1L1(onOff = true, darkTheme = true, modifier = Modifier.fillMaxWidth())
}