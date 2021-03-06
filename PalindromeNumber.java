/***
Author:     Douglas, douglas.chan.utoronto@outlook.com
Date:       Oct 4, 2017
Problem:    9.Palindrome Number
Difficulty: Easy
Source:     https://leetcode.com/problems/palindrome-number/description/

Determine whether an integer is a palindrome. Do this without extra space.

Do it through integer reverse

***/

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        //remove negative integers and positive integers with 0 at rightmost digit 
        if (x<0 || (x!=0 && x%10==0 ))
            return false;
        
        int rev = 0;
        //compare half of integer 
        while(x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
            
       }        
       return (x==rev || x==rev/10);
    }
}
