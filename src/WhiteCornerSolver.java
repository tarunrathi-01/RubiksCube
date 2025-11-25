public class WhiteCornerSolver {

    private final char[][][] cube;
    private final Moves move;

    public WhiteCornerSolver(RubiksCube rubiksCube) {
        this.cube = rubiksCube.getCube();
        this.move = new Moves(rubiksCube);
    }
    public void CornerSolver(){
        whiteGreenRedSolver();
        whiteGreenOrangeSolver();
        whiteRedBlueSolver();
        whiteBlueOrangeSolver();
    }

    // ---------------------------------------------------------
    //  WHITE-GREEN-RED CORNER
    // ---------------------------------------------------------
    private void whiteGreenRedSolver() {

        if (cube[0][0][0] == 'W' && cube[1][2][0] == 'G' && cube[2][2][2] == 'R') {
            return;
        }

        else if ((cube[0][0][0] == 'G' && cube[1][2][0] == 'R' && cube[2][2][2] == 'W') ||
                (cube[0][0][0] == 'R' && cube[1][2][0] == 'W' && cube[2][2][2] == 'G') ||
                (cube[2][0][2] == 'G' && cube[1][0][0] == 'R' && cube[5][2][0] == 'W') ||
                (cube[2][0][2] == 'R' && cube[1][0][0] == 'W' && cube[5][2][0] == 'G') ||
                (cube[2][0][2] == 'W' && cube[1][0][0] == 'G' && cube[5][2][0] == 'R')) {
            fixGRWCorner();
        }

        else if ((cube[5][0][0] == 'W' && cube[3][0][2] == 'G' && cube[2][0][0] == 'R') ||
                (cube[5][0][0] == 'G' && cube[3][0][2] == 'R' && cube[2][0][0] == 'W') ||
                (cube[5][0][0] == 'R' && cube[3][0][2] == 'W' && cube[2][0][0] == 'G')) {
            PerformAndLogMoves(new String[]{"T`"});
            fixGRWCorner();
        }

        else if ((cube[1][2][2] == 'W' && cube[4][2][0] == 'G' && cube[0][0][2] == 'R') ||
                (cube[1][2][2] == 'G' && cube[4][2][0] == 'R' && cube[0][0][2] == 'W') ||
                (cube[1][2][2] == 'R' && cube[4][2][0] == 'W' && cube[0][0][2] == 'G')) {
            PerformAndLogMoves(new String[]{"R","T","R`"});
            fixGRWCorner();
        }

        else if ((cube[1][0][2] == 'W' && cube[4][0][0] == 'G' && cube[5][2][2] == 'R') ||
                (cube[1][0][2] == 'G' && cube[4][0][0] == 'R' && cube[5][2][2] == 'W') ||
                (cube[1][0][2] == 'R' && cube[4][0][0] == 'W' && cube[5][2][2] == 'G')) {
            PerformAndLogMoves(new String[]{"T"});
            fixGRWCorner();
        }

        else if ((cube[0][2][0] == 'W' && cube[2][0][0] == 'G' && cube[3][2][2] == 'R') ||
                (cube[0][2][0] == 'G' && cube[2][0][0] == 'R' && cube[3][2][2] == 'W') ||
                (cube[0][2][0] == 'R' && cube[2][0][0] == 'W' && cube[3][2][2] == 'G')) {
            PerformAndLogMoves(new String[]{"Ba`","T`","Ba"});
            fixGRWCorner();
        }

        else if ((cube[5][0][2] == 'R' && cube[4][0][2] == 'W' && cube[3][0][0] == 'G') ||
                (cube[5][0][2] == 'W' && cube[4][0][2] == 'G' && cube[3][0][0] == 'R') ||
                (cube[5][0][2] == 'G' && cube[4][0][2] == 'R' && cube[3][0][0] == 'W')) {
            PerformAndLogMoves(new String[]{"2T"});
            fixGRWCorner();
        }

        else if ((cube[0][2][2] == 'W' && cube[3][2][0] == 'G' && cube[4][2][2] == 'R') ||
                (cube[0][2][2] == 'G' && cube[3][2][0] == 'R' && cube[4][2][2] == 'W') ||
                (cube[0][2][2] == 'R' && cube[3][2][0] == 'W' && cube[4][2][2] == 'G')) {
            PerformAndLogMoves(new String[]{"Ba","2T","BA`"});
            fixGRWCorner();
        }
    }
    private boolean IsGRWCornerSolved()
    {
        return (cube[0][0][0] == 'W' && cube[1][2][0] == 'G' && cube[2][2][2] == 'R');
    }

    public void fixGRWCorner() {

        int safety = 0;

        while (!IsGRWCornerSolved() && safety < 20) {
            PerformAndLogMoves(new String[]{"L`","T`","L","T"});
            safety++;
        }

        if (safety == 20) {
            System.out.println("ERROR: GRW corner did not solve after 20 iterations.");
        }
    }





    // ---------------------------------------------------------
    //  WHITE-GREEN-ORANGE CORNER
    // ---------------------------------------------------------
    private void whiteGreenOrangeSolver() {

        if (cube[0][0][2] == 'W' && cube[1][2][2] == 'G' && cube[2][2][0] == 'O') {
            return;
        }

        else if ((cube[0][0][2] == 'G' && cube[1][2][2] == 'O' && cube[2][2][0] == 'W') ||
                (cube[0][0][2] == 'O' && cube[1][2][2] == 'W' && cube[2][2][0] == 'G') ||
                (cube[1][0][2] == 'W' && cube[5][2][2] == 'G' && cube[4][0][0] == 'O') ||
                (cube[1][0][2] == 'G' && cube[5][2][2] == 'O' && cube[4][0][0] == 'W') ||
                (cube[1][0][2] == 'O' && cube[5][2][2] == 'W' && cube[4][0][0] == 'G')) {
        }

        else if ((cube[2][0][2] == 'W' && cube[5][2][0] == 'G' && cube[1][0][0] == 'O') ||
                (cube[2][0][2] == 'G' && cube[5][2][0] == 'O' && cube[1][0][0] == 'W') ||
                (cube[2][0][2] == 'O' && cube[5][2][0] == 'W' && cube[1][0][0] == 'G')) {
        }

        else if ((cube[4][0][2] == 'W' && cube[5][0][2] == 'G' && cube[3][0][0] == 'O') ||
                (cube[4][0][2] == 'G' && cube[5][0][2] == 'O' && cube[3][0][0] == 'W') ||
                (cube[4][0][2] == 'O' && cube[5][0][2] == 'W' && cube[3][0][0] == 'G')) {
        }

        else if ((cube[0][2][2] == 'W' && cube[4][2][2] == 'G' && cube[3][2][0] == 'O') ||
                (cube[0][2][2] == 'G' && cube[4][2][2] == 'O' && cube[3][2][0] == 'W') ||
                (cube[0][2][2] == 'O' && cube[4][2][2] == 'W' && cube[3][2][0] == 'G')) {
        }

        else if ((cube[2][0][0] == 'O' && cube[5][0][0] == 'G' && cube[3][0][2] == 'W') ||
                (cube[2][0][0] == 'G' && cube[5][0][0] == 'W' && cube[3][0][2] == 'O') ||
                (cube[2][0][0] == 'W' && cube[5][0][0] == 'O' && cube[3][0][2] == 'G')) {
        }

        else if ((cube[0][2][0] == 'W' && cube[2][2][0] == 'O' && cube[3][2][2] == 'G') ||
                (cube[0][2][0] == 'O' && cube[2][2][0] == 'G' && cube[3][2][2] == 'W') ||
                (cube[0][2][0] == 'G' && cube[2][2][0] == 'W' && cube[3][2][2] == 'O')) {
        }
    }


    // ---------------------------------------------------------
    //  WHITE-RED-BLUE CORNER
    // ---------------------------------------------------------
    private void whiteRedBlueSolver() {

        if (cube[0][2][0] == 'W' && cube[2][2][0] == 'R' && cube[3][2][2] == 'B') {
            return;
        }

        else if ((cube[0][2][0] == 'R' && cube[2][2][0] == 'B' && cube[3][2][2] == 'W') ||
                (cube[0][2][0] == 'B' && cube[2][2][0] == 'W' && cube[3][2][2] == 'R') ||
                (cube[5][0][0] == 'R' && cube[2][0][0] == 'W' && cube[3][0][2] == 'B') ||
                (cube[5][0][0] == 'W' && cube[2][0][0] == 'B' && cube[3][0][2] == 'R') ||
                (cube[5][0][0] == 'B' && cube[2][0][0] == 'R' && cube[3][0][2] == 'W')) {
        }

        else if ((cube[2][0][2] == 'B' && cube[5][2][0] == 'R' && cube[1][0][0] == 'W') ||
                (cube[2][0][2] == 'R' && cube[5][2][0] == 'W' && cube[1][0][0] == 'B') ||
                (cube[2][0][2] == 'W' && cube[5][2][0] == 'B' && cube[1][0][0] == 'R')) {
        }

        else if ((cube[1][0][2] == 'W' && cube[5][2][2] == 'B' && cube[4][0][0] == 'R') ||
                (cube[1][0][2] == 'B' && cube[5][2][2] == 'R' && cube[4][0][0] == 'W') ||
                (cube[1][0][2] == 'R' && cube[5][2][2] == 'W' && cube[4][0][0] == 'B')) {
        }

        else if ((cube[4][0][2] == 'W' && cube[5][0][2] == 'B' && cube[3][0][0] == 'R') ||
                (cube[4][0][2] == 'B' && cube[5][0][2] == 'R' && cube[3][0][0] == 'W') ||
                (cube[4][0][2] == 'R' && cube[5][0][2] == 'W' && cube[3][0][0] == 'B')) {
        }

        else if ((cube[0][2][2] == 'W' && cube[4][2][2] == 'B' && cube[3][2][0] == 'R') ||
                (cube[0][2][2] == 'B' && cube[4][2][2] == 'R' && cube[3][2][0] == 'W') ||
                (cube[0][2][2] == 'R' && cube[4][2][2] == 'W' && cube[3][2][0] == 'B')) {
        }
    }


    // ---------------------------------------------------------
    //  WHITE-BLUE-ORANGE CORNER
    // ---------------------------------------------------------
    private void whiteBlueOrangeSolver() {

        if (cube[0][2][2] == 'W' && cube[4][2][2] == 'O' && cube[3][2][0] == 'B') {
            return;
        }

        else if ((cube[0][2][2] == 'O' && cube[4][2][2] == 'B' && cube[3][2][0] == 'W') ||
                (cube[0][2][2] == 'B' && cube[4][2][2] == 'W' && cube[3][2][0] == 'O') ||
                (cube[5][0][2] == 'O' && cube[4][2][0] == 'W' && cube[3][0][0] == 'B') ||
                (cube[5][0][2] == 'W' && cube[4][2][0] == 'B' && cube[3][0][0] == 'O') ||
                (cube[5][0][2] == 'B' && cube[4][2][0] == 'O' && cube[3][0][0] == 'W')) {
        }

        else if ((cube[2][0][2] == 'O' && cube[5][2][0] == 'B' && cube[1][0][0] == 'W') ||
                (cube[2][0][2] == 'B' && cube[5][2][0] == 'W' && cube[1][0][0] == 'O') ||
                (cube[2][0][2] == 'W' && cube[5][2][0] == 'O' && cube[1][0][0] == 'B')) {
        }

        else if ((cube[1][0][2] == 'W' && cube[5][2][2] == 'O' && cube[4][0][0] == 'B') ||
                (cube[1][0][2] == 'O' && cube[5][2][2] == 'B' && cube[4][0][0] == 'W') ||
                (cube[1][0][2] == 'B' && cube[5][2][2] == 'W' && cube[4][0][0] == 'O')) {
        }

        else if ((cube[5][0][0] == 'O' && cube[2][0][0] == 'B' && cube[3][0][2] == 'W') ||
                (cube[5][0][0] == 'B' && cube[2][0][0] == 'W' && cube[3][0][2] == 'O') ||
                (cube[5][0][0] == 'W' && cube[2][0][0] == 'O' && cube[3][0][2] == 'B')) {
        }
    }
    private void PerformAndLogMoves(String[] Sequence){
        move.PerformMoves(Sequence);
    }
}
