package com.example.retrofit_exemple1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.retrofit_exemple1.ui.theme.Retrofit_exemple1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Retrofit_exemple1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val vm:UserViewModel= UserViewModel()
                    EcranUser(vm)
                }
            }
        }
    }
}

@Composable
fun Greeting( vm : PostViewModel) {
    val liste=vm.getPosts().collectAsState(initial = emptyList())

    LazyColumn{
       items(liste.value) {
               p ->  Row {
           Text(text = p.id.toString())
           Spacer(modifier = Modifier.width(5.dp))
           Text(p.title)
        }
       }
    }

}

@Composable
fun EcranUser( vm : UserViewModel) {
    val liste=vm.getUsers().collectAsState(initial = emptyList())

    LazyColumn{
        items(liste.value) {
                p ->  Row {
            Text(text = p.id.toString())
            Spacer(modifier = Modifier.width(5.dp))
            Text(p.name)
        }
        }
    }

}

