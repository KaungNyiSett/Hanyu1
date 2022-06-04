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
fun B1L12(
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
                sentence = "我有三个妹妹。",
                pinyin = "Wǒ yǒusān gè mèimei. ",
                definition = R.string.b1l12s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "李阿姨有一个儿子。",
                pinyin = "Lǐ āyí yǒu yīgè er zi.",
                definition = R.string.b1l12s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "陈叔叔有一个女儿。",
                pinyin = "Chén shūshu yǒu yīgè nǚ\'ér.",
                definition = R.string.b1l12s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "小强有两支笔。",
                pinyin = "Xiǎoqiáng yǒu liǎng zhī bǐ.",
                definition = R.string.b1l12s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华有两本书。",
                pinyin = "Xiǎo huá yǒu liǎng běn shū. ",
                definition = R.string.b1l12s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小明有两个本子。",
                pinyin = "Xiǎomíng yǒu liǎng gè běnzi.",
                definition = R.string.b1l12s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "你有几支笔？",
                pinyin = "Nǐ yǒu jǐ zhī bǐ?",
                definition = R.string.b1l12s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "你有几本书？",
                pinyin = "Nǐ yǒu jǐ běn shū?",
                definition = R.string.b1l12s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "你有几个本子？",
                pinyin = "Nǐ yǒu jǐ gè běnzi?",
                definition = R.string.b1l12s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "我有两本书",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "这是我的书包。我有两本书，四支笔和五个本子。你有几本书？",
                    pinyin = "Zhè shì wǒ de shūbāo. Wǒ yǒu liǎng běn shū, sì zhī bǐ hé wǔ gè běnzi. Nǐ yǒu jǐ běn shū?",
                    definition = R.string.b1l12s10,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
            }else{
                Text(
                    text = "      这是我的书包。我有两本书，四支笔和五个本子。你有几本书？",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB1L12(){
    B1L12(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}