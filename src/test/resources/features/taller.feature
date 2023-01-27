#Autor : Hector Javier Ortega
@HUtaller
Feature:Registro exitoso de nuevo usuario
  Yo como nuevo usuario de la aplizacion web
  Necesito registrarme de forma exitosa en la pagina
  Para validar que la cuenta salga en el resumen

  Scenario Outline Registrarse correctamente en la pagina
    Given Deseo registrrme en la pagina "https://parabank.parasoft.com/"
    When  Haga click en el boton Register
    And   Se abra el formulario de registro
    And   Llene los campos del formulario <FistName> <LastName> <Address> <City> <State> <ZipCode> <SSN> <Username> <Password> <Confirm>
    Then  El registro sea realizado correctamente

    Examples:

      |FistName  |LastName |  Address | City|State|ZipCode|SSN   | Username|Password|Confirm|
      |     hhh  |    jjj  |     345  |ddd  |ccc  | 345f   | 3456f|   user2 |  123456|123456 |


  Scenario Outline: Iniciar sesion correctamente en la pagina
    Given estoy en la pagina "https://parabank.parasoft.com/"
    When  Ingrese las credenciales
      | Username|Password|
      |<Username>|<Password>|
    Then  valido que el usuario creado tenga asignado un numero

    Examples:
      | Username|Password|
      |  user2 |123456  |