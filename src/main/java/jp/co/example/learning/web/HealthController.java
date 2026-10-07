package jp.co.example.learning.web;

import java.time.OffsetDateTime;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** 🩺 アプリケーションと Oracle 接続の最小疎通確認 API です。 */
@RestController
public class HealthController {
    private final JdbcTemplate jdbcTemplate;

    public HealthController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/api/health")
    public Map<String, Object> health() {
        boolean databaseConnected = false;
        try {
            jdbcTemplate.queryForObject("SELECT 1 FROM dual", Integer.class);
            databaseConnected = true;
        } catch (Exception ignored) {
            // Skeleton では API 自体を応答可能にし、DB 状態をレスポンスで確認できるようにします。
        }
        return Map.of(
            "status", databaseConnected ? "UP" : "DEGRADED",
            "database", databaseConnected ? "UP" : "DOWN",
            "application", "java-learning-support",
            "timestamp", OffsetDateTime.now().toString()
        );
    }
}
