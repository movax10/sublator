var app = angular.module('SublatorApp',[]);
app.controller('WordslistController',['$scope', function($scope) {
	$scope.words2 = [{words: 'mama', count: 53}, {words: 'always', count: 26}, {words: 'said', count: 34}]
	$scope.words = [['mama', 53],['always', 26],['said', 34],['life', 12],['was', 160]];
	$scope.fields = ['words','count'];
	$scope.sort = function(field){
		$scope.sort.order = !$scope.sort.order;
		$scope.sort.field = field;
	};
	$scope.sort.order = false;
	$scope.sort.field = "words";

}]);