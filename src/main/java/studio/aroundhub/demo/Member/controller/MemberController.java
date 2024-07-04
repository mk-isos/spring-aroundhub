package studio.aroundhub.demo.Member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import studio.aroundhub.demo.Member.controller.dto.JoinRequest;
import studio.aroundhub.demo.Member.sercice.MemberService;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/hello")
    public String getHello(){
        return "Hello. I'm Mk-isos!";
    }


    @PostMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest){

        String id = joinRequest.getId();
        String name = joinRequest.getName();
        String phoneNumber = joinRequest.getPhoneNumber();

        String result = memberService.join(id, name, phoneNumber);

        if (result.equalsIgnoreCase("success")) {
            return "success";
        } else {
            return "fail";
        }

    }



}
