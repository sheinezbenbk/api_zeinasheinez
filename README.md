# API REST - Gestion de Bibliothèque

API REST développée avec Spring Boot pour gérer des livres et des auteurs.

## Binôme

| Nom | Prénom | Formation |
|-----|--------|-----------|
| BAL | Zeinabou | MMI 3 TD1 |
| BEN BOUBAKER | Sheinez | MMI 3 TD1 |

---

## Lancer l'application


### Étapes
1. Démarrer MySQL dans XAMPP
2. Créer la base de données `stock` dans phpMyAdmin
3. Lancer l'application depuis le run IntelliJ 
4. L'API est accessible sur `http://localhost:8080`

---

## Endpoints disponibles

### **Auteurs**

| Méthode | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/authors` | Liste tous les auteurs |
| GET | `/api/authors/{id}` | Récupère un auteur par ID |
| POST | `/api/authors` | Crée un nouvel auteur |
| PUT | `/api/authors/{id}` | Modifie un auteur |
| DELETE | `/api/authors/{id}` | Supprime un auteur |

### **Livres**

| Méthode | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/books` | Liste tous les livres |
| GET | `/api/books/{id}` | Récupère un livre par ID |
| POST | `/api/books` | Crée un nouveau livre |
| PUT | `/api/books/{id}` | Modifie un livre |
| DELETE | `/api/books/{id}` | Supprime un livre |

### **Statistiques**

| Méthode | Endpoint | Description |
|---------|----------|-------------|
| GET | `/api/stats/books-per-category` | Nombre de livres par catégorie |

---

## Exemples de requêtes

### Créer un auteur
```http
POST http://localhost:8080/api/authors
Content-Type: application/json

{
  "firstName": "Victor",
  "lastName": "Hugo",
  "birthYear": 1802
}
```

### Créer un livre
```http
POST http://localhost:8080/api/books
Content-Type: application/json

{
  "title": "Le Mythe de Sisyphe",
  "isbn": "978-2070322886",
  "year": 1942,
  "category": "ESSAY",
  "author": {
    "id": 2
  }
}
```
<img width="701" height="539" alt="image" src="https://github.com/user-attachments/assets/80a3d54c-7b5c-410f-8596-77236ced6a48" />

### Récupérer tous les livres
```http
GET http://localhost:8080/api/books
```

### Voir les statistiques
```http
GET http://localhost:8080/api/stats/books-per-category
```

**Réponse :**
```json
{
  "NOVEL": 2,
  "ESSAY": 1,
  "POETRY": 0,
  "OTHER": 0
}
```

---

## Catégories de livres disponibles

- `NOVEL` - Roman
- `ESSAY` - Essai
- `POETRY` - Poésie
- `OTHER` - Autre

---

## Technologies utilisées

- Spring Boot
- IntelliJ
- XAMPP
- extension Talend API Tester 
- MySQL
