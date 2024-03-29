package com.haechan.feign.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/*
Producer에서 API 반환 객체로 사용
Ost에서는 OpenFeign 인터페이스 생성 시 API 작성할때 반환 타입 선언에 사용
-> 따라서 두 곳에서 동일해야 하기 때문에 라이브러리로 만들어서 사용하는 것이 좋다
import 하여 양쪽에서 같게 사용
 */
@Component
@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class SingerFeignResponse {
    private Long singerId;
    private String name;
}