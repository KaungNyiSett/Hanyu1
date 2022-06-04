package com.enzhongwen.hanyu1

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.enzhongwen.hanyu1.ui.theme.BlueLight
import com.enzhongwen.hanyu1.ui.theme.CustomYellow

@Composable
fun LessonItems(
    lesson: Lessons,
    darkTheme: Boolean,
    itemOnClick: () -> Unit = {},
) {
    val textColor = if (darkTheme) {
        Color.White
    } else {
        Color.Black
    }

    val cardColor = if (darkTheme) {
        Color.DarkGray
    } else {
        Color.White
    }

    val buttonColor = if (darkTheme) {
        BlueLight
    } else {
        CustomYellow
    }

    Card(
        modifier = Modifier
            .padding(
                start = 15.dp,
                end = 15.dp,
                top = 12.dp
            )
            .fillMaxWidth(),
        backgroundColor = cardColor
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
            ) {
                Column {
                    Text(
                        text = stringResource(id = lesson.no),
                        color = textColor
                    )
                    Text(
                        text = lesson.heading,
                        color = textColor
                    )
                }
                Button(
                    onClick = {
                        itemOnClick()
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = buttonColor
                    )
                ) {
                    Text(
                        text = stringResource(id = R.string.learn),
                        color = Color.White
                    )
                }
            }
        }
    }
}

data class Lessons(
    @StringRes val no: Int,
    val heading: String,
    val id: Int
)

val hanyu1Lessons = listOf(
    Lessons(R.string.lesson1, "你好", 1),
    Lessons(R.string.lesson2, "我爱爸爸妈妈", 2),
    Lessons(R.string.lesson3, "爸爸是老师", 3),
    Lessons(R.string.lesson4, "你叫什么名字", 4),
    Lessons(R.string.lesson5, "我爱我家", 5),
    Lessons(R.string.lesson6, "哥哥去学校", 6),
    Lessons(R.string.lesson7, "我们上课吧", 7),
    Lessons(R.string.lesson8, "我们吃午饭", 8),
    Lessons(R.string.lesson9, "小华打球", 9),
    Lessons(R.string.lesson10, "我的一天", 10),
    Lessons(R.string.lesson11, "这是我的书", 11),
    Lessons(R.string.lesson12, "我有两本书", 12),
    Lessons(R.string.lesson13, "你家有电脑吗", 13),
    Lessons(R.string.lesson14, "书在书架上", 14),
    Lessons(R.string.lesson15, "我的房间", 15),
)