package com.example.tugas5

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Image(
                painter = painterResource(id = R.drawable.night_sky),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(100.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.card_background)),
                    elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = stringResource(id = R.string.form_title),
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(id = R.color.purple_text)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = stringResource(id = R.string.form_subtitle),
                            fontSize = 12.sp,
                            color = colorResource(id = R.color.text_hint)
                        )
                        Spacer(modifier = Modifier.height(24.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            OutlinedTextField(
                                value = firstName,
                                onValueChange = { firstName = it },
                                placeholder = { Text(stringResource(id = R.string.hint_first_name), fontSize = 14.sp) },
                                modifier = Modifier.weight(1f),
                                shape = RoundedCornerShape(12.dp),
                                singleLine = true
                            )
                            OutlinedTextField(
                                value = lastName,
                                onValueChange = { lastName = it },
                                placeholder = { Text(stringResource(id = R.string.hint_last_name), fontSize = 14.sp) },
                                modifier = Modifier.weight(1f),
                                shape = RoundedCornerShape(12.dp),
                                singleLine = true
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))

                        OutlinedTextField(
                            value = email,
                            onValueChange = { email = it },
                            placeholder = { Text(stringResource(id = R.string.hint_email), fontSize = 14.sp) },
                            modifier = Modifier.fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            singleLine = true
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                }
                Spacer(modifier = Modifier.height(40.dp))
            }
        }
    }
}