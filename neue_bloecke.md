# Neue Blöcke hinzufügen

0. Java Klasse für den neuen Block erstellen

1. In der Datei: `block-mapping.properties` die Zuweisung von Block-ID zu Java-Klasse.
```
roboauto.servo-init=com.ardublock.translator.block.roboauto.ServoInitBlock
```

2. In der Datei `ardublock.properties` den Namen (und Beschreibung) für den Block anlegen, ggf. in mehreren Sprachen

3. In der Datei `ardublock.xml` zuerst einen neuen Blockgenus erzeugen

```xml
<BlockGenus name="roboauto.servo-init" kind="command" color="0 221 140"  initlabel="bg.roboauto.servo-init"></BlockGenus>
```
und zudem einen Eintrag im entsprechenden `Block-Drawer` erstellen:
```xml
<BlockDrawer button-color="41 158 37" name="bg.roboauto.sensors" type="default">
    <BlockGenusMember>roboauto.servo-init</BlockGenusMember>
    ...
</BlockDrawer>
```