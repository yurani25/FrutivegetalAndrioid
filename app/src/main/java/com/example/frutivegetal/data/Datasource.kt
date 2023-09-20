package com.example.frutivegetal.data

import com.example.frutivegetal.R
import com.example.frutivegetal.model.Affirmation

class Datasource
{

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1,R.drawable.imagen1),
            Affirmation(R.string.affirmation2,R.drawable.imagen2),
            Affirmation(R.string.affirmation3,R.drawable.imagen3),
            Affirmation(R.string.affirmation4,R.drawable.imagen4),
            Affirmation(R.string.affirmation5,R.drawable.imagen5),
            Affirmation(R.string.affirmation6,R.drawable.imagen6),
            Affirmation(R.string.affirmation7,R.drawable.imagen7),
            Affirmation(R.string.affirmation8,R.drawable.imagen8),
            Affirmation(R.string.affirmation9,R.drawable.imagen9),
            Affirmation(R.string.affirmation10,R.drawable.imagen10),
        )
    }
}