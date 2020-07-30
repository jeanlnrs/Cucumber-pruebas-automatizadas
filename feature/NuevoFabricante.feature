Feature: Interactuar con los flujos del proveedor
    
        Scenario Outline: Cliente desea agregar un nuevo fabricante
    Given Yo ingreso a el sistema
    When Yo ingreso <fabricante> al modal Agregar nuevo fabricante
    Then Validar el nombre <fabricante> en la tabla de fabricantes
    Examples:
    |fabricante	  |
    |"fabrica1"		|
    |"fabrica2"		|
    |"fabrica3"		|
    |"fabrica4"		|
    |"fabrica5"		|
    |"fabrica6"		|
    |"fabrica7"		|
    |"fabrica8"		|
    |"fabrica9"		|
    |"fabrica0"		|  
    
    Scenario Outline: Agregar un nuevo producto
    Given Yo ingreso a inventario
    When Yo completo el formulario del <producto>
    Then Validar que aparezca el nuevo inventario
    Examples:
    |producto     |
    |"producto 1" |
    |"producto 2" |
    |"producto 3" |
    |"producto 4" |
    |"producto 5" |
    |"producto 6" |
    |"producto 7" |
    |"producto 8" |
    |"producto 9" |
    |"producto 10"|