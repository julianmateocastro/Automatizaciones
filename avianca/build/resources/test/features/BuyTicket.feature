Feature: Se requiere reservar un vuelo en la pagina de avianca para verificar el precio mas economico.

  Scenario:Se completan los campos para la reserva del vuelo y se verifica el precio mas economico
    Given se ingresa a la pagina
    When se completan los campos para posteriormente realizar la busqueda de los vuelos
    And se deben validar cada uno de los precios para seleccionar el vuelo mas economico de salida
    And se realiza la seleccion del paquete mas economico salida
    And se deben validar cada uno de los precios para seleccionar el vuelo mas economico de regreso
    And se realiza la seleccion del paquete mas economico regreso
    Then se valida que el precio final sea el esperado
