package MedicalStore;

/**
* MedicalStore/medintfHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from store.idl
* Wednesday, 11 April, 2018 9:52:50 PM IST
*/

public final class medintfHolder implements org.omg.CORBA.portable.Streamable
{
  public MedicalStore.medintf value = null;

  public medintfHolder ()
  {
  }

  public medintfHolder (MedicalStore.medintf initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MedicalStore.medintfHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MedicalStore.medintfHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MedicalStore.medintfHelper.type ();
  }

}
