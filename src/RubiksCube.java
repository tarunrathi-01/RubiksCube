public class RubiksCube {

    private char[][][] cube = new char[6][3][3];
    private static final char[] colors = {'W','G','R','B','O','Y'};

    public static final int BOTTOM = 0;
    public static final int FRONT = 1;
    public static final int LEFT = 2;
    public static final int BACK = 3;
    public static final int RIGHT = 4;
    public static final int TOP = 5;

    public void InitiateCube(){
        for (int face =0;face<6;face ++){
            for(int i = 0; i<3; i++){
                for(int j=0;j<3;j++){
                    cube[face][i][j] = colors[face];
                }
            }
        }
    }

    public void DisplayCube(){
        for(int face = 0;face<6; face ++){
            for(int i=0;i<3;i++){
                for (int j=0;j<3;j++){
                    System.out.print(cube[face][i][j] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public char[][][] getCube(){
        return cube;
    }
}
