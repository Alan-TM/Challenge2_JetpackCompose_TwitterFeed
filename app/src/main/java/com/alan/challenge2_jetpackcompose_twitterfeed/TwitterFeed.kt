package com.alan.challenge2_jetpackcompose_twitterfeed

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TwitterFeed() {
    Box(
        Modifier
            .fillMaxWidth()
            .background(Color(0xFF161F2D))
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            ProfileImage()
            UserTopInfo()
        }
    }
}

@Composable
fun UserTopInfo() {
    Row(Modifier.padding(horizontal = 12.dp)) {
        Username()
        UserID(Modifier.padding(horizontal = 8.dp))
        TweetHour()
        // TODO check this alignment
        //MoreButton()
    }
}

@Composable
fun TweetHour() {
    Text(
        text = "4h",
        fontWeight = FontWeight.Light,
        color = Color.LightGray,
        fontSize = 11.sp
    )
}

@Composable
fun MoreButton() {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_dots),
            contentDescription = "More",
            tint = Color.White
        )
    }
}

@Composable
fun UserID(modifier: Modifier) {
    Text(
        text = "@HijoDelChayan",
        fontWeight = FontWeight.Light,
        color = Color.LightGray,
        fontSize = 11.sp,
        modifier = modifier
    )
}

@Composable
fun Username() {
    Text(text = "Alan", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 12.sp)
}

@Composable
fun ProfileImage() {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Profile",
            modifier = Modifier
                .clip(CircleShape)
                .size(50.dp),
            contentScale = ContentScale.Crop
        )
    }
}
