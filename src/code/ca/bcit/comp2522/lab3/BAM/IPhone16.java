package ca.bcit.comp2522.lab3.BAM;

public class IPhone16 extends IPhone {

    private static boolean highResCam;
    private static int memoryGig;

    public IPhone16(double phonePlanMins, String phoneCarrier) {
        super(phonePlanMins, phoneCarrier);
    }

    @Override
    public String toString(){
        StringBuilder iPhone16;
        String iDeviceStr;
        String iPhone16Str;

        iPhone16 = new StringBuilder();
        iDeviceStr = super.toString();
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
        compareObjIPhone = (IPhone) compareObj;
        final boolean equals;
        equals = this.phonePlanMins==compareObjIPhone.phonePlanMins;
        return equals;
    }
}
