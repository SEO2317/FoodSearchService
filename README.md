<h1>FoodSearchService</h1>

<h2>0. 목차</h2><br>

  <ol>
    <li>팀원 소개</li>
    <li>푸드 서칭 서비스 프로젝트 목적 및 구성</li>
    <li>트러플 슈팅</li>
    <li>프로젝트를 마무리하며 느낀 점</li>
    <li>STACK</li>
  </ol>  
  
<hr>  
  
<h2>1.팀원 소개</h2>  
서영석 - 엔티티 연관관계 설계, 컨트롤러 설계<br>
김다현 - CRUD 작성<br>
도은빈 - 순서도 작성<br>
오치헌 - pareser를 통해 음식의 데이터를 수립하는 담당<br>

<hr>

<h3>트러플 슈팅</h3>

<h4>mave project</h4>
에러

Required request parameter 'category_Id' for method parameter type String is not presen

No Persistence provider for EntityManager named mini step

해결방법


persistence.xml 파일명이 Persistence.xml이 아니라 스캔이 되지 않아 이름을 변경하고 해결 하였습니다.

