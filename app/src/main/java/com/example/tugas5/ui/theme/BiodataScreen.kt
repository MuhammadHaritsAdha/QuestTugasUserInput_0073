package com.example.tugas5
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BiodataScreen() {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var dob by remember { mutableStateOf("") }
    var experience by remember { mutableStateOf("") }
    var isAndroidChecked by remember { mutableStateOf(false) }
    var isUiUxChecked by remember { mutableStateOf(false) }
    var isWebChecked by remember { mutableStateOf(false) }

    Scaffold { innerPadding ->
        Box(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
            Image(painter = painterResource(id = R.drawable.night_sky), contentDescription = null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
            Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()), horizontalAlignment = Alignment.CenterHorizontally) {
                Spacer(modifier = Modifier.height(100.dp))
            }
        }
    }
}