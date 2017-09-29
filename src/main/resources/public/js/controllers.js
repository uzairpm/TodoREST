var appControllers = angular.module('app.controllers', []);

appControllers.controller('TodoListController', function($scope, $state, popupService, $window, Todo) {
	$scope.filterByStatus = '';
	$scope.todos = Todo.query();

	$scope.deleteTodo = function(todo) {
		if (popupService.showPopup('Really delete this?')) {
			todo.$delete(function() {
				$scope.todos = Todo.query(); 
				$state.go('todos');
			});
		}
	};
});

appControllers.controller('TodoViewController', function($scope, $stateParams, Todo) {
	$scope.todo = Todo.get({ id: $stateParams.id });
});

appControllers.controller('TodoCreateController', function($scope, $state, $stateParams, Todo) {
	$scope.todo = new Todo();
	$scope.todo.condition = 'NEW';

	$scope.addTodo = function() {
		$scope.todo.$save(function() {
			$state.go('todos');
		});
	};
});

appControllers.controller('TodoEditController', function($scope, $state, $stateParams, Todo) {
	$scope.updateTodo = function() {
		$scope.todo.$update(function() {
			$state.go('todos');
		});
	};

	$scope.loadTodo = function() {
		$scope.todo = Todo.get({ id: $stateParams.id });
	};
	$scope.loadTodo();
});
