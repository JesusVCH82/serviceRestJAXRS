package com.restAPI;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/*
 * Clase creada para hacer la configuracion de la ruta hacia la cual se haran las peticiones, sustituyendo a las
 * declaraciones en el web.xml
 */

@ApplicationPath("/api/v1")
public class ConfigurationApplication  extends Application{

}
