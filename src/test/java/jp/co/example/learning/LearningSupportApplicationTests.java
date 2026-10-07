package jp.co.example.learning;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/** 🧪 Skeleton の Spring Context が起動できることを確認します。 */
@SpringBootTest
@ActiveProfiles("test")
class LearningSupportApplicationTests {
    @Test
    void contextLoads() {
        assertThat(true).isTrue();
    }
}
