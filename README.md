# 🕹️ PokeMondonGO v3

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk&logoColor=white)
![NetBeans](https://img.shields.io/badge/IDE-NetBeans-1B6AC6?logo=apache-netbeans-ide&logoColor=white)
![Status](https://img.shields.io/badge/Status-Archivado-red)
![MVC](https://img.shields.io/badge/Arquitectura-MVC-blue)

> ⚠️ **Nota:** Este repositorio será archivado. Fue un proyecto valioso para el aprendizaje, especialmente para practicar el uso de tablas de contenidos y documentación estructurada en GitHub.

¡Bienvenido/a a **PokeMondonGO v3**! 🎮

Este es un proyecto académico desarrollado originalmente en el semestre **2024-1** como parte de la materia de Técnicas de Programación I en la Fundación Universitaria Konrad Lorenz.

En el semestre **2024-1** trabajé en una primera versión funcional. Luego, en **2024-2**, implementé el patrón MVC, pero no pude continuar desarrollando más funcionalidades. Actualmente estoy trabajando en la **v3**, una versión completamente refactorizada, con una mejor estructura, enfoque en buenas prácticas de desarrollo, y con planes para incorporar una interfaz gráfica de usuario (GUI).

---

## 📖 Tabla de Contenidos

- [✨ ¿Qué hace esta aplicación?](#-qué-hace-esta-aplicación)
- [🔁 Última versión mejorada](#-última-versión-mejorada)
- [📁 Estructura del Proyecto](#-estructura-del-proyecto)
- [🐾 Pokémon Disponibles](#-pokémon-disponibles)
- [⚔️ Sistema de Tipos](#️-sistema-de-tipos)
- [🚀 Tecnologías usadas](#-tecnologías-usadas)
- [🧪 ¿Cómo probarlo?](#-cómo-probarlo)
- [🗺️ Roadmap](#️-roadmap)
- [🤝 Contribuciones](#-contribuciones)
- [🤓 Autor](#-autor)

---

## ✨ ¿Qué hace esta aplicación?

PokeMondonGO es una **simulación de batallas Pokémon** inspirada en el clásico estilo RPG. Fue creada con fines educativos para practicar conceptos como:

| Concepto | Descripción |
|----------|-------------|
| 🧱 **POO** | Programación Orientada a Objetos (herencia, polimorfismo, encapsulamiento) |
| 📦 **Paquetes** | Manejo de paquetes y clases organizadas |
| 💾 **Persistencia** | Lectura y escritura de archivos |
| 🗃️ **Estructuras** | Uso de estructuras de datos (EnumSet, Listas, etc.) |
| 🏭 **Patrones** | Implementación del patrón Factory para creación de Pokémon |

---

## 🔁 Última versión mejorada

En esta nueva versión he aplicado mejoras importantes:

- ✅ Código refactorizado para mejor legibilidad y mantenimiento
- ✅ Separación clara de capas (MVC)
- ✅ Añadido soporte para archivos de configuración
- ✅ Mejor manejo de errores y validaciones
- ✅ Organización del proyecto en paquetes `controller`, `model`, `view`
- ✅ Sistema de tipos con multiplicadores de daño

---

## 📁 Estructura del Proyecto

```
src/
└── co/edu/konradlorenz/
    ├── controller/           # 🎮 Controladores de la aplicación
    │   ├── AplMain.java           # Punto de entrada principal
    │   ├── Controller.java        # Controlador principal
    │   ├── ControllerBatalla.java # Lógica de batallas
    │   ├── ControllerEntrenador.java
    │   ├── ControllerPersistencia.java
    │   └── ControllerPokemon.java
    │
    ├── model/                # 📊 Modelos de datos
    │   ├── entrenador/
    │   │   └── Entrenador.java
    │   ├── persistencia/
    │   ├── pokemon/
    │   │   ├── Pokemon.java
    │   │   ├── PokemonFactory.java
    │   │   ├── EnumEstado.java
    │   │   └── EnumTipoPokemon.java
    │   └── pokemones/        # 🐾 Pokémon implementados
    │       ├── Articuno.java
    │       ├── Caterpie.java
    │       ├── Charmander.java
    │       └── ...más Pokémon
    │
    └── view/                 # 👁️ Vistas de la aplicación
        ├── Vista.java
        ├── VistaBatalla.java
        └── VistaMenu.java
```

---

## 🐾 Pokémon Disponibles

Actualmente el juego cuenta con los siguientes Pokémon:

| Pokémon | Tipo(s) | Descripción |
|---------|---------|-------------|
| 🔥 Charmander | Fuego | El clásico inicial de fuego |
| ❄️ Articuno | Hielo/Volador | Legendario de hielo |
| ⚡ Jolteon | Eléctrico | Evolución eléctrica de Eevee |
| 🐛 Caterpie | Bicho | Pokémon oruga |
| 🌊 Tentacool | Agua/Veneno | Medusa de los mares |
| 🥊 Hitmonlee | Lucha | Experto en patadas |
| 💤 Snorlax | Normal | El dormilón |
| 🧠 Drowzee | Psíquico | Devorador de sueños |
| 🐚 Shellder | Agua | Bivalvo de agua |
| ⛰️ Diglett | Tierra | Topo excavador |

---

## ⚔️ Sistema de Tipos

El juego implementa un **sistema de tipos** con efectividades, similar al de los juegos oficiales:

### Tipos implementados
`FUEGO` | `AGUA` | `PLANTA` | `VENENO` | `ELÉCTRICO` | `PSÍQUICO` | `ROCA` | `TIERRA` | `NORMAL` | `VOLADOR` | `HADA` | `LUCHA` | `ACERO` | `BICHO` | `HIELO` | `FANTASMA`

### Multiplicadores de daño
- **2.0x** → Súper efectivo ⬆️
- **1.0x** → Daño normal ➡️
- **0.5x** → Poco efectivo ⬇️
- **0.0x** → Sin efecto 🚫

---

## 🚀 Tecnologías usadas

| Tecnología | Versión | Uso |
|------------|---------|-----|
| ![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk) | 21 | Lenguaje principal |
| ![NetBeans](https://img.shields.io/badge/NetBeans-Latest-1B6AC6?logo=apache-netbeans-ide) | Latest | IDE de desarrollo |
| ![Ant](https://img.shields.io/badge/Apache%20Ant-Build-A81C7D?logo=apache-ant) | - | Sistema de compilación |
| PostgreSQL (Próximamente) | - | Base de datos |

---

## 🧪 ¿Cómo probarlo?

### Requisitos previos
- ☕ Java JDK 21 o superior
- 🔧 NetBeans IDE (recomendado) o cualquier IDE con soporte para proyectos Ant

### Instalación

1. **Clona este repositorio**
   ```bash
   git clone https://github.com/13rianVargas/PokeMondonGO-v3.git
   cd PokeMondonGO-v3
   ```

2. **Abre el proyecto**
   - Con NetBeans: `File → Open Project → Selecciona la carpeta`
   - Con línea de comandos:
     ```bash
     ant compile
     ant run
     ```

3. **Ejecuta la aplicación**
   - Ejecuta la clase `AplMain.java` ubicada en:
     ```
     src/co/edu/konradlorenz/controller/AplMain.java
     ```

> 💡 **Nota:** Revisa los archivos de configuración en `nbproject/` si usas otra ruta de ejecución.

---

## 🗺️ Roadmap

### En progreso 🔄
- [ ] Más Pokémon disponibles
- [ ] Mejoras en el sistema de batallas
- [ ] Persistencia de datos de entrenadores

### Próximamente 🔮
- [ ] Interfaz gráfica (GUI) con JavaFX/Swing
- [ ] Integración con PostgreSQL
- [ ] Sistema de evoluciones
- [ ] Movimientos especiales por tipo
- [ ] Modo multijugador local

---

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Si deseas contribuir:

1. Haz un **fork** del proyecto
2. Crea una rama para tu feature (`git checkout -b feature/NuevoFeature`)
3. Haz commit de tus cambios (`git commit -m 'Agregar nuevo feature'`)
4. Haz push a la rama (`git push origin feature/NuevoFeature`)
5. Abre un **Pull Request**

---

## 🤓 Autor

<div align="center">

**13rian Vargas**

Estudiante de Ingeniería de Sistemas – Konrad Lorenz  
Miembro fundador del club de desarrollo [K-Forge](https://github.com/orgs/K-Forge)

[![GitHub](https://img.shields.io/badge/GitHub-13rianVargas-181717?logo=github)](https://github.com/13rianVargas)

</div>

---

<div align="center">

Hecho con 💛 por Bri ☕

*¡Hazte con todos!* 🎯

</div>