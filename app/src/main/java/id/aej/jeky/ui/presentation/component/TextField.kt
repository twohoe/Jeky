@file:OptIn(ExperimentalMaterial3Api::class)

package id.aej.jeky.ui.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import id.aej.jeky.ui.presentation.Black
import id.aej.jeky.ui.presentation.Border
import id.aej.jeky.ui.presentation.Icon
import id.aej.jeky.ui.presentation.Label
import id.aej.jeky.ui.presentation.Primary

@Composable fun BaseTextField(
    modifier: Modifier,
    value: String = "",
    trailingIcon: (@Composable () -> Unit)? = null,
    label: String ="",
    placeholder: String,
    keyboardOptions: KeyboardOptions = KeyboardOptions(),
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onValueChange: () -> Unit
) {
    Column(
        modifier = modifier,

    ) {
       Text(
           text = label,
           style = MaterialTheme.typography.labelMedium,
           color = Black,
           modifier = Modifier.fillMaxWidth()
       )
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = Black,
                unfocusedBorderColor = Border,
                focusedBorderColor = Primary,
                placeholderColor = Label,
                unfocusedTrailingIconColor = Icon,
                focusedTrailingIconColor = Primary
            ),
            shape = RoundedCornerShape(16.dp),
            placeholder = {
                Text(
                    text = placeholder,
                    style = MaterialTheme.typography.bodyMedium,
                )
            },
            trailingIcon = {
                trailingIcon?.invoke()
                }
            )
        }

    }