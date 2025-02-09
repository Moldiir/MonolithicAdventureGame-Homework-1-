# 📖 Documentation for Refactoring MonolithicAdventureGame Using SOLID Principles

## 🌟 1. Introduction
This document outlines the transformation of **MonolithicAdventureGame** into a **modular and scalable** architecture following **SOLID principles**. The refactored game now consists of independent, well-structured classes with clearly defined responsibilities, significantly improving maintainability, flexibility, and ease of extension.

---

## 🏗 2. Code Structure After Refactoring
### 🔹 Main Modules:
- **🎮 Player** – Manages player attributes such as health, experience, and inventory.
- **⚔️ CombatManager** – Handles combat mechanics and logic.
- **👹 EnemyManager** – Manages enemy entities and their behaviors.
- **🎒 ItemManager** – Controls item collection, usage, and inventory.
- **🗺 LevelManager** – Oversees level progression and structure.
- **🏆 ScoreManager** – Tracks and updates player scores dynamically.

### 📂 Directory Structure:
📂 MainGame
│── 📂 src
│   ├── Main.java
│   ├── MainGame.java
│   ├── 📂 game
│   │   ├── Game.java
│   ├── 📂 player
│   │   ├── Player.java
│   ├── 📂 combat
│   │   ├── CombatManager.java
│   │   ├── CombatManagerImpl.java
│   ├── 📂 enemies
│   │   ├── Enemy.java
│   │   ├── Skeleton.java
│   │   ├── Zombie.java
│   │   ├── Vampire.java
│   ├── 📂 items
│   │   ├── manager
│   │   │   ├── ItemManager.java
│   │   │   ├── ItemManagerImpl.java
│   │   ├── GoldCoin.java
│   │   ├── HealthElixir.java
│   │   ├── MagicScroll.java
│   ├── 📂 level
│   │   ├── LevelManager.java
│   │   ├── LevelManagerImpl.java

---

## 🏛 3. Application of SOLID Principles
### 🔹 **Single Responsibility Principle (SRP)**
Each class has a single, well-defined responsibility:
- **Player** – Manages player-related attributes and inventory.
- **CombatManager** – Handles battle-related calculations and logic.
- **ItemManager** – Manages in-game items and inventory interactions.
- **LevelManager** – Controls level advancement and transitions.

### 🔹 **Open/Closed Principle (OCP)**
New enemy types (**Vampire, Zombie**) and new items (**HealthElixir, GoldCoin**) can be introduced **without modifying existing classes** thanks to the use of **abstract base classes** like **Enemy** and **Item**.

### 🔹 **Liskov Substitution Principle (LSP)**
Subclasses **Skeleton, Zombie, Vampire** inherit from **Enemy** and seamlessly integrate into **CombatManager**, ensuring modularity and reusability.

### 🔹 **Interface Segregation Principle (ISP)**
Rather than a single large interface (**GameEntity**), specialized interfaces improve modularity:
- **IAttackable** – For entities that can attack.
- **IDamageable** – For entities that can receive damage.
- **IItemInteractable** – For entities that interact with items.

### 🔹 **Dependency Inversion Principle (DIP)**
- **CombatManager** interacts with enemies through **IEnemy**, reducing direct dependencies.
- **ItemManager** operates on **IItem**, decoupling item logic from concrete implementations.

---

## 🏆 4. Justification for Class Structure
### 🎯 **Functional Module Separation**
Breaking the game into smaller, **self-contained modules** allows easier maintenance and **future expansion**. For example, adding a new enemy type (**Werewolf**) requires only a new subclass of **Enemy**, leaving the combat system untouched.

### 🎯 **Flexibility and Extensibility**
Using **interfaces like IEnemy and IItem** ensures seamless introduction of new game elements without modifying existing code, thus adhering to **OCP** and preventing **tight coupling**.

### 🎯 **Improved Readability and Maintainability**
By separating **combat, levels, and inventory management** into distinct classes, the **codebase becomes clearer and more structured**, making it **easier to debug and extend**.

---

## 🎯 5. Conclusion
Thanks to a **well-structured refactoring process**, the game has become **modular, extensible, and maintainable**. New enemies, items, or levels can be **seamlessly integrated** without altering existing functionality, ensuring **long-term scalability and efficiency**. 🚀