# 🍔 Foodies - Food Delivery Application

Foodies is a modern, full-stack food delivery application built using **Spring Boot (Java)** for the backend and **React.js** for the frontend. This project supports a seamless user experience, admin dashboard, secure JWT-based authentication, real-time order management, and online payments with Razorpay.

---

## 🚀 Features

- 🛒 User registration & login (JWT-based)
- 🍽️ Browse, add to cart, and place food orders
- 👨‍🍳 Admin dashboard to manage food items and track orders
- 🧾 Order tracking with real-time status updates
- 💳 Secure Razorpay payment integration
- ☁️ AWS S3 image storage support
- 📦 MongoDB NoSQL database for fast and flexible data management

---

## 🛠️ Tech Stack

**Frontend:**
- React.js
- Bootstrap & CSS
- Axios

**Backend:**
- Java + Spring Boot
- Spring Security (JWT)
- MongoDB
- Razorpay Integration
- AWS S3 (Image Upload)

---

## ⚙️ Getting Started

### 1. Clone the repository


git clone https://github.com/your-username/foodies-backend.git
cd foodies-backend


1)register yourself
2)login after login you get token using this token you can access api
3)add food
4)get single food
5)



🔐 API Endpoints
Method	           Endpoint	                                                                 Description
POST	            http://localhost:8080/api/register                                       User Registration


POST	   /api/auth/login	                    User Login (JWT)

GET	    /api/food/all	                        Fetch all food items

POST	  /api/order/create	                    Place new order

GET	    /api/order/user	                      Fetch user orders

GET	    /api/order/admin	                    Admin: All orders

PUT	    /api/order/status/{id}	              Admin: Update order status



Register api
![register api](https://github.com/user-attachments/assets/85489c25-06c7-4070-af1c-63f3562c9fb7)



login api
![login api](https://github.com/user-attachments/assets/de3360ab-e41d-410a-899b-d4410d6d6ff5)

order create api
![create order](https://github.com/user-attachments/assets/a641a29b-fe56-4804-94ce-8cd1bdee05db)


get all food api
![get all food](https://github.com/user-attachments/assets/4aaf8399-558a-4435-aa60-5a2a177ee450)


get all orders api
![get all orders](https://github.com/user-attachments/assets/c672568a-a3c6-49d3-b061-d4cbd82f9452)



delete food
![delete food](https://github.com/user-attachments/assets/839ae0c1-6521-4aef-865a-c4ba6a0b7816)

get single food
![get single food](https://github.com/user-attachments/assets/701ccdb8-a85f-45be-9029-54cbe865d970)



add to cart
![add to cart](https://github.com/user-attachments/assets/f1e52284-f8f7-4c98-b7dc-05abc6fe089b)



remove from cart
![remove from cart](https://github.com/user-attachments/assets/300da923-9bd0-493a-9bc7-94c6e1e77fd9)




uapdate order status
![upadte order status](https://github.com/user-attachments/assets/4fac1fa7-18a1-4a55-85b7-0d5311a1188d)




verify payment
![verify payment](https://github.com/user-attachments/assets/220f2073-4619-4e59-aa63-e0dea1f3bb92)






🖼️ Admin Dashboard
The admin dashboard is accessible via the frontend at /admin. Admin can:

Add new food items with images

View and delete food items

Track and update orders in real-time

🤝 Contribution
Contributions are welcome! Fork the repo and submit a pull request.



📄 License
This project is licensed under the MIT License.

🙌 Special Thanks
Spring Boot Community

Razorpay API

AWS S3 SDK

