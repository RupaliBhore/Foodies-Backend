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

```bash
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

