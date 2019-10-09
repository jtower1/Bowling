public class Frame {
    int pins = 10;
    int pinsRemaining;
    int score;

   public int frameScore(){
        pinsRemaining = pins - (int)Math.random() * 10;
        if (pinsRemaining>0) {
            pins = pinsRemaining;
            pinsRemaining = pins -(int)Math.random()* pinsRemaining;
        }
        switch (pinsRemaining) {
            case 0:
                score = 10;
                break;
            case 1:
                score = 9;
                break;
            case 2:
                score = 8;
                break;
            case 3:
                score = 7;
                break;
            case 4:
                score = 6;
                break;
            case 5:
                score = 5;
                break;
            case 6:
                score = 4;
                break;
            case 7:
                score = 3;
                break;
            case 8:
                score = 2;
                break;
            case 9:
                score = 1;
                break;
            case 10:
                score = 0;
                break;
        }
        return score;
    }

}
