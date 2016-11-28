$(document).ready({
	
	var path = window.location.pathname;
	var $menuTop = $("#menuTop");
	
	if (path == "/" || path == "/roles" || path == "/tabelas" || path == "/imagens" || path == "/formularios" || path == "/msgFormularios" || path == "/progressBar" || path == "/tabs" || path == "/rolesMenus" || path == "/modal" ||)
	{
		$menuTop.find(".inicio").addClass("active");
	} else if (path == "/sobre") {
		$menuTop.find(".sobre").addClass("active");		
	} else if (path == "/infos") {
		$menuTop.find(".infos").addClass("active");		
	} else if (path == "/contato") {
		$menuTop.find(".contato").addClass("active");		
	}
	
});