<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
 
    request.setCharacterEncoding("UTF-8");
 
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" >
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <link rel="favicon" href="./img/favi.ico">
	<link rel="stylesheet" href="homeStyle.css">
    <title>ˋˏ ❤ ˎˊ JJING & KKO ˋˏ ❤ ˎˊ</title>
 
    <link
      rel="stylesheet"
      href="https://unpkg.com/swiper/swiper-bundle.min.css"
    />

<link

      rel="stylesheet"

      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"

    />

</head>
<body bgcolor="#FFFEFE">
	<nav class="bar">
		<div class="logo">
			<a href="home.jsp">
			<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="407.5" height="60.5" viewBox="0 0 407.5 60.5">
  <defs>
    <filter id="JJING_KKO" x="0" y="0" width="407.5" height="60.5" filterUnits="userSpaceOnUse">
      <feOffset dx="4" dy="4" input="SourceAlpha"/>
      <feGaussianBlur stdDeviation="0.5" result="blur"/>
      <feFlood flood-opacity="0.161"/>
      <feComposite operator="in" in2="blur"/>
      <feComposite in="SourceGraphic"/>
    </filter>
  </defs>
  <g transform="matrix(1, 0, 0, 1, 0, 0)" filter="url(#JJING_KKO)">
    <text id="JJING_KKO-2" data-name="JJING &amp; KKO" transform="translate(1 39)" fill="#65574e" font-size="53" font-family="CooperBlackStd, Cooper Std"><tspan x="0" y="0">JJING &amp; KKO</tspan></text>
  </g>
</svg>
			</a>
		</div>

		<ul class="menu">
			<li><a href="infomation.html">INFORMATION</a></li>
      <li><a href="picture.html">PICTURE</a></li>
      <li><a href="video.html">VIDEO</a></li>
      <li><a href="goods.html">GOODS</a></li>
      <li><a href="login.jsp">LOGIN</a></li>
		</ul>
		
	</nav>
<!-- Swiper -->
    <div class="swiper-container mySwiper">
      <div class="swiper-wrapper">
        <div class="swiper-slide">
          <img src="./img/info1.jpg">
        </div>
        <div class="swiper-slide">
          <img src="./img/info2.jpg" />
        </div>
        <div class="swiper-slide">
          <img src="./img/info3.jpg" />
        </div>
        <div class="swiper-slide">
          <img src="./img/info4.jpg" />
        </div>
      </div>
      <div class="swiper-button-next"></div>
      <div class="swiper-button-prev"></div>
      <div class="swiper-pagination"></div>
    </div>

    <!-- Swiper JS -->
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>

    <!-- Initialize Swiper -->
    <script>
      var swiper = new Swiper(".mySwiper", {
        spaceBetween: 30,
        effect: "fade",
        navigation: {
          nextEl: ".swiper-button-next",
          prevEl: ".swiper-button-prev",
        },
        pagination: {
          el: ".swiper-pagination",
          clickable: true,
        },
      });
    </script>

    <div class="home_text">
      <img src=".\img\home_text.png">
    </div>

    <div class="insta">
      <font face="'Cooper Std'" color="#65574E" size="38pt"> Instagram </font>
      <a class="kakao" href="https://www.instagram.com/00_04_02_/"><font face="'Noto Sans KR'" color="#65574E" size="3pt">더보기 > </font></a>
    </div>

    <div class="insta_pic">
      <ul class="insta_pic1">
        <li><a href="https://www.instagram.com/p/CQJEuKFrd_l/"><img src="./img/a.png"></a></li>
        <li><a href="https://www.instagram.com/p/CQJEs0YrFWf/"><img src="./img/b.png"></a></li>
        <li><a href="https://www.instagram.com/p/CQJEr60riEw/"><img src="./img/c.png"></a></li>
      </ul>
      <ul class="insta_pic2">
        <li><a href="https://www.instagram.com/p/CQJErB7L-PU/"><img src="./img/d.png"></a></li>
        <li><a href="https://www.instagram.com/p/CQJEqLArWX6/"> <img src="./img/e.png"></a></li>
        <li><a href="https://www.instagram.com/p/CQJEo3mLany/"><img src="./img/f.png"></a></li>
      </ul> 
      <ul class="insta_pic3">
        <li><a href="https://www.instagram.com/p/CQJEoAHLw2u/"><img src="./img/g.png"></a></li>
        <li><a href="https://www.instagram.com/p/CQJEm6yLqmE/"><img src="./img/h.png"></a></li>
        <li><a href="https://www.instagram.com/p/CQJEl9Sr6qk/"><img src="./img/i.png"></a></li>
      </ul>
    </div> 

    <div class="ytb">
    <font face="'Cooper Std'" color="#65574E" size="38pt"> Youtube </font>
    </div>

    <div class="ytb2" align="center">
    <a href="https://www.youtube.com/channel/UCTZlOmGaxtUNHMeyYQd5CrQ"> <img src="./img/ytb.png"> </a>
    </div>

    <footer class="foot">
              <div class="bLogo">
                <a href="">
                <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" width="151.5" height="165.5" viewBox="0 0 151.5 165.5">
                <defs>
                  <filter id="JJING_KKO" x="0" y="0" width="151.5" height="165.5" filterUnits="userSpaceOnUse">
                    <feOffset dx="4" dy="4" input="SourceAlpha"/>
                    <feGaussianBlur stdDeviation="0.5" result="blur"/>
                    <feFlood flood-opacity="0.161"/>
                    <feComposite operator="in" in2="blur"/>
                    <feComposite in="SourceGraphic"/>
                  </filter>
                </defs>
                <g transform="matrix(1, 0, 0, 1, 0, 0)" filter="url(#JJING_KKO)">
                  <text id="JJING_KKO-2" data-name="JJING&amp;
              KKO" transform="translate(73 31)" fill="#65574e" font-size="42" font-family="CooperBlackStd, Cooper Std"><tspan x="-72.66" y="0">JJING</tspan><tspan x="-19.173" y="58">&amp;</tspan><tspan x="-53.676" y="116">KKO</tspan></text>
                </g>
              </svg>

              </a>
              </div>
     
     <div class="KBE">
      <div class="KB">
        <li><font class="Ftitle">KAKAO TALK</font></li>
        <a class="kakao" href="https://open.kakao.com/o/sJEN6vBb"><li><font class="Ftext">https://open.kakao.com/o/sJEN6vBb</font></li></a>
        <br><br>
        <li><font class="Ftitle">BANK</font></li>
        <li><font class="Ftext">하나 470-910036-73807 <br>
                                신한 110-459-201218</font></li>
      </div>
      <div class="E">
        <li><font class="Ftitle">E mail</font></li>
        <li><font class="Ftext">www031226@gmail.com</font></li>

        <ul class="icon">
        <a class="kakao" href="https://www.instagram.com/00_04_02_/"><i class="fab fa-instagram"></i></a>
        <a class="kakao" href="https://twitter.com/jjingnkko"><i class="fab fa-twitter"></i></a>
        <a class="kakao" href="https://www.facebook.com/profile.php?id=100008322708994"><i class="fab fa-facebook-square"></i></a>
      </ul>
      </div>
    </div>
    </footer>
    <div  class="copyright">
       <font>이 페이지에 있는 모든 것의 저작권은 저한테 있으며 무단으로 복제 및 사용해보셔도 됩니다</font>
      </div>
</body>
</html>