package amazonCode;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 String Username;
        String Password;
        
        
//set password and username, figuring out to let the user have more freedom and the username and password they create
        Password = "lord";
        Username = "Jesus";

        
        //entering the username
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();

        //password
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();

        
        //still determining on how let the user more freedom
        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Access Granted! Welcome!");
        }

        else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

    }
    }

    }


