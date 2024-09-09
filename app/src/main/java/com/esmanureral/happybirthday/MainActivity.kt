package com.esmanureral.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.esmanureral.happybirthday.R.drawable.androidparty
import com.esmanureral.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /*GreetingText(
                        message = "HappY Birthday Cengiz Han",
                        from ="From Esmanur",
                        modifier = Modifier.padding(8.dp))*/
                    GreetingImage(message = "Happy Birthday Cengiz Han!", from = "From Esmanur")
                }
            }
        }
    }
}
@Composable

fun GreetingText(message: String, from:String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center, //ortaladık
        modifier = modifier

    ) {
        Text(
            text = message,
            fontSize = 100.sp,//bunu yazınca karışıyor
            lineHeight = 116.sp,//yükseklik ayarladık
            textAlign = TextAlign.Center //yazı ortalandı.
        )
        //from esmanur yazısı
        Text(
            text = from,
            fontSize = 36.sp,
            modifier= Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingImage(
            message = "Happy Birthday Cengiz Han!",
            from = "From Esmanur"
        )
    }
}

 @Composable
 fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
     val image = painterResource(androidparty)
     Box(modifier) {
         Image(
             painter = image,
             contentDescription = null,
             contentScale = ContentScale.Crop,//resimdeki fazlalıkları kesti
             alpha = 0.5F//opaklık


         )
         GreetingText(
             message = message,
             from = from,
             modifier = Modifier
                 .fillMaxSize()
                 .padding(8.dp)
         )
     }
 }