import java.util.Scanner;

 public class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String e){
        super(e);
    }
}
   class ExceptionHandling{
    static boolean validatePassword(String password){
        int len;
        len=password.length();

        int numberCount=0;
        int specialCharCount=0;
        char char1[] = password.toCharArray();
        for(int i=0;i<len;i++){
            char c =char1[i];
            if(c>='0'&& c<='9'){
                numberCount++;

                }if(c=='@' ||c=='!'){
                specialCharCount++;
            }
        }
        if(len<8|| numberCount==0||specialCharCount==0){
            return false;
        }
        else{
            return true;
        }
    }



        public static void main(String[] args) throws InvalidPasswordException{
            String loginID;
            String password;
            Scanner input=new Scanner(System.in);
            System.out.println("Enter LOGIN ID");
            loginID= input.next();
            System.out.println("Enter password");
             password= input.next();
            if(validatePassword(password)){
                System.out.println("LOGIN successful");

            }else throw new InvalidPasswordException("Please enter valid credentials");
        }


    }





