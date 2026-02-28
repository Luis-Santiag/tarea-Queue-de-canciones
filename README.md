
Proyecto del curso Programación 3  
Universidad Mariano Gálvez de Guatemala  

Descripción

Este proyecto consiste en la implementación de una estructura de datos Queue (Cola) desarrollada manualmente en Java, sin utilizar las clases del JDK como:
Queue
LinkedList
ArrayDeque
O cualquier otra estructura ya implementada

La cola sigue el principio FIFO (First In, First Out)

Estructura del Proyecto

data-structure-queue/

data-structure.queue    Librería con la implementación de la cola  
queueHandler                       Proyecto ejecutable que usa la cola  
evidencias                         Capturas de ejecución  
README.md

Requisitos

 Java 8 o superior
 Maven

Cómo compilar el proyecto

Clonar el repositorio

bash
git clone 
cd data-structure-queue

Compilar la liberia

cd data-structure.queue
mvn clean install

Compilar el ejecutable 
cd ../queueHandler
mvn clean package

Ejecutar 
cd target
java -jar queueHandler-0.0.1-SNAPSHOT.jar


Decisiones Técnicas

 Se utilizó una estructura enlazada en lugar de arreglo para evitar redimensionamiento.
 Se separó la librería del handler para cumplir el diseño modular.
 Se utilizó Maven para permitir compilación automática al clonarse.
 No se utilizaron estructuras del JDK para cumplir el requisito académico.

 Implementación de Prioridad

La prioridad se implementó agregando un atributo priority en la clase Song
Cuando se inserta una canción:

Si tiene mayor prioridad, se coloca antes en la cola.
Si tiene misma prioridad, respeta el orden FIFO.

La inserción se realiza recorriendo manualmente los nodos hasta encontrar la posición correcta.
Esto permite simular un comportamiento similar a una cola con prioridad sin usar PriorityQueue.

 Simulación de Duración

Cada canción posee un atributo duration (en segundos).

La simulación se realiza utilizando:
Thread.sleep(duration * 1000)

Esto permite simular el tiempo real de reproducción antes de pasar a la siguiente canción.
No se utilizaron librerías externas para la simulación.


