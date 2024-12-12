Étapes pour démarrer
utilisation Spring Initializr pour generer le projet
Eviter mon erreur cloner le projer avant de commencer
-configuration du fichier application.properties
les deux lignes les plus important
spring.application.name=dice
server.port=8081
puis configurer la base de donnée
spring.datasource.url=jdbc:h2:mem:devDb 
le mem veut dire que nouvoulons une base de donée  en memoire
- Créer la classe Dice pour generer des valeur aléatoire de 1 à 6. utiliser Randon
- Créer l'Entité DiceRollLog  en utilisant l'annotation @Entity
      Utilisation de lombok pour facilité la gestion des getters et setters/ les construteurs parametres et sans parametrez
      avant tout ajouté les depences sur le fichier maven
- Création DiceRelogRepository pour gérer les interactions avec la base de données.
- Création du contrôleur REST pour lancer les dés
- Création du Service
- Creation d'un controleur pour afficher les historiques
- Teste et validation
    utiliser l'url avec: localhost:8081/<EndPoind>
          localhost:8081/GET /rollDice : Lancer un seul dé.
          localhost:8081/GET /rollDices/{X} : pour Lancer X dés (X étant un paramètre dynamique).
          localhost:8081/GET /diceLogs pour afficher l'historique

git commit -m 'nom comit'
git push
git tag Rendu
git tag --tags
         
