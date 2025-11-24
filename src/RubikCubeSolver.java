public class RubikCubeSolver {
    public void Solver(RubiksCube cube){
        WhiteCrossSolver crossSolver = new WhiteCrossSolver(cube);
        crossSolver.SolveWhiteCross();
        WhiteCornerSolver cornerSolver = new WhiteCornerSolver(cube);
        cornerSolver.WhiteCornerSolver();
    }
}
