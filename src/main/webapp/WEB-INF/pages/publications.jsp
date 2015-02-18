<!doctype html>

<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="A layout example that shows off a responsive email layout.">

  <title>Time travellers</title>

  <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.5.0/pure-min.css">

  <!--[if lte IE 8]>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/layouts/email-old-ie.css">
  <![endif]-->
  <!--[if gt IE 8]><!-->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/layouts/email.css">
  <!--<![endif]-->

</head>
<body>






<div id="layout" class="content pure-g">
  <div id="nav" class="pure-u">
    <a href="#" class="nav-menu-button">Menu</a>

    <div class="nav-inner">

      <div class="pure-menu pure-menu-open">
        <ul>
          <c:forEach items="${events}" var="event">
            <li><a href="/publications?event=${event.name}">${event.name}</a></li>
          </c:forEach>
        </ul>
      </div>
    </div>
  </div>

  <div id="list" class="pure-u-1">
    <c:forEach items="${publications}" var="pub">
      <div class="email-item email-item-selected pure-g"  onclick="location.href='/publication?title=${pub.title}';" style="cursor:pointer;">

        <div class="pure-u-3-4">
          <h5 class="email-name">${pub.author}</h5>
          <h4 class="email-subject">${pub.title}</h4>
          <p class="email-desc">
            lslaslall
          </p>
        </div>
      </div>
    </c:forEach>

    <div class="email-item email-item-selected pure-g"  onclick="location.href='';" style="cursor:pointer;">

      <div class="pure-u-3-4">
        <h5 class="email-name">Tilo Mitra</h5>
        <h4 class="email-subject">Hello from Toronto</h4>
        <p class="email-desc">
          Hey, I just wanted to check in with you from Toronto. I got here earlier today.
        </p>
      </div>
    </div>

    <div class="email-item email-item-unread pure-g">

      <div class="pure-u-3-4">
        <h5 class="email-name">Eric Ferraiuolo</h5>
        <h4 class="email-subject">Re: Pull Requests</h4>
        <p class="email-desc">
          Hey, I had some feedback for pull request #51. We should center the menu so it looks better on mobile.
        </p>
      </div>
    </div>

    <div class="email-item email-item-unread pure-g">

      <div class="pure-u-3-4">
        <h5 class="email-name">YUI Library</h5>
        <h4 class="email-subject">You have 5 bugs assigned to you</h4>
        <p class="email-desc">
          Duis aute irure dolor in reprehenderit in voluptate velit essecillum dolore eu fugiat nulla.
        </p>
      </div>
    </div>

    <div class="email-item pure-g">

      <div class="pure-u-3-4">
        <h5 class="email-name">Reid Burke</h5>
        <h4 class="email-subject">Re: Design Language</h4>
        <p class="email-desc">
          Excepteur sint occaecat cupidatat non proident, sunt in culpa.
        </p>
      </div>
    </div>

    <div class="email-item pure-g">

      <div class="pure-u-3-4">
        <h5 class="email-name">Andrew Wooldridge</h5>
        <h4 class="email-subject">YUI Blog Updates?</h4>
        <p class="email-desc">
          Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.
        </p>
      </div>
    </div>

    <div class="email-item pure-g">

      <div class="pure-u-3-4">
        <h5 class="email-name">Yahoo! Finance</h5>
        <h4 class="email-subject">How to protect your finances from winter storms</h4>
        <p class="email-desc">
          Mauris tempor mi vitae sem aliquet pharetra. Fusce in dui purus, nec malesuada mauris.
        </p>
      </div>
    </div>

    <div class="email-item pure-g">

      <div class="pure-u-3-4">
        <h5 class="email-name">Yahoo! News</h5>
        <h4 class="email-subject">Summary for April 3rd, 2012</h4>
        <p class="email-desc">
          We found 10 news articles that you may like.
        </p>
      </div>
    </div>
  </div>


</div>

<script src="http://yui.yahooapis.com/3.17.2/build/yui/yui-min.js"></script>

<script>
  YUI().use('node-base', 'node-event-delegate', function (Y) {

    var menuButton = Y.one('.nav-menu-button'),
            nav        = Y.one('#nav');

    // Setting the active class name expands the menu vertically on small screens.
    menuButton.on('click', function (e) {
      nav.toggleClass('active');
    });

    // Your application code goes here...

  });
</script>






</body>
</html>