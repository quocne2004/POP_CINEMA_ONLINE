# 🎬 Hệ Thống Đặt Vé Xem Phim - PoP Cinema

> Ứng dụng web hiện đại giúp người dùng xem thông tin phim, đặt vé, thanh toán trực tuyến và quản lý đơn hàng — được xây dựng bằng **Vue.js** ,**Bootstrap**.

---

## 📌 Chức năng

### 👥 Khách hàng
- 🔐 **Xác thực tài khoản**: Đăng nhập, đăng ký, quên mật khẩu  
- 🏠 **Trang chủ**: Hiển thị phim nổi bật, và đang chiếu và sắp chiếu  
- 🎞️ **Chi tiết phim**: Xem thông tin phim, trailer, và lịch chiếu  
- 📰 **Bài viết / Tin tức**: Xem và đọc chi tiết các bài viết  
- 💬 **Bình luận & đánh giá**: Gửi nhận xét và chấm điểm phim  
- 🎟️ **Đặt vé xem phim**: Chọn ngày, giờ, phòng chiếu , ghế ngồi, dịch vụ   
- 💳 **Thanh toán trực tuyến**: Hỗ trợ thanh toán online nhanh chóng  
- 📦 **Quản lý đơn hàng**: Xem lại lịch sử đặt vé và trạng thái vé  
- 👤 **Quản lý thông tin cá nhân**: Cập nhật hồ sơ và ảnh đại diện  
- 🤖 **Chatbot hỗ trợ**: Trả lời nhanh các câu hỏi thường gặp  

---

### 🛠️ Admin & Nhân viên
- 🔐 **Đăng nhập quản trị**: Hệ thống phân quyền riêng cho admin và nhân viên  
- 📊 **Bảng điều khiển (Dashboard)**: Thống kê tổng quan hệ thống  
- 🎬 **Quản lý phim**: Thêm, sửa, xóa thông tin phim  
- 🕒 **Quản lý suất chiếu**: Thiết lập và quản lý lịch chiếu phim  
- 🏢 **Quản lý phòng chiếu**: Tạo và cập nhật sơ đồ phòng chiếu  
- 💺 **Quản lý ghế**: Cấu hình, chỉnh sửa thông tin ghế ngồi  
- 🎟️ **Quản lý vé**: Theo dõi, xử lý vé và hoàn tiền  
- 🍿 **Quản lý dịch vụ**: Quản lý combo bắp nước, đồ ăn kèm  
- 💸 **Quản lý voucher**: Tạo và quản lý mã giảm giá, khuyến mãi  
- 🔑 **Phân quyền hệ thống**: Cấp quyền và giới hạn truy cập cho nhân viên  
- 📰 **Quản lý bài viết**: Viết và đăng tin tức, bài blog  
- 📦 **Quản lý đơn hàng**: Theo dõi và xử lý đơn đặt vé của khách hàng  
- 👨‍💼 **Quản lý tài khoản nhân viên**  
- 👤 **Quản lý tài khoản khách hàng**  
- 📈 **Thống kê & báo cáo**: Biểu đồ doanh thu, lượt đặt vé, khách hàng mới,...

---


## 🚀 Tính năng mở rộng trong tương lai

- 🎥 **Xem phòng chiếu ảo 3D:**  
  Dự kiến tích hợp mô hình 3D của rạp chiếu, cho phép người dùng xem bố cục ghế, màn hình và góc nhìn thực tế trước khi đặt vé.

- 🤖 **Chatbot AI thông minh hơn:**  
  Nâng cấp chatbot có khả năng gợi ý phim và hỗ trợ đặt vé tự động.

---


## ⚙️ Công nghệ sử dụng

### 🧩 Frontend
- [Vue.js](https://vuejs.org/) – Framework chính xây dựng giao diện người dùng (SPA)
- [Vite](https://vitejs.dev/) — công cụ build nhanh gọn
- [Bootstrap](https://getbootstrap.com/) – CSS framework giúp xây dựng giao diện nhanh
- [Axios](https://axios-http.com/) – Thư viện gọi API HTTP
- [Vue Router](https://router.vuejs.org/) – Quản lý routing cho ứng dụng Vue
- [Pinia / Vuex](https://pinia.vuejs.org/) — quản lý trạng thái ứng dụng
- [Chart.js](https://www.chartjs.org/) – Thư viện trực quan hóa dữ liệu với biểu đồ
- [vue-chartjs](https://vue-chartjs.org/) – Wrapper của Chart.js dành cho Vue 3
- [Three.js](https://threejs.org/) – Thư viện đồ họa 3D/WebGL
- [Panolens](https://github.com/pchen66/panolens.js) – Thư viện tạo trải nghiệm ảnh/scene 360° (dựa trên Three.js). Dùng để hiển thị panorama, tour 360° tương tác

### 🧩 Backend (dự kiến hoặc đã tích hợp)
- RESTful API (Spring Boot / Node.js)
- Xác thực người dùng bằng JWT
- Cơ sở dữ liệu: MySQL / PostgreSQL

---

## 📁 Cấu trúc dự án

```

RAPXEMPHIMFE/           # Thư mục gốc của frontend project
│
├── .vscode/            # Cấu hình VS Code
├── node_modules/       # Thư viện cài bằng npm
├── public/             # Ảnh tĩnh, favicon, logo,...
│
├── src/                # Thư mục chính của mã nguồn
│ ├── assets/           # Ảnh, biểu tượng, CSS, fonts,...
│ │
│ ├── components/       # Các component Vue tái sử dụng
│ │ ├── Admin/          # Component dành cho trang quản trị
│ │ ├── ChatBot/        # Giao diện và logic chatbot
│ │ ├── Client/         # Component cho giao diện khách hàng
│ │ └── Test/           # Component dùng cho thử nghiệm
│ │
│ ├── layout/           # Giao diện tổng thể (Header, Footer, Sidebar,...)
│ ├── router/           # Cấu hình định tuyến trang (Vue Router)
│ │
│ ├── App.vue           # Component gốc của ứng dụng
│ ├── main.js           # File khởi tạo ứng dụng Vue
│ └── style.css         # CSS chung của toàn dự án
│
├── .gitignore          # Cấu hình bỏ qua file/thư mục khi push Git
├── index.html          # Trang HTML gốc của ứng dụng
├── package.json        # Thông tin dự án & dependencies
├── package-lock.json   # Ghi lại phiên bản dependencies cụ thể
├── README.md           # File mô tả dự án
└── vite.config.js      # File cấu hình Vite

```

---

## 🚀 Cách chạy dự án

1. **Clone dự án bằng HTTPS**

    ```bash
    git clone https://github.com/dangquocne/PoP_Cinema_FE.git
    cd RAPXEMPHIMFE
    ```

2. **Clone dự án bằng SSH**

    ```bash
    git clone git@github.com:dangquocne/PoP_Cinema_FE.git
    cd RAPXEMPHIMFE
    ```    

3. **Cài đặt thư viện**
    
    ```bash
    npm install
    ```    

4. **Chạy dự án**
   
    ```bash
    npm run dev
    ```   

---


## 👨‍💻 Tác giả
Huỳnh Đăng Quốc 
huynhdangquoc2004@gmail.com

---


## 📄 License

MIT

---

**PoP Cinema** – Nền tảng đặt vé xem phim trực tuyến 
