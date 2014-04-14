<html>
    <head>
		<title>yl 首页</title>
	</head>
	<body>Index page</body>
	
	<hr>news  look here
	
	   <form name=form  method=post action=index/getnews.htm>
                <td colspan=2><input type=submit value=newsajax /></td>
        </form>
        <form name=form  method=post action=index/getnewsById.htm?msgId=5>
                <td colspan=2><input type=submit value=newsbyidajax /></td>
        </form>
	
	<hr>feedback look here
	 <form name=form  method=post action=index/subFeedBack.htm?fdContext=testdc&connect=12908655654&companyName=tx>
                <td colspan=2><input type=submit value=feedbackajax /></td>
        </form>
</html> 