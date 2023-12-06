package com.ad_coding.youtubeclone.home.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ad_coding.youtubeclone.ui.theme.Black40

@Composable
fun Categories() {
    LazyRow(
        contentPadding = PaddingValues(
            start = 15.dp,
            end = 15.dp,
            bottom = 6.dp
        ),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.background(MaterialTheme.colorScheme.background)
    ) {
        item {
            ElevatedFilterChip(
                selected = false,
                onClick = { /*TODO*/ },
                label = {
                    Text(text = "Explore")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Explore,
                        contentDescription = null,
                        tint = Color.White
                    )
                },
                colors = FilterChipDefaults.elevatedFilterChipColors(
                    containerColor = Color.DarkGray
                )
            )
        }

        item {
            ElevatedFilterChip(
                selected = true,
                onClick = { /*TODO*/ },
                label = {
                    Text(text = "All")
                },
                colors = FilterChipDefaults.elevatedFilterChipColors(
                    selectedContainerColor = Color.White,
                    selectedLabelColor = Black40
                ),
                shape = CircleShape
            )
        }

        item {
            ElevatedFilterChip(
                selected = false,
                onClick = { /*TODO*/ },
                label = {
                    Text(text = "Gaming")
                },
                colors = FilterChipDefaults.elevatedFilterChipColors(
                    containerColor = Color.DarkGray
                ),
                shape = CircleShape
            )
        }

        item {
            ElevatedFilterChip(
                selected = false,
                onClick = { /*TODO*/ },
                label = {
                    Text(text = "Sports")
                },
                colors = FilterChipDefaults.elevatedFilterChipColors(
                    containerColor = Color.DarkGray
                ),
                shape = CircleShape
            )
        }

        item {
            ElevatedFilterChip(
                selected = false,
                onClick = { /*TODO*/ },
                label = {
                    Text(text = "Music")
                },
                colors = FilterChipDefaults.elevatedFilterChipColors(
                    containerColor = Color.DarkGray
                ),
                shape = CircleShape
            )
        }

        item {
            ElevatedFilterChip(
                selected = false,
                onClick = { /*TODO*/ },
                label = {
                    Text(text = "Anime")
                },
                colors = FilterChipDefaults.elevatedFilterChipColors(
                    containerColor = Color.DarkGray
                ),
                shape = CircleShape
            )
        }
    }
}