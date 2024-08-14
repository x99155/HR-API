# HR API - Gestion des Employés

Cette API permet la gestion des employés à travers des opérations de type CRUD (Create, Read, Update, Delete). Vous pouvez créer, consulter, mettre à jour et supprimer les informations relatives aux employés.

## Endpoints

### 1. Créer un nouvel employé
**Méthode :** `POST`  
**URL :** `/api/employee`  
**Description :** Crée un nouvel employé et enregistre ses informations dans la base de données.

### 2. Récupérer les informations d'un employé
**Méthode :** `GET`  
**URL :** `/api/employee/{id}`  
**Description :** Récupère les informations d'un employé spécifique à partir de son identifiant unique.

### 3. Lister tous les employés
**Méthode :** `GET`  
**URL :** `/api/employees`  
**Description :** Récupère la liste de tous les employés enregistrés.

### 4. Mettre à jour les informations d'un employé
**Méthode :** `PUT`  
**URL :** `/api/employee/{id}`  
**Description :** Met à jour les informations d'un employé existant en se basant sur son identifiant.

### 5. Supprimer un employé
**Méthode :** `DELETE`  
**URL :** `/api/employee/{id}`  
**Description :** Supprime un employé de la base de données en utilisant son identifiant unique.