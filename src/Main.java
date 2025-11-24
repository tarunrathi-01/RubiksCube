//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        RubiksCube cube = new RubiksCube();
        char[][][] Rubik = cube.getCube();

        Moves move = new Moves(cube);
        cube.InitiateCube();


        move.PerformMoves(new String[]{"B", "B", "F","L" , "R`", "Ba","T"});

        cube.DisplayCube();
        RubikCubeSolver solver= new RubikCubeSolver();
        solver.Solver(cube);
        cube.DisplayCube();
        }
    }
