package ca.bcit.comp2522.lab3.BAM;

import java.util.Objects;

public class IPhone16 extends IPhone {

    // Marcus:
    // - Add final
    // - Not static
    private static boolean highResCam;
    private static int memoryGig;

    public IPhone16(final double phonePlanMins, final String phoneCarrier,
                    final boolean highResCam, final int memoryGig) {
        super(phonePlanMins, phoneCarrier);
        // Marcus:
        // - Validation method for highResCam and memoryGig
        // - Assign highResCam and memoryGig
    }

    @Override
    public String toString(){
        StringBuilder iPhone16;
        String iDeviceStr;
        String iPhone16Str;

        iPhone16 = new StringBuilder();
        iDeviceStr = super.toString();

        // Marcus:
        // - One command (append) at a line
        iPhone16.append(iDeviceStr).append("This iPhone having a res cam is : " + highResCam +
                ". The amount of memory in the phone is" + memoryGig);
        iPhone16Str = iPhone16.toString();
        return iPhone16Str;
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
        final boolean equals;
        compareObjIPhone = (IPhone) compareObj;
        equals = this.phonePlanMins == compareObjIPhone.phonePlanMins;
        return equals;
    }

    // Marcus:
    // - Use hashCode based on phonePlanMins
    @Override
    public int hashCode(){
        return Objects.hashCode("test");
    }
}
