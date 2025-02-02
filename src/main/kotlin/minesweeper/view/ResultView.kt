package minesweeper.view

import minesweeper.domain.BoardRow
import minesweeper.domain.EmptyCell
import minesweeper.domain.MineBoard
import minesweeper.domain.MineCell

object ResultView {
    fun printBoard(board: MineBoard) {
        for (row in board.boardInfo) {
            printRow(row)
            println()
        }
    }

    private fun printRow(row: BoardRow) {
        for (cell in row.rowInfo) {
            print(
                when {
                    cell.isOpen -> when (cell) {
                        is MineCell -> "* "
                        is EmptyCell -> "${cell.mineCount} "
                    }
                    else -> "C "
                }
            )
        }
    }

    fun printGameStart() {
        println("지뢰찾기 게임 시작")
    }

    fun printLose() {
        println("Lose Game.")
    }

    fun printWin() {
        println("Win Game.")
    }
}
