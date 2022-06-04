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
fun B1L8(
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
                sentence = "小华吃早饭。",
                pinyin = "Xiǎo huá chī zǎofàn.",
                definition = R.string.b1l8s1,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华吃午饭。",
                pinyin = "Xiǎo huá chī wǔfàn.",
                definition = R.string.b1l8s2,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华吃晚饭。",
                pinyin = "Xiǎo huá chī wǎnfàn.",
                definition = R.string.b1l8s3,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "早上爸爸吃面条。",
                pinyin = "Zǎoshang bàba chī miàntiáo.",
                definition = R.string.b1l8s4,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "中午妈妈吃饺子。",
                pinyin = "Zhōngwǔ māmā chī jiǎozi.",
                definition = R.string.b1l8s5,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "晚上我们吃米饭。",
                pinyin = "Wǎnshàng wǒmen chī mǐfàn.",
                definition = R.string.b1l8s6,
                onOff = onOff,
                darkTheme = darkTheme
            )
            Space()
            TextGp(
                sentence = "我和妹妹去动物园。",
                pinyin = "Wǒ hé mèimei qù dòngwùyuán.",
                definition = R.string.b1l8s7,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "小华和小强是同学。",
                pinyin = "Xiǎohuá hé Xiǎoqiáng shì tóngxué.",
                definition = R.string.b1l8s8,
                onOff = onOff,
                darkTheme = darkTheme
            )
            if(onOff){
                Space()
            }
            TextGp(
                sentence = "爸爸和妈妈吃早饭。",
                pinyin = "Bàba hé māmā chī zǎofàn.",
                definition = R.string.b1l8s9,
                onOff = onOff,
                darkTheme = darkTheme
            )
        }
        Text(
            text = "我们吃午饭",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            color = textColor
        )
        Background(darkTheme = darkTheme){
            if(onOff){
                TextGp(
                    sentence = "中午，我们吃午饭。我吃面条，小红和小强吃米饭，老师吃饺子。",
                    pinyin = "Zhōngwǔ, wǒmen chī wǔfàn. Wǒ chī miàntiáo, Xiǎohóng hé Xiǎoqiáng chī mǐfàn, lǎoshī chī jiǎozi.",
                    definition = R.string.b1l8s10,
                    onOff = onOff,
                    darkTheme = darkTheme
                )
                Space()
            }else{
                Text(
                    text = "      中午，我们吃午饭。我吃面条，小红和小强吃米饭，老师吃饺子。",
                    color = textColor,
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewB1L8(){
    B1L8(
        onOff = true,
        darkTheme = false,
        modifier = Modifier
    )
}