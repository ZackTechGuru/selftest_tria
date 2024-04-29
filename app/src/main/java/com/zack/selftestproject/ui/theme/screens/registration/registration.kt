package com.zack.selftestproject.ui.theme.screens.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Registration() {
    var name by remember { mutableStateOf("")}
    var email by remember { mutableStateOf("")}
    var password by remember { mutableStateOf("")}

    Column (
      horizontalAlignment = Alignment.CenterHorizontally, 
      verticalArrangement = Arrangement.Center,
      modifier = Modifier
          .fillMaxSize()
          .background(color = Color.LightGray)
    ){
        Text(
            text = "Create New account",
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            color = Color.Blue)
        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField (
            value = name, onValueChange = {name= it},
            label = { Text(text = "Enter your name")},
            shape = RoundedCornerShape(25.dp),
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "name")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Blue,
                unfocusedBorderColor = Color.Blue)
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField (
            value = email, onValueChange = {email= it},
            label = { Text(text = "Enter your email")},
            shape = RoundedCornerShape(25.dp),
            leadingIcon = {Icon(imageVector = Icons.Default.Email, contentDescription = "email")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Blue,
                unfocusedBorderColor = Color.Blue)
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField (
            value = password, onValueChange = {password= it},
            label = { Text(text = "Enter your password")},
            shape = RoundedCornerShape(25.dp),
            leadingIcon = {Icon(imageVector = Icons.Default.Lock, contentDescription = "password")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Blue,
                unfocusedBorderColor = Color.Blue)
        )
        Spacer(modifier = Modifier.height(30.dp))
        
        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
            modifier = Modifier.size(width = 250.dp, height = 35.dp)
                ) {
            Text(text = "Create account",
                fontSize = 15.sp) }
        Spacer(modifier = Modifier.height(10.dp))

        val isChecked = remember { mutableStateOf(false) }
        Row( horizontalArrangement = Arrangement.Center,
            ){
            Checkbox(
                checked =  isChecked.value,
                onCheckedChange = {isChecked.value= it},
                enabled = true,
                colors = CheckboxDefaults.colors(),
                modifier = Modifier
                    .padding(5.dp)
                    .size(3.dp)
                )
            Spacer(modifier = Modifier.padding(2.dp))
            Text(text = "I agree to the Terms & Conditions.",
                modifier = Modifier.width(190.dp),
                textAlign = TextAlign.Center,
                fontSize = 12.sp,
                color= Color.Blue

                )

        }
        Spacer(modifier = Modifier.height(150.dp))
        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
            modifier = Modifier.size(width = 250.dp, height = 35.dp)
        ) {
            Text(text = "Already a User? Login",
                fontSize = 15.sp) }


    }
    
}

@Preview
@Composable
private fun RegistrationPrev() {
    Registration()

}