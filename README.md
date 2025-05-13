# Conversor de Monedas

## Descripción
El **Conversor de Monedas** es una aplicación que permite convertir montos entre diferentes monedas utilizando tasas de cambio en tiempo real. Es una herramienta útil para quienes necesitan realizar conversiones rápidas y precisas.

## Características
- **Tasas de cambio en tiempo real**: Obtiene datos actualizados desde la API de ExchangeRate-API.
- **Soporte para múltiples monedas**: Convierte entre USD y las siguientes monedas:
  - Peso Argentino (ARS)
  - Real Brasileño (BRL)
  - Peso Chileno (CLP)
  - Sol Peruano (PEN)
  - Bolívar Soberano (VES)
  - Peso Boliviano (BOB)
- **Interfaz interactiva**: Solicita al usuario la moneda de destino y muestra el resultado de la conversión.

## Requisitos
- **Java**: JDK 21 o superior.
- **Librería Gson**: Incluida en el proyecto como `gson-2.13.1.jar`.
- **Conexión a Internet**: Necesaria para obtener las tasas de cambio.

## Instalación
1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/conversor-de-monedas.git
2. Asegúrate de tener configurado el JDK 21 o superior.
3. Importa el proyecto en tu IDE favorito (por ejemplo, IntelliJ IDEA o VS Code).
4. Asegúrate de que la librería gson-2.13.1.jar esté configurada como dependencia del proyecto.

## Uso
1. Ejecuta la clase principal Main.
2. Selecciona la moneda de destino de la lista proporcionada.
3. Ingresa el monto a convertir.
4. La aplicación mostrará el resultado de la conversión.

## Estructura del Proyecto
src/

├── Modelos/

│   └── [Moneda.java](http://_vscodecontentref_/0)       # Clase que representa el resultado de la conversión.

├── principal/

│   └── [Main.java](http://_vscodecontentref_/1)         # Clase principal que ejecuta la lógica del programa.

## API Utilizada
La aplicación utiliza ExchangeRate-API para obtener las tasas de cambio en tiempo real.

## Contribuciones
¡Las contribuciones son bienvenidas! Si deseas colaborar:

1. Haz un fork del repositorio.
2. Crea una rama para tu funcionalidad o corrección de errores.
3. Envía un pull request con tus cambios.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

Autor
Desarrollado como parte del desafío de ONE - Alura Latam. ```
