## Descripción

Ejercicios pensados para practicar los design patterns Singleton y Abstract Factory.

### Tecnologias usadas

- Java 23

- IntelliJ


***

## Nivel 1

<br>

BUILDER:

Desarrolla un sistema de gestión de comandas de pizzas utilizando el patrón de diseño Builder en Java. El sistema debe permitir la creación de diferentes tipos de pizzas con configuraciones de tamaño, masa e ingredientes diferentes.

Define una clase Pizza con los siguientes atributos:
- size (tamaño)
- dough (tipo de masa)
- toppings (ingredientes)

Crea una interfaz PizzaBuilder con los métodos necesarios para configurar el tamaño, la masa y los ingredientes de una pizza.
Implementa una o más clases que actúen como constructores concretos (PizzaBuilder) para diferentes tipos de pizzas. Por ejemplo, podrías tener un constructor para la pizza hawaiana, otro para la pizza vegetariana, etc.
Desarrolla una clase Director que reciba un PizzaBuilder y que permita construir pizzas de manera específica.
En el programa principal (Main), crea instancias de PizzaBuilder y de Director, y utilízalas para construir pizzas con diferentes configuraciones. 

<br>

***

## Nivel 2

OBSERVER:

Diseña un sistema en el cual un Agente de Bolsa (Observable) notifique a diversas agencias de Bolsa (Observers) cambios cuando la Bolsa sube o baja.

Es necesario que el objeto Observable mantenga referencias a los Observers.

<br>

***


## Cómo ejecutarlo
Clona el repositorio o descarga el archivo zip, luego ábrelo en tu entorno de desarrollo integrado (IDE) preferido.