#language: es

Característica: login pagina libreria
  Antecedentes:
    Dado J se encuentra en la pagina libreria nacional

@LoginExitoso
  Escenario: Login Exitoso
    Cuando J ingresa los datos de login correctamente
    Entonces J se encuentra dentro de la plataforma

@BusquedaLibro
  Escenario: Busqueda Libro
    Cuando J ingresa parametros de busqueda
    Entonces J encuentra el articulo

