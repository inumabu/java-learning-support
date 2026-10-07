# ☕ Java 学習支援サイト

Java 21、Spring Boot、Thymeleaf、Oracle Database を使った **Java 学習支援 Web サイトの Skeleton** です。

## 🎯 Skeleton の範囲

- Spring Boot の起動基盤
- Thymeleaf による学習サイト入口画面
- Oracle Database 接続設定（HikariCP + JDBC）
- `/api/health` によるアプリ / DB 疎通確認
- Docker Compose の Oracle Free + アプリ構成
- Spring Context / Web MVC の最小テスト
- Maven Wrapper、GitHub Actions、開発ドキュメント

学習コース、レッスン、課題、提出、採点、進捗管理などのドメイン機能は次のフェーズで実装します。

## 🧰 必要な環境

- Java 21
- Maven Wrapper（`./mvnw` / `mvnw.cmd`）
- Oracle Database 23c Free または接続可能な Oracle 環境
- Docker Desktop（Compose を使う場合）

## 🚀 ローカル起動

```bash
cp .env.example .env
./mvnw spring-boot:run
```

PowerShell:

```powershell
Copy-Item .env.example .env
$env:SPRING_PROFILES_ACTIVE = "local"
$env:ORACLE_JDBC_URL = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1"
$env:ORACLE_DB_USERNAME = "learning_app"
$env:ORACLE_DB_PASSWORD = "change-me"
./mvnw.cmd spring-boot:run
```

ブラウザで http://localhost:8080/ を開きます。状態確認は http://localhost:8080/api/health です。

## 🐳 Docker Compose

Oracle とアプリをまとめて起動します。

```bash
docker compose up --build
```

PowerShell でも同じコマンドを利用できます。

```powershell
docker compose up --build
```

> ⚠️ Oracle コンテナの初回起動には時間がかかります。認証情報は `.env` または Compose の環境変数で変更してください。

## 🧪 検証コマンド

```bash
./mvnw -B verify
./mvnw -B package
```

PowerShell:

```powershell
.\mvnw.cmd -B verify
.\mvnw.cmd -B package
```

## 📚 ドキュメント

- [アーキテクチャ](ARCHITECTURE.md)
- [開発ガイド](DEVELOPMENT.md)
- [コントリビューション](CONTRIBUTING.md)
- [テスト方針](TESTING.md)
- [セキュリティ](SECURITY.md)
- [リリース手順](RELEASE.md)
- [ロードマップ](ROADMAP.md)
- [変更履歴](CHANGELOG.md)
- [要件 Skeleton](docs/requirements.md)
- [ADR](docs/adr/0001-skeleton-boundaries.md)
