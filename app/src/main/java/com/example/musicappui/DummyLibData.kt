package com.example.musicappui

import androidx.annotation.DrawableRes

data class DummyLibData(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<DummyLibData>(
    DummyLibData(R.drawable.ic_playlist_green, "Playlist"),
    DummyLibData(R.drawable.ic_microphone, "Artist"),
    DummyLibData(R.drawable.ic_baseline_album_24, "Album"),
    DummyLibData(R.drawable.ic_baseline_music_note_24, "Songs"),
    DummyLibData(R.drawable.ic_genre, "Genre"),
)

