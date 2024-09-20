package ca.bcit.comp2522.lab3.BAM;

import java.util.Objects;

/**
 *
 *
 * @author Andre
 * @version 1.0
 */
public class IPhone extends IDevice{

    private static double phonePlanMins;
    private static String phoneCarrier;
    public IPhone (final double phonePlanMins, final String phoneCarrier){
        super("talking");

        validatePhonePlanMins(phonePlanMins);
        validatePhoneCarrier(phoneCarrier);

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
    public boolean equals(final Object compareObj){
        if (compareObj == null){
            return false;
        }

        if (!(compareObj instanceof IPhone)){
            return false;
        }

        if (compareObj == this){
            return true;
        }

        final IPhone compareObjIPhone;
        compareObjIPhone = (IPhone) compareObj;
        final boolean equals;
        equals = this.phonePlanMins==compareObjIPhone.phonePlanMins;
        return equals;
    }

    @Override
    public int hashCode(){
        return Objects.hashCode("woah");
    }

private static void validatePhonePlanMins(final double phonePlanMins){
    if (phonePlanMins < 0){
        throw new IllegalArgumentException("Phone plan minutes must be greater than zero");
        }
    }

    private static void validatePhoneCarrier(final String phoneCarrier){
        if (phoneCarrier == null){
            throw new IllegalArgumentException("Phone carrier must not be null");
        }
    }
}
