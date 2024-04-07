E-commerce-Spring-boot


I created a RESTful API for an e-commerce platform as part of my learning process. This API handles all the basic Create, Read, Update, and Delete operations typical in e-commerce systems, incorporating user validation at each stage.

Authentication and validation processes are implemented for both customers and sellers, ensuring security with session tokens valid for one hour. Sellers, who have an administrator role, can exclusively manage the entire application. Only registered sellers with valid session tokens can perform actions such as adding, updating, or deleting products from the main database. Additionally, sellers have access to customer and order details.

Customers have the capability to register within the application and log in to obtain a valid session token. They can browse products, add items to their cart, and place orders. Access to features such as viewing orders and managing the cart is restricted to logged-in users.
