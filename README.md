<div id="top"></div>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->

<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->


<!-- PROJECT LOGO -->
<br />
<div align="center">

[//]: # (  <a href="https://github.com/kimdonghyeon3/SpringBoot_bashboard">)

[//]: # (    <img src="./logo.png" alt="Logo" width="80" height="80">)

[//]: # (  </a>)

<h3 align="center">스프링 부트와 Mybatis</h3>

  <p align="center">
    스프링과 Mybatis의 활용을 다룬 예제
    <br />

[//]: # (    <a href="https://github.com/kimdonghyeon3/SpringBoot_bashboard"><strong>View Demo »</strong></a>)

[//]: # (    <br />)

[//]: # (    <br />)

  </p>
</div>


<!-- ABOUT THE PROJECT -->
## MyBatis

Mybatis는 객체 지향 언어에서 데이터베이스 프로그래밍을 편리하게 할 수 있도록 도와주는 프레임워크이다. 기본 적으로 JAVA에서는
데이터베이스 프로그래밍을 위해서 JDBC를 제공하고 있는데, Mybatis는 JDBC를 보다 편리하게 사용하기 위한 프레임 워크라고 생각하면 된다.

이러한 관점에서 보면 JPA와 굉장히 유사한 프레임 워크지만 명확한 차이가 있으니, JPA와의 차이점을 인지하여
어떠한 프레임워크를 언제 사용해야하는지 이해해보자
<p align="right">(<a href="#top">back to top</a>)</p>

[//]: # (### Built With)

[//]: # (<img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"> <img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white"> <img src="https://img.shields.io/badge/javascript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black"> <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/JSON-000000?style=for-the-badge&logo=JSON&logoColor=61DAFB">)

[//]: # ( <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> <img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white"> <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white"> <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">)

[//]: # (<p align="right">&#40;<a href="#top">back to top</a>&#41;</p>)
## MyBatis vs JPA

Mybatis와 jpa는 같은 구석이 있으면서도 다른 프레임 워크이다. 직접적으로 와닿는 부분은 Mybatis의 경우 Navtive SQL을 직접 작성하여 활용하지만, 
JPA의 경우 객제 지향 그대로 Method를 활용해 SQL을 실행하게 된다. 이런 차이점으로 부터 당연히 SQL을 다루는 붑누에 있어서 차이가 난다.
이전 Query DSL과 같이, 복잡한 쿼리를 Native SQL을 활용한다면, 쉽게 구현해 낼 수 있지만, 여전히 JPA는 복잡한 쿼리는 구현하는데 한계가 있다.

쉽게만 생각해 본다면, 이러한 차이점으로 인해 MySQL과 JPA를 고르기도 하지만, 주된 차이점들이 있다.
이를 명확히 확인하기 위해서 아래를 참고해보자!

### JPA

장점
 - 1차 캐시, 쓰기지연, 변경감지, 지연로딩을 제공하여 성능상 이점이 있다.
 - 코드 레벨로 관리 되므로 사용하기 용이하고 생산성이 높다.
 - 컴파일 타임에 오류를 캐치할 수 있다.
 - DB에 종속적이지 않으므로 특정 쿼리를 사용하지 않아 추상적으로 구현이 가능하다.
 - 엔티티로 테이블이 관리됨으로 스키마 변경시 엔티티만 변경하면 되므로 유지 보수가 편리하다.
 - 쿼리에 대한 이해도가 부족해도 코드 레벨로 커버가 가능하다.
 - 객체지향적으로 데이터를 관리할 수 있다.

단점
 - JPA만으로 복잡한 쿼리를 작성하기에 한계가 있다.
 - 초기에 생산성이 높지만, 프로젝트가 고도화 되다보면 N+1, FetchType, Proxy, 연관관계 등 성능이슈가 있다.

### Mybatis

장점

- Native SQL를 직접 작성하므로 최적화 쿼리를 구현하기 쉽다.
- 엔티티에 종속적이지 않기 때문에 다양한 테이블을 조합할 수 있다.
- 복잡한 SQL 쿼리작성도 보다 쉽게 작성할 수 있다.

단점

- 스키마 변경시 SQL을 직접 수정해야한다.
- 반복된 쿼리가 발생하여 반복 잡업이 있다.
- 런타임시 오류를 발견할 수 없다.
- DB에 종속적인 쿼리문이 발생하여 DB변경시 로직도 변경해야한다.

어떠한 프레임 워크도 완벽할 수 없지만, 각각의 장단점은 명확하다. 특히 요즘 트랜드는 JPA로 많이 옮겨지고 있는 추세이고
JPA의 단점을 JPQL이나 QueryDSL로 보완할 수 있기 때문이다.

<!-- GETTING STARTED -->
## Getting Started

### 설치 방법

1. Clone the repo
   ```sh
   git clone https://github.com/kimdonghyeon3/Spring_Mybatis
   ```

2. JDK Setting
   ```sh
   projectstructure -> project -> sdk
   setting -> gradle 검색 -> gradle JVM
   ```

3. MySQL Setting
   ```sh
   src/main/resources/applicaton.yml
   
   //mysql id, pw, db setting
    ```

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->

[//]: # (## Usage)

[//]: # ()
[//]: # (회원가입을 통해 회원을 생성 후 원하는 질문을 등록하면된다.)

[//]: # ()
[//]: # (<p align="right">&#40;<a href="#top">back to top</a>&#41;</p>)

<!-- DEMO EXAMPLES -->

[//]: # (## Demo)

[//]: # (![img]&#40;./demo1.png&#41;)

[//]: # (![img]&#40;./demo2.png&#41;)

[//]: # (![img]&#40;./demo3.png&#41;)

[//]: # ()
[//]: # ()
[//]: # (<p align="right">&#40;<a href="#top">back to top</a>&#41;</p>)

<!-- CONTACT -->
## Contact

Email - kimdonghyeon98@gmail.com

Project Link: [https://github.com/kimdonghyeon3/Spring_Mybatis](https://github.com/kimdonghyeon3/Spring_Mybatis)

<p align="right">(<a href="#top">back to top</a>)</p>

MIT License
Copyright (c) 2021 Othneil Drew

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo_name.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo_name/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo_name.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo_name/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo_name.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo_name/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo_name.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo_name/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo_name/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/linkedin_username
[product-screenshot]: images/screenshot.png
