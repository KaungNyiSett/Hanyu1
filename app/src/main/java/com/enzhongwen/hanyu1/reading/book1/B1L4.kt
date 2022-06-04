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
fun B1L4(
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
                sentence = "你姓什么？我姓王。",
                pinyin = "Nǐ xìng shénme? Wǒ xìng Wáng.",
                definition = R.string.b1l4s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "他姓什么？他姓张。",
                pinyin = "Tā xìng shénme? Tā xìng zhāng.",
                definition = R.string.b1l4s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "老师姓什么？老师姓陈。",
                pinyin = "Lǎoshī xìng shénme? Lǎoshī xìng chén.",
                definition = R.string.b1l4s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "你叫什么名字？",
                pinyin = "Nǐ jiào shénme míngzì?",
                definition = R.string.b1l4s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我叫王小明。",
                pinyin = "Wǒ jiào Wáng Xiǎomíng.",
                definition = R.string.b1l4s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "你哥哥叫什么名字？",
                pinyin = "Nǐ gēgē jiào shénme míngzì? ",
                definition = R.string.b1l4s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "他叫王小华。",
                pinyin = "Tā jiào Wáng Xiǎohuá.",
                definition = R.string.b1l4s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "你姐姐叫什么名字？",
                pinyin = "Nǐ jiějiě jiào shénme míngzì?",
                definition = R.string.b1l4s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "她叫李小玲。",
                pinyin = "Tā jiào Lǐ Xiǎolíng.",
                definition = R.string.b1l4s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "你叫什么名字",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "我姓王，叫王小华。我弟弟叫王小明，我妹妹叫王小丽。",
                    pinyin = "Wǒ xìng Wáng, jiào Wáng Xiǎohuá. Wǒ dìdì jiào Wáng Xiǎomíng, wǒ mèimei jiào Wáng Xiǎolì.",
                    definition = R.string.b1l4s10,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
            }else{
                Text(
                    text = "      我姓王，叫王小华。我弟弟叫王小明，我妹妹叫王小丽。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB1L4(){
    B1L4(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}