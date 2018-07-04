define(['app'], function (app) {
    app.controller('homeController', function ($scope) {
    	console.log('homeController');
    	$scope.msg = "homeController";
    	$scope.formData = "home";
    	var formData = "formData-vv";
    	$scope.items = {1:"vv", 2:"vv", 3:"vv"};
    });
}); 
