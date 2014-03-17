val _array = Array(5,3,12,1,29,3,5,7,123,7,34,67,12,6)

object QuickSort{
	def excutor(dataSet:Array[Int]):Array[Int]={
		if(dataSet.length < 2){
			return dataSet
		}else{
			var _pivot = dataSet(dataSet.length/2)
			excutor(dataSet filter (_pivot>)) ++ 
			(dataSet filter (_pivot==)) ++ 
			excutor(dataSet filter (_pivot<))
		}
	}
}


val _sorted = QuickSort.excutor(_array)


for(i <- 0 to _sorted.length-1){
	println(_sorted(i))
}