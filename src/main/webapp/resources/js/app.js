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
})
.directive('file', function() {
  return {
    restrict: 'AE',
    scope: {
      file: '@'
    },
    link: function(scope, el, attrs){
      el.bind('change', function(event){
        var files = event.target.files;
        var file = files[0];
        scope.file = file;
        scope.$parent.file = file;
        scope.$apply();
      });
    }
  };
});