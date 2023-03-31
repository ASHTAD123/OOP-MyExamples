
/*  Abstract class
  
        This example shows child class is responsible for providing implementation
        
 */

 /* Parent Class */
abstract class securitySystem {

             abstract void brandName();
             abstract void systemType();
             abstract void securityLevel();
             
             public static void main(String[] args) {
                
             }
}

 /* Child Classes */
abstract class AbcSecuritySystems extends securitySystem{

            void brandName(){
                System.out.println(" Abc Security Systems ");
            };
}

abstract class BcdSecuritySystem extends AbcSecuritySystems{
            
             void brandName(){
                System.out.println(" Bcd Security Systems ");
             };

             void systemType(){
                System.out.println(" Arm Architecture Systems ");
             };

             void securityLevel(){
                System.out.println(" Security level A ");
             };
}
