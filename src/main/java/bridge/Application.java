package bridge;

import bridge.controller.BridgeGame;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        BridgeGame bridgeGame = new BridgeGame();
        bridgeGame.setting();
        bridgeGame.make();
        bridgeGame.move();
        while (bridgeGame.check()) {
            bridgeGame.move();
        }
        if(!bridgeGame.check()){
            bridgeGame.retry();
        }

    }
}
