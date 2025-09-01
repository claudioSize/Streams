# Streams
Estudiando y poniendo en practicas los streams en java

PRUEBA TÉCNICA: Procesamiento funcional de datos en Java
Contexto: Estás construyendo un pequeño módulo de análisis para una empresa que vende productos en distintos países. Dispones de datos de:

Productos
Ventas
Clientes
Objetivo general: Implementar consultas y transformaciones usando la API de Streams (NO bucles for tradicionales), emplear lambdas, Optional, collectors avanzados y buenas prácticas.

MODELOS (puedes ajustarlos pero manten la esencia)
Crea las siguientes clases inmutables (usa constructor + getters, o records si quieres):

Producto

id (String)
nombre (String)
categoria (String) (ej: "Electrónica", "Hogar", "Juguetes")
precio (double)
Cliente

id (String)
nombre (String)
pais (String) (ej: "Argentina", "Chile", "Peru", "Brasil")
email (String, puede ser null en algunos casos para probar Optional)
Venta

id (String)
productoId (String)
clienteId (String)
fecha (LocalDate)
cantidad (int)
Dataset de ejemplo mínimo (puedes ampliarlo): Productos: P1, "Smartphone X", "Electrónica", 800.0 P2, "Cafetera Pro", "Hogar", 120.0 P3, "Lego Star", "Juguetes", 95.5 P4, "Auriculares Z", "Electrónica", 150.0 P5, "Silla Gamer", "Hogar", 300.0

Clientes: C1, "Ana", "Argentina", "ana@mail.com" C2, "Luis", "Peru", null C3, "María", "Chile", "maria@mail.com" C4, "Pedro", "Brasil", "pedro@mail.com" C5, "Lucia", "Argentina", null

Ventas: V1, P1, C1, 2024-01-10, 1 V2, P2, C1, 2024-01-11, 2 V3, P3, C2, 2024-02-05, 3 V4, P1, C3, 2024-02-20, 2 V5, P4, C4, 2024-02-28, 4 V6, P5, C5, 2024-03-03, 1 V7, P2, C2, 2024-03-04, 1 V8, P3, C3, 2024-03-10, 5 V9, P4, C1, 2024-03-15, 1 V10, P1, C4, 2024-03-20, 1

REQUERIMIENTOS FUNCIONALES (EJERCICIOS)
A. Búsquedas y filtros

Obtener la lista de productos de una categoría dada (parámetro) ordenados alfabéticamente por nombre.
Listar los clientes que no tienen email (usar filter + Optional posteriormente en otra capa si quieres).
Dada una cadena (substring), devolver productos cuyo nombre la contenga (case-insensitive).
B. Transformaciones y mapeos 4. Crear un Map<String, List<Producto>> agrupando productos por categoría. 5. Crear un Map<String, Long> con el conteo de productos por categoría. 6. Devolver una lista de nombres de clientes en mayúsculas únicos y ordenados (distinct + map + sorted).

C. Operaciones sobre Ventas 7. Calcular el ingreso total (sumatoria de precio * cantidad) de todas las ventas. 8. Obtener el top 3 de productos más vendidos (por unidades) devolviendo una lista de (productoId, unidadesVendidas). (Hint: groupingBy + summingInt + sorting + limit). 9. Calcular el ticket promedio: (sumatoria total de (precio*cantidad)) / (número de ventas). 10. Para cada país, calcular el total facturado (map país -> double) considerando las ventas de clientes de ese país. 11. Encontrar el producto con mayor facturación total (precio * total unidades vendidas). Retornar Optional<Producto>.

D. Uso de Optional 12. Método: Optional<Cliente> buscarClientePorEmail(String email) (retorna vacío si no existe o si el email es null). 13. Método: String obtenerEmailCliente(String clienteId) que retorne el email o "NO_EMAIL" si ausente (usar orElse / orElseGet). 14. Método: double obtenerPrecioProducto(String productoId) que lance excepción personalizada si no existe (usar orElseThrow).

E. Consultas combinadas 15. Generar un reporte de ventas por producto: Resultado esperado (por cada producto existente aunque no tenga ventas): ProductoNombre | UnidadesVendidas | FacturacionTotal (Si no tiene ventas, 0 y 0.0) (Hint: Map productoId -> stats; luego map a DTO) 16. Listar los clientes ordenados por el total gastado (descendente) y si hay empate, por nombre ascendente. (Necesitas agrupar ventas por cliente, sumar, luego ordenar).
