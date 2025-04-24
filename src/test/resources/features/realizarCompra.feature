# language : es

  Característica: Automatizar proceso de compra en aliexpress

  @SmokeTest

  Esquema del escenario: Agregar producto al carrito

  Dado Que me encuentro en la página '<url>'

  Cuando busco el producto '<busqueda>'

  Y escojo el producto '<producto>'

  Entonces verifico el precio '<precio>'

  Y añado al carrito

  Entonces visualizo el producto '<producto>' con el precio '<precio>'

  Ejemplos:
  | url | busqueda | producto | precio |
  ##@externaldata@parametros/Datos.xlsx@carrito
  | | | | |
