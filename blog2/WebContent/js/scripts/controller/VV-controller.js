app.controller('HomeController', function($scope, $routeParams, $location) {
	console.log("enter:home2");
	$scope.items = {1:"vv", 2:"vv", 3:"vv", 4:"vv", 5:"vv", 6:"vv"};
}); 

app.controller('WordsController', function($scope, $routeParams, $location) {
	console.log("enter:words");
}); 

app.controller('LearnController', function($scope, $routeParams, $location) {
	console.log("enter:learn");
});

app.controller('TravelController', function($scope, $routeParams, $location) {
	console.log("enter:travel");
}); 

app.controller('AboutController', function($scope, $routeParams, $location) {
	console.log("enter:about");
}); 

app.controller('BoardController', function($scope, $routeParams, $location) {
	console.log("enter:board");
});

app.controller('LoginController', function($scope, $routeParams, $location, $http) {
	$scope.login = function() {
		//console.log("login");
		//console.log("username:" + $scope.current.username);
		//console.log("password:" + $scope.current.password);
		var url = "/blog/login.do";
		get(url, $scope.current.username, $scope.current.password);
	};
	
	function get(url, username, password){
		$http({
			method:"POST",
			url:url,	
			params:{
				"username":username,
				"password":password
			}
		}).success(function(data) {
			console.log("success...");
			alert("登录成功");
			$location.path('/home/main');
		}).error(function() {
			alert("用户名或密码错误");
		});
	}
});
