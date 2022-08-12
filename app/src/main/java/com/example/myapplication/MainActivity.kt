package com.example.myapplication

import android.graphics.Paint
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme


                BirthdayGreetingWithImage()




            }

        }
    }
}



@Composable
fun BirthdayGreetingWithImage() {
    val image = painterResource(R.drawable.img)
    //Step 3 create a box to overlap image and texts
    Column {
        Box(contentAlignment = Alignment.BottomStart) {
            Image(
                painter = image,
                contentDescription = "mountains",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "⟟ The Mountains",
                color = androidx.compose.ui.graphics.Color.White,
                fontSize = 22.sp,
                textAlign = TextAlign.End
            )
        }

        Row(modifier = Modifier
            .padding(10.dp),

                ){
            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = null,
                modifier = Modifier.clip(RoundedCornerShape(10.dp)),
            )

            Text(
                text = "Mountain Man",
                textAlign = TextAlign.Center
            )
            Text(
                text = "adaaaaaaaaaaaa",
                textAlign = TextAlign.End,
                color = androidx.compose.ui.graphics.Color.White

            )

            Image(
                painter = painterResource(id = R.drawable.b),
                contentDescription = null,


            )
            Image(
                painter = painterResource(id = R.drawable.c),
                contentDescription = null,

                )
            Image(
                painter = painterResource(id = R.drawable.d),
                contentDescription = null,


                )


        }
        Row(){
            Text(
                text = "______________________________________________________",
                textAlign = TextAlign.Center,
                color= androidx.compose.ui.graphics.Color.Companion.Black.copy(0.2f)
            )
        }
        Row(modifier=Modifier
            .padding(start=35.dp , top=40.dp , end=10.dp ,bottom= 0.dp),
        ){
            Text(
                text="Camera"
            )
            Text(
                text = "adaaaaaaaaaaaa",
                textAlign = TextAlign.End,
                color = androidx.compose.ui.graphics.Color.White

            )
            Text(
                text="Aperture"
            )

        }
        Row(modifier=Modifier
            .padding(start=35.dp , top=0.dp , end=10.dp ,bottom= 10.dp),
        ){
            Text(
                text="NikonD3200",
                fontSize = 15.sp,
                color= androidx.compose.ui.graphics.Color.Black.copy(alpha=0.5f)
            )
            Text(
                text = "adaaaaaaaaa",
                textAlign = TextAlign.End,
                color = androidx.compose.ui.graphics.Color.White

            )
            Text(
                text="f/50",
                color= androidx.compose.ui.graphics.Color.Black.copy(alpha=0.5f)
            )

        }
        Row(modifier=Modifier
            .padding(start=35.dp , top=10.dp , end=10.dp ,bottom= 0.dp),
        ){
            Text(
                text="Focal Lenght"
            )
            Text(
                text = "adaaaaaaaa",
                textAlign = TextAlign.End,
                color = androidx.compose.ui.graphics.Color.White,


            )
            Text(
                text="Shutter Speed"
            )

        }
        Row(modifier=Modifier
            .padding(start=35.dp , top=0.dp , end=10.dp ,bottom= 10.dp),
        ){
            Text(
                text="16.0mm",
                fontSize = 15.sp,
                color= androidx.compose.ui.graphics.Color.Black.copy(alpha=0.5f)
            )
            Text(
                text = "adaaaaaaaaaaaa",
                textAlign = TextAlign.End,
                color = androidx.compose.ui.graphics.Color.White

            )
            Text(
                text="1/125s",
                color= androidx.compose.ui.graphics.Color.Black.copy(alpha=0.5f)
            )

        }
        Row(modifier=Modifier
            .padding(start=35.dp , top=10.dp , end=10.dp ,bottom= 0.dp),
        ){
            Text(
                text="ISO"
            )
            Text(
                text = "aaaadaaaaaaaaaaaa",
                textAlign = TextAlign.End,
                color = androidx.compose.ui.graphics.Color.White

            )
            Text(
                text="Dimensions"
            )

        }
        Row(modifier=Modifier
            .padding(start=35.dp , top=0.dp , end=10.dp ,bottom= 10.dp),
        ){
            Text(
                text="100",
                fontSize = 15.sp,
                color= androidx.compose.ui.graphics.Color.Black.copy(alpha=0.5f)
            )
            Text(
                text = "adaaaaaaaaaaaaaaaa",
                textAlign = TextAlign.End,
                color = androidx.compose.ui.graphics.Color.White

            )
            Text(
                text="3906x4089",
                color= androidx.compose.ui.graphics.Color.Black.copy(alpha=0.5f)
            )

        }
        Row(){
            Text(
                text = "______________________________________________________",
                textAlign = TextAlign.Center,
                color= androidx.compose.ui.graphics.Color.Companion.Black.copy(0.2f)
            )
        }
        Row(modifier=Modifier
            .padding(start=69.dp , top=10.dp , end=10.dp ,bottom= 0.dp),
        ){
            Text(
                text="Views"
            )
            Text(
                text = "adaaa",
                textAlign = TextAlign.End,
                color = androidx.compose.ui.graphics.Color.White,


                )
            Text(
                text="Downloads"
            )
            Text(
                text="adaaa",
                color = androidx.compose.ui.graphics.Color.White,
            )
            Text(
                text="Likes"
            )

        }
        Row(modifier=Modifier
            .padding(start=69.dp , top=10.dp , end=10.dp ,bottom= 0.dp),
        ){
            Text(
                text="8.8M",
                color = androidx.compose.ui.graphics.Color.Black.copy(alpha=0.5f)

            )
            Text(
                text = "8.8Maaa",
                textAlign = TextAlign.End,
                color = androidx.compose.ui.graphics.Color.White.copy(alpha=0.5f),


                )
            Text(
                text="99.1k",
                color = androidx.compose.ui.graphics.Color.Black.copy(alpha=0.5f)
            )
            Text(
                text="adaaaaaa",
                color = androidx.compose.ui.graphics.Color.White.copy(alpha=0.5f),
            )
            Text(
                text="1.8K",
                color = androidx.compose.ui.graphics.Color.Black.copy(alpha=0.5f)
            )

        }
        Row(modifier=Modifier
            .padding(start=49.dp , top=20.dp , end=10.dp ,bottom= 0.dp),
        ) {
            Button(onClick = { },) {
                Text("The Mountains")

            }
        }
    }

}





