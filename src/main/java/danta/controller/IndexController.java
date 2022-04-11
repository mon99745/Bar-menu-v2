package danta.controller;



import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/")
// @PageableDefault를 설정하면 페이지의 size, 정렬순을 정할 수 있다.
// 한 페이지당 5 Size, 최신글을 제일 맨위로 볼 수 있게 해둠.
    public String index(Model model,
                        @PageableDefault(size = 5, sort = "id", direction = Sort.Direction.DESC)
                        @RequestParam(required = false, defaultValue = "") String search) {
        return "menu";
    }
}