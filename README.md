# ArduBlock 2 mit Erweiterung für das Elegoo Smart Car v3

Fork des ArduBlock 2 Source Repos mit zusätzlichen Blöcken, um das Elegoo Smart Car einfacher damit steuern zu können.

## 1. Kompilieren
- im `openblocks-master/openblocks-master` Ordner einmalig `mvn clean package` ausführen
- im `ardublock-master/ardublock-master` Ordner `mvn clean package` ausführen, wenn Änderungen gemacht wurden, um das Ardublock-JAR neu zu erstellen

## 2. Installation
- Das Ardublock-JAR unter `ardublock-master/ardublock-master/target/ardublock-all.jar` in den `tools`-Ordner der Arduino Installation kopieren

- Aus dem `roboauto-arduino-lib` Repo den `RoboAuto`-Ordner in den `libraries`-Ordner der Arduino Installation kopieren
