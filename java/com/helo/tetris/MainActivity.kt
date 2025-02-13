package com.helo.tetris

import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.helo.tetris.view.Tetris

class MainActivity : ComponentActivity() {

    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        try {
            mediaPlayer = MediaPlayer.create(this, R.raw.theme)
            if (mediaPlayer != null) {
                mediaPlayer?.isLooping = true  // Habilita o loop
                Log.d("MainActivity", "Música preparada com sucesso")
            } else {
                Log.e("MainActivity", "Erro ao criar MediaPlayer")
            }
        } catch (e: Exception) {
            Log.e("MainActivity", "Erro ao inicializar a música: ${e.message}")
        }

        setContent {
            Tetris()
        }
    }

    override fun onStop() {
        super.onStop()
        mediaPlayer?.release()
        Log.d("MainActivity", "MediaPlayer liberado")
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer?.pause()
        Log.d("MainActivity", "Música pausada")
    }

    override fun onResume() {
        super.onResume()
        try {
            if (mediaPlayer != null && !mediaPlayer!!.isPlaying) {
                mediaPlayer?.start()
                Log.d("MainActivity", "Música retomada")
            } else {
                Log.e("MainActivity", "MediaPlayer não está pronto para tocar")
            }
        } catch (e: IllegalStateException) {
            Log.e("MainActivity", "Erro ao tentar iniciar a música: ${e.message}")
        }
    }
}
