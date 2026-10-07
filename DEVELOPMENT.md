# 🛠️ 開発ガイド

## 🧭 役割分担

- `web`: Controller、画面、HTTP API
- `application`: ユースケース（次フェーズ）
- `domain`: 学習ドメイン（次フェーズ）
- `infrastructure`: Oracle Repository、Migration、外部連携（次フェーズ）

## ▶️ 起動

```bash
./mvnw spring-boot:run
```

開発時は `SPRING_PROFILES_ACTIVE=local` を使います。秘密情報は `.env` や OS の環境変数で渡し、Git へ登録しません。

## ✅ 変更時の確認

```bash
./mvnw -B verify
```

画面を変更した場合は `/`、API を変更した場合は `/api/health` を確認します。Oracle の SQL を追加する場合は、Oracle 23c Free と本番想定の権限差を記録してください。
