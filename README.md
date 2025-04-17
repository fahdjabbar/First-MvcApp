# Projet Spring MVC - Gestion de Produits

Un projet Spring MVC simple utilisant Maven, H2 Database et Bootstrap pour l'affichage des produits.

## 📌 Technologies utilisées
- **Framework** : Spring MVC
- **Build Tool** : Maven
- **Base de données** : H2 (en mémoire)
- **Frontend** : Bootstrap (via Thymeleaf)
- **IDE** : IntelliJ IDEA

## 📁 Structure du projet
src/
├── main/
│ ├── java/
│ │ └── com/
│ │ └── example/
│ │ ├── entities/ # Package des entités
│ │ │ └── Product.java
│ │ ├── repository/ # Package des repositories
│ │ │ └── ProductRepository.java
│ │ └── web/ # Package web/controller
│ │ └── MvcRepositoryApplication.java
│ └── resources/
│ ├── static/ # Fichiers statiques (CSS/JS)
│ ├── templates/ # Fichiers Thymeleaf
│ │ └── Products.html
│ └── application.properties # Configuration H2/Spring
pom.xml # Fichier Maven


## 🛠 Configuration

### Prérequis
- JDK 11+
- Maven 3.6+
- IntelliJ IDEA (recommandé)

### Installation
1. Cloner le dépôt
2. Importer dans IntelliJ comme projet Maven
3. Attendre que les dépendances se téléchargent

### Base de données H2
- Accès à la console H2 : `http://localhost:8080/h2-console`
- JDBC URL : `jdbc:h2:mem:testdb`
- User : `sa`
- Pas de mot de passe

## 🌐 Fonctionnalités
- Affichage des produits dans une table Bootstrap
- Interface simple avec Thymeleaf
- Base H2 en mémoire avec données initiales (si configuré)

## 🚀 Exécution
1. Lancer `MvcRepositoryApplication.java`
2. Accéder à l'interface : `http://localhost:8080/products`

## 📝 Fichiers clés
- `Product.java` : Entité JPA avec id, name, price, etc.
- `ProductRepository.java` : Interface JpaRepository pour les opérations CRUD
- `Products.html` : Template Thymeleaf avec tableau Bootstrap
- `application.properties` : Configuration Spring et H2

## 📚 Dépendances Maven
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- H2 Database
- Thymeleaf
- Bootstrap (via webjars)

## 📸 Capture d'écran
![image](https://github.com/user-attachments/assets/2f003be1-1617-4e51-ac38-9f6b51f4d445)

