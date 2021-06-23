
Écrivez une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.

# PartitionListLib
 - immuable list
 - the iterator and list iterator are implemented by  AbstractList class...

## instructions 
   
    Entrées :
              - @liste (non vide) 
              - @sublistSize (positif)
              
    PartitionList.partition(Arrays.asList(1, 2, 3, 4,5), 2) ==> [ [1,2],[3,4],[5] ]
 
## pour utiliser la classe dans un autre projet 

	
1- mvn clean install (Jar)

2- utiliser le projet comme dépendance en ajoutant au fichier pom.xml : 
###
    <dependency>
       <groupId>fr.ThinkingPositive.partition</groupId>
       <artifactId>devoirMaison</artifactId>
       <version>1.0</version>
    </dependency>

###
