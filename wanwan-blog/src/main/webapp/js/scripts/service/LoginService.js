define([ 'app', 'service/common/ajaxService', 'layer' ], function(app) {
	app.service('loginService', function($http, ajaxService) {
		var me = this;
		me.login = function(url, data, success) {
			console.log("login...")
			ajaxService.ajaxGet(url, data, success);
		}
		me.showText = function() {
			console.log("showText...")
			layer.open({
		        type:1,
		        skin: 'layui-layer-demo', //样式类名
		        anim: 2,
		        shadeClose: true, //开启遮罩关闭
		        closeBtn: 0, //不显示关闭按钮
		        title:"登录框",
		        area:["395px","300px"],
		        content:$("#loginBox"),
			});
			
		}
	
	});
});
