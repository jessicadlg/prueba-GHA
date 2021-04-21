import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
   // private  Operaciones operacion;
    private int num1;
    private int num2;
    private int resultado;


    @Test
    public void sumarDosNumeros(){
        Operaciones operacion= givenExisteUnaSuma();

        whenRealizoLaSuma(operacion);

        thenObtengoLaSuma(operacion);
    }
    @Test
    public void restarDosNumeros(){
        Operaciones operacion=  givenExisteUnaResta();

        whenRealizoLaResta(operacion);

        thenObtengoLaResta(operacion);

    }

    @Test
    public void multiplicarDosNumeros(){
        Operaciones operacion=  givenExisteUnaMultiplicacion();

        whenRealizoLaMultiplicacion(operacion);

        thenObtengoLaMultiplicacion(operacion);

    }

    @Test
    public void dividirDosNumeros(){
        Operaciones operacion= givenExisteUnaDivision();

        whenRealizoLaDivision(operacion);

        thenObtengoLaDivisionConResiduoCero(operacion);
    }


    private void thenObtengoLaSuma(Operaciones operacion) {
        //assertEquals(7,resultado);
        assertThat(operacion.sumar(2,5)).isEqualTo(7);
    }
    private int whenRealizoLaSuma(Operaciones operacion) {
        int resultado = operacion.sumar(2,5);
        return  resultado;
    }
    private Operaciones givenExisteUnaSuma() {
        return  new Operaciones();
    }

    //resta
    private void thenObtengoLaResta(Operaciones operacion) {
        //assertEquals(7,resultado);
        assertThat(operacion.resta(10,5)).isEqualTo(5);
    }
    private int whenRealizoLaResta(Operaciones operacion) {
        int resultado = operacion.resta(10,5);
        return  resultado;
    }
    private Operaciones givenExisteUnaResta() {
        return  new Operaciones();
    }

    //multiplicacion
    private Operaciones givenExisteUnaMultiplicacion() {
        return  new Operaciones();
    }

    private int whenRealizoLaMultiplicacion(Operaciones operacion) {
        int resultado = operacion.multiplicar(3,3);
        return  resultado;
    }

    private void thenObtengoLaMultiplicacion(Operaciones operacion) {
        assertThat(operacion.multiplicar(3,3)).isEqualTo(9);
    }
    //Division

    private Operaciones givenExisteUnaDivision() {
        return new Operaciones();
    }
    private int whenRealizoLaDivision(Operaciones operacion) {
        int resultado= operacion.division(10,2);
        return resultado;
    }
    private void thenObtengoLaDivisionConResiduoCero(Operaciones operacion) {
        assertThat(operacion.division(10,2)).isEqualTo(5);
    }

}
