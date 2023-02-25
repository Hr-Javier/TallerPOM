#Autor : Hector Javier Ortega
#language: es
@HUtaller
Característica:Registro exitoso de nuevo usuario
  Yo como nuevo usuario de la aplicacion web
  Necesito registrarme de forma exitosa en la pagina
  Para validar que la cuenta salga en el resumen

  Esquema del escenario: Registrarse correctamente en la pagina
    Dado Deseo registrme en la pagina "https://parabank.parasoft.com/"
    Cuando  Haga click en el boton '<Register>'
    Y Escriba el campoA '<firstName>'
    Y Escriba el campoB '<lastName>'
    Y Escriba el campoC '<address>'
    Y Escriba el campoD '<city>'
    Y Escriba el campoE '<state>'
    Y Escriba el campoF '<zipCode>'
    Y Escriba el campoG '<SSN>'
    Y Escriba el campoH '<username>'
    Y Escriba el campoI '<password>'
    Y Escriba el campoJ '<confirm>'
    Y Escriba el campoK '<confirm>'
    Y haga clic en el boton "registrar"
    Entonces El registro sea realizado correctamente

    Ejemplos:

      |firstName|lastName|address|city|state|zipCode|SSN   |username| password| confirm|
      |  Hector | Ortega |  345  |Cdd |Fcc  | 345f  | 3456f|   user2|  f123456|f123456 |
#      |  Juan   | Perez |  3454  |Cdd |Fcc  | 345f  | 3456f|   user2|  f123456|f123456 |


#  Feature:Validacion exitosa de registro
#  Yo como nuevo usuario registrado en la aplicacion
#  Necesito validar que el registro haya sido correcto
#  Para validar que el numero de cuenta concuerde
#

#  Scenario Outline: Iniciar sesion correctamente en la pagina
#    Given estoy en la pagina "https://parabank.parasoft.com/"
#    When  Ingrese las credenciales
#      | Username|Password|
#      |<Username>|<Password>|
#    Then  valido que el usuario creado tenga asignado un numero
##
#    Examples:
#      | Username|Password|
#      |  user2 |123456  |