# 🏗️ アーキテクチャ

```text
Browser
  │ HTTP / HTML
  ▼
Spring Boot Web
  ├─ Thymeleaf UI
  ├─ REST API（health のみ Skeleton）
  └─ Application / Domain（次フェーズ）
          │ JDBC / Repository
          ▼
Oracle Database
```

## 🧱 方針

- Web 層と DB アクセスを分離する
- Oracle を正本データストアとする
- 画面はサーバーサイドレンダリングを基本にし、必要な部分だけ API 化する
- 学習コンテンツ、課題提出、進捗を別の集約として設計する
- 認証・認可は学習者、講師、管理者のロールを前提にする

## 🩺 ヘルスチェック

`/api/health` は `SELECT 1 FROM dual` を使い、アプリケーションと Oracle の状態を `UP` / `DEGRADED` で返します。内部エラー詳細は外部へ返しません。
