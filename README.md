# 🎨 MZ세대를 위한 AI 패션 코디 추천 서비스

> **평범한 옷차림에 싫증 난 MZ세대 여성**을 위한 독특한 스타일 제안 서비스입니다.  
> 사용자의 디지털 옷장과 날씨, TPO, 개인 취향, 그리고 패션 피드백까지 통합하여 AI 기반 코디네이션을 추천합니다.

---

## 🔍 주요 기능

- **AI 기반 코디 추천** (GPT-4.1 사용)
- **유니크 코디네이션 스타일** (크로스오버 / 패턴 온 패턴 / 레이어드 코디네이션)
- **사용자 디지털 옷장 연동** (MongoDB 기반)
- **벡터 유사도 검색**으로 아이템 검색
- **피드백 반영 시스템**으로 개인 코디룰 자동 업데이트
- **찜 기능**을 통한 코디 저장/조회/삭제

---

## 🔨 How to Build

1. **Git Clone**
    ```bash
    git clone 
    cd your-fashion-project
    ```

2. **환경 변수 설정**
    `.env` 또는 `application.yml`에 다음 항목들을 설정하세요:
    ```yaml
    openai:
      api-key: YOUR_API_KEY
    spring:
      data:
        mongodb:
          uri: YOUR_MONGO_URI
    ```

3. **빌드**
    ```bash
    ./gradlew clean build
    ```

---

## 🚀 How to Run

1. **로컬 실행**
    ```bash
    ./gradlew bootRun
    ```

2. **Postman으로 테스트**
    - `POST /api/outfit/recommend`: 코디 요청
    - `POST /api/outfit/feedback`: 피드백 반영
    - `POST /api/outfit/addFavoriteCoordination`: 찜 등록
    - `GET /api/outfit/getFavoriteCoordinations`: 찜 목록 조회
    - `DELETE /api/outfit/removeFavoriteCoordination/{id}`: 찜 삭제

3. **Swagger (선택)**
    - http://localhost:8080/swagger-ui/index.html

---

## 🧪 How to Test

1. **단위 테스트 실행**
    ```bash
    ./gradlew test
    ```

2. **Postman 테스트 세트 구성**
    - `/postman/` 디렉토리에 제공된 `.json`을 Postman에 Import하여 테스트

---

## 📁 데이터 준비

- `resources/baseJson/` 및 `resources/layeredBaseJson/` 하위에 날씨별 JSON 템플릿 필요
- MongoDB에는 `top`, `pants`, `dress`, `skirt`, `outerwear`, `item` 컬렉션 필요
- `item_vector_index` 및 벡터 인덱싱 구축 필수

---

## 🤝 기여

Pull Request, Issue 환영합니다!

---

## 📜 라이선스

MIT License

---

## 📧 문의

- 이메일: contact@yourdomain.com
- 팀명: Team 수아정 (SUAJUNG)
