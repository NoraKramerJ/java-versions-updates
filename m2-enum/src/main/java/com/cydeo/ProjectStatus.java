package com.cydeo;

public enum ProjectStatus {
    OPEN,CLOSED,PROGRESS("IN PROGRESS");

    String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    ProjectStatus() {
        /* when we create a constructor without objects,
        // we don't have to add value to our static final constants that
        we didn't assign value to

         */
    }
}
