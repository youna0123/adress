# 🎨 MZ세대를 위한 AI 패션 코디 추천 서비스

> **평범한 옷차림에 싫증 난 MZ세대 여성**을 위한 독특한 스타일 제안 서비스입니다.  
> 사용자의 디지털 옷장과 날씨, TPO, 개인 취향, 그리고 패션 피드백까지 통합하여 AI 기반 코디네이션을 추천합니다.
<br>
<br>
---
<br>
<br>
## 🔍 주요 기능

- **AI 기반 코디 추천** (GPT-4.1 사용)
- **유니크 코디네이션 스타일** (크로스오버 / 패턴 온 패턴 / 레이어드 코디네이션)
- **사용자 디지털 옷장 연동** (MongoDB 기반)
- **벡터 유사도 검색**으로 아이템 검색
- **피드백 반영 시스템**으로 개인 코디룰 자동 업데이트
- **찜 기능**을 통한 코디 저장/조회/삭제
<br>
<br>
---
<br>
<br>
## 🔨 How to Build

1. **Git Clone**
    ```bash
    git clone https://github.com/youna0123/adress.git
    cd adress
    ```

2. **환경 변수 설정**
    `application.yml`에 다음 항목들을 설정하세요:
    ```yaml
      mail:
        host: smtp.gmail.com
        port: 587
        username: YOUR_GMAIL_ADDRESS
        password: YOUR_PASSWORD
    ```

    ```yaml
      app:
          jwt:
            secret: YOUR_SECRET
            expirationMs: 86400000

          base-url: YOUR_BASE_URL
    ```

    `application.property`에 다음 항목들을 설정하세요:
    ```yaml
    # MongoDB
    spring.data.mongodb.uri=YOUR_MONGODB_URI1
    spring.data.mongodb.uri2=YOUR_MONGODB_URI2

    # OpenAI
    openai.api.key=YOUR_OPENAI_API_KEY
    ```

    `MongoConfig1.java`에 다음 항목들을 설정하세요:
    ```yaml
    public MongoDatabaseFactory mongoDbFactory1() {

        return new SimpleMongoClientDatabaseFactory("YOUR_MONGODB_URI1");
    }
    ```

    `MongoConfig2.java`에 다음 항목들을 설정하세요:
    ```yaml
    public MongoDatabaseFactory mongoDbFactory2() {

        return new SimpleMongoClientDatabaseFactory("YOUR_MONGODB_URI2");
    }
    ```

3. **빌드**
    ```bash
    ./gradlew clean build
    ```
<br>
<br>
---
<br>
<br>
## 🚀 How to Run

**로컬 실행**
```bash
./gradlew bootRun
```
<br>
<br>
---
<br>
<br>
## 🧪 How to Test

**Postman으로 테스트**
- `POST /api/outfit/recommend`: 코디 요청
- `POST /api/outfit/feedback`: 피드백 반영
- `POST /api/outfit/addFavoriteCoordination`: 찜 등록
- `GET /api/outfit/getFavoriteCoordinations`: 찜 목록 조회
- `DELETE /api/outfit/removeFavoriteCoordination/{id}`: 찜 삭제
<br>
<br>
---
<br>
<br>
## 📧 문의

- 이메일: kyaa123@naver.com
