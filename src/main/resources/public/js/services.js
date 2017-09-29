var appServices = angular.module('app.services', []);

appServices.factory('Todo', function($resource) {
  return $resource('/api/v1/todos/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
});

appServices.service('popupService',function($window){
    this.showPopup = function(message){
        return $window.confirm(message);
    };
});
