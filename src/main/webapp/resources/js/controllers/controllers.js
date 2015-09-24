angular.module('app.controllers',['app.services'])
	.controller('TranslationController', function($scope, $log, TranslationService) {
		$scope.fields = ['word','count'];
		$scope.words = TranslationService.getAll();
		$scope.sort = function(field){
			$scope.sort.order = !$scope.sort.order;
			$scope.sort.field = field;
		};
		$scope.sort.order = false;
		$scope.sort.field = "count";
	});