# Простой проект Калькулятор на Kotlin

[![Build and Test](https://github.com/username/kotlin-calculator/actions/workflows/build.yml/badge.svg)](https://github.com/username/kotlin-calculator/actions/workflows/build.yml)
[![codecov](https://codecov.io/gh/username/kotlin-calculator/branch/main/graph/badge.svg)](https://codecov.io/gh/username/kotlin-calculator)

Этот проект представляет собой простую реализацию калькулятора на Kotlin с покрытием JUnit тестами.

## Функциональность

Калькулятор поддерживает следующие операции:

- Сложение
- Вычитание
- Умножение
- Деление (с проверкой деления на ноль)

## Тестирование

Проект включает полное покрытие кода тестами с использованием JUnit Jupiter:

- Все операции калькулятора протестированы
- Включены параметризованные тесты для вычитания
- Добавлена проверка исключений при делении на ноль

## Настройка

### Требования

- JDK 17 или выше
- Gradle 7.5 или выше

### Команды

Запуск тестов:

```bash
./gradlew test
```

Запуск тестов с отчетом о покрытии кода:

```bash
./gradlew test jacocoTestReport
```

Отчет о покрытии кода будет доступен в директории `build/jacocoHtml`.

## Технологический стек

- Kotlin 2.0.10
- JUnit Jupiter 5.9.2
- Gradle
- JaCoCo для отчетов о покрытии кода
- GitHub Actions для непрерывной интеграции
- Codecov для визуализации покрытия кода
