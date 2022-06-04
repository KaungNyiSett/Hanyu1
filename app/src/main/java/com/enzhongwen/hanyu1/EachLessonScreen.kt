package com.enzhongwen.hanyu1

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.enzhongwen.hanyu1.data.*
import com.enzhongwen.hanyu1.db.VocabData
import com.enzhongwen.hanyu1.reading.book1.*
import com.enzhongwen.hanyu1.ui.theme.BlueLight
import com.enzhongwen.hanyu1.ui.theme.CustomYellow
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch


@OptIn(ExperimentalPagerApi::class)
@Composable
fun EachLessonScreen(
    darkTheme: Boolean,
    lesson: Int,
    navController: NavController,
    onBack: () -> Unit,
) {
    var onOff by rememberSaveable {
        mutableStateOf(true)
    }

    val pagerState = rememberPagerState()

    val scope = rememberCoroutineScope()

    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            AppBarTop(
                title = "Lesson $lesson",
                navIcon = Icons.Default.ArrowBack,
                navClick = {
                    onBack()
                    navController.navigateUp()
                },
                action1Icon = R.drawable.studymode,
                action1Click = {
                    onOff = !onOff
                },
                darkTheme = darkTheme
            )
        }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(
                    color = if (darkTheme) {
                        Color.Black
                    } else {
                        Color.White
                    }
                )
        ) {
            BannerAd()

            HorizontalPager(
                count = 2,
                state = pagerState,
                modifier = Modifier.weight(1f)
            ) { page ->

                when(page){
                    0 -> LessonVocab(
                        darkTheme = darkTheme,
                        navController = navController,
                        lesson = lesson,
                        onOff = onOff,
                        modifier = Modifier
                    )

                    1 -> Reading(
                        lesson = lesson,
                        onOff = onOff,
                        darkTheme = darkTheme,
                        modifier = Modifier
                    )
                }
            }
            TabPart(
                state = pagerState.currentPage,
                darkTheme = darkTheme,
                selectedTab = pagerState.currentPage,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(it)
                    }
                }
            )
        }
    }
}

@Composable
fun TabPart(
    state: Int,
    darkTheme: Boolean,
    onClick: (Int) -> Unit,
    selectedTab: Int,
) {
    val titles = listOf(R.string.vocabulary, R.string.reading)


    val textColor = if (darkTheme) {
        BlueLight
    } else {
        CustomYellow
    }

    TabRow(
        selectedTabIndex = selectedTab,
        backgroundColor = if (darkTheme) {
            Color.DarkGray
        } else {
            Color.LightGray
        },
    ) {
        titles.forEachIndexed { index, title ->
            Tab(
                text = {
                    Text(
                        text = stringResource(id = title),
                        color = textColor,
                    )
                },
                selected = state == index,
                onClick = {
                    onClick(index)
                }
            )
        }
    }
}

@Composable
fun Reading(
    modifier: Modifier,
    lesson: Int,
    onOff: Boolean,
    darkTheme: Boolean
) {

    when (lesson) {
        1 -> B1L1(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        2 -> B1L2(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        3 -> B1L3(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        4 -> B1L4(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        5 -> B1L5(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        6 -> B1L6(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        7 -> B1L7(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        8 -> B1L8(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        9 -> B1L9(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        10 -> B1L10(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        11 -> B1L11(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        12 -> B1L12(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        13 -> B1L13(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        14 -> B1L14(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
        15 -> B1L15(
            onOff = onOff,
            darkTheme = darkTheme,
            modifier = modifier
        )
    }
}

fun lessonVocab(lesson: Int): List<VocabData> {
    return when (lesson) {
        1 -> b1l1
        2 -> b1l2
        3 -> b1l3
        4 -> b1l4
        5 -> b1l5
        6 -> b1l6
        7 -> b1l7
        8 -> b1l8
        9 -> b1l9
        10 -> b1l10
        11 -> b1l11
        12 -> b1l12
        13 -> b1l13
        14 -> b1l14
        15 -> b1l15
        else -> b1l1
    }
}

@Composable
fun LessonVocab(
    darkTheme: Boolean,
    navController: NavController,
    lesson: Int,
    modifier: Modifier,
    onOff: Boolean
) {

    val list = remember {
        mutableListOf<VocabData>()
    }

    LazyColumn(
        modifier = modifier.background(
            color = if (darkTheme) {
                Color.Black
            } else {
                Color.White
            }
        )
    ) {
        items(
            items = lessonVocab(lesson),
            key = {
                it.id1
            }
        ) {
            for (i in FAV_LIST) {
                if (i.id1 == it.id1) {
                    list.add(it)
                }
            }

            val animatedProgress = remember {
                Animatable(
                    initialValue = 0.8f
                )
            }

            LaunchedEffect(Unit) {
                animatedProgress.animateTo(
                    targetValue = 1f,
                    animationSpec = tween(
                        durationMillis = 300,
                        easing = LinearEasing
                    )
                )
            }

            VocabItems(
                saved = it,
                darkTheme = darkTheme,
                navController = navController,
                onOff = onOff,
                favourite = list.contains(it),
                modifier = Modifier.graphicsLayer(
                    scaleX = animatedProgress.value,
                    scaleY = animatedProgress.value
                )
            )
        }
    }
}