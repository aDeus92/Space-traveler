package com.adeus.spacetraveler.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

data class JetShape(
    val small: RoundedCornerShape,
    val medium: RoundedCornerShape,
    val large : RoundedCornerShape,
    val dialog : RoundedCornerShape
)
val jetShape = JetShape(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(64.dp),
    dialog = RoundedCornerShape(24.dp)
)