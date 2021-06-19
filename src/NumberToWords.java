/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author saugatdhakal
 */
public class NumberToWords {
    private String one_to_hund(int n){
        String str="";
        while(n!=0){
            if(n==1){
                str =str+" One";
                n=0;
            }
            else if (n==2){
                str=str+" Two";
                n=0;
            }
            else if( n==3){
                str=str+" Three";
                n=0;
            }
            else if(n==4){
                str=str+" Four";
                n=0;
            }
            else if(n==5){
                str=str+" Five";
                n=0;
            }
            else if(n==6){
                str =str+" Six";
                n=0;
            }
            else if(n==7){
                str=str+" Seven";
                n=0;
            }
            else if(n==8){
                str=str+" Eight";
                n=0;
            }
            else if(n==9){
                str=str+" Nine";
                n=0;
            }
            else if(n==10){
                 str=str+" Ten";
                n=0;
            }
            else if(n==11){
                 str=str+" Eleven";
                n=0;
            }
            else if(n==12){
                 str=str+" Twelve";
                n=0;
            }
            else if(n==13){
                 str=str+" Thirteen";
                n=0;
            }
            else if(n==14){
                 str=str+" Fourteen";
                n=0;
            }
            else if(n==15){
                 str=str+" Fifteen";
                n=0;
            }
            else if(n==16){
                 str=str+" Sixteen";
                n=0;
            }
            else if(n==17){
                 str=str+" Seventeen";
                n=0;
            }
            else if(n==18){
                 str=str+" Eighteen";
                n=0;
            }
            else if(n==19){
                 str=str+" Nineteen";
                n=0;
            }
            else if(n>=20 && n<30){
                 str=str+" Tweenty";
                n=n-20;
            }
            else if(n>=30 && n<40){
                 str=str+" Thirty";
                n=n-30;
            }
            else if(n>40 && n<50){
                 str=str+" Fourty";
                n=n-40;
            }
            else if(n>=50 && n<60){
                 str=str+" Fifty";
                n=n-50;
            }
            else if(n>=60 && n<70){
                 str=str+" Sixty";
                n=n-60;
            }
            else if(n>=70 && n<80){
                 str=str+" Seventy";
                n=n-70;
            }
            else if(n>=80 && n<90){
                 str=str+" Eighty";
                n=n-80;
            }
            else if(n>=90 && n<100){
                 str=str+" Ninety";
                n=n-90;
            }
        }
        return str;
    }
    public String convert(int n){
        String str ="";
        while(n!=0){
             if(n>=1 && n<100){
                 str=str+one_to_hund(n);
                n=0;
            }
             else if(n>=100 && n<1000){
                 str=str+one_to_hund(n/100);
                 str=str+" Hundred";
                 n=n%100;
            }
             else if(n>=1000 && n<100000){
                 str=str+one_to_hund(n/1000);
                 str=str+" Thousand";
                 n=n%1000;
            }
             else if(n>=100000 && n<10000000){
                 str=str+one_to_hund(n/100000);
                 str=str+" Lakh";
                 n=n%100000;
            }
             
        }
        return (str);
    }
    
}
