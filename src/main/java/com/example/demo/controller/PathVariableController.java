package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PathVariableController {

    /** 화면 표시 */
    @GetMapping("show")
    public String showView() {
        // 반환값으로 뷰 이름을 돌려줌
        return "view";
    }

    @GetMapping("/function/{no}")
    public String selectFunction(@PathVariable Integer no) {
        // 뷰 이름을 초기화
        String view = null;
        switch (no) {
            case 1:
                view = "pathvariable/function1";
                break;
            case 2:
                view = "pathvariable/function2";
                break;
            case 3:
                view = "pathvariable/function3";
                break;
        }

        // 반환값으로 뷰 이름을 고렬줌
        return view;
    }
}
