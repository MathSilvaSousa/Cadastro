import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CadastroGoogle {
    @Test
    public void fazerCadastro(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        navegador.get("http://www.google.com/intl/pt-BR/gmail/about/");
        navegador.findElement(By.linkText("Criar uma conta")).click();
        navegador.findElement(By.name("firstName")).sendKeys("Nome");
        navegador.findElement(By.name("lastName")).sendKeys("Sobrenome");
        navegador.findElement(By.name("Username")).sendKeys("NomeDeUsuario");
        navegador.findElement(By.name("Passwd")).sendKeys("Senha");
        navegador.findElement(By.name("ConfirmPasswd")).sendKeys("ConfirmaSenha");
        navegador.findElement(By.className("VfPpkd-vQzf8d")).click();
        navegador.quit();
    }
}

