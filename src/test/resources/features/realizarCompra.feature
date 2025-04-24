# language : es

  Característica: Automatizar proceso de compra en aliexpress

  @SmokeTest

  Esquema del escenario: Agregar producto al carrito

  Dado Que me encuentro en la página '<url>'

  Cuando busco el producto '<busqueda>'

  Y escojo el producto

  Y añado al carrito

  Entonces verifico el precio

  Y visualizo el carrito

  Ejemplos:
  | url | busqueda |
  ##@externaldata@parametros/Datos.xlsx@carrito
   |https://es.aliexpress.com/   |Lapicero|
