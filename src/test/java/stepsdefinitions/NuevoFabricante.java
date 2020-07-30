package stepsdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

public class NuevoFabricante 
{
	WebDriver driver;
	String xpath;
	@Given("^Yo ingreso a el sistema$")
	public void yo_abro_el_navegador() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Semestral/fabricante.php");
	}

	@When("^Yo ingreso \"(.*)\" al modal Agregar nuevo fabricante$")
	public void yo_ingreso_Lionel_Messi_al_modal_Agregar_nuevo_fabricante(String elmentado) throws Throwable 
	{
		driver.findElement(By.linkText("Fabricante")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("nombre")).sendKeys(elmentado);
		Thread.sleep(1000);
		driver.findElement(By.id("guardar_datos")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("resultados_ajax")).isEnabled();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='nuevoCliente']/div/div/div[3]/button[1]") ).click();
	}

	@Then("^Validar el nombre \"(.*)\" en la tabla de fabricantes$")
	public void validar_el_nombre_Lionel_Messi_en_la_tabla_de_fabricantes(String elmentado) throws Throwable 
	{
		xpath = "//*[contains(text(),"+ elmentado +")]";
		Thread.sleep(1000);
		if(driver.findElement(By.xpath(xpath))!= null)
		{
			System.out.println("Element is Present");
		}
		else
		{
			System.out.println("Element is Absent");
		}
		Thread.sleep(3000);
		driver.quit();
	}
	@Given("^Yo ingreso a inventario$")
	public void yo_ingreso_a_inventario() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/Semestral/stock.php");
		
	}

	@When("^Yo completo el formulario del \"(.*)\"$")
	public void yo_completo_el_formulario(String producto) throws Throwable 
	{
		
		int codigo = (int)(Math.random() * 10001);
		int codigoDeBarra = (int)(Math.random() * 1111111111 + 1000000000);
		int Fabricante = (int)(Math.random() * 2 + 9);
		int precio = (int)(Math.random() * 10 + 20);
		int stock = (int)(Math.random() *  10 + 25);
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("codigo")).sendKeys("COD"+codigo);
		Thread.sleep(1000);
		driver.findElement(By.id("codigobarra")).sendKeys("4"+codigoDeBarra);
		Thread.sleep(1000);
		driver.findElement(By.id("nombre")).sendKeys(producto);
		Thread.sleep(1000);
		driver.findElement(By.id("fabricante")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option["+Fabricante+"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("descripcion")).sendKeys("Descripcion del "+producto);
		Thread.sleep(1000);
		driver.findElement(By.id("precio")).sendKeys(precio+".98");
		Thread.sleep(1000);
		driver.findElement(By.id("stock")).sendKeys(""+stock);
		Thread.sleep(1000);
		
	}

	@Then("^Validar que aparezca el nuevo inventario$")
	public void validar_que_aparezca_el_nuevo_inventario() throws Throwable 
	{
	    driver.findElement(By.id("guardar_datos")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='nuevoProducto']/div/div/div[3]/button[1]") ).click();
		Thread.sleep(8000);
		Thread.sleep(3000);
		driver.quit();
	}


}
