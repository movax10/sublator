angular
.module('SublatorApp', ['ngResource'])
.service('TranslationService', function($log, $resource) {
	return {
		getAll : function() {
			var translationResource = $resource('translation', {}, {
				query : {
					method : 'GET',
					params : {},
					isArray : true
				}
			});
			return translationResource.query();
		}
	}
})
.controller('TranslationController', function($scope, $log,
		TranslationService) {
	$scope.fields = ['word','count'];
	$scope.words = TranslationService.getAll();
	$scope.sort = function(field){
		$scope.sort.order = !$scope.sort.order;
		$scope.sort.field = field;
	};
	$scope.sort.order = false;
	$scope.sort.field = "count";
});