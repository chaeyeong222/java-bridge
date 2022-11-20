package bridge.view;

public class Print {
    private static String GAME_START_MESSAGE = "다리 건너기 게임을 시작합니다.";
    private static String REQUEST_BRIDGE_LENGTH_MESSAGE = "다리의 길이를 입력해주세요.";
    private static String PICK_A_PART_MESSAGE = "이동할 칸을 선택해주세요. (위: U, 아래: D)";
    private static String ASK_RETRY_MESSAGE = "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)";

    public static void gameStartMessage(){
        System.out.println(GAME_START_MESSAGE);
    }
    public static void requestBridgeLengthMessage(){
        System.out.println(REQUEST_BRIDGE_LENGTH_MESSAGE);
    }
    public static void requestPickAPartOfBridgeMessage(){ System.out.println(PICK_A_PART_MESSAGE); }
    public static void askRetryMessage(){ System.out.println(ASK_RETRY_MESSAGE); }

    public static void exceptionMessage(Exception e) {
        System.out.println(e.getMessage());
    }
}

