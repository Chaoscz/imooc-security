package com.imooc.exception;

public class UserNotExistException extends RuntimeException {

    private static final long  serialVersionUID = -12312312313123L;


    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserNotExistException(String id){
        super("user not exist");
        this.id = id;
    }
}
