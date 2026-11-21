package com.example.androidtemplate.scaffold

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * The [AppScaffold] serves as the root of the UI as to isolate the
 * [MainActivity][com.example.androidtemplate.MainActivity] to its specific tasks.
 */
@Composable
fun AppScaffold() {
    Scaffold { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Text("Hello template")
        }
    }
}
