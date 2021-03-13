package study.webappservice.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


//@SpringBootTest
class HelloResponseDtoTest {

    @Test
    public void lombok_test(){

        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        Assertions.assertThat(dto.getAmount()).isEqualTo(1000);
        Assertions.assertThat(dto.getName()).isEqualTo("test");
    }

}