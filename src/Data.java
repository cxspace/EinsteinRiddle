import com.sun.rowset.internal.Row;

/**
 * Created by cx on 2016/09/17.
 */
public class Data {

    //定义存储匹配到一种房子属性的120中情况
    public static final int ARRANGE_ROW = 120;
    //六个属性
    public static final int ARRANGE_COL = 5;

    //存储排列的数组
    public static int arrange[][] = new int[ARRANGE_ROW][ARRANGE_COL];

    public static final int nationalities[] = new int[ARRANGE_COL];
    public static final int NATIONAL_ENGLAND = 1;
    public static final int NATIONAL_SWEDEN = 2;
    public static final int NATIONAL_DENMARK = 3;
    public static final int NATIONAL_NOWAY = 4;
    public static final int NATIONAL_GERMANY = 5;

    public static final int colors[] = new int[ARRANGE_COL];
    public static final int COLOR_RED = 1;
    public static final int COLOR_GREEN = 2;
    public static final int COLOR_WHITE = 3;
    public static final int COLOR_YELLOW = 4;
    public static final int COLOR_BLUE = 5;

    public static final int drinks[] = new int[ARRANGE_COL];
    public static final int DRINK_TEA = 1;
    public static final int DRINK_COFFEE = 2;
    public static final int DRINK_MILK = 3;
    public static final int DRINK_BEER = 4;
    public static final int DRINK_WATER = 5;

    public static final int cigarettes[] = new int[ARRANGE_COL];
    public static final int CIGARETTE_PALL_MALL = 1;
    public static final int CIGARETTE_DAN_HILL = 2;
    public static final int CIGARETTE_BLEND = 3;
    public static final int CIGARETTE_BLUE_MASTER = 4;
    public static final int CIGARETTE_PRINCE = 5;

    public static final int pets[] = new int[ARRANGE_COL];
    public static final int PET_DOG = 1;
    public static final int PET_BIRD = 2;
    public static final int PET_CAT= 3;
    public static final int PET_HORSE = 4;
    public static final int PET_FISH = 5;

    public static final int result[][] = {nationalities,colors,drinks,cigarettes,pets};

}
