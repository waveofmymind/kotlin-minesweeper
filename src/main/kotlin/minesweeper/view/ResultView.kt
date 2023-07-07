package minesweeper.view

import minesweeper.domain.BoardRow
import minesweeper.domain.CellType
import minesweeper.domain.MineBoard

object ResultView {
    fun printBoard(board: MineBoard) {
        for (row in board.getBoardInfo) {
            printRow(row)
            println()
        }
    }

    private fun printRow(row: BoardRow) {
        for (cell in row.rowInfo) {
            print(
                when (cell.type) {
                    CellType.Mine -> "* "
                    CellType.Empty -> "C "
                }
            )
        }
    }
    fun printGameStart() {
        println("지뢰찾기 게임 시작")
    }
}
