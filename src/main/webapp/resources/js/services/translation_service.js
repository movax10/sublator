angular.module('app.services',['ngResource'])
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
  });