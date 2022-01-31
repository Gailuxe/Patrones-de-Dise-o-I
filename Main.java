import java.sql.SQLException;

import singleton.ConexionSingleton;

public class Main{
    public static void main(String args[])
    {
        try {
        //Creando los objetos de Singleton
        ConexionSingleton conexionSingleton= ConexionSingleton.getInstance(
            "jdbc:mysql://localhost:3306/Cards", 
            "car_user", 
            "1234");


            conexionSingleton.getConexion().query("select * from carta");
            //conexionSingleton.getConexion().ejecutar("insert into carta values('SATURNO')");
            //conexionSingleton.getConexion().ejecutar("delete from carta where nombre='LUNA';");
            //conexionSingleton.getConexion().ejecutar("update carta set nombre='MARTE' where nombre = 'SOL';");
            //conexionSingleton.getConexion().ejecutar("create table paises (ID int primary key, nombre varchar(20), continente varchar(20));");
            conexionSingleton.getConexion().ejecutar("insert into paises values('1','panama','america')");
            conexionSingleton.getConexion().ejecutar("insert into paises values('2','alemania','europa')");
            conexionSingleton.getConexion().ejecutar("insert into paises values('3','mexico','america')");
            conexionSingleton.getConexion().ejecutar("insert into paises values('4','china','asia')");
            conexionSingleton.getConexion().ejecutar("delete from paises where nombre='2';");
            conexionSingleton.getConexion().ejecutar("update paises set nombre='japon' where id = '4';");
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

}