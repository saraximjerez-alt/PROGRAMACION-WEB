class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() { return nombre; }
    public double getSalario() { return salario; }

    public double calcularSalario() {
        return salario;
    }
}


class EmpleadoTiempoCompleto extends Empleado {
    private long bonificacion;

    public EmpleadoTiempoCompleto(String nombre, double salarioBase, long bonificacion) {
        super(nombre, salarioBase);
        this.bonificacion = bonificacion;
    }

    public long getBonificacion() { return bonificacion; }

    @Override
    public double calcularSalario() {
        return salario + bonificacion;
    }
}


class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre, 0); 
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() { return horasTrabajadas; }
    public double getValorHora() { return valorHora; }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }
}
