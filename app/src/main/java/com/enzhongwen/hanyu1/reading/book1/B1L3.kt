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
fun B1L3(
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
                sentence = "我是学生。",
                pinyin = "Wǒ shì xuéshēng. ",
                definition = R.string.b1l3s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "爸爸是老师。",
                pinyin = "Bàba shì lǎoshī.",
                definition = R.string.b1l3s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "妈妈是医生。",
                pinyin = "Māmā shì yīshēng.",
                definition = R.string.b1l3s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "叔叔是警察。",
                pinyin = "Shūshu shì jǐngchá.",
                definition = R.string.b1l3s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "你妈妈是老师吗？",
                pinyin = "Nǐ māmā shì lǎoshī ma? ",
                definition = R.string.b1l3s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我妈妈不是老师，她是医生。",
                pinyin = "Wǒ māmā bùshì lǎoshī, tā shì yīshēng.",
                definition = R.string.b1l3s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "你爸爸是医生吗？",
                pinyin = "Nǐ bàba shì yīshēng ma? ",
                definition = R.string.b1l3s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我爸爸不是医生，他是老师。",
                pinyin = "Wǒ bàba bùshì yīshēng, tā shì lǎoshī.",
                definition = R.string.b1l3s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "爸爸是老师",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "爸爸是老师，妈妈是医生，我是学生。弟弟，妹妹是学生吗？他们不是学生。",
                    pinyin = "Bàba shì lǎoshī, māmā shì yīshēng, wǒ shì xuéshēng. Dìdì, mèimei shì xuéshēng ma? Tāmen bùshì xuéshēng.",
                    definition = R.string.b1l3s9,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
            }else{
                Text(
                    text = "      爸爸是老师，妈妈是医生，我是学生。弟弟，妹妹是学生吗？他们不是学生。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB1L3(){
    B1L3(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}