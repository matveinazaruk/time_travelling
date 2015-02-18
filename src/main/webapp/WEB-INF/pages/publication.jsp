<!doctype html>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="A layout example that shows off a responsive email layout.">

  <title>Email &ndash; Layout Examples &ndash; Pure</title>

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
          <a href="events">
            <h3 style="color: #1b98f8">Events</h3>
          </a>
          <c:forEach items="${events}" var="event">
            <c:if test="${event.name == eventName}">
              <li style="background-color: #373C5A"><a href="/publications?event=${event.name}">${event.name} <br> ${event.date}</a></li>
            </c:if>
            <c:if test="${event.name != eventName}">
              <li><a href="/publications?event=${event.name}">${event.name} <br> ${event.date}</a></li>
            </c:if>

          </c:forEach>
        </ul>
      </div>
    </div>
  </div>

  <div id="list" class="pure-u-1">
    <c:forEach items="${publications}" var="pub">
      <c:if test="${pub.fromFuture && pub.title == pubTitle}">
        <div class="email-item email-item-selected pure-g"
             style="border-left: 6px solid #ff6666; cursor:pointer;"
             onclick="location.href='/publication?event=${eventName}&title=${pub.title}';">

          <div class="pure-u-3-4">
            <h5 class="email-name">${pub.author}</h5>
            <h4 class="email-subject">${pub.title}</h4>
            <p class="email-desc">
                ${pub.date}
            </p>
          </div>
        </div>
      </c:if>
      <c:if test="${pub.fromFuture && pub.title != pubTitle}">
        <div class="email-item pure-g"
             style="border-left: 6px solid #ff6666; cursor:pointer;"
             onclick="location.href='/publication?event=${eventName}&title=${pub.title}';">

          <div class="pure-u-3-4">
            <h5 class="email-name">${pub.author}</h5>
            <h4 class="email-subject">${pub.title}</h4>
            <p class="email-desc">
                ${pub.date}
            </p>
          </div>
        </div>
      </c:if>
      <c:if test="${!pub.fromFuture  && pub.title == pubTitle}">
        <div class="email-item email-item-selected pure-g"  onclick="location.href='/publication?event=${eventName}&title=${pub.title}';" style="cursor:pointer;">

          <div class="pure-u-3-4">
            <h5 class="email-name">${pub.author}</h5>
            <h4 class="email-subject">${pub.title}</h4>
            <p class="email-desc">
                ${pub.date}
            </p>
          </div>
        </div>
      </c:if>
      <c:if test="${!pub.fromFuture  && pub.title != pubTitle}">
        <div class="email-item pure-g"  onclick="location.href='/publication?event=${eventName}&title=${pub.title}';" style="cursor:pointer;">

          <div class="pure-u-3-4">
            <h5 class="email-name">${pub.author}</h5>
            <h4 class="email-subject">${pub.title}</h4>
            <p class="email-desc">
                ${pub.date}
            </p>
          </div>
        </div>
      </c:if>
    </c:forEach>
  </div>

  <div id="main" class="pure-u-1">
    <div class="email-content">
      <div class="email-content-header pure-g">
        <div class="pure-u-1-2">
          <h1 class="email-content-title">${publication.title}</h1>
          <p class="email-content-subtitle">
            By <a>${publication.author}</a> at <span>${publication.date}</span>
          </p>
        </div>

      </div>

      <div class="email-content-body">
        <p>
          ${publication.content}
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