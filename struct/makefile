# Compilateur Java
JC = javac

J=java

JDOC =javadoc

# Dossier source et dossier de sortie
SRC = src
CLASSES_DIR = classes
DOC = docs

# Cible par défaut : compiler tout
all: stack_classes queue_classes doc

# Compiler stack
stack_classes:
	$(JC) -sourcepath $(SRC) $(SRC)/stack/*.java -d $(CLASSES_DIR)

# Compiler queue
queue_classes:
	$(JC) -sourcepath $(SRC) $(SRC)/queue/*.java -d $(CLASSES_DIR)

# Exécuter Main dans stack
run_stack: stack_classes # vérifie que la commande à été executé avant
	java -cp $(CLASSES_DIR) stack.MainStack

# Exécuter Main dans queue
run_queue: queue_classes # vérifie que la commande à été executé avant
	java -cp $(CLASSES_DIR) queue.MainQueue

# Compilation doc
doc: 
	$(JDOC) -sourcepath $(SRC) -subpackages stack queue -d $(DOC)

# compilation des tests
test windows:
	$(JC) -classpath "junit-console.jar;$(CLASSES_DIR)" test/stack/*.java

	$(JC) -classpath "junit-console.jar;$(CLASSES_DIR)" test/queue/*.java

	$(J) -jar junit-console.jar -classpath "test;$(CLASSES_DIR)" -scan-classpath

test linux:
	$(JC) -classpath junit-console.jar:$(CLASSES_DIR) test/stack/*.java

	$(JC) -classpath junit-console.jar:$(CLASSES_DIR) test/queue/*.java

	$(J) -jar junit-console.jar -classpath test:$(CLASSES_DIR) -scan-classpath

# Nettoyage complet
fclean:
	rm -rf $(CLASSES_DIR)
