package com.example.jsoncreator.callcreator;

import java.lang.reflect.Type;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Service
public class JsonCreatorService {


	public String callJsonCreator(String mapAsAString) {
		Type type = new TypeToken<Map<String,Object>>(){}.getType();
		Gson gson = new Gson();

		Map<String,Object> map = gson.fromJson(mapAsAString, type);
		String json = gson.toJson(map);

		return json;
	}

}
