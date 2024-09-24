package ca.bcit.comp2522.lab3.BAM;

import java.util.Objects;

public class IPhone16 extends IPhone {
    private static final int MEMORY_GIG_MIN = 0;

    public final boolean highResCam;
    public final int memoryGig;

    public IPhone16(final double phonePlanMins, final String phoneCarrier,
                    final boolean highResCam, final int memoryGig) {
        super(phonePlanMins, phoneCarrier);

        this.highResCam = highResCam;
        this.memoryGig = memoryGig;

        validatememoryGig(memoryGig);
    }

    @Override
    public String toString(){
        StringBuilder iPhone16;
        String iDeviceStr;
        String iPhone16Str;

        iPhone16 = new StringBuilder();
        iDeviceStr = super.toString();


        iPhone16.append(iDeviceStr)
                .append("This iPhone having a res cam is : " + highResCam +
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


    @Override
    public int hashCode(){
        return Objects.hashCode(phonePlanMins);
    }

    private static void validatememoryGig(final int memoryGig) {
        if (memoryGig <= MEMORY_GIG_MIN){
            throw new IllegalArgumentException("memoryGig must be greater than " + MEMORY_GIG_MIN);
        }
    }
}
