package v01.ch13.serviceLoader;

public interface Cipher
{
   byte[] encrypt(byte[] source, byte[] key);
   byte[] decrypt(byte[] source, byte[] key);
   int strength();
}