<h1>FoodSearchService</h1>

<h2>0. 목차</h2><br>

  <ol>
    <li>팀원 소개</li>
    <li>푸드 서칭 서비스 프로젝트 목적</li>
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


<h3>푸드 서칭 서비스 프로젝트 목적</h3>

평소에 웹서핑을 하면서 검색의 필터가 다소 많이 한정되있어 불편함을 느끼고 해결하고자 음식을 세분화하여 재료, 카테고리별 검색하여 추천 해주는 서비스를 기획 하였습니다.


<hr>


<h3>트러플 슈팅</h3>

<h4>mave project</h4>
에러

Required request parameter 'category_Id' for method parameter type String is not presen

No Persistence provider for EntityManager named mini step

해결방법


persistence.xml 파일명이 Persistence.xml이 아니라 스캔이 되지 않아 이름을 변경하고 해결 하였습니다.


<hr>

<div>
  <h3>느낀점</h3>

눈으로 보고 수업을 듣고 jpa에 대해 이해 했다고 생각하였지만<br>
배움은 배우는 것에 그치지 않고 꼭 직접해보야 한다 생각하게 되었습니다.<br>

<h4>서영석</h4>
평소에 도메인으로 만들때 get,set,생성자,toString을 일부를 깨먹게 되니,<br>
방법을 찾던 중에서<br>
lombok 있어 사용해보니 간편하고 편리하게 좋았습니다.

<hr> 

<h4>김다현</h4>

<hr>

<h4>도은빈<h4>
직접 코드를 작성할려고 하니 수업을 따라가면서 해봤던 것과는 너무나도 달랐다.
공부해야할 것이 방대하다는 것을 새삼 느꼈다
  
<h4>오치헌</h4>
2일 안에 만들어야 했던 미니 프로젝트를 하면서 내 부족한 부분을 많이 느꼈다.<br> 눈으로 볼 때는 이렇게,이렇게 하면 나오겠네 하면서 봤던 부분들이 직접 작성하고 해보니 어? 라는 말이 계속 나오게 되면서 쉽지않다라는 것을 알게 되었다.<br> 하지만 팀원들과의 소통을 하게 되면서 내가 지나쳤던 부분들을 다른 팀원들이 한 것을 보고 새롭게 얻어가는 것이 많아서 팀이라는 것은 좋구나를 느꼈고, 소통을 소극적으로 한 것이 아쉬운 부분으로 남았다.<br> 다음번엔 내가 잘하지 못하더라도 소통을 적극적으로 해보도록 하겠다.
</div>
