# Club de Yacht Puerto Black – Gestión de Fondeadero

## 📌 Descripción general

El sistema permite registrar yates amarrados, liberar amarras, calcular costos
mensuales y obtener reportes sobre la ocupación y recaudación del fondeadero,
aplicando **Programación Orientada a Objetos** y **testing con JUnit**.

---

## 🎯 Objetivo del sistema

Modelar el funcionamiento de un fondeadero que:

- Administra una cantidad limitada de **amarras**
- Permite amarrar y desamarrar yates
- Distingue entre **yates a motor** y **yates a vela**
- Calcula el costo mensual de amarre según reglas establecidas
- Obtiene información de ocupación y recaudación total

---

## 🛠️ Tecnologías utilizadas

- **Java**
- **JUnit** (tests unitarios)
- Eclipse IDE
- Proyecto Java tradicional con estructura estándar

---

## 🧠 Diseño y conceptos aplicados

El diseño del sistema se basó en conceptos de **Programación Orientada a Objetos**:

- **Herencia**: clase base `Yate` y especializaciones según el tipo de propulsión
- **Polimorfismo**: cálculo del precio de amarre según el tipo de yate
- **Encapsulamiento**: atributos privados y métodos de acceso controlados
- **Responsabilidad única**: cada clase cumple un rol específico
- **Colecciones** para administrar las amarras del fondeadero

---

## 🚢 Modelo del dominio

### Yate (Clase base)

Todo yate posee:
- Nombre
- Dueño
- Manga
- Calado
- Eslora
- Cantidad de tripulantes
- Peso

La clase define el comportamiento común a todos los yates y permite
especializar atributos según el tipo.

---

## ⚓ Tipos de yates implementados

### ✔ Yate a Motor
Además de los atributos comunes, registra:
- Desplazamiento
- Tipo de propulsión
- Potencia
- Velocidad
- Autonomía

---

### ✔ Yate a Vela
Además de los atributos comunes, registra:
- Altura del mástil
- Superficie vélica mayor
- Superficie vélica total

---

## 🏗️ Fondeadero

La clase `Fondeadero` es la encargada de administrar las amarras.

### Funcionalidades implementadas:

- Crear el fondeadero indicando la **cantidad máxima de amarras**
- `amarrarYate(Yate yate)`  
  Amarra un yate si hay disponibilidad
- `desamarrarYate(Yate yate)`  
  Libera la amarra ocupada por el yate
- `obtenerCantidadDeYatesAmarrados()`  
  Devuelve el total de amarras ocupadas
- `obtenerCantidadDeAmarrasDisponibles()`  
  Devuelve el total de amarras libres
- `obtenerPrecioDeAmarre(Yate yate)`  
  Calcula el costo mensual de la amarra
- `obtenerRecaudacionTotal()`  
  Devuelve el total recaudado por los yates amarrados

---

## 💰 Cálculo del precio de amarre

El costo mensual se calcula en base a:

### Tipo de yate
- Yate a Motor: **$10.000**
- Yate a Vela: **$9.000**

### Eslora
- Hasta 20 metros: **$2.000**
- Más de 20 metros: **$3.000**

**Precio final = costo por tipo + costo por eslora**

---

## 🧪 Testing

Se implementaron **seis (6) casos de prueba representativos** para validar
el comportamiento de la clase `Fondeadero`, cubriendo:

- Amarre y desamarre de yates
- Cálculo correcto de amarras disponibles y ocupadas
- Cálculo del precio de amarre según tipo y eslora
- Obtención correcta de la recaudación total

Los tests permiten verificar que el sistema funcione correctamente ante
distintas situaciones.

---

## 📁 Organización del proyecto

- Paquetes organizados por responsabilidad
- Clases con responsabilidades claras
- Métodos simples y legibles
- Convenciones de nomenclatura:
  - `UpperCamelCase` para clases
  - `lowerCamelCase` para métodos y variables

---

## ✅ Estado del proyecto

✔ Compila correctamente  
✔ Cumple con todos los requerimientos del enunciado  
✔ Aplica herencia y polimorfismo  
✔ Funcionalidades correctamente testeadas  
