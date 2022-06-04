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
fun B1L10(
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
            text = "我的一天",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "早上我去学校。上课了，老师讲课，我们听课。下课了，我和同学们做游戏。放学了，我回家做作业。",
                    pinyin = "Zǎoshang wǒ qù xuéxiào. Shàngkèle, lǎoshī jiǎngkè, wǒmen tīngkè. Xiàkèle, wǒ hé tóngxuémen zuò yóuxì. Fàngxuéle, wǒ huí jiā zuò zuo yè.",
                    definition = R.string.b1l10s1,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
            }else{
                Text(
                    text = "      早上我去学校。上课了，老师讲课，我们听课。下课了，我和同学们做游戏。放学了，我回家做作业。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
        Background(darkTheme = darkTheme){
            TextGp(
                sentence = "张小强：他是谁？",
                pinyin = "Zhāngxiǎoqiáng: Tā shì shéi?",
                definition = R.string.b1l10s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "王小华：他是我爸爸。",
                pinyin = "Wángxiǎohuá: Tā shì wǒ bàba.",
                definition = R.string.b1l10s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "张小强：他吃什么？",
                pinyin = "Zhāngxiǎoqiáng: Tā chī shénme?",
                definition = R.string.b1l10s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "王小华：他吃面包。",
                pinyin = "Wángxiǎohuá: Tā chī miànbāo.",
                definition = R.string.b1l10s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "张小强：他去哪儿？",
                pinyin = "Zhāngxiǎoqiáng: Tā qù nǎ'er?",
                definition = R.string.b1l10s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "王小华：他去学校。",
                pinyin = "Wángxiǎohuá: Tā qù xuéxiào.",
                definition = R.string.b1l10s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "张小强：他和谁打篮球？",
                pinyin = "Zhāngxiǎoqiáng: Tā hé shéi dǎ lánqiú? ",
                definition = R.string.b1l10s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "王小华：他和哥哥打篮球。",
                pinyin = "Wángxiǎohuá: Tā hé gēgē dǎ lánqiú.",
                definition = R.string.b1l10s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
    }
}

@Preview
@Composable
fun PreviewB1L10(){
    B1L10(
        onOff = false,
        darkTheme = false,
        modifier = Modifier
    )
}