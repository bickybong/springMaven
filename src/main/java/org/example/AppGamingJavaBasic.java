public class AppGamingJavaBasic {

    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(MarioGame);
        GameRunner.run();
    }
}
