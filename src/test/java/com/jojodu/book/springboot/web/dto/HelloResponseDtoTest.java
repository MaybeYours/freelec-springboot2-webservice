package com.jojodu.book.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat; //assertJ 라는 검증 라이브러리의 검증 메소드
                                                            //검증하고 싶은 대상을 인자로 받는다 , 메소드 체이닝이 지원되어 isEqualTo와 같이 메소드를 이어서 사용가능

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
       assertThat(dto.getName()).isEqualTo(name); //isEqualTo => 동등 비교 메소드로 , assetThat의 값을 비교하여 같을때만 성공!
       assertThat(dto.getAmount()).isEqualTo(amount);

    }
}
