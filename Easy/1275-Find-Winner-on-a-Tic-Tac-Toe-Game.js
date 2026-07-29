/**
 * @param {number[][]} moves
 * @return {string}
 */
var tictactoe = function(moves) {
    let rows = [0,0,0];
    let cols = [0,0,0];
    let diagonal = 0;
    let antiDiagonal = 0;

    for( let i=0;i<moves.length;i++){
        let row = moves[i][0];
        let col = moves[i][1];

        let player;

        if(i%2 === 0){
            player = +1;
        }else{
            player = -1;
        }

        rows[row] += player;
        cols[col] += player;

        if(row === col){
            diagonal += player;
        }
        if(row+col === 2){
            antiDiagonal += player;
        }

        if(
            Math.abs(rows[row]) === 3 ||
            Math.abs(cols[col]) === 3 ||
            Math.abs(diagonal) === 3 ||
            Math.abs(antiDiagonal) === 3
        ){
            if(player === 1){
                return "A";
            }else{
                return "B";
            }
        }

    }

    if(moves.length === 9){
        return "Draw";
    }
    return "Pending";
};
