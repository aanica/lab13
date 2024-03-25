package com.example.domain;

public class Employee {
    public int empId;
    public String name;
    public String ssn;
    public double salary;
    public Employee() {}

    public void setEmpId(int empId){

        this.empId=empId;
    }
    public int getEmpId(){

        return this.empId;
    }
    public void setName(String name){

        this.name=name;
    }

    public String getName(){

        return this.name;
    }
    public void setSsn(String ssn){

        this.ssn=ssn;
    }

    public String getSsn(){

        return this.ssn;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){

        return this.salary;
    }

}
