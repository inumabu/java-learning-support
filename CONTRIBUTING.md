# 🤝 コントリビューションガイド

1. `feat/`、`fix/`、`docs/` のブランチを作成
2. Java 21 と既存のパッケージ境界を維持して実装
3. `./mvnw -B verify` を実行
4. 変更理由、テスト結果、Oracle への影響を Pull Request に記載

## 📝 コミット例

```text
feat: add lesson catalog skeleton
fix: handle oracle health check failure
docs: clarify local oracle setup
```

## ⚠️ ルール

- Token、パスワード、接続文字列の実値をコミットしない
- Controller に SQL を直接書かない
- 画面文言は日本語を基本とし、状態には意味のある絵文字を添える
- DB 変更は将来の Migration 方針に合わせる
