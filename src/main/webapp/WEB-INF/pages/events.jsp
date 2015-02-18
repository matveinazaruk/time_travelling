<!doctype html>
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
          <li><a href="#">Event 1</a></li>
          <li><a href="#">Event 2</a></li>
          <li><a href="#">Event 3</a></li>
          <li><a href="#">Event 4</a></li>
        </ul>
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