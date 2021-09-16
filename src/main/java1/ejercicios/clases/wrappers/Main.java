package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//byte
		byte datoByte=2;//primitivo
		Byte datoByteWrapper=3;//Wrapper
		System.out.println("Primitivo:"+datoByte);
		System.out.println("Wrapper:"+datoByteWrapper);
		//conversiones
		byte datoByte1=6;
		Byte datoConvertido=datoByte1;
		System.out.println("Byte convetido:"+datoConvertido);
		//conversiones 2
		Byte datoConvetido2=6;
		byte datoByte2=datoConvetido2.byteValue();
		System.out.println("byte convetido:"+datoByte2);
		
		
		//short
		short datoShort=1;//primitivo
		Short datoShortWrapper=1;//Wrapper
		System.out.println("Primitivo:"+datoShort);
		System.out.println("Wrapper:"+datoShortWrapper);
		//conversiones
		short datoShort1=4;
		Short shortConvertido=datoShort1;
		System.out.println("Short convertido:"+shortConvertido);
		//conversiones2
		Short shortConvertido2=24;
		short datoShort2=shortConvertido2.shortValue();
		System.out.println("short convertido:"+datoShort2);
		
		//int
		int edad=45;//primitivo
		Integer edadWrapper=48;//Wrapper
		System.out.println("Primitivo:"+edad);
		System.out.println("Wrapper:"+edadWrapper);
		//conversiones
		int edad1=45;
		Integer integerConvetido=edad1;
		System.out.println("Integer convertido"+integerConvetido);
		
		//conversiones2
		Integer integerConvetido2=23;
		int edad2=integerConvetido2.intValue();
		System.out.println("int convetido:"+edad2);
		
		
		
		//long
		long valorGrande=12345;//primitivo
		Long valorGrandeWrapper=23313L;//Wrapper
		System.out.println("Primitivo:"+valorGrande);
		System.out.println("Wrapper:"+valorGrandeWrapper);
		//conversiones 
		long valorGrande1=1234;
		Long longConvertido=valorGrande1;
		System.out.println(" Long convertido:"+longConvertido);
		//conversiones 2
		Long longConvertido2=(long) 123D;
		long valorGrande2=longConvertido2.longValue();
		System.out.println("long convetido:"+valorGrande2);
		
		//boolean
		boolean datoBoolean=true; //primitivo
		Boolean datoBooleanWrapper=false;//wrapper
		System.out.println("Primitivo:"+datoBoolean);
		System.out.println("Wrapper:"+datoBooleanWrapper);
		//conversiones
		boolean datoBoolean1=true;
		Boolean booleanConvertido=datoBoolean1;
		System.out.println("Boolena convetido:"+booleanConvertido);
		//conversiones2
		Boolean  booleanConvertido2=false;
		boolean datoBoolean2=booleanConvertido2.booleanValue();
		System.out.println("boolean convertido"+datoBoolean2);
		
		//float
		float valorFloat=12235;//Primitiva
		Float valorFloatWrapper=12345F;//Wrapper
		System.out.println("Primitivo:"+valorFloat);
		System.out.println("Wrapper:"+valorFloatWrapper);
		//conversiones
		float  valorFloat1=12235;
		Float floatConvertido=valorFloat1;
		System.out.println("Float convertido:"+floatConvertido);
		//conversiones2
		Float floatConvertido2=1233F;
		float valorFloat2=floatConvertido2.floatValue();
		System.out.println("float Convertido:"+valorFloat2);
		
		//double
		double datoDouble=123;//primitiva
		Double datoDoubleWrapper=987D;//Wrapper
		System.out.println("Primitivo:"+datoDouble);
		System.out.println("Wrapper:"+datoDoubleWrapper);
		//conversiones
		double datoDouble1=123;
		Double doubleConvertido=datoDouble1;
		System.out.println("Double Convertido:"+doubleConvertido);
		//conversiones2
		Double doubleConvertido2=987D;
		double datoDouble2=doubleConvertido2.doubleValue();
		System.out.println("double convertido:"+datoDouble2);
		
		//char
		char datoChar=123;//primitiva
		Character datoCharWrapper=234;//Wrapper
		System.out.println("Primitivo:"+datoChar);
		System.out.println("Wrapper:"+datoCharWrapper);
		//conversiones
		char datoChar1=123;
		Character charConvertido=datoChar1;
		System.out.println("Character convertido:"+charConvertido);
		//conversiones2
		Character charConvertido2=234;
		char datoChar2=charConvertido2.charValue();
		System.out.println("char convetido:"+datoChar2);
		
	}

}
