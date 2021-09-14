package com.revature.Exceptions;

public class UserdoesnotExistException extends RuntimeException{

    public UserdoesnotExistException(){
        super("This User does not Exist.");
    }

}
