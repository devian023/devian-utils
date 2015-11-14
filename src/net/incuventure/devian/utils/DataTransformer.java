package net.incuventure.devian.utils;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataTransformer {
	
    /**
     * @Author Ian Lamigo
     * @Return List<HashMap>
     * This method is typically used to transform List<List> to List<HashMap>
     * It is effective when transforming an HQL resultset, which is a List<List>, to a List of data with Key-Value pair.
     */
	public static List transform(List<Object[]> list, List<String> aliases){
    	List newList = new ArrayList();
    	for(int j = 0; j < list.size(); j++ ){
    		Object[] row = list.get(j);
    		Map map = new HashMap();
    		for(int i = 0; i < row.length; i++){
    			map.put( aliases.get(i), row[i] );
    		}
    		newList.add(map);
    	}
    	return newList;
    }
}