define([ 'app', "service/LoginService" ], function(app) {
	app.controller('loginController',
			function($scope, $location, loginService) {

				$scope.login = function() {
					// 获取用户名
					var name = $scope.current.username;
					var password = $scope.current.password;
					var data = {
						"name" : name,
						"password" : password
					}
					loginService.login("/web/admin/login", data,
							function(data) {
								console.log(data);
							});
				}

			});
});
