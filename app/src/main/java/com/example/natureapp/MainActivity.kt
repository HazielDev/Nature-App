package com.example.natureapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.natureapp.ui.theme.NatureAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NatureAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),horizontalAlignment = Alignment.CenterHorizontally) {
        Cardo(
            title = "Rutas de Tolantongo",
            desc = "hay mucha gente",
            image = "https://tourenmexico.uno/wp-content/uploads/2022/02/421065150_841752041296478_7438022754266161698_n.jpg"
        )
        Cardo(
            title = "Hawaii",
            desc = "Hawaii, quien no quiere ir?",
            image = "https://img.s-hawaiianairlines.com/static/images/tripplanning/06-10-interesting-facts-about-hawaii/hero-image.jpg?version=0bf7&sc_lang=en-au&w=2580&hash=7B24871B256A853553109268033A95AB2B74BABD"
        )
        Cardo(
            title = "Playa Escondida Puerto Rico",
            desc = "Si es tan escondida, cómo sabemos de ella?",
            image = "https://rh-destinations.com/wp-content/uploads/2021/08/royal-holiday-blog-puerto-rico-playa-flamenco-culebra-1024x576.jpg"
        )
        Cardo(
            title = "Buceo 2",
            desc = "buceo en ensenada",
            image = "https://images.squarespace-cdn.com/content/v1/542b135de4b0fd39380461a2/1542910044703-63S0T3RF3OYL6IFHE51H/2018+Septiembre+Ensenada+Kelp-2.JPG"
        )
        Cardo(
            title = "Buceo",
            desc = "buceo en baja california",
            image = "https://d2p1cf6997m1ir.cloudfront.net/media/thumbnails/4a/39/4a39d4573484d8f6728f76e095a3a2b1.webp"
        )
    }
}

@Composable
fun Cardo(title: String = "Titulo", desc: String = "Descripcion", image: String = "") {
    Box(
        Modifier
            .padding(top = 30.dp)
            .fillMaxWidth(0.9f)
            .height(200.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color = Color.Gray)
    ) {
        AsyncImage(
            model = image,
            contentDescription = "CosmoLogo",
            modifier = Modifier
                .fillMaxSize()
                .height(20.dp),
            contentScale = ContentScale.Crop
        )
        Column(
            Modifier
                .padding(0.dp)
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Black,
                            Color.Transparent
                        ),
                        startY = Float.POSITIVE_INFINITY, // Empieza en la parte inferior
                        endY = 0f // Termina en la parte superior
                    )
                ), verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = title,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(12.dp)
            )
            Text(text = desc, color = Color.White, modifier = Modifier.padding(start = 12.dp, end = 12.dp, bottom = 12.dp))
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hola VATO $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NatureAppTheme {
        Home()
    }
}