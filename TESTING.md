# 🧪 テスト方針

## 現在の Skeleton

- `@SpringBootTest`: Spring Context と H2 テスト接続の起動
- `@WebMvcTest`: 入口画面の HTTP 契約
- `mvn verify`: コンパイル、テスト、Jar パッケージ

## 次の段階

- Repository の Oracle Integration Test（Testcontainers）
- コース / レッスン / 課題のユースケーステスト
- 権限境界と入力バリデーション
- Playwright 等による画面 E2E

Oracle に依存するテストは、ローカルの共有 DB を破壊しない独立スキーマで実行します。
