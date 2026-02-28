
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

