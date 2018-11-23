app.controller("ShortestPathController", function($scope,$ngBootbox,$http,$window,$location,$rootScope) {
	
	$scope.demo="Input:\n\n" +
			"Enter number of cities\n" +
			"5\n" +
			"Enter distance between cities\n" +
			"0 12 10 19 8\n" +
			"12 0 3 7 2\n" +
			"10 3 0 6 20\n" +
			"19 7 6 0 4\n" +
			"8 2 20 4 0\n" +
			"Enter the origin city: (Starts from 1)\n" +
			"1\n\n" +
			"Output:\n" +
			"Route: [1, 2, 5, 3, 4, 1]\n" +
			"Distance: 32.0" 
	var config = { headers : {  'Content-Type': 'application/json ;charset=utf-8;'   } }
	  $scope.findPath= function(){
		  if(!($scope.shortest.numberOfCities<=2)){
		  
			  if($scope.shortest.edgeWeights != "" && $scope.shortest.edgeWeights != undefined){
				  
				  var edgeweights= $scope.shortest.edgeWeights.split('\n');
				  var combineWeights="";
				  for(i=0;i<edgeweights.length;i++){
					  combineWeights+=edgeweights[i]+" ";
				  }
				  //console.log("combineWeights===>"+combineWeights);
				  $scope.shortest.edgeWeights=combineWeights;
			  }
			  
		  $http.post("http://localhost:8089/short",$scope.shortest)
          .success(function (response){  
        	 
        	  $scope.result="Best Route & Distance::"+response.result;
        	  
        	       	  
        	  //console.log($scope.tableData);
          })
          .error(function (response){
          });
		  }
		  else{
			  $ngBootbox.alert("Please check your input:<br>" +
			  		"1.Number of cities should be more than 2<br>" +
			  		"2.Origin city starts from 0 so last city should not be equal to the number of cities");

		  }
		  

      };
      
      $http.get("http://localhost:8089/short")
      .success(function (response){  
    	 
    	  $scope.data=response;
    	  
    	       	  
    	  //console.log($scope.tableData);
      })
      .error(function (response){
      });
      
      
    
});

