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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.enzhongwen.hanyu1.R
import com.enzhongwen.hanyu1.reading.Background
import com.enzhongwen.hanyu1.reading.Space
import com.enzhongwen.hanyu1.reading.TextGp


@Composable
fun B1L5(
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
            text = "我爱我家",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme) {
            if (onOff) {
                TextGp(
                    sentence = "这是我家，我爱爸爸，我爱妈妈，我爱我家。",
                    pinyin = "Zhè shì wǒjiā, wǒ ài bàba, wǒ ài māmā, wǒ ài wǒjiā.",
                    definition = R.string.b1l5s1,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
            } else {
                Text(
                    text = "      这是我家，我爱爸爸，我爱妈妈，我爱我家。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
        Background(darkTheme = darkTheme){
            TextGp(
                sentence = "王小华：你好！",
                pinyin = "Wáng Xiǎohuá: Nǐ hǎo!",
                definition = R.string.b1l5s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "张小强：你好！",
                pinyin = "Zhāng Xiǎoqiáng: Nǐ hǎo!",
                definition = R.string.b1l5s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "王小华：我是王小华，你呢？",
                pinyin = "Wáng Xiǎohuá: Wǒ shì Wáng Xiǎohuá, nǐ ne?",
                definition = R.string.b1l5s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "张小强：我叫张小强。",
                pinyin = "Zhāng Xiǎoqiáng: Wǒ jiào Zhāng Xiǎoqiáng.",
                definition = R.string.b1l5s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "王小华：脏-----小-----强？",
                pinyin = "Wáng Xiǎohuá: Zāng-----xiǎo-----qiáng?",
                definition = R.string.b1l5s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "张小强：我姓张，我不脏。",
                pinyin = "Zhāng Xiǎoqiáng: Wǒ xìng zhāng, wǒ bù zāng.",
                definition = R.string.b1l5s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "王小华：哦，对不起，张小强。",
                pinyin = "Wáng Xiǎohuá: Ó, duìbùqǐ, Zhāng Xiǎoqiáng.",
                definition = R.string.b1l5s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "张小强：没关系！",
                pinyin = "Zhāng Xiǎoqiáng: Méiguānxì!",
                definition = R.string.b1l5s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
    }
}

@Preview
@Composable
fun PreviewB1L5(){
    B1L5(
        onOff = false,
        darkTheme = false,
        modifier = Modifier
    )
}