package ca.bcit.comp2522.lab3.BAM;

import java.util.Objects;

public class IPhone extends IDevice{

    double phonePlanMins;
    String phoneCarrier;
    public IPhone (double phonePlanMins, String phoneCarrier){
        super("talking");
        this.phonePlanMins = phonePlanMins;
        this.phoneCarrier = phoneCarrier;
    }

    public String getPurpose(){
        return "the purpose of this iDevice is “talking”";
    }

    @Override
    public void printDetails(){
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
       StringBuilder iPhoneStrBuilder;
       String iDeviceString;
       String iPhoneStr ;


       iPhoneStrBuilder = new StringBuilder();
       iDeviceString = super.toString();

       iPhoneStrBuilder.append(iDeviceString).append("iPhone. Phone plan minutes: ")
        .append(phonePlanMins).append(". Phone carrier is: ").append(phoneCarrier);

       iPhoneStr = iPhoneStrBuilder.toString();
       return iPhoneStr;
    }

    @Override
    public int hashCode(){
        return Objects.hashCode("woah");
    }
}
