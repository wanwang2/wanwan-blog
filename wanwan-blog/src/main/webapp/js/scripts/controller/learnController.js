define(['app'], function (app) {
    app.controller('learnController', function ($scope) {
    	console.log('learnController');
    	$scope.msg = "learnController";
    	$scope.formData = "learn";
    	var formData = "formData-vv";
    	$scope.items = {1:"vv", 2:"vv", 3:"vv"};
    });
}); 
