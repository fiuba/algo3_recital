# Recital

Necesitamos construir una parte del modelo de la plataforma de venta de entradas que nos permita generar los tickets de ingresos para Taylor Swift.

Las entradas disponibles:
- Tipo A:
  - Precio $ 600
- Tipo B:
  - Precio: $ 5000

Existen medios de pagos que te permiten adquirir:
 - Tarjeta PertenenciaH, puede comprar cualquier tipo de entrada. No tiene 
límite de compra.
 - Tarjeta Gold, puede comprar entradas de Tipo A. Tiene por límite de compra 
   $1000.

## Casos de uso
1. Un comprador pide 2 entradas TipoB y paga con la tarjeta PertenenciaH.  
   Recibe dos entradas.
2. Un comprador pide 2 entradas TipoA y paga con la tarjeta Gold. Recibe una 
   sola entrada.
3. Un comprador pide 2 entradas TipoB, 2 entradas TipoA con la tarjeta 
   PertenenciaH. Recibe las 4 entradas.

## Se pide:
- Diagrama de clases completo incluyendo todas las clases y abstracción por 
más que no se utilicen en los diagramas de secuencia de los casos de uso.
- Diagrama de secuencia para cada uno de los casos de uso.
- Código de la prueba para cada uno de los casos de uso.
