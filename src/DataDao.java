/**
 * Created by cx on 2016/09/18.
 */
public class DataDao {

    //拿到120中全排列
    public static void arrangeInit(int arrange[][]){
        int p=0;
        for (int i = 1 ; i <= 5 ; i++){
            for (int j = 1 ; j <= 5 ; j++){
                for(int k = 1 ; k <= 5 ; k++){
                    for (int l = 1 ; l <= 5 ; l++){
                        for (int m = 1 ; m <= 5 ; m++){

                            if(i!=j&&i!=k&&i!=l&&i!=m&&j!=k&&j!=l&&j!=m&&k!=l&&k!=m&&l!=m) {
                                arrange[p][0] = i;
                                arrange[p][1] = j;
                                arrange[p][2] = k;
                                arrange[p][3] = l;
                                arrange[p][4] = m;
                                p++;
                            //    System.out.println("第" + p + "次:" + i + "-" + j + "-" + k + "-" + l + "-" + m);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void printResult(int result[][]){
        //输出结果的国籍情况
        for (int i = 0 ; i < 5 ; i++){
            switch (result[0][i]){
                case 1:
                    System.out.print("英国人 ");
                    break;
                case 2:
                    System.out.print("瑞典人 ");
                    break;
                case 3:
                    System.out.print("丹麦人 ");
                    break;
                case 4:
                    System.out.print("挪威人 ");
                    break;
                case 5:
                    System.out.print("德国人 ");
                    break;
            }
        }

        System.out.println();

        //遍历颜色情况
        for (int i = 0 ; i < 5 ; i++){
                switch (result[1][i]) {
                    case 1:
                        System.out.print("红色房子 ");
                        break;
                    case 2:
                        System.out.print("绿色房子 ");
                        break;
                    case 3:
                        System.out.print("白色房子 ");
                        break;
                    case 4:
                        System.out.print("黄色房子 ");
                        break;
                    case 5:
                        System.out.print("蓝色房子 ");
                        break;
                }
        }

        System.out.println();
        //遍历饮料情况
        for (int i = 0 ; i < 5 ; i++){
            switch (result[2][i]) {
                case 1:
                    System.out.print("茶 ");
                    break;
                case 2:
                    System.out.print("咖啡 ");
                    break;
                case 3:
                    System.out.print("牛奶 ");
                    break;
                case 4:
                    System.out.print("啤酒 ");
                    break;
                case 5:
                    System.out.print("水 ");
                    break;
            }
        }

        System.out.println();

        //遍历香烟情况
        for (int i = 0 ; i < 5 ; i++){
            switch (result[3][i]) {
                case 1:
                    System.out.print("PallMall ");
                    break;
                case 2:
                    System.out.print("DanHill ");
                    break;
                case 3:
                    System.out.print("Blend ");
                    break;
                case 4:
                    System.out.print("BlueMaster ");
                    break;
                case 5:
                    System.out.print("Prince ");
                    break;
            }
        }

        System.out.println();

        //遍历宠物情况
        for (int i = 0 ; i < 5 ; i++){
            switch (result[4][i]) {
                case 1:
                    System.out.print("狗 ");
                    break;
                case 2:
                    System.out.print("鸟 ");
                    break;
                case 3:
                    System.out.print("猫 ");
                    break;
                case 4:
                    System.out.print("马 ");
                    break;
                case 5:
                    System.out.print("鱼 ");
                    break;
            }
        }
        System.out.println();

    }

    //1、英国人住红色房子 0 1
    public static boolean check01(int result[][]){
        for (int i = 0 ; i < Data.nationalities.length ; i++){
            if (result[0][i] == Data.NATIONAL_ENGLAND){
                if (result[1][i] == Data.COLOR_RED){
                    return true;
                }
            }
        }
        return false;
    }

    //    2、瑞典人养狗 0 4
    public static boolean check02(int result[][]){
         for (int i = 0 ; i < Data.nationalities.length; i ++ ){
             if (result[0][i]==Data.NATIONAL_SWEDEN){
                 if (result[4][i]==Data.PET_DOG){
                     return true;
                 }
             }
         }
        return false;
    }
//    3、丹麦人喝茶 0 2
    public  static  boolean check03(int result[][]){
        for (int i = 0 ; i < Data.nationalities.length ; i ++){
            if (result[0][i]==Data.NATIONAL_DENMARK){
                if (result[2][i]==Data.DRINK_TEA){
                    return true;
                }
            }
        }
        return false;
    }
//    4、绿色房子在白色房子左面（紧邻的左边） 0 1
    public static boolean check04(int result[][]){
        for (int i = 0 ; i < Data.colors.length ; i++){
            if (result[1][i]==Data.COLOR_GREEN){
                for (int j = 0 ; j < Data.colors.length ; j++){
                    if (result[1][j]==Data.COLOR_WHITE){
                        if (j - i==1){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
//    5、绿色房子主人喝咖啡 1 2
    public static boolean check05(int result[][]){
        for (int i = 0 ; i < Data.colors.length ; i ++){
            if (result[1][i]==Data.COLOR_GREEN){
                if (result[2][i]==Data.DRINK_COFFEE){
                    return true;
                }
            }
        }
        return false;
    }
//    6、抽Pall Mall 香烟的人养鸟 3 4
    public static boolean check06(int result[][]){
        for (int i = 0 ; i < Data.cigarettes.length ; i ++){
            if (result[3][i]==Data.CIGARETTE_PALL_MALL){
                if (result[4][i]==Data.PET_BIRD){
                    return true;
                }
            }
        }
        return false;
    }
//    7、黄色房子主人抽Dunhill香烟 1 3
    public static boolean check07(int result[][]){
        for (int i = 0 ; i < Data.colors.length ; i++){
            if (result[1][i]==Data.COLOR_YELLOW){
                if (result[3][i]==Data.CIGARETTE_DAN_HILL){
                    return true;
                }
            }
        }
        return false;
    }
//    8、住在中间房子的人喝牛奶 2 2
    public static boolean check08(int result[][]){
        if (result[2][2]==Data.DRINK_MILK){
            return true;
        }
        return false;
    }
//    9、 挪威人住第一间房 0 0
    public static boolean check09(int result[][]){
        if (result[0][0]==Data.NATIONAL_NOWAY){
            return true;
        }
        return false;
    }
//    10、抽Blends香烟的人住在养猫的人隔壁 3 4
    public static boolean check10(int result[][]){
        for (int i = 0 ; i < Data.cigarettes.length ; i ++){
            if (result[3][i]==Data.CIGARETTE_BLEND){
                for (int j = 0 ; j < Data.pets.length ; i ++){
                    if (result[4][j]==Data.PET_CAT){
                        if (Math.abs(i-j)==1){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
//    11、养马的人住抽Dunhill香烟的人隔壁 4 3
    public static boolean check11(int result[][]){
        for (int i = 0 ; i < Data.pets.length ; i++){
            if (result[4][i]==Data.PET_HORSE){
                for (int j = 0 ; j < Data.cigarettes.length ; j ++){
                    if (result[3][j]==Data.CIGARETTE_DAN_HILL){
                        if (Math.abs(i-j)==1){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

//    12、抽Blue Master的人喝啤酒 2 3
    public static boolean check12(int result[][]){
        for (int i = 0 ; i < Data.cigarettes.length ; i++){
            if (result[3][i]==Data.CIGARETTE_BLUE_MASTER){
                if (result[2][i]==Data.DRINK_BEER){
                    return true;
                }
            }
        }
        return false;
    }
//    13、德国人抽Prince香烟 0 3
    public static boolean check13(int result[][]) {
        for (int i = 0; i < Data.nationalities.length; i++) {
            if (result[0][i] == Data.NATIONAL_GERMANY) {
                if (result[3][i] == Data.CIGARETTE_PRINCE) {
                    return true;
                }
            }
        }
        return false;
    }
//    14、挪威人住蓝色房子隔壁 0 1
    public static boolean check14(int result[][]){
        for (int i = 0 ; i < Data.nationalities.length ; i ++){
            if (result[0][i]==Data.NATIONAL_NOWAY){
                for (int j = 0 ; j < Data.colors.length ; j++){
                    if (result[1][j]==Data.COLOR_BLUE){
                        if (Math.abs(i-j)==1){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

//    15、抽Blends香烟的人有一个喝水的邻居 2 3
    public static boolean check15(int result[][]){
        for (int i = 0 ; i < Data.cigarettes.length ; i++){
            if (result[3][i]==Data.CIGARETTE_BLEND){
                for (int j = 0 ; j < Data.drinks.length ; j ++){
                    if (result[2][j]==Data.DRINK_WATER){
                        if (Math.abs(i-j)==1){
                            return true;
                        }
                    }
                }
            }
       }
        return false;
    }

    public static int[][] calculate(){

        //计数
        int p = 1;
        int result[][] = new int[5][5];
        arrangeInit(Data.arrange);

        for (int j = 0 ; j < 120 ; j++){
            for (int i = 0 ; i < 5 ; i++){
                //第一行遍历
                result[0][i] = Data.arrange[j][i];
            }
            //如果不满足条件执行下一次循环
            if (!check09(result)){
               //只删选出符合条件的
                continue;
            }

            for (int k = 0 ; k < 120 ; k++){
                //第二行遍历
                for (int i = 0 ; i < 5 ; i++){
                    result[1][i] = Data.arrange[k][i];
                }
                //条件1或者条件14不满足,下一次迭代
                if (!check01(result)||!check14(result)||!check04(result)){
                    continue;
                }

                for (int l = 0 ; l < 120 ; l++){
                    for (int i = 0 ; i < 5 ; i++){
                      //第三行遍历
                       result[2][i] = Data.arrange[l][i];
                    }
                    if (!check03(result)||!check05(result)||!check08(result)){
                        continue;
                    }

                    for (int m = 0 ; m < 120 ; m++){
                        for (int i = 0 ; i < 5 ; i ++){
                            //第四行遍历
                            result[3][i] = Data.arrange[m][i];
                        }

                        if (!check07(result)||!check12(result)||!check13(result)||!check15(result))
                        {
                           continue;
                        }

                        for (int n = 0 ; n < 120 ; n++){
                            for (int i = 0 ; i < 5 ; i++){

                                System.out.println("第"+p+"次迭代");
                                p++;
                                //第五行遍历
                                result[4][i] = Data.arrange[n][i];
                            }
                            if (!check02(result)||!check06(result)||!check10(result)||!check11(result)){
                                continue;
                            }else {
                                return result;
                            }

                        }

                    }
                }
            }
        }
        return result;
    }

}
