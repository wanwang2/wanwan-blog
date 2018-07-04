function getMax(list){
	var max = 0;
	for(var i = 0; i < list.length; i++){
		if(list[i] != null && list[i] > max){
			max = list[i];
		}
	}
	return max;
}

function getMin(list){
	var min = 99999;
	for(var i = 0; i < list.length; i++){
		if(list[i] != null && list[i] < min){
			min = list[i];
		}
	}
	return min;
}

function resetList(key, list) {
	for(var i = 0; i < list.length; i++){
		if(list[i] != null && list[i] == key){
			list[i] = null;//重置
		}
	}
}

function sort(list){
	var result = {};
	for(var i = 0; i < list.length; i++){
		if(i % 2 == 0){ // 取最大值
			result[i] = getMax(i);
		}else{ // 取最小值
			result[i] = getMin(i);
		}
		resetList(result[i], list); // 设置null不让进入判断
	}
	return result;
}