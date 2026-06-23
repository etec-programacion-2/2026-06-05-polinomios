# Polinomios

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
![Java](https://img.shields.io/badge/Java_21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Proyecto educativo en Kotlin que implementa un modelo de polinomios con las clases `Polinomio` y `Termino`, incluyendo operaciones básicas como la suma.

## Estructura

```
app/src/main/kotlin/org/example/
├── polinomio/
│   ├── Termino.kt       # Término con coeficiente y exponente
│   └── Polinomio.kt     # Polinomio como lista de términos y operaciones
└── App.kt               # Punto de entrada con ejemplos
```

## Operaciones disponibles

- **Suma** — combina términos de igual exponente (`sumar()` / operador `+`)

## Ejecutar

```bash
./gradlew run
```
