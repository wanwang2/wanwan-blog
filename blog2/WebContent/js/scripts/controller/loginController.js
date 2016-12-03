define(['app', 'service/LoginService'], function (app) {
    app.controller('loginController', function ($scope, $location, loginService) {
    	console.log('loginController');
    	$scope.msg = "loginController";
    	$scope.formData = "vv";
    	$scope.login = function(){
    		console.log('login function...');
    		var url = "";
    		var data = {username:'vv'}
    		loginService.login(url, data, function(data) {
				console.log(data);
				$location.path("/home");
			});
    	}
    	
    }); 
}); 
