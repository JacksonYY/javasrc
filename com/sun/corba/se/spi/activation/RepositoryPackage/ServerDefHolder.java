package com.sun.corba.se.spi.activation.RepositoryPackage;

/**
* com/sun/corba/se/spi/activation/RepositoryPackage/ServerDefHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u11/648/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Monday, June 16, 2014 5:30:31 PM PDT
*/

public final class ServerDefHolder implements org.omg.CORBA.portable.Streamable
{
  public com.sun.corba.se.spi.activation.RepositoryPackage.ServerDef value = null;

  public ServerDefHolder ()
  {
  }

  public ServerDefHolder (com.sun.corba.se.spi.activation.RepositoryPackage.ServerDef initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.spi.activation.RepositoryPackage.ServerDefHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.spi.activation.RepositoryPackage.ServerDefHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.spi.activation.RepositoryPackage.ServerDefHelper.type ();
  }

}