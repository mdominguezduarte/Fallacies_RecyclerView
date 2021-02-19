package com.example.fallacies.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Fallacy (@StringRes val stringResourceId: Int,
                    @DrawableRes val imageResourceId: Int)