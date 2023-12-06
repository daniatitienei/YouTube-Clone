@file:OptIn(ExperimentalMaterial3Api::class)

package com.ad_coding.youtubeclone.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.AddCircleOutline
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Subscriptions
import androidx.compose.material.icons.outlined.VideoLibrary
import androidx.compose.material.icons.rounded.Cast
import androidx.compose.material.icons.rounded.Explore
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.ad_coding.youtubeclone.R
import com.ad_coding.youtubeclone.home.composable.Categories
import com.ad_coding.youtubeclone.home.composable.TopBarYouTube
import com.ad_coding.youtubeclone.home.composable.Video
import com.ad_coding.youtubeclone.ui.theme.Black40

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            Column {
                TopBarYouTube()
                Categories()
            }
        },
        bottomBar = {
            NavigationBar {
                BottomNavigationItem(
                    selected = true,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            imageVector = Icons.Rounded.Home,
                            contentDescription = null,
                            modifier = Modifier.size(28.dp)
                        )
                    },
                    label = {
                        Text(
                            text = "Home",
                            style = MaterialTheme.typography.labelMedium
                        )
                    }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.shorts),
                            contentDescription = null,
                            modifier = Modifier.size(28.dp)
                        )
                    },
                    label = {
                        Text(
                            text = "Shorts",
                            style = MaterialTheme.typography.labelMedium
                        )
                    }
                )

                BottomNavigationItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = {
                        Box(
                            modifier = Modifier
                                .border(
                                    color = Color.White,
                                    width = 1.dp,
                                    shape = CircleShape
                                )
                                .padding(4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Add,
                                contentDescription = null,
                                modifier = Modifier.size(38.dp)
                            )
                        }
                    }
                )

                BottomNavigationItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Subscriptions,
                            contentDescription = null,
                            modifier = Modifier.size(28.dp)
                        )
                    },
                    label = {
                        Text(
                            text = "Subscriptions",
                            style = MaterialTheme.typography.labelMedium,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = 1
                        )
                    }
                )

                BottomNavigationItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.VideoLibrary,
                            contentDescription = null,
                            modifier = Modifier.size(28.dp)
                        )
                    },
                    label = {
                        Text(
                            text = "Library",
                            style = MaterialTheme.typography.labelMedium
                        )
                    }
                )
            }
        }
    ) { padding ->
        LazyColumn(
            contentPadding = PaddingValues(
                top = padding.calculateTopPadding() + 10.dp,
                bottom = padding.calculateBottomPadding()
            ),
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            item {
                Video(
                    thumbnail = R.drawable.first_video_thumbnail,
                    title = "Grand Theft Auto IV - Trailer 1",
                    channelName = "Rockstar Games",
                    profilePic = R.drawable.first_video_profile_pic,
                    views = "104M",
                    posted = "1 day ago"
                )
            }
            item {
                Video(
                    thumbnail = R.drawable.second_video_thumbnail,
                    title = "$10.000 Every Day You Survive In A Grocery Store",
                    channelName = "MrBeast",
                    profilePic = R.drawable.second_video_profile_pic,
                    views = "77M",
                    posted = "3 days ago"
                )
            }
            item {
                Video(
                    thumbnail = R.drawable.third_video_thumbnail,
                    title = "Azteca - Sute albastre (Prod. AMTILB)",
                    channelName = "Azteca",
                    profilePic = R.drawable.third_video_profile_pic,
                    views = "3.2M",
                    posted = "5 years ago"
                )
            }
        }
    }
}