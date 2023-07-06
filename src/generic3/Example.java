package generic3;

public class Example {
    public static void main(String[] args) {

    PhoneFunction.call(new User<Phone>(new Phone()));
    PhoneFunction.call(new User<IPhone>(new IPhone()));
    PhoneFunction.call(new User<Galaxy>(new Galaxy()));
    PhoneFunction.call(new User<IPhone12Pro>(new IPhone12Pro()));
    PhoneFunction.call(new User<IPhoneXS>(new IPhoneXS()));
    PhoneFunction.call(new User<S22>(new S22()));
    PhoneFunction.call(new User<ZFlip3>(new ZFlip3()));

    System.out.println("\n######################################\n");

    PhoneFunction.faceId(new User<IPhone>(new IPhone()));
    PhoneFunction.faceId(new User<IPhone12Pro>(new IPhone12Pro()));
    PhoneFunction.faceId(new User<IPhoneXS>(new IPhoneXS()));

    System.out.println("\n######################################\n");

    PhoneFunction.samsungPay(new User<Galaxy>(new Galaxy()));
    PhoneFunction.samsungPay(new User<S22>(new S22()));
    PhoneFunction.samsungPay(new User<ZFlip3>(new ZFlip3()));

    System.out.println("\n######################################\n");

    PhoneFunction.recordVoice(new User<Phone>(new Phone()));
    PhoneFunction.recordVoice(new User<Galaxy>(new Galaxy()));
    }
}