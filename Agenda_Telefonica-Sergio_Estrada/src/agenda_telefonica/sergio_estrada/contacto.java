
package agenda_telefonica.sergio_estrada;

public class contacto {
   private String numero_telefono,nombre,adomicilio;

public contacto(String numero_telefono, String nombre, String adomicilio) {

this.numero_telefono = numero_telefono;

this.nombre = nombre;

this.adomicilio = adomicilio;

}

public String vernum_tel(){

return this.numero_telefono;

}

public String vercontacto(){

return this.nombre;

}

public String veradomicilio (){

return this.adomicilio;

}

}
