public class Moves {
    private final char[][][] cube;

    public Moves(RubiksCube rubiksCube){
        this.cube = rubiksCube.getCube();
    }

    public void FaceRotationClockwise(int face){
        char temp = cube[face][0][0];
        cube[face][0][0] = cube[face][2][0];
        cube[face][2][0] = cube[face][2][2];
        cube[face][2][2] = cube[face][0][2];
        cube[face][0][2] = temp;

        temp = cube[face][0][1];
        cube[face][0][1] = cube[face][1][0];
        cube[face][1][0] = cube[face][2][1];
        cube[face][2][1] = cube[face][1][2];
        cube[face][1][2] = temp;

    }

    public void FaceRotationCounterClockwise(int face){
        char temp = cube[face][0][0];
        cube[face][0][0] = cube[face][0][2];
        cube[face][0][2] = cube[face][2][2];
        cube[face][2][2] = cube[face][2][0];
        cube[face][2][0] = temp;

        temp = cube[face][0][1];
        cube[face][0][1] = cube[face][1][2];
        cube[face][1][2] = cube[face][2][1];
        cube[face][2][1] = cube[face][1][0];
        cube[face][1][0] = temp;
    }

    public void RotateBottomClockwise(){
        FaceRotationClockwise(RubiksCube.BOTTOM);

        char[] temp = {cube[1][2][0] ,cube[1][2][1] ,cube[1][2][2]};

        cube[1][2][0] = cube[2][2][0];
        cube[1][2][1] = cube[2][2][1];
        cube[1][2][2] = cube[2][2][2];

        cube[2][2][0] = cube[3][2][0];
        cube[2][2][1] = cube[3][2][1];
        cube[2][2][2] = cube[3][2][2];

        cube[3][2][0] = cube[4][2][0];
        cube[3][2][1] = cube[4][2][1];
        cube[3][2][2] = cube[4][2][2];

        cube[4][2][0] = temp[0];
        cube[4][2][1] = temp[1];
        cube[4][2][2] = temp[2];

    }
    public void RotateBottomCounterClockwise(){
        FaceRotationCounterClockwise(RubiksCube.BOTTOM);

        char[] temp = { cube[1][2][0], cube[1][2][1], cube[1][2][2] };

        cube[1][2][0] = cube[4][2][0];
        cube[1][2][1] = cube[4][2][1];
        cube[1][2][2] = cube[4][2][2];

        cube[4][2][0] = cube[3][2][0];
        cube[4][2][1] = cube[3][2][1];
        cube[4][2][2] = cube[3][2][2];

        cube[3][2][0] = cube[2][2][0];
        cube[3][2][1] = cube[2][2][1];
        cube[3][2][2] = cube[2][2][2];

        cube[2][2][0] = temp[0];
        cube[2][2][1] = temp[1];
        cube[2][2][2] = temp[2];

    }

    public void RotateFrontClockwise(){
        FaceRotationClockwise(RubiksCube.FRONT);

        char[] temp = {cube[0][0][0] ,cube[0][0][1] ,cube[0][0][2]};

        cube[0][0][0] = cube[4][2][0];
        cube[0][0][1] = cube[4][1][0];
        cube[0][0][2] = cube[4][0][0];

        cube[4][0][0] = cube[5][2][0];
        cube[4][1][0] = cube[5][2][1];
        cube[4][2][0] = cube[5][2][2];

        cube[5][2][2] = cube[2][0][2];
        cube[5][2][1] = cube[2][1][2];
        cube[5][2][0] = cube[2][2][2];

        cube[2][0][2] = temp[0];
        cube[2][1][2] = temp[1];
        cube[2][2][2] = temp[2];

    }
    public void RotateFrontCounterClockwise(){
        FaceRotationCounterClockwise(RubiksCube.FRONT);

        char[] temp = {cube[0][0][0] ,cube[0][0][1] ,cube[0][0][2]};

        cube[0][0][0] = cube[2][0][2];
        cube[0][0][1] = cube[2][1][2];
        cube[0][0][2] = cube[2][2][2];

        cube[2][0][2] = cube[5][2][2];
        cube[2][1][2] = cube[5][2][1];
        cube[2][2][2] = cube[5][2][0];

        cube[5][2][0] = cube[4][0][0];
        cube[5][2][1] = cube[4][1][0];
        cube[5][2][2] = cube[4][2][0];

        cube[4][0][0] = temp[2];
        cube[4][1][0] = temp[1];
        cube[4][2][0] = temp[0];

    }

    public void RotateLeftClockwise(){
        FaceRotationClockwise(RubiksCube.LEFT);

        char[] temp = {cube[0][0][0] , cube[0][1][0] , cube[0][2][0]};

        cube[0][0][0] = cube[1][0][0];
        cube[0][1][0] = cube[1][1][0];
        cube[0][2][0] = cube[1][2][0];

        cube[1][0][0] = cube[5][0][0];
        cube[1][1][0] = cube[5][1][0];
        cube[1][2][0] = cube[5][2][0];

        cube[5][0][0] = cube[3][2][2];
        cube[5][1][0] = cube[3][1][2];
        cube[5][2][0] = cube[3][0][2];

        cube[3][0][2] = temp[0];
        cube[3][1][2] = temp[1];
        cube[3][2][2] = temp[2];
    }
    public void RotateLeftCounterClockwise(){
        FaceRotationCounterClockwise(RubiksCube.LEFT);
        char[] temp = {cube[0][0][0], cube[0][1][0] ,cube[0][2][0]};

        cube[0][0][0] = cube[3][2][2];
        cube[0][1][0] = cube[3][1][2];
        cube[0][2][0] = cube[3][0][2];

        cube[3][0][2] = cube[5][2][0];
        cube[3][1][2] = cube[5][1][0];
        cube[3][2][2] = cube[5][0][0];

        cube[5][0][0] = cube[1][0][0];
        cube[5][1][0] = cube[1][1][0];
        cube[5][2][0] = cube[1][2][0];

        cube[1][0][0] = temp[0];
        cube[1][1][0] = temp[1];
        cube[1][2][0] = temp[2];
    }

    public void RotateBackClockwise(){
        FaceRotationClockwise(RubiksCube.BACK);

        char[] temp = { cube[0][2][0] , cube[0][2][1] , cube[0][2][2]};

        cube[0][2][0] = cube[2][0][0];
        cube[0][2][1] = cube[2][1][0];
        cube[0][2][2] = cube[2][2][0];

        cube[2][0][0] = cube[5][0][2];
        cube[2][1][0] = cube[5][0][1];
        cube[2][2][0] = cube[5][0][0];

        cube[5][0][0] = cube[4][0][2];
        cube[5][0][1] = cube[4][1][2];
        cube[5][0][2] = cube[4][2][2];

        cube[4][0][2] = temp[2];
        cube[4][1][2] = temp[1];
        cube[4][2][2] = temp[0];
    }

    public void RotateBackCounterClockwise(){
        FaceRotationCounterClockwise(RubiksCube.BACK);

        char[] temp = {cube[0][2][0] , cube[0][2][1] , cube[0][2][2]};

        cube[0][2][2] = cube[4][0][2];
        cube[0][2][1] = cube[4][1][2];
        cube[0][2][0] = cube[4][2][2];

        cube[4][0][2] = cube[5][0][0];
        cube[4][1][2] = cube[5][0][1];
        cube[4][2][2] = cube[5][0][2];

        cube[5][0][0] = cube[2][2][0];
        cube[5][0][1] = cube[2][1][0];
        cube[5][0][2] = cube[2][0][0];

        cube[2][0][0] = temp[2];
        cube[2][1][0] = temp[1];
        cube[2][2][0] = temp[0];
    }

    public void RotateRightClockwise(){
        FaceRotationClockwise(RubiksCube.RIGHT);

        char[] temp = {cube[0][0][2] , cube[0][1][2] , cube[0][2][2]};

        cube[0][0][2] = cube[3][2][0];
        cube[0][1][2] = cube[3][1][0];
        cube[0][2][2] = cube[3][0][0];

        cube[3][2][0] = cube[5][0][2];
        cube[3][1][0] = cube[5][1][2];
        cube[3][0][0] = cube[5][2][2];

        cube[5][0][2] = cube[1][0][2];
        cube[5][1][2] = cube[1][1][2];
        cube[5][2][2] = cube[1][2][2];

        cube[1][0][2] = temp[0];
        cube[1][1][2] = temp[1];
        cube[1][2][2] = temp[2];
    }

    public void RotateRightCounterClockwise(){
        FaceRotationCounterClockwise(RubiksCube.RIGHT);

        char[] temp = {cube[0][0][2] , cube[0][1][2] , cube[0][2][2]};

        cube[0][0][2] = cube[1][0][2];
        cube[0][1][2] = cube[1][1][2];
        cube[0][2][2] = cube[1][2][2];

        cube[1][0][2] = cube[5][0][2];
        cube[1][1][2] = cube[5][1][2];
        cube[1][2][2] = cube[5][2][2];

        cube[5][0][2] = cube[3][2][0];
        cube[5][1][2] = cube[3][1][0];
        cube[5][2][2] = cube[3][0][0];

        cube[3][2][0] = temp[0];
        cube[3][1][0] = temp[1];
        cube[3][0][0] = temp[2];
    }
    public void RotateTopClockwise(){
        FaceRotationClockwise(RubiksCube.TOP);

        char[] temp = {cube[1][0][0] , cube[1][0][1] , cube[1][0][2]};

        cube[1][0][0] = cube[4][0][0];
        cube[1][0][1] = cube[4][0][1];
        cube[1][0][2] = cube[4][0][2];

        cube[4][0][0] = cube[3][0][0];
        cube[4][0][1] = cube[3][0][1];
        cube[4][0][2] = cube[3][0][2];

        cube[3][0][0] = cube[2][0][0];
        cube[3][0][1] = cube[2][0][1];
        cube[3][0][2] = cube[2][0][2];

        cube[2][0][0] = temp[0];
        cube[2][0][1] = temp[1];
        cube[2][0][2] = temp[2];

    }

    public void RotateTopCounterClockwise(){
        FaceRotationCounterClockwise(RubiksCube.TOP);

        char[] temp = {cube[1][0][0] , cube[1][0][1] , cube[1][0][2]};

        cube[1][0][0] = cube[2][0][0];
        cube[1][0][1] = cube[2][0][1];
        cube[1][0][2] = cube[2][0][2];

        cube[2][0][0] = cube[3][0][0];
        cube[2][0][1] = cube[3][0][1];
        cube[2][0][2] = cube[3][0][2];

        cube[3][0][0] = cube[4][0][0];
        cube[3][0][1] = cube[4][0][1];
        cube[3][0][2] = cube[4][0][2];

        cube[4][0][0] = temp[0];
        cube[4][0][1] = temp[1];
        cube[4][0][2] = temp[2];

    }

    public void PerformMoves(String[] Sequence){
        for (String s : Sequence) {
            switch (s) {
                case "B":
                    RotateBottomClockwise();
                    break;
                case "B`":
                    RotateBottomCounterClockwise();
                    break;
                case "F":
                    RotateFrontClockwise();
                    break;
                case "F`":
                    RotateFrontCounterClockwise();
                    break;
                case "L":
                    RotateLeftClockwise();
                    break;
                case "L`":
                    RotateLeftCounterClockwise();
                    break;
                case "Ba":
                    RotateBackClockwise();
                    break;
                case "Ba`":
                    RotateBackCounterClockwise();
                    break;
                case "R":
                    RotateRightClockwise();
                    break;
                case "R`":
                    RotateRightCounterClockwise();
                    break;
                case "T":
                    RotateTopClockwise();
                    break;
                case "T`":
                    RotateTopCounterClockwise();
                    break;
                case "2B":
                    RotateBottomClockwise();
                    RotateBottomClockwise();
                    break;
                case "2F":
                    RotateFrontClockwise();
                    RotateFrontClockwise();
                    break;
                case "2L":
                    RotateLeftClockwise();
                    RotateLeftClockwise();
                    break;
                case "2Ba":
                    RotateBackClockwise();
                    RotateBackClockwise();
                    break;
                case "2R":
                    RotateRightClockwise();
                    RotateRightClockwise();
                    break;
                case "2T":
                    RotateTopClockwise();
                    RotateTopClockwise();
                    break;
            }
        }
    }
}
