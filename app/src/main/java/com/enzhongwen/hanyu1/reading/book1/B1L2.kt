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
fun B1L2(
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
                sentence = "我是王小华。",
                pinyin = "Wǒ shì Wáng Xiǎohuá.",
                definition = R.string.b1l2s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "他是我爸爸。",
                pinyin = "Tā shì wǒ bàba.",
                definition = R.string.b1l2s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "她是我妈妈。",
                pinyin = "Tā shì wǒ māmā.",
                definition = R.string.b1l2s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我爱妈妈。",
                pinyin = "Wǒ ài māmā.",
                definition = R.string.b1l2s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "妈妈爱我。",
                pinyin = "Māmā ài wǒ.",
                definition = R.string.b1l2s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我爱爸爸妈妈。",
                pinyin = "Wǒ ài bàba māmā.",
                definition = R.string.b1l2s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "我爱爸爸妈妈",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "我是王小华，他是我爸爸，她是我妈妈，我爱爸爸妈妈。",
                    pinyin = "Wǒ shì Wáng Xiǎohuá, tā shì wǒ bàba, tā shì wǒ māmā, wǒ ài bàba māmā.",
                    definition = R.string.b1l2s7,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
            }else{
                Text(
                    text = "      我是王小华，他是我爸爸，她是我妈妈，我爱爸爸妈妈。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB1L2(){
    B1L2(
        onOff = false,
        darkTheme = false,
        modifier = Modifier
    )
}