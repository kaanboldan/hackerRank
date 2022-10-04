public class isPalindrome {
    public void Palindrome(String A)
    {
        A=A.toLowerCase();
        Boolean isPalindrome=true;
        if(A.length()>1)
        {
            for(int a=0;a<A.length();a++)
            {
                if(A.length()%2==1)
                {
                    if((A.length()/2)+1==a+1)
                        break;
                }
                else
                if(A.length()/2==a)
                    break;

                if(A.substring(a,a+1).contains(A.substring((A.length()-a)-1,(A.length()-a)))){
                    isPalindrome=true;
                }
                else{
                    isPalindrome=false;
                    break;
                }

            }
        }
        if(isPalindrome==true)
            System.out.println("Yes");
        else
            System.out.println("No");

    }


}
