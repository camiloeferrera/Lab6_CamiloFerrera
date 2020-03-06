package lab6_camiloferrera;

public class Usuario {
    private String nombre,user,password;
    private int edad;

    public Usuario(String nombre, String user, String password, int edad) {
        this.nombre = nombre;
        this.user = user;
        this.password = password;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
}
