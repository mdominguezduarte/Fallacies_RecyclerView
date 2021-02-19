package com.example.fallacies.data

import com.example.fallacies.R
import com.example.fallacies.model.Fallacy

class Datasource {

    fun loadFallacies(): List<Fallacy> {
        return listOf<Fallacy>(
            Fallacy(R.string.fallacy1,R.drawable.image1),
            Fallacy(R.string.fallacy2, R.drawable.image2),
            Fallacy(R.string.fallacy3, R.drawable.image3),
            Fallacy(R.string.fallacy4, R.drawable.image4),
            Fallacy(R.string.fallacy5, R.drawable.image5),
            Fallacy(R.string.fallacy6, R.drawable.image6),
            Fallacy(R.string.fallacy7, R.drawable.image7),
            Fallacy(R.string.fallacy8, R.drawable.image8),
            Fallacy(R.string.fallacy9, R.drawable.image9),
            Fallacy(R.string.fallacy10, R.drawable.image10),
            Fallacy(R.string.fallacy11, R.drawable.image11),
            Fallacy(R.string.fallacy12, R.drawable.image12),
            Fallacy(R.string.fallacy13, R.drawable.image13),
            Fallacy(R.string.fallacy14, R.drawable.image14),
            Fallacy(R.string.fallacy15, R.drawable.image15)
        )

    }
}