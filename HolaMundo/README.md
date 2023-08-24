# Variables

Una variable es una ubicación en la memoria de la computadora que se utiliza para almacenar un valor. Las variables se utilizan para almacenar información que puede cambiar durante la ejecución de un programa. Por ejemplo, si estás escribiendo un programa que calcula el área de un círculo, podrías usar una variable para almacenar el radio del círculo. A medida que el usuario ingrese diferentes valores para el radio, la variable se actualizará con el nuevo valor.

Las variables se declaran utilizando un tipo de datos y un nombre. El tipo de datos indica qué tipo de valor se almacenará en la variable. Por ejemplo, si estás almacenando un número entero, el tipo de datos sería "int". El nombre de la variable es una etiqueta que se utiliza para identificar la variable.

Después de declarar una variable, se puede asignar un valor a la variable utilizando un operador de asignación. Por ejemplo, la siguiente declaración asigna el valor 10 a la variable "radio":

```
int radio = 10;
```

Una vez que se asigna un valor a una variable, se puede utilizar ese valor en el programa. Por ejemplo, la siguiente declaración calcula el área del círculo utilizando la variable "radio":

```
double area = Math.PI * radio * radio;
```

Los tipos de variables más comunes son:

* **int:** almacena números enteros.
* **double:** almacena números decimales.
* **char:** almacena caracteres.
* **boolean:** almacena valores booleanos, que son true o false.

También hay otros tipos de variables más especializados, como las variables de tipo matriz, que almacenan una colección de valores, y las variables de tipo objeto, que almacenan referencias a objetos.

Las variables son una parte esencial de la programación. Se utilizan para almacenar información, controlar el flujo del programa y realizar cálculos.

## Tipos de variables

* **Variables de tipo primitivo:** son variables que almacenan valores de un tipo de datos básico, como números, texto o booleanos. Los tipos de datos primitivos son:
    * **int:** almacena números enteros.
    * **double:** almacena números reales.
    * **char:** almacena caracteres.
    * **boolean:** almacena valores booleanos.

* **Variables de tipo no primitivo:** son variables que almacenan referencias a objetos. Los objetos son estructuras de datos que pueden almacenar datos y métodos. Los tipos de datos no primitivos más comunes son:
    * **String:** almacena texto.
    * **Object:** almacena referencias a objetos de cualquier tipo.
    * **Arrays:** almacenan colecciones de valores.

Las variables de tipo primitivo son más rápidas que las variables de tipo no primitivo. Esto se debe a que las variables de tipo primitivo se almacenan en la memoria principal de la computadora, mientras que las variables de tipo no primitivo se almacenan en la memoria secundaria.

* **Los tipos de datos referenciados**: Son variables que almacenan referencias a objetos. Los objetos son estructuras de datos que pueden almacenar datos y métodos.

Las variables de tipo referenciado son diferentes de las variables de tipo primitivo en que no almacenan los datos directamente. En cambio, almacenan una dirección de memoria que apunta a los datos reales.

Esto significa que cuando se asigna un valor a una variable de tipo referenciado, no se está asignando el valor en sí, sino la dirección de memoria donde se almacena el valor.

Por ejemplo, la siguiente declaración asigna el valor "hola" a la variable "nombre":

```
String nombre = "hola";
```

En realidad, lo que está haciendo es asignar la dirección de memoria de la cadena "hola" a la variable "nombre".

La siguiente declaración imprime el valor de la variable "nombre":

```
System.out.println(nombre);
```

Esto imprimirá la cadena "hola".

Una de las principales diferencias entre los tipos de datos referenciados y los tipos de datos primitivos es que los tipos de datos referenciados pueden ser null. Null es un valor especial que significa que la variable no apunta a ningún objeto.

Por ejemplo, la siguiente declaración asigna el valor null a la variable "nombre":

```
String nombre = null;
```

En este caso, la variable "nombre" no apunta a ningún objeto. Si intentas imprimir el valor de la variable "nombre", obtendrás un error.

Otra diferencia importante entre los tipos de datos referenciados y los tipos de datos primitivos es que los tipos de datos referenciados se almacenan en la memoria secundaria, mientras que los tipos de datos primitivos se almacenan en la memoria principal.

Esto significa que las variables de tipo referenciado son más lentas que las variables de tipo primitivo.

Los tipos de datos referenciados se utilizan para almacenar objetos. Los objetos son estructuras de datos que pueden almacenar datos y métodos.

Los tipos de datos referenciados son una parte importante de la programación orientada a objetos.

La elección del tipo de variable adecuado depende de los valores que se deben almacenar. Por ejemplo, si se necesita almacenar un número entero, se debe utilizar una variable de tipo entero. Si se necesita almacenar texto, se debe utilizar una variable de tipo String.

## Reglas para definir nombres de variables

| Regla                                                                                                                     | Descripción                                                                                              |
|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|
| **Reglas**                                                                                                                |                                                                                                          |
| El nombre de la variable debe ser único dentro del ámbito en el que se declara.                                           | Esto significa que no pueden haber dos variables con el mismo nombre en el mismo ámbito.                 |
| El nombre de la variable debe comenzar con una letra o un guión bajo (_).                                                 | Los números y otros caracteres especiales no se pueden utilizar al principio del nombre de una variable. |
| El nombre de la variable puede contener letras, números y guiones bajos (_).                                              | Sin embargo, no se pueden utilizar espacios en blanco o otros caracteres especiales.                     |
| El nombre de la variable no puede ser una palabra clave de Java.                                                          | Las palabras clave son palabras reservadas que tienen un significado especial en Java.                   |
| El nombre de la variable debe ser descriptivo del valor que almacena.                                                     | Esto ayudará a que el código sea más legible y fácil de entender.                                        |
| **Convenios**                                                                                                             |                                                                                                          |
| Los nombres de las variables suelen escribirse en minúsculas, con la primera letra de las palabras internas en mayúscula. | Esto se conoce como "notación camelCase".                                                                |
| Los nombres de las variables temporales pueden escribirse en minúsculas, con el prefijo "_".                              | Esto ayuda a distinguirlas de las variables permanentes.                                                 |
| Los nombres de las constantes se deben escribir en mayúsculas, con las palabras separadas por guiones bajos.              | Esto ayuda a distinguirlas de las variables.                                                             |
| Los nombres de las variables de clase deben comenzar con una letra mayúscula.                                             | Esto ayuda a distinguirlas de las variables de instancia.                                                |

Además de estas reglas, también se recomienda que los nombres de las variables sean concisos y fáciles de recordar.
