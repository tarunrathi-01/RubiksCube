public class WhiteCrossSolver {
    private final char[][][] cube;
    private Moves moves;

    public WhiteCrossSolver(RubiksCube rubiksCube) {
        this.cube = rubiksCube.getCube();
        this.moves = new Moves(rubiksCube);
    }

    public void SolveWhiteCross() {
        WhiteGreenSolver();
        WhiteRedSolver();
        WhiteBlueSolver();
        WhiteOrangeSolver();
    }

    private void WhiteGreenSolver() {
        if (cube[0][0][1] == 'W' && cube[1][2][1] == 'G')
            return;
        String Coordinates = GetEdgeCoordinates('G');
        switch (Coordinates) {
            case "BottomAndLeft":
                String[] blSequence = {"B"};
                PerformAndLogMoves(blSequence);
                break;
            case "BottomAndBack":
                String[] bbaSequence = {"2B"};
                PerformAndLogMoves(bbaSequence);
                break;
            case "BottomAndRight":
                String[] brSequence = {"B`"};
                PerformAndLogMoves(brSequence);
                break;
            case "FrontAndTop":
                String[] ftSequence = {"T", "L", "F`"};
                PerformAndLogMoves(ftSequence);
                break;
            case "FrontAndLeft":
                String[] flSequence = {"L", "B"};
                PerformAndLogMoves(flSequence);
                break;
            case "FrontAndRight":
                String[] frSequence = {"R`", "B`"};
                PerformAndLogMoves(frSequence);
                break;
            case "LeftAndTop":
                String[] ltSequence = {"L", "F`"};
                PerformAndLogMoves(ltSequence);
                break;
            case "LeftAndBack":
                String[] lbaSequence = {"2L", "F`"};
                PerformAndLogMoves(lbaSequence);
                break;
            case "BackAndTop":
                String[] batSequence = {"T`", "L", "F`"};
                PerformAndLogMoves(batSequence);
                break;
            case "BackAndRight":
                String[] barSequence = {"R", "B`"};
                PerformAndLogMoves(barSequence);
                break;
            case "RightAndTop":
                String[] rtSequence = {"R`", "F"};
                PerformAndLogMoves(rtSequence);
                break;
            //White edges
            case "WhiteBottomAndFront":
                String[] wbfSequence = {"B`", "L`", "F`"};
                PerformAndLogMoves(wbfSequence);
                break;
            case "WhiteBottomAndLeft":
                String[] wblSequence = {"L`", "F`"};
                PerformAndLogMoves(wblSequence);
                break;
            case "WhiteBottomAndBack":
                String[] wbbaSequence = {"Ba", "R", "B`"};
                PerformAndLogMoves(wbbaSequence);
                break;
            case "WhiteBottomAndRight":
                String[] wbrSequence = {"R", "F"};
                PerformAndLogMoves(wbrSequence);
                break;
            case "WhiteFrontAndTop":
                String[] wftSequence = {"2F"};
                PerformAndLogMoves(wftSequence);
                break;
            case "WhiteFrontAndLeft":
                String[] wflSequence = {"F`"};
                PerformAndLogMoves(wflSequence);
                break;
            case "WhiteFrontAndRight":
                String[] wfrSequence = {"F"};
                PerformAndLogMoves(wfrSequence);
                break;
            case "WhiteLeftAndTop":
                String[] wltSequence = {"T`", "2F"};
                PerformAndLogMoves(wltSequence);
                break;
            case "WhiteLeftAndBack":
                String[] wlbaSequence = {"L`", "B"};
                PerformAndLogMoves(wlbaSequence);
                break;
            case "WhiteBackAndTop":
                String[] wbatSequence = {"2Ba", "2B"};
                PerformAndLogMoves(wbatSequence);
                break;
            case "WhiteBackAndRight":
                String[] wbarSequence = {"2R", "F"};
                PerformAndLogMoves(wbarSequence);
                break;
            case "WhiteRightAndTop":
                String[] wrtSequence = {"2R", "B`"};
                PerformAndLogMoves(wrtSequence);
                break;
        }
    }

    public void WhiteRedSolver() {
        if (cube[0][1][1] == 'W' && cube[2][2][1] == 'R')
            return;
        String coordinates = GetEdgeCoordinates('R');
        switch (coordinates) {
            case "BottomAndBack":
                PerformAndLogMoves(new String[]{"F", "B", "F`"});
                break;
            case "BottomAndRight":
                PerformAndLogMoves(new String[]{"F", "2B", "F`"});
                break;
            case "FrontAndTop":
                PerformAndLogMoves(new String[]{"F`", "L", "F"});
                break;
            case "FrontAndLeft":
                PerformAndLogMoves(new String[]{"L"});
                break;
            case "FrontAndRight":
                PerformAndLogMoves(new String[]{"R`", "F", "2B", "F`"});
                break;
            case "LeftAndTop":
                PerformAndLogMoves(new String[]{"L", "R`", "B`", "F"});
                break;
            case "LeftAndBack":
                PerformAndLogMoves(new String[]{"Ba", "F`", "B", "F"});
                break;
            case "BackAndTop":
                PerformAndLogMoves(new String[]{"Ba", "L`"});
                break;
            case "BackAndRight":
                PerformAndLogMoves(new String[]{"2Ba", "L`"});
                break;
            case "RightAndTop":
                PerformAndLogMoves(new String[]{"R`", "F", "B`", "F`"});
                break;
            //White Cases
            case "WhiteBottomAndLeft":
                PerformAndLogMoves(new String[]{"F`", "B", "F", "L"});
                break;
            case "WhiteBottomAndRight":
                PerformAndLogMoves(new String[]{"F", "R", "F", "B`", "2F"});
                break;
            case "WhiteBottomAndBack":
                PerformAndLogMoves(new String[]{"Ba`", "L`"});
                break;
            case "WhiteFrontAndTop":
                PerformAndLogMoves(new String[]{"T", "2F"});
                break;
            case "WhiteFrontAndLeft":
                PerformAndLogMoves(new String[]{"B", "F`", "B`"});
                break;
            case "WhiteFrontAndRight":
                PerformAndLogMoves(new String[]{"B", "F", "B`"});
                break;
            case "WhiteLeftAndTop":
                PerformAndLogMoves(new String[]{"2L"});
                break;
            case "WhiteLeftAndBack":
                PerformAndLogMoves(new String[]{"L`"});
                break;
            case "WhiteBackAndTop":
                PerformAndLogMoves(new String[]{"T`", "2L"});
                break;
            case "WhiteBackAndRight":
                PerformAndLogMoves(new String[]{"B`", "Ba`", "B"});
                break;
            case "WhiteRightAndTop":
                PerformAndLogMoves(new String[]{"2T", "2L"});
                break;
        }
    }

    private void WhiteBlueSolver() {
        if (cube[0][2][1] == 'W' && cube[3][2][1] == 'B') {
            return;
        }
        String coordinates = GetEdgeCoordinates('B');
        switch (coordinates) {
            case "BottomAndRight":
                PerformAndLogMoves(new String[]{"F`", "L`", "B", "L", "F"});
                break;
            case "FrontAndTop":
                PerformAndLogMoves(new String[]{"B`", "F", "R`", "B"});
                break;
            case "FrontAndLeft":
                PerformAndLogMoves(new String[]{"B", "L", "B`"});
                break;
            case "FrontAndRight":
                PerformAndLogMoves(new String[]{"B`", "R`", "B"});
                break;
            case "LeftAndTop":
                PerformAndLogMoves(new String[]{"B", "L`", "B`", "Ba"});
                break;
            case "LeftAndBack":
                PerformAndLogMoves(new String[]{"Ba"});
                break;
            case "BackAndTop":
                PerformAndLogMoves(new String[]{"Ba", "B", "L`", "B`"});
                break;
            case "BackAndRight":
                PerformAndLogMoves(new String[]{"B`", "R", "B"});
                break;
            case "RightAndTop":
                PerformAndLogMoves(new String[]{"R", "Ba`"});
                break;

            // White Cases
            case "WhiteBottomAndRight":
                PerformAndLogMoves(new String[]{"R`", "Ba`"});
                break;
            case "WhiteBottomAndBack":
                PerformAndLogMoves(new String[]{"B`", "R`", "B", "Ba`"});
                break;
            case "WhiteFrontAndTop":
                PerformAndLogMoves(new String[]{"2T", "2Ba"});
                break;
            case "WhiteFrontAndLeft":
                PerformAndLogMoves(new String[]{"B", "2L", "B`", "Ba"});
                break;
            case "WhiteFrontAndRight":
                PerformAndLogMoves(new String[]{"2R", "Ba`"});
                break;
            case "WhiteLeftAndTop":
                PerformAndLogMoves(new String[]{"T", "2Ba"});
                break;
            case "WhiteLeftAndBack":
                PerformAndLogMoves(new String[]{"B", "L`", "B`"});
                break;
            case "WhiteBackAndTop":
                PerformAndLogMoves(new String[]{"2Ba"});
                break;
            case "WhiteBackAndRight":
                PerformAndLogMoves(new String[]{"Ba`"});
                break;
            case "WhiteRightAndTop" :
                PerformAndLogMoves(new String[]{"T`", "2Ba"});
                break;

        }
    }

    private void WhiteOrangeSolver() {
        if (cube[0][1][2] == 'W' && cube[4][2][1] == 'O') {
            return;
        }
        String coordinates = GetEdgeCoordinates('O');
        switch (coordinates) {
            case "FrontAndTop":
                PerformAndLogMoves(new String[]{"B`","F","B","R`"});
                break;
            case "FrontAndLeft":
                PerformAndLogMoves(new String[]{"B`","2F","B","R`"});
                break;
            case "FrontAndRight":
                PerformAndLogMoves(new String[]{"R`"});
                break;
            case "LeftAndTop":
                PerformAndLogMoves(new String[]{"T`","B`","F","B","R`"});
                break;
            case "LeftAndBack":
                PerformAndLogMoves(new String[]{"B","Ba","B`"});
                break;
            case "BackAndTop":
                PerformAndLogMoves(new String[]{"B","Ba`","B`","R"});
                break;
            case "BackAndRight":
                PerformAndLogMoves(new String[]{"R"});
                break;
            case "RightAndTop":
                PerformAndLogMoves(new String[]{"R","B","Ba`","B`"});
                break;
            case "WhiteBottomAndRight":
                PerformAndLogMoves(new String[]{"B`","F`","B","R`"});
                break;
            case "WhiteFrontAndTop":
                PerformAndLogMoves(new String[]{"T`","2R"});
                break;
            case "WhiteFrontAndLeft":
                PerformAndLogMoves(new String[]{"B`","F`","B","T`","2R"});
                break;
            case "WhiteFrontAndRight":
                PerformAndLogMoves(new String[]{"B`","F","B"});
                break;
            case "WhiteLeftAndTop":
                PerformAndLogMoves(new String[]{"2T","2R"});
                break;
            case "WhiteLeftAndBack":
                PerformAndLogMoves(new String[]{"2B","L","2T","2R"});
                break;
            case "WhiteBackAndTop":
                PerformAndLogMoves(new String[]{"B","2Ba","B`"});
                break;
            case "WhiteBackAndRight":
                PerformAndLogMoves(new String[]{"B","Ba`","B`"});
                break;
            case "WhiteRightAndTop":
                PerformAndLogMoves(new String[]{"2R"});
                break;
        }
    }



    private String GetEdgeCoordinates(char color){
        char[] cases = {'a','b','c','d','e','f','g','h','i','j','k','l'};
        for (char aCase : cases) {
            int[][] edgeCoordinates = EdgeCoordinates(aCase);
            int[] coord1 = edgeCoordinates[0];
            int[] coord2 = edgeCoordinates[1];

            if (cube[coord1[0]][coord1[1]][coord1[2]] == 'W' && cube[coord2[0]][coord2[1]][coord2[2]] == color) {
                return EdgeName(aCase);
            } else if (cube[coord1[0]][coord1[1]][coord1[2]] == color && cube[coord2[0]][coord2[1]][coord2[2]] == 'W') {
                return "White" + EdgeName(aCase);
            }
        }
        return "";
    }

    private int[][] EdgeCoordinates(char var){
        return switch (var) {
            case 'a' -> new int[][]{{0, 0, 1}, {1, 2, 1}};
            case 'b' -> new int[][]{{0, 1, 0}, {2, 2, 1}};
            case 'c' -> new int[][]{{0, 2, 1}, {3, 2, 1}};
            case 'd' -> new int[][]{{0, 1, 2}, {4, 2, 1}};
            case 'e' -> new int[][]{{1, 0, 1}, {5, 2, 1}};
            case 'f' -> new int[][]{{1, 1, 0}, {2, 1, 2}};
            case 'g' -> new int[][]{{1, 1, 2}, {4, 1, 0}};
            case 'h' -> new int[][]{{2, 0, 1}, {5, 1, 0}};
            case 'i' -> new int[][]{{2, 1, 0}, {3, 1, 2}};
            case 'j' -> new int[][]{{3, 0, 1}, {5, 0, 1}};
            case 'k' -> new int[][]{{3, 1, 0}, {4, 1, 2}};
            case 'l' -> new int[][]{{4, 0, 1}, {5, 1, 2}};
            default -> new int[][]{{0, 0, 0}, {0, 0, 0}};
        };
    }

    private String EdgeName(char var){
        return switch (var) {
            case 'a' -> "BottomAndFront";
            case 'b' -> "BottomAndLeft";
            case 'c' -> "BottomAndBack";
            case 'd' -> "BottomAndRight";
            case 'e' -> "FrontAndTop";
            case 'f' -> "FrontAndLeft";
            case 'g' -> "FrontAndRight";
            case 'h' -> "LeftAndTop";
            case 'i' -> "LeftAndBack";
            case 'j' -> "BackAndTop";
            case 'k' -> "BackAndRight";
            case 'l' -> "RightAndTop";
            default -> "";
        };
    }

    private void PerformAndLogMoves(String[] Sequence){
        moves.PerformMoves(Sequence);
    }

}
