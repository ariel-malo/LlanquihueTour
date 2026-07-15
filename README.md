Examen final – Desarrollo Orientado a Objetos I

 👤 Autor del proyecto
- **Nombre completo**: ariel ramirez mardones
- **Carrera:** analista programacion computacional
- **Sede:** online

---

## 📘 Descripción general del sistema
Llanquihue Tour es una aplicación desarrollada en Java que simula el sistema de gestión de una empresa de turismo. 
El proyecto fue creado aplicando los principios de la Programación Orientada a Objetos (POO)
y tiene como objetivo administrar la información de clientes, empleados, proveedores y tours ofrecidos por la empresa.

El sistema permite cargar los tours desde un archivo de texto,
registrar distintas entidades relacionadas con la empresa y consultar la información almacenada mediante una estructura modular y reutilizable.

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
 ├── 📁 model/ # Clases del dominio del sistema │ ├── Persona.java │ ├── Cliente.java │ ├── Empleado.java │ ├── Proveedor.java │
 ├── Tour.java │ ├── Rut.java │ └── Registrable.java # Interfaz para las entidades registrables │
 ├── 📁 data/ # Gestión y carga de datos │ ├── GestorDatos.java │ ├── GestorTour.java │ 
 ├── 📁 util/ # Clases utilitarias │ └── InvalidoException.java │└── LectorDatos.java │
 ├── 📁 ui/ # Interfaz y clase principal │ └── Main.java │
 └── Archivos de datos └── tours.txt



## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:
https://github.com/ariel-malo/LlanquihueTour.git
```bash

```

2. Abre el proyecto en IntelliJ IDEA.
3. Crea un objeto en la clase Main.java desde el paquete app
4. Ejecuta el archivo `Main.java` desde el paquete `ui`.



---

**Repositorio GitHub:** \[https://github.com/ariel-malo/LlanquihueTour.git]
**Fecha de entrega:** \[16/07/2026]

---






