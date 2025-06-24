# 🔐 SecureMessenger Pro

An enhanced Java console messaging simulation that showcases real-world object-oriented programming concepts in action — designed for the **Week 6** deliverable of the **FlexiSAF Java Internship Program**.

---

## 💼 Overview

**SecureMessenger Pro** simulates users sending and receiving messages while demonstrating:

- ✅ Nested classes
- ✅ Anonymous classes
- ✅ Access modifiers (`private`, `protected`, `public`)
- ✅ Abstract class inheritance
- ✅ Encapsulation and polymorphism
- ✅ Timestamps with `LocalDateTime`

------

   ## 🧠 Key Concepts

   | Concept             | Example Used                         |
   |---------------------|--------------------------------------|
   | Nested Class         | `Messenger` inside `User`            |
   | Access Modifiers     | Controlled access across classes     |
   | Anonymous Class      | Auto-responder with `MessageListener`|
   | Abstract Class       | `Person` base class for `User`       |
   | Timestamp            | Added to every message sent          |

   ---

   ## 🧪 Sample Output

   📤 [2025-06-24 22:10] Bilyaminu sends to Amina: Hey Amina, are you joining the FlexiSAF call?
   📤 [2025-06-24 22:10] Amina sends to Bilyaminu: Yes! Just give me 5 minutes.
   🤖 Auto-Reply: Thank you, John. I’ve received your message: "Are you available this weekend?"

   📥 INBOX for Bilyaminu:
       [2025-06-24 22:10] From Amina: Yes! Just give me 5 minutes.

   📥 INBOX for Amina:
       [2025-06-24 22:10] From Bilyaminu: Hey Amina, are you joining the FlexiSAF call?
---

## 📂 Structure

week-6/
└── MessengerPro.java
└── User.java
└── MessageListener.java (interface)
└── Person.java


---

## 🔧 Technologies

- Java 8+
- Console input/output
- `java.time` package for timestamp

---

## 🧑‍💻 Author

**Bilyaminu Ahmad**
*Java Developer – FlexiSAF Internship, Week 6 Project*

---

## 📜 License

This project is free to use for learning, academic portfolios, and professional development.
