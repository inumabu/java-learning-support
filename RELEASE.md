# 🚀 リリース手順

1. `CHANGELOG.md` を更新
2. `./mvnw -B verify` を実行
3. `./mvnw -B package` で Jar を生成
4. Docker イメージをタグ付け
5. 本番 Secret と Oracle 接続先を確認
6. `/api/health` と主要画面を確認

本番リリース前に、Oracle Migration とロールバック計画をレビューします。
