# TP JavaFX – Application de Gestion des Produits

Ce projet est une mini-application développée avec **JavaFX** qui permet de gérer une liste de produits (nom + prix). L’interface utilisateur est réalisée avec **FXML** et **CSS**, et les interactions sont contrôlées par un contrôleur Java.

<img src="Capture\img.png">
## 📋 Fonctionnalités

- Ajouter un produit avec un nom et un prix
- Afficher dynamiquement la liste des produits
- Valider les champs saisis et afficher une alerte en cas d’erreur

---

## 🧱 Structure du projet

```bash
TP-JFX/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/tpjfx/
│   │   │       ├── ProductApp.java          # Classe principale (Application)
│   │   │       ├── Product.java             # Classe modèle
│   │   │       └── ProductController.java   # Contrôleur JavaFX
│   │   └── resources/
│   │       ├── com/example/tpjfx/
│   │       │   └── product-view.fxml        # Vue JavaFX (FXML)
│   │       └── style.css                    # Feuille de style CSS
```

# 🧩 Description des composants
## 1. Product.java
   Classe modèle représentant un produit avec deux attributs :

name : nom du produit

price : prix du produit (double)

Elle contient des constructeurs, des getters/setters et une méthode toString() pour afficher les produits dans la ListView.

## 2. product-view.fxml
   Fichier FXML qui définit l’interface graphique :

Deux champs texte pour entrer le nom et le prix

Un bouton "Ajouter"

Une ListView pour afficher la liste des produits

## 3. ProductController.java
   Contrôleur associé à la vue :

Gère l’ajout des produits à la liste

Valide les entrées utilisateur

Affiche des messages d’alerte si les données sont incorrectes

## 4. style.css
   Feuille de style CSS appliquée à l’interface :

Permet d'améliorer l’apparence de l’application (polices, marges, couleurs, etc.)

## 5. ProductApp.java
   Classe principale de l’application :

Charge le fichier FXML

Applique la feuille de style

Lance la scène principale avec la fenêtre de l’application