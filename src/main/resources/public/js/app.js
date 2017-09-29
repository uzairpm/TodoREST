(function() {
	var app = angular.module('app', ['ui.router', 'ngAnimate', 'ui.bootstrap', 'ngResource', 'app.controllers', 'app.services'])

	app.config(function($stateProvider, $urlRouterProvider, $controllerProvider){
		var viewsPrefix = 'views/';
		$urlRouterProvider.otherwise("/todos");

		$stateProvider.state('home', {
			url: "/",
			templateUrl: viewsPrefix + "home.html"
		}).state('todos',{
	        url:'/todos',
	        templateUrl: viewsPrefix + 'todos.html',
	        controller:'TodoListController'
	    }).state('viewTodo',{
	       url:'/todos/:id/view',
	       templateUrl: viewsPrefix + 'todo-view.html',
	       controller:'TodoViewController'
	    }).state('newTodo',{
	        url:'/todos/new',
	        templateUrl: viewsPrefix + 'todo-add.html',
	        controller:'TodoCreateController'
	    }).state('editTodo',{
	        url:'/todos/:id/edit',
	        templateUrl: viewsPrefix + 'todo-edit.html',
	        controller:'TodoEditController'
	    })
	});
}());
