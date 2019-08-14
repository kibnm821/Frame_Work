public class string {
    public static void main (String args[])
    {
        String str1 = new String ("This is really not immutable!!!");
        String str2 = str1;
        boolean retVal; int length; double d = 102939939.939;
        retVal = str1.equals(str2);
        System.out.println("Returned Val ="+ retVal);
        System.out.println("String length ="+ str1.length());
        System.out.println("Returned compareTo Val ="+ str1.compareTo(str2));
        System.out.println("Returned concat Val ="+ str1.concat(str2));
        System.out.println("Returned replaceAll Val ="+ str1.replaceAll("is","??"));
        System.out.println("Returned substring Val ="+ str1.substring(10));
        System.out.println("Returned valueOf Val ="+ String.valueOf(d));
    }
}