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
fun B1L11(
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
                sentence = "这是我的书。",
                pinyin = "Zhè shì wǒ de shū.",
                definition = R.string.b1l11s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "这是小强的笔。",
                pinyin = "Zhè shì xiǎoqiáng de bǐ.",
                definition = R.string.b1l11s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "这是妹妹的玩具。",
                pinyin = "Zhè shì mèimei de wánjù.",
                definition = R.string.b1l11s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "那是谁的书包？",
                pinyin = "Nà shì shéi de shūbāo? ",
                definition = R.string.b1l11s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "那是谁的本子？",
                pinyin = "Nà shì shéi de běnzi?",
                definition = R.string.b1l11s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "那是谁的尺子？",
                pinyin = "Nà shì shéi de chǐzi?",
                definition = R.string.b1l11s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "她是谁的奶奶？",
                pinyin = "Tā shì shéi de nǎinai?",
                definition = R.string.b1l11s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "她是小丽的奶奶。",
                pinyin = "Tā shì xiǎo lì de nǎinai.",
                definition = R.string.b1l11s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "这是我的书",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "这是我的书，那是我同桌的书。这是小强的书包。那是谁的书包？那是小华的书包。",
                    pinyin = "Zhè shì wǒ de shū, nà shì wǒ tóng zhuō de shū. Zhè shì xiǎoqiáng de shūbāo. Nà shì shéi de shūbāo? Nà shì xiǎo huá de shūbāo.",
                    definition = R.string.b1l11s9,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
            }else{
                Text(
                    text = "      这是我的书，那是我同桌的书。这是小强的书包。那是谁的书包？那是小华的书包。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB1L11(){
    B1L11(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}