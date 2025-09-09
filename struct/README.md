# EXPLICATION

Ce dossier contient quelques structures de données que j'ai apprises en ASD (Algorithme et Structure de Données).

Il y a plusieurs versions:

La première s'affiche dans le terminal grace au MakeFile.

Il suffit d'ecrire make dans le terminal (les différentes commandes sont données dans la session Makefile).

La deuxième possède une interface graphique. j'ai utilisé Swing pour la première fois.
Je n'ai jamais appris à l'utiliser à la fac car je n'ai pas encore eu IHM (Interaction Homme-Machine).
Je me suis donc aidé de la documentation officielle ainsi que d'un tutoriel qui expliquait les bases.

Pour le lancer, vous avez un fichier jar.

Je vous met aussi les commandes au cas où vous ne voudriez pas utiliser le make et le jar.

On remarque bien l'affichage que de certaines valeurs.
Pour la pile, on n'a accès qu'a la dernière valeur (sommet) et pour la file, on a acccés a la tête et a la queue.

# COMMANDES

## Compilation des classes

javac -sourcepath src src/stack/*.java -d classes

javac -sourcepath src src/queue/*.java -d classes

## Compilation des tests

javac -classpath "junit-console.jar;classes" test/stack/*.java

javac -classpath "junit-console.jar;classes" test/queue/*.java

### Commande Linux

javac -classpath junit-console.jar:classes test/stack/*.java

javac -classpath junit-console.jar:classes test/queue/*.java 


## Execution du main

java -classpath classes stack/MainStack

java -classpath classes stack/StackFrame

java -classpath classes queue/QueueFrame

java -classpath classes queue/MainQueue

## Execution des tests

java -jar junit-console.jar -classpath "test;classes" -scan-classpath

### Commande Linux

java -jar junit-console.jar -classpath test:classes -scan-classpath 


## Documentation

javadoc -sourcepath src -subpackages stack queue -d docs

## Jar

jar cmf MANIFESTQUEUE.MF QueueGUI.jar -C classes . 

jar cmf MANIFESTSTACK.MF StackGUI.jar -C classes .

# Makefile

## Compilations des classe et doc:

make

## Executions des mains

make run_queue

make run_stack

## Suppression classes

make fclean

## Executions des tests

make test windows

ou

make test linux


## Compilation documentation:

make doc

