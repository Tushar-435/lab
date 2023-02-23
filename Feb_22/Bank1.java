package Feb_22;

class Bank1 {
	float getRateOfInterest() {
		return 0;
	}}
class SBI extends Bank1 {
	float getRateOfInterest() {
		return 8;
	}}
class ICICI extends Bank1 {
float getRateOfInterest() {
	return 7;
	}}
class AXIS extends Bank1 {
float getRateOfInterest() {
	return 9;
}

	public static void main(String[] args) {
		Bank1 bank;
    bank=new SBI();
        System.out.println(bank.getRateOfInterest());
        bank=new ICICI();
        System.out.println(bank.getRateOfInterest());
        bank=new AXIS();
        System.out.println(bank.getRateOfInterest());
		
	}

}
