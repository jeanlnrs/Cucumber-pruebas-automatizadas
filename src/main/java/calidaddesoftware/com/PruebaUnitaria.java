package calidaddesoftware.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaUnitaria 
{

	@Test
	public void AplicaITBMS() 
	{
		itbms itbms = new itbms(0,7);
		assertEquals(true,itbms.aplicaITBMS());
	}

}
