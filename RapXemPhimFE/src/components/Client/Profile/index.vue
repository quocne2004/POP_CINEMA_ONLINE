<template>
	<div class="container mt-5">
		<div class="row">
			<div class="col-lg-4">
				<div class="card">
					<div class="card-body text-center">
						<div class="d-flex  justify-content-start text-center">
							<img :src="profile.avatar || 'https://cellphones.com.vn/sforum/wp-content/uploads/2024/02/anh-avatar-cute-58.jpg'"
								alt="Avatar" class="rounded-circle p-1 bg-primary ms-5" width="100"
								data-bs-toggle="modal" data-bs-target="#avatarModal" style="cursor: pointer;">

							<div class="fs-4 fw-bold mt-4 ms-3">{{ profile.hoVaTen }}</div>
						</div>
						<hr>
						<div class="fs-6">Tổng chi tiêu 2025</div>
						<button class="btn btn-primary me-2">Follow</button>
						<button class="btn btn-outline-primary">Message</button>
					</div>
				</div>
			</div>
			<div class="col-lg-8">
				<div class="card">
					<div class="card-body">
						<ul class="nav nav-tabs nav-primary nav-fill text-center" role="tablist">
							<li class="nav-item " role="presentation">
								<a class="nav-link active" data-bs-toggle="tab" href="#profile" role="tab"
									aria-selected="true">
									<div class="d-flex align-items-center">
										<div class="tab-icon"><i class="bx bx-home font-18 me-1"></i>
										</div>
										<div class="tab-title">Thông Tin Cá Nhân</div>
									</div>
								</a>
							</li>
							<li class="nav-item" role="presentation">
								<a class="nav-link" data-bs-toggle="tab" href="#changepassword" role="tab"
									aria-selected="false" tabindex="-1">
									<div class="d-flex align-items-center">
										<div class="tab-icon"><i class="bx bx-user-pin font-18 me-1"></i>
										</div>
										<div class="tab-title">Đổi Mật Khẩu</div>
									</div>
								</a>
							</li>
							<!-- <li class="nav-item" role="presentation">
								<a class="nav-link" data-bs-toggle="tab" href="#history" role="tab"
									aria-selected="false" tabindex="-1">
									<div class="d-flex align-items-center">
										<div class="tab-icon"><i class="fa-solid fa-clock-rotate-left me-1"></i>
										</div>
										<div class="tab-title">Lịch Sử Giao Dịch</div>
									</div>
								</a>
							</li> -->
						</ul>
						<div class="tab-content py-3">
							<div class="tab-pane fade active show" id="profile" role="tabpanel">
								<div class="card-body">
									<div class="row mb-3">
										<div class="col-sm-3">
											<h6 class="mb-0">Họ Và Tên</h6>
										</div>
										<div class="col-sm-9 text-secondary">
											<input type="text" class="form-control" v-model="profile.hoVaTen">
										</div>
									</div>
									<div class="row mb-3">
										<div class="col-sm-3">
											<h6 class="mb-0">Email</h6>
										</div>
										<div class="col-sm-9 text-secondary">
											<input type="text" class="form-control" v-model="profile.email" disabled>
										</div>
									</div>
									<div class="row mb-3">
										<div class="col-sm-3">
											<h6 class="mb-0">Số Điện Thoại</h6>
										</div>
										<div class="col-sm-9 text-secondary">
											<input type="text" class="form-control" v-model="profile.soDienThoai">
										</div>
									</div>
									<div class="row mb-3">
										<div class="col-sm-3">
											<h6 class="mb-0">CCCD</h6>
										</div>
										<div class="col-sm-9 text-secondary">
											<input type="text" class="form-control" v-model="profile.cccd">
										</div>
									</div>
									<div class="row mb-3">
										<div class="col-sm-3">
											<h6 class="mb-0">Ngày Sinh</h6>
										</div>
										<div class="col-sm-9 text-secondary">
											<input type="date" class="form-control" v-model="profile.ngaySinh">
										</div>
									</div>
									<div class="row">
										<div class="col-sm-3"></div>
										<div class="col-sm-9 text-secondary">
											<!-- <input type="button" class="btn btn-primary px-4" value="Save Changes"
												@click="capNhatThongTin()"> -->
											<button type="button" class="btn btn-primary px-4"
												@click="capNhatThongTin()">Lưu Thay Đổi</button>
										</div>
									</div>
								</div>
							</div>
							<div class="tab-pane fade" id="changepassword" role="tabpanel">
								<div class="card">
									<div class="row g-0">
										<div class="col-lg-6 border-end">
											<div class="card-body">
												<div class="">
													<div class="mb-3 mt-2">
														<label class="form-label">Mật Khẩu Hiện Tại</label>
														<input type="password" class="form-control"
															placeholder="Nhập mật khẩu cũ"
															v-model="update_pass.matKhauCu">
													</div>
													<div class="mb-3 mt-2">
														<label class="form-label">Mật Khẩu Mới</label>
														<input type="password" class="form-control"
															placeholder="Nhập mật khẩu mới"
															v-model="update_pass.matkhauMoi">
													</div>
													<div class="mb-3">
														<label class="form-label">Xác Nhận Mật Khẩu</label>
														<input type="password" class="form-control"
															placeholder="Xác Nhận Mật Khẩu"
															v-model="update_pass.xacNhanMatKhau">
													</div>
													<div class="d-grid gap-2">
														<button type="button" class="btn btn-primary"
															@click="capNhatMatKhau()">Đổi Mật
															Khẩu</button>
													</div>
												</div>
											</div>
										</div>
										<div class="col-lg-6">
											<img src="https://cdn.tgdd.vn/Files/2019/12/07/1225665/huong-dan-thay-doi-mat-khau-tai-khoan-google-don-gian-tren-dien-thoai-may-tinh-7.jpg"
												class="card-img login-img" alt="..." style="height: 325px;">
										</div>
									</div>
								</div>
							</div>
							<!-- <div class="tab-pane fade" id="history" role="tabpanel">
								
							</div> -->
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Avatar Modal -->
	<!-- Modal Chọn Avatar -->
	<div class="modal fade" id="avatarModal" tabindex="-1">
		<div class="modal-dialog modal-dialog-centered modal-lg">
			<div class="modal-content shadow-lg" style="border-radius: 20px;">

				<div class="modal-header border-0">
					<h5 class="modal-title fw-bold fs-4">Chọn Avatar</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
				</div>

				<div class="modal-body">
					<div class="row g-4 justify-content-center">

						<!-- Avatar 1 -->
						<div class="col-4 col-md-3 text-center avatar-container">
							<div class="avatar-wrapper"
								:class="{ selected: selectedAvatar === 'https://res.cloudinary.com/dvxkhsfyj/image/upload/v1762926668/popcornne_ziiohd.png' }"
								@click="selectedAvatar = 'https://res.cloudinary.com/dvxkhsfyj/image/upload/v1762926668/popcornne_ziiohd.png'">

								<img src="https://res.cloudinary.com/dvxkhsfyj/image/upload/v1762926668/popcornne_ziiohd.png"
									class="avatar-option">

								<div class="avatar-tick"><i class="bi bi-check-lg"></i></div>
							</div>
						</div>

						<!-- Avatar 2 -->
						<div class="col-4 col-md-3 text-center avatar-container">
							<div class="avatar-wrapper"
								:class="{ selected: selectedAvatar === 'https://res.cloudinary.com/dvxkhsfyj/image/upload/v1762926652/popcornclient_hditjq.png' }"
								@click="selectedAvatar = 'https://res.cloudinary.com/dvxkhsfyj/image/upload/v1762926652/popcornclient_hditjq.png'">

								<img src="https://res.cloudinary.com/dvxkhsfyj/image/upload/v1762926652/popcornclient_hditjq.png"
									class="avatar-option"
									data-avatar="https://res.cloudinary.com/dvxkhsfyj/image/upload/v1762926652/popcornclient_hditjq.png">
								<div class="avatar-tick"><i class="bi bi-check-lg"></i></div>
							</div>
						</div>

						<!-- Avatar 3 -->
						<div class="col-4 col-md-3 text-center avatar-container">
							<div class="avatar-wrapper"
								:class="{ selected: selectedAvatar === 'https://res.cloudinary.com/dvxkhsfyj/image/upload/v1756310316/popcorn_ry5fwe.png' }"
								@click="selectedAvatar = 'https://res.cloudinary.com/dvxkhsfyj/image/upload/v1756310316/popcorn_ry5fwe.png'">

								<img src="https://res.cloudinary.com/dvxkhsfyj/image/upload/v1756310316/popcorn_ry5fwe.png"
									class="avatar-option"
									data-avatar="https://res.cloudinary.com/dvxkhsfyj/image/upload/v1756310316/popcorn_ry5fwe.png">
								<div class="avatar-tick"><i class="bi bi-check-lg"></i></div>
							</div>
						</div>

					</div>
				</div>

				<div class="modal-footer border-0 justify-content-center">
					<button class="btn btn-secondary px-4" data-bs-dismiss="modal">Hủy</button>
					<button class="btn btn-primary px-4" :disabled="!selectedAvatar" @click="capNhatAvatar()">
						Lưu Avatar
					</button>
				</div>

			</div>
		</div>
	</div>
</template>
<script>
import axios from 'axios';

const token = localStorage.getItem("key_client");
export default {

	data() {
		return {
			selectedAvatar: null,
			profile: {},
			update_pass: {
			}
		}
	},
	mounted() {


		this.loadProfile();

	},
	methods: {

		loadProfile() {

			axios.post("http://localhost:8080/api/client/profile", {}, {

				headers: {
					'Authorization': `Bearer ${token}`
				}
			})
				.then((res) => {
					this.profile = res.data;  // vì res.data là object user

				})
				.catch((err) => {
					console.error("Lỗi khi tải hồ sơ:", err);
				});
		},


		//Hàm kiểm tra dữ liệu khi cập nhật thông tin cá nhân
		validateEditKhachHang(nv) {
			// Kiểm tra xem có để trống trường nào không
			if (!nv.hoVaTen || !nv.email || !nv.soDienThoai || !nv.ngaySinh || !nv.cccd) {
				this.$toast.error("Vui lòng điền đầy đủ thông tin");
				return false;
			}


			// Kiểm tra định dạng số điện thoại (0 + 9-10 chữ số)
			const regexPhone = /^0\d{9,10}$/;
			if (!regexPhone.test(nv.soDienThoai)) {
				this.$toast.error("Số điện thoại không hợp lệ");
				return false;
			}

			// Kiểm tra định dạng CCCD (12 số)
			const regexCCCD = /^\d{12}$/;
			if (!regexCCCD.test(nv.cccd)) {
				this.$toast.error("CCCD phải gồm 12 số");
				return false;
			}

			// Kiểm tra ngày sinh không vượt quá ngày hiện tại
			const today = new Date();
			const birthday = new Date(nv.ngaySinh);

			if (isNaN(birthday.getTime())) {
				this.$toast.error("Ngày sinh không hợp lệ");
				return false;
			}

			// Tính tuổi
			const age = today.getFullYear() - birthday.getFullYear();
			const monthDiff = today.getMonth() - birthday.getMonth();
			const dayDiff = today.getDate() - birthday.getDate();

			// Điều chỉnh tuổi nếu chưa tới ngày sinh năm nay
			let realAge = age;
			if (monthDiff < 0 || (monthDiff === 0 && dayDiff < 0)) {
				realAge--;
			}

			// Không được nhỏ hơn 18 tuổi
			if (realAge < 18) {
				this.$toast.error("Ngày sinh của bạn phải từ 18 tuổi trở lên");
				return false;
			}

			return true; // tất cả hợp lệ
		},
		capNhatThongTin() {
			if (!this.validateEditKhachHang(this.profile)) {
				return; // Dừng nếu dữ liệu không hợp lệ
			}


			axios.put('http://localhost:8080/api/client/update-thong-tin', this.profile, {
				headers: {
					Authorization: `Bearer ${token}`
				}
			})
				.then((res) => {
					if (res.data.status) {
						this.$toast.success(res.data.message);
						this.profile = {};
						this.loadProfile();
					} else {
						this.$toast.error("Cập nhật thất bại");
					}
				}).catch((err) => {
					console.error("Error:", err.response);
				});
		},

		capNhatMatKhau() {

			// 1. Kiểm tra trống
			if (!this.update_pass.matKhauCu || !this.update_pass.matkhauMoi || !this.update_pass.xacNhanMatKhau) {
				this.$toast.error("Vui lòng điền đầy đủ thông tin.");
				return;
			}
			// 2. Kiểm tra mật khẩu mới khớp
			if (this.update_pass.matkhauMoi !== this.update_pass.xacNhanMatKhau) {
				this.$toast.error("Mật khẩu xác nhận không khớp.");
				return;
			}

			// 3. Kiểm tra regex mật khẩu mới (khớp backend)
			const regexPass = /^(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
			if (!regexPass.test(this.update_pass.matkhauMoi)) {
				this.$toast.error("Mật khẩu mới phải có ít nhất 8 ký tự, bao gồm chữ hoa, số và ký tự đặc biệt.");
				return;
			}

			axios.post('http://localhost:8080/api/client/change-pass', this.update_pass, {
				headers: {
					Authorization: `Bearer ${token}`
				}
			})
				.then((res) => {
					if (res.data.status) {

						this.$toast.success(res.data.message);
						this.update_pass = {};

					} else {
						this.$toast.error(res.data.message);
					}
				}).catch((error) => {

					if (error.response) {
						// Trường hợp server trả lỗi (4xx, 5xx)
						this.$toast.error(error.response.data.message || "Lỗi từ server");
					} else if (error.request) {
						// Trường hợp request gửi đi nhưng không nhận response
						this.$toast.error("Không nhận được phản hồi từ server");
					} else {
						// Trường hợp lỗi khác (lỗi cấu hình axios chẳng hạn)
						this.$toast.error("Có lỗi xảy ra khi gửi request");
					}
				});
		},
		capNhatAvatar() {
			axios.post("http://localhost:8080/api/client/update-avatar",
				{
					avatarUrl: this.selectedAvatar
				},
				{
					headers: {
						Authorization: `Bearer ${token}`
					}
				}
			)

				.then(res => {
					if (res.data.status) {
						this.$toast.success(res.data.message);
						this.profile.avatar = this.selectedAvatar;

						// đóng modal
						const modal = bootstrap.Modal.getInstance(document.getElementById("avatarModal"));
						modal.hide();
					} else {
						this.$toast.error(res.data.message || "Cập nhật thất bại!");
					}
				})
				.catch(err => {
					this.$toast.error("Lỗi server!");
					console.error(err);
				});
		}


	}
}
</script>
<style>
.avatar-wrapper {
	position: relative;
	display: inline-block;
}

.avatar-option {
	width: 120px;
	height: 120px;
	object-fit: cover;
	border-radius: 50%;
	border: 4px solid transparent;
	cursor: pointer;
	transition: 0.25s;
}

.avatar-option:hover {
	transform: scale(1.1);
	box-shadow: 0px 0px 12px rgba(13, 110, 253, 0.4);
}

/* Tick dấu ✔ */
.avatar-tick {
	position: absolute;
	bottom: 5px;
	right: 8px;
	background: #0d6efd;
	color: #fff;
	border-radius: 50%;
	width: 30px;
	height: 30px;
	display: none;
	align-items: center;
	justify-content: center;
	font-size: 18px;
}

.avatar-wrapper.selected .avatar-option {
	border-color: #0d6efd !important;
	transform: scale(1.1);
	box-shadow: 0px 0px 15px rgba(13, 110, 253, 0.6);
}

.avatar-wrapper.selected .avatar-tick {
	display: flex;
}
</style>