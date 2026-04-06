package com.quoc.Movie_Ticket_Booking.controller.client;

import com.quoc.Movie_Ticket_Booking.repository.DonHangRepository;
import com.quoc.Movie_Ticket_Booking.repository.VeRepository;
import com.quoc.Movie_Ticket_Booking.util.CommonUtil;
import com.quoc.Movie_Ticket_Booking.vnpaypayment.PaymentService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vn.payos.PayOS;

import java.io.IOException;

@RestController
@RequestMapping("/api/payment")

public class PaymentController {

    @Autowired
    private DonHangRepository donHangRepository;

    @Autowired
    private VeRepository veRepository;

    @Autowired
    private CommonUtil commonUtil;

    private final PaymentService paymentService;

    private final PayOS payOS;

    public PaymentController(PayOS payOS, PaymentService paymentService) {
        super();
        this.payOS = payOS;
        this.paymentService = paymentService;

    }


    @GetMapping("/cancel")
    public void paymentCancel(@RequestParam String maDonHang, HttpServletResponse response) throws IOException {
        paymentService.cancel(maDonHang);
        response.sendRedirect("http://localhost:5173/cancel");
    }


    //Trả về thành công cho payos
    @GetMapping("/success")
    public void paymentSuccess(@RequestParam String maDonHang,
                               @RequestParam String maGiaoDich,
                               HttpServletResponse response) throws IOException {
        paymentService.success(maDonHang);
        response.sendRedirect("http://localhost:5173/success?madonhang=" + maDonHang + "&magiaodich=" + maGiaoDich);
    }



    //Trả về thành công cho vnpay
        @GetMapping("/vn-pay-callback")
        public void payCallbackHandler(HttpServletRequest request, HttpServletResponse response) throws IOException {

            String status = request.getParameter("vnp_ResponseCode");
            String maDonHang = request.getParameter("vnp_TxnRef");
            String maGiaoDich = request.getParameter("vnp_TransactionNo");

            if ("00".equals(status)) {
                //  Cập nhật trạng thái đơn hàng trong DB
                paymentService.success(maDonHang);

                //  Redirect sang trang success trên frontend
                response.sendRedirect("http://localhost:5173/success?madonhang="+ maDonHang + "&magiaodich=" + maGiaoDich);
            } else if ("24".equals(status)) {
                paymentService.cancel(maDonHang);
                response.sendRedirect("http://localhost:5173/cancel");
            }

        }
}
