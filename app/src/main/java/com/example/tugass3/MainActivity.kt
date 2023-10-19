package com.example.tugass3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugass3.ui.theme.Tugass3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugass3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun HomeS(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
        text = "BEATRIX APP", fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.padding(13.dp))

        BoxS()

        Spacer(modifier = Modifier.padding(13.dp))

        Lokasi()


    }
}

@Composable
fun BoxS (){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Blue)
            .clip(RoundedCornerShape(25.dp))

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.
        fillMaxWidth()
        ) {
            Image(painter = painterResource(id = R.drawable.img),contentDescription = "",
                modifier = Modifier.size(150.dp)
            )
            Text(text = "Rain", fontSize = 40.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier.size(150.dp))
        }
    }
}

@Composable
fun Lokasi() {
    Text(text = "19 C", fontSize = 64.sp, fontWeight = FontWeight.Bold)
    Row(verticalAlignment = Alignment.CenterVertically)
    {
        Image(
            painter = painterResource(id = R.drawable.img), contentDescription = "",
            modifier = Modifier.size(35.dp)
        )
        Text(text = "Yogyakarta,", fontSize = 40.sp, fontWeight = FontWeight.Bold)
    }

    Spacer(modifier = Modifier.padding(13.dp))
    Text(
        text = "Kasihan, Kabupaten Bantul, DIY",
        textAlign = TextAlign.Center,
        fontSize = 20.sp,
        color = Color.Gray
    )


}
        @Preview(showBackground = true)
        @Composable
                fun GreetingPreview(){
                    HomeS()
                }


