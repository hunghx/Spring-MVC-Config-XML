package ra.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // chú thích đây là thành phần controller của ứng dụng và tự dộng tạo bean
public class HomeController {
    @RequestMapping(value = "/home/api/view")  // định nghĩa đường dẫn mapping
    // mặc định sẽ nhận request theo phương thức get
    public String goHome(Model model){
        // gửi kèm dữ liệu sang view
        model.addAttribute("name","Nguyễn văn A");
        model.addAttribute("age",24);
        return "home"; // trả về view
    }

}
