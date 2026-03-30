# 🎬 Hệ Thống Đặt Vé Xem Phim - PoP Cinema

> PoP Cinema Backend là hệ thống API mạnh mẽ phục vụ hệ thống đặt vé xem phim trực tuyến — xây dựng bằng **Spring Boot**, **RESTful API** tích hợp **JWT, PayOS, VNPAY, Email, AI Chatbot** và cơ sở dữ liệu **MySQL**.


---


## 📌 Chức năng chính

### 👥 Khách hàng
- 🔑 **Đăng ký**: Kích hoạt tài khoản qua email xác nhận   
- 🔐 **Đăng nhập**: Xác thực bằng JWT Token, gửi email đặt lại mật khẩu khi quên mật khẩu 
- 🏠 **Trang chủ**: Xây dựng API hiển thị phim đang chiếu và sắp chiếu, bài viết  
- 🎞️ **Chi tiết phim**: Xây dựng API hiển thị thông tin chi tiết phim, suất chiếu  
- 📰 **Bài viết / Tin tức**: Xây dựng API hiển thị thông tin chi tiết bài viết 
- 💬 **Bình luận & đánh giá**:Xây dựng API để CRUD Bình luận , đánh giá 
- 🎟️ **Đặt vé xem phim**: Xây dựng API Chọn ngày, giờ, phòng chiếu , ghế ngồi, dịch vụ , thêm voucher  
- 💳 **Thanh toán trực tuyến**: Tích hợp cổng thanh toán VNPAY, PayOS 
- 📦 **Quản lý đơn hàng**: Xây dựng API quản lý đơn hàng
- 👤 **Quản lý thông tin cá nhân**: Xây dựng API Cập nhật thông tin và mật khẩu  
- 🤖 **Chatbot hỗ trợ**: Tích hợp AI LLM (Gemini,OpenAI) 


---


### 🛠️ Admin & Nhân viên
- 🔐 **Đăng nhập quản trị**: (JWT + Role-based Security) 
- 📊 **Bảng điều khiển (Dashboard)**:Xây dựng API Thống kê tổng quan hệ thống  
- 🎬 **Quản lý phim**: Xây dựng API CRUD, tìm kiếm phim  
- 🕒 **Quản lý suất chiếu**: Xây dựng API CRUD , tìm kiếm suất chiếu, tạo vé tự động 
- 🏢 **Quản lý phòng chiếu**:  Xây dựng API CRUD, tìm kiếm phòng chiếu, tạo ghế tự động
- 💺 **Quản lý ghế**: Xây dựng API CRUD, tìm kiếm ,lọc ghế , xem sơ đồ ghế  ,phân trang 
- 🎟️ **Quản lý vé**: Xây dựng API hiển thị danh sách vé , huỷ , cập nhật, tìm kiếm , phân trang 
- 🍿 **Quản lý dịch vụ**:  Xây dựng API CRUD, tìm kiếm dịch vụ  
- 💸 **Quản lý voucher**: Xây dựng API CRUD voucher 
- 🔑 **Phân quyền hệ thống**:  Xây dựng API CRUD chức vụ ,Cấp quyền ,huỷ quyền và giới hạn truy cập cho nhân viên  
- 📰 **Quản lý bài viết**:  Xây dựng API CRUD, tìm kiếm bài viết
- 📦 **Quản lý đơn hàng**: Xây dựng API tìm kiếm , lọc theo ngày ,hiển thị danh sách, xem chi tiết, xoá đơn hàng , in vé
- 👨‍💼 **Quản lý tài khoản nhân viên**:  Xây dựng API CRUD nhân viên 
- 👤 **Quản lý tài khoản khách hàng**:   Xây dựng API CRUD khách hàng 
- 📈 **Thống kê & báo cáo**: Xây dựng API thống kê đơn hàng, số vé bán, khách hàng mới, suất chiếu, phim, voucher, dịch vụ, chi tiếu,...


---


## ⚙️ Công nghệ sử dụng

### 🧩 Backend
- **Spring Boot** — Framework chính của hệ thống  
- **Spring Security + JWT** — Xác thực và phân quyền người dùng  
- **Spring Data JPA (Hibernate)** — Làm việc với cơ sở dữ liệu quan hệ  
- **Spring Validation** — Xử lý validate dữ liệu đầu vào  
- **Spring Cloud OpenFeign** — Gọi API giữa các service  
- **Spring Mail** — Gửi email xác nhận và thông báo hệ thống  
- **Spring AI (OpenAI Integration)** — Tích hợp chatbot AI LLM thông minh  
- **MySQL** — Cơ sở dữ liệu chính của hệ thống  
- **PayOS SDK (Java)** — Thanh toán trực tuyến qua PayOS  
- **Lombok** — Giảm boilerplate code (getter, setter, builder,...)  
- **Maven** — Quản lý dependency và build dự án.... 


---


## 📁 Cấu trúc dự án

```

Movie_Ticket_Booking/
│
├── .idea/                      # Cấu hình IntelliJ IDEA
├── .mvn/                       # Cấu hình Maven wrapper
├── bin/                        # File biên dịch tạm
├── target/                     # File build output
│
├── src/                                # Thư mục chính của mã nguồn
│   ├── main/
│   │   ├── java/com/quoc/Movie_Ticket_Booking/
│   │   │   ├── client/                 # API dành cho người dùng (Client)
│   │   │   ├── config/                 # Cấu hình bảo mật, CORS, JWT, Email,VNPAY,PayOS...
│   │   │   ├── controller/             # API endpoints xử lý request/response
│   │   │   │   ├── admin/              # Controller cho Admin (quản trị)
│   │   │   │   ├── client/             # Controller cho người dùng
│   │   │   │   └── payospayment/       # Xử lý logic PayOS
│   │   │   ├── dto/                    # Data Transfer Objects
│   │   │   │   ├── request/            # DTO cho request yêu cầu
│   │   │   │   └── response/           # DTO cho response trả về
│   │   │   ├── exception/              # Xử lý ngoại lệ toàn cục
│   │   │   ├── model/                  # Entity ánh xạ database
│   │   │   ├── repository/             # JPA Repository (Tương tác dữ liệu)
│   │   │   ├── service/                # Business logic (xử lý nghiệp vụ, tách khỏi controller)
│   │   │   ├── type/                   # Enum và kiểu dữ liệu cố định
│   │   │   ├── util/                   # Tiện ích chung
│   │   │   ├── vnpaypayment/           # Xử lí nghiệp vụ thanh toán VNPay 
│   │   │   └── MovieTicketBookingApplication.java # File chạy chính
│   │   │
│   │   └── resources/
│   │       ├── application.properties  # Cấu hình hệ thống
│   │       └── static / templates      # (nếu có) HTML, tài nguyên tĩnh
│   │
│   └── test/                           # Unit test
│
├── pom.xml                             # File cấu hình Maven
├── README.md                           # File mô tả dự án
└── mvnw / mvnw.cmd                     # Maven wrapper scripts

```

---


## 🚀 Cách chạy dự án

1. **Clone dự án bằng HTTPS**

    ```bash
    git clone https://github.com/dangquocne/PoP_Cinema_BE.git
    cd PoP_Cinema_BE
    ```

2. **Clone dự án bằng SSH**

    ```bash
    git clone git@github.com:dangquocne/PoP_Cinema_BE.git
    cd PoP_Cinema_BE
    ```       

3. **Cấu hình cơ sở dữ liệu**    

    Mở src/main/resources/application.properties và chỉnh lại:

    ```bash
     spring.datasource.url=jdbc:mysql://localhost:3306/movie_booking
     spring.datasource.username=root
     spring.datasource.password=yourpassword
    ``` 

4. **Chạy dự án**  

   Chạy trực tiếp trong **IntelliJ IDEA** hoặc **Spring Tool Suite 4** qua file:  

   Mở file: 

   src/main/java/com/quoc/Movie_Ticket_Booking/MovieTicketBookingApplication.java

   Sau đó ấn chuột phải → **Run As → Java Application**		


---


## 👨‍💻 Tác giả
Huỳnh Đăng Quốc 
huynhdangquoc2004@gmail.com

---

## 📄 License

MIT License © 2025 Huỳnh Đăng Quốc 

---

**PoP Cinema** – Nền tảng đặt vé xem phim trực tuyến

