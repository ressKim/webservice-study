package study.webappservice.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


//@SpringBootTest
class HelloResponseDtoTest {

    @Test
    public void lombok_test(){

        String name = "static/test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        Assertions.assertThat(dto.getAmount()).isEqualTo(1000);
        Assertions.assertThat(dto.getName()).isEqualTo("static/test");
    }

}