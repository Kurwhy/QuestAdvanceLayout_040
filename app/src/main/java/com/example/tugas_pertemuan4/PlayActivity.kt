package com.example.tugas_pertemuan4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity() {
    Column(modifier = Modifier.fillMaxSize()) {
        HeaderSection()
        Text(text = "Kepada Yth,",
            modifier = Modifier.padding(12.dp))
        Text(text = "Wahyu Firmansyah",
            modifier = Modifier.padding(12.dp))
        Spacer(modifier = Modifier.size(16.dp))
        DetailSurat(
            judul = "Nama",
            isinya = "Wahyu"
        )
        DetailSurat(
            judul = "Alamat",
            isinya = "Kota Batam"
        )
        DetailSurat(
            judul = "No Telp",
            isinya = "08975678759"
        )
        DetailSurat(
            judul = "Keterangan",
            isinya = "tenyaho"
        )
    }
}

@Composable
fun HeaderSection() {
    Box (modifier = Modifier.
    fillMaxWidth().
    background(color = Color.DarkGray).
    padding(15.dp))
    {
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Column {
                Text (
                    text = "Daerah Istimewa Yogyakarta",
                    color = Color.White
                )
                Text (
                    text = "FAX: 021-121212, Tlp : 08211111",
                    color = Color.White
                )
            }
            Box(
                contentAlignment = Alignment.BottomStart
            ) {
                Image(
                    painter = painterResource(id = R.drawable.knvb),
                    contentDescription = "",
                    modifier = Modifier.size(100.dp)
                )
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = ""
                )
            }
        }
    }
}

@Composable
fun DetailSurat(
    judul: String, isinya: String
) {
    Column(
        modifier = Modifier.
        fillMaxWidth().
        padding(16.dp),
    ) {

        Row(
            modifier = Modifier.fillMaxWidth().padding(top = 2.dp)
        ) {
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = isinya,
                modifier = Modifier.weight(2f))
        }
    }
}

