public class Moves {
    private char[][][] cube;

    public Moves(RubiksCube rubiksCube){
        this.cube = rubiksCube.getCube();
    }

    public void faceRotationClockwise(int face){
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

    public void faceRotationCounterClockwise(int face){
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

    public void rotateBottomClockwise(){
        faceRotationClockwise(RubiksCube.BOTTOM);

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
    public void rotateBottomCounterClockwise(){
        faceRotationCounterClockwise(RubiksCube.BOTTOM);

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

    public void rotateFrontClockwise(){
        faceRotationClockwise(RubiksCube.FRONT);

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
    public void rotateFrontCounterClockwise(){
        faceRotationCounterClockwise(RubiksCube.FRONT);

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

    public void rotateLeftClockwise(){
        faceRotationClockwise(RubiksCube.LEFT);

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
}
