package com.helo.tetris.model

import androidx.compose.ui.graphics.Color
import com.helo.tetris.ui.theme.PINK
import com.helo.tetris.ui.theme.PINK_1
import com.helo.tetris.ui.theme.PINK_2
import com.helo.tetris.ui.theme.PINK_3
import com.helo.tetris.ui.theme.PINK_4
import com.helo.tetris.ui.theme.PINK_5
import com.helo.tetris.ui.theme.PINK_6
import com.helo.tetris.ui.theme.PINK_7

data class PecaTetris(
    val tipo: TipoDePeca,
    var x: Int,
    var y: Int,
    var indexRotacao: Int = 0
)

enum class TipoDePeca(
    val shapes: Array<Array<IntArray>>,
    val colors: Color
){
    I(arrayOf(
        arrayOf(intArrayOf(1,1,1,1)), // Horizontal de I
        arrayOf(intArrayOf(1), intArrayOf(1), intArrayOf(1), intArrayOf(1)) // Vertical de I
    ), PINK),
    // J
    J(arrayOf(
        arrayOf(
            intArrayOf(0,0,1),
            intArrayOf(1,1,1)),
            arrayOf(
                intArrayOf(1,1,1),
                intArrayOf(1,0,0)),
        arrayOf(
            intArrayOf(0,1),
            intArrayOf(0,1),
            intArrayOf(1,1))
        ), PINK_2),

    //L
    L(arrayOf(
        arrayOf(
            intArrayOf(1,0,0),
            intArrayOf(1,1,1)),
        arrayOf(
            intArrayOf(1,1),
            intArrayOf(1,0),
            intArrayOf(1,0)),
        arrayOf(
            intArrayOf(1,1,1),
            intArrayOf(0,0,1)),
        arrayOf(
            intArrayOf(1,0),
            intArrayOf(1,0),
            intArrayOf(1,1))
    ), PINK_3),

    // O
    O(arrayOf(
        arrayOf(intArrayOf(1,1), intArrayOf(1,1))
    ), PINK_4),

    // S
    S(arrayOf(
        arrayOf(
            intArrayOf(0,1,1),
            intArrayOf(1,1,0)),
        arrayOf(
            intArrayOf(1,0),
            intArrayOf(1,1),
            intArrayOf(0,1))
    ), PINK_5),

    // T
    T(arrayOf(
        arrayOf(
            intArrayOf(0,1,0),
            intArrayOf(1,1,1)),
        arrayOf(
            intArrayOf(1,0),
            intArrayOf(1,1),
            intArrayOf(1,0)),
        arrayOf(
            intArrayOf(1,1,1),
            intArrayOf(0,1,0)),
        arrayOf(
        intArrayOf(0,1),
        intArrayOf(1,1),
        intArrayOf(0,1)),
        ), PINK_6),

    // Z
    Z(arrayOf(
        arrayOf(
            intArrayOf(1,1,0),
            intArrayOf(0,1,1)),
        arrayOf(
            intArrayOf(0,1),
            intArrayOf(1,1),
            intArrayOf(1,0))
    ), PINK_7)
}