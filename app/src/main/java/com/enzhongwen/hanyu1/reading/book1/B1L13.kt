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
fun B1L13(
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
                sentence = "我有一台电脑。",
                pinyin = "Wǒ yǒuyī tái diànnǎo.",
                definition = R.string.b1l13s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我有一张照片。",
                pinyin = "Wǒ yǒuyī zhāng zhàopiàn. ",
                definition = R.string.b1l13s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "我没有自行车。",
                pinyin = "Wǒ méiyǒu zìxíngchē.",
                definition = R.string.b1l13s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "我没有字典。",
                pinyin = "Wǒ méiyǒu zìdiǎn.",
                definition = R.string.b1l13s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "小强有电脑吗？",
                pinyin = "Xiǎoqiáng yǒu diànnǎo ma?",
                definition = R.string.b1l13s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小丽有伞吗？",
                pinyin = "Xiǎo lì yǒu sǎn ma?",
                definition = R.string.b1l13s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "你有没有哥哥？",
                pinyin = "Nǐ yǒu méiyǒu gēgē?",
                definition = R.string.b1l13s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "你们学校有没有食堂？",
                pinyin = "Nǐmen xuéxiào yǒu méiyǒu shítáng?",
                definition = R.string.b1l13s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "你家有电脑吗",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "我家有两台电脑。爸爸有一台，哥哥有一台，我没有电脑。你家有电脑吗？",
                    pinyin = "Wǒjiā yǒu liǎng tái diànnǎo. Bàba yǒuyī tái, gēgē yǒuyī tái, wǒ méiyǒu diànnǎo. Nǐ jiā yǒu diànnǎo ma?",
                    definition = R.string.b1l13s9,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
            }else{
                Text(
                    text = "      我家有两台电脑。爸爸有一台，哥哥有一台，我没有电脑。你家有电脑吗？",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB1L13(){
    B1L13(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}