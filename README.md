# back-project
<!-- 
<table>
    <tr>
        <th colspan=5>💻🙎‍♂스터디원</th>
    </tr>
    <tr>
        <td><a href='https://github.com/qoqomi'>유승연</a></td>
        <td><a href='https://github.com/Lee-Kyung-Dong'>이경동</a></td>
        <td><a href='https://github.com/lky8967'>이정우</a></td>
        <td><a href='https://github.com/ParkSungGyu1'>박성규</a></td>
        <td><a href='https://github.com/puppyGugu'>이병수</a></td>
</table>
<br>
 -->
<!-- # W1_mountain_review -->

## 항해99 첫 미니프로젝트 (참가자 : 유승연, 이병수, 이경동, 박성규, 이정우)


## 프로젝트 정보

 - 혼자 코딩을 연습하며 til를 일기처럼 자유롭게 적는 서비스를 제공하는 웹 사이트입니다

 - 개발기간 : 22.6.10-6.16
---
## Stack

 - frontend : HTML, CSS, javascript

 - backend : Java8 , spring

 - db : mySql

 - react.js 
---
## 결과물

---
## 상세기능
### 메인페이지
1. 메인
 - 게시글 전체 조회
<!--  - modal 기능 
 - 사진 클릭 시 상세페이지
 - 검색기능 가능
<!--  - [전체목록 보기] button click 시 이벤트 발생  -->
2. modal 
 - 등록하기 button click시 이벤트 발생
 - 사진 클릭 시 상세페이지에 작성했던 정보 모달로 call -->

### 로그인,회원가입

 - 메인 페이지에서 로그인 페이지로 rendering 
 - JWT Token 이용 
<!--  - 회원가입 button 클릭 시 회원가입 button으로 toggle 
 - Bulma 사용 -->

### 등록페이지
1. 등록 종류
 - Url 등록, 제목, 내용 
<!--  - 사진 업로드 시 파일명 명시 -->
<!--  - 개선점 : 어떤 사진을 올렸는지 확인하기 위해 파일명을 명시하였지만 사진파일을 미리보기를 추가하여 사용자의 실수를 줄일 수 있을거 같다. -->
<!-- 2. 예외처리
 - 사진 또는 산이름을 미작성시 경고알람
 - 개선점 : 산이름, 코스 이름, 지역명, 소감을 작성시 욕설 또는 은어가 들어가는 경우를 예외처리 (자연어처리기능)  -->

### 게시물

 - 등록페이지로부터 받은 데이터를 메인페이지에 게시물로 나타냄
 - 게시물의 경우 사진만 보여지며 마우스가 사진으로 이동시 이벤트가 발생하여 산이름, 작성자, 편의시설이 보여짐
 - 사진 클릭시 사진, 산이름, 위치, 편의시설, 소감의 데이터가 모두 보여짐 (modal 기능 구현)
---
 
## API 구성
https://lky8967.tistory.com/77

