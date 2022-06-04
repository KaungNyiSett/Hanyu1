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
fun B1L14(
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
                sentence = "书在桌子上。",
                pinyin = "Shū zài zhuōzi shàng.",
                definition = R.string.b1l14s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "书在椅子上。",
                pinyin = "Shū zài yǐzi shàng.",
                definition = R.string.b1l14s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "书在书架上。",
                pinyin = "Shū zài shūjià shàng.",
                definition = R.string.b1l14s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "篮球在椅子下边。",
                pinyin = "Lánqiú zài yǐzi xiàbian.",
                definition = R.string.b1l14s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "本子在字典下边。",
                pinyin = "Běnzi zài zìdiǎn xiàbian.",
                definition = R.string.b1l14s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "书包在桌子下边。",
                pinyin = "Shūbāo zài zhuōzi xiàbian.",
                definition = R.string.b1l14s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "教室在图书馆左边。",
                pinyin = "Jiàoshì zài túshū guǎn zuǒbiān.",
                definition = R.string.b1l14s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "图书馆在教室右边。",
                pinyin = "Túshū guǎn zài jiàoshì yòubiān. ",
                definition = R.string.b1l14s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "妹妹在妈妈的左边。",
                pinyin = "Mèimei zài māmā de zuǒbiān.",
                definition = R.string.b1l14s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "弟弟在妈妈的右边。",
                pinyin = "Dìdì zài māmā de yòubiān.",
                definition = R.string.b1l14s10,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "书在书架上",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "我们学校有一个图书馆。",
                    pinyin = "Wǒmen xuéxiào yǒu yīgè túshū guǎn.",
                    definition = R.string.b1l14s11,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "图书馆在教室的右边。",
                    pinyin = "Túshū guǎn zài jiàoshì de yòubiān.",
                    definition = R.string.b1l14s12,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "图书馆的书在哪儿？",
                    pinyin = "Túshū guǎn de shū zài nǎ'er? ",
                    definition = R.string.b1l14s13,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
                TextGp(
                    sentence = "书在书架上。",
                    pinyin = "Shū zài shūjià shàng.",
                    definition = R.string.b1l14s14,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
            }else{
                Text(
                    text = "      我们学校有一个图书馆。图书馆在教室的右边。图书馆的书在哪儿？书在书架上。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB1L14(){
    B1L14(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}