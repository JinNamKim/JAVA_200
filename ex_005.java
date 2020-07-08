public class ex_005 {
    public static void main(String[] args) {
        for(int year = 1988; year < 2021; year++){
            boolean yearTF = false;
            if( ((year%4 ==0) && (year%100 != 0 )) || (year % 400 == 0) ){
                yearTF = true;
            }
            else{
                yearTF = false;
            }

            if(yearTF){
                System.out.println(year +"년은 윤년입니다.");
            }
            else{
                System.out.println(year +"년은 윤년이 아닙니다.");
            }
        }
    }
}