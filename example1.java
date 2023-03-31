// Abstract class example

/* This example shows 

    1. We cannot make object of Abstract class
    2. abstract class contains methods which are partially implemented or doesn't have any implementation
*/ 

abstract class MyMobileDesign {

        abstract void brandName();
    
        abstract void brandName(){};

        abstract void handsetName();

        abstract void serialNumber();
}

class a{
    
    public static void main(String[] args) {
            
            // MyMobileDesign md = new MyMobileDesign();
    }
}