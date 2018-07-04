define([], function () {
    return {
        defaultRoute: '/start',
        routes: {
            'start': {
                templateUrl: 'views/login.html',
                url: '/start',
                dependencies: ['controller/loginController'],
                allowAnonymous: true
            },
            'home': {
            	templateUrl: 'views/home.html',
                url: '/home',
                dependencies: ['controller/homeController'],
                allowAnonymous: true
            }
            
        }
    };
});