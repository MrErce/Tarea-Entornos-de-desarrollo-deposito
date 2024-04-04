package cuentas;

/**
 * clase cuenta almacena los atributos nombre, cuenta, saldo y tipo de interes
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    /**
     * constructor de clase cuenta
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * getter del atributo nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter del atributo nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter del atributo cuenta
     *
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * setter del atributo cuenta
     *
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * getter del atributo saldo
     *
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * setter del atributo saldo
     *
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * getter del atributo tipoInteres
     *
     * @return tipoInteres
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * setter del atributo tipoInteres
     *
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * metodo que devuelve el saldo
     *
     * @return
     */
    public double estado() {
        return saldo;
    }

    /**
     * metodo para ingresar una cantidad
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * metodo para retirar una cantidad
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
}
