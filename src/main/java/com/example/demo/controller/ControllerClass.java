package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.User;

@RestController
@RequestMapping("/user")
public class ControllerClass {
	
	@RequestMapping(value = "/isuser/{key}", method=RequestMethod.POST)
	public String getResponse(@PathVariable(value = "key") String key, @RequestBody User user)
	{
		String val = "Key : "+key+" : "+user.getId()+":"+user.getName();
		System.out.println(user.getId()); 
		System.out.println(user.getName());
		return val;
	
	}

	
}

//@RestController
//@RequestMapping("/payment")
//public class ControllerClass {
// private final String sharedKey = "SHARED_KEY";
// private static final String SUCCESS_STATUS = "success";
// private static final String ERROR_STATUS = "error";
// private static final int CODE_SUCCESS = 100;
// private static final int AUTH_FAILURE = 102;
// @RequestMapping(value = "/pay", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON)
// public String pay(@RequestBody PaymentRequest request) {
////  BaseResponse response = new BaseResponse();
////  if (sharedKey.equalsIgnoreCase(key)) {
////   int userId = request.getUserId();
////   String itemId = request.getItemId();
////   double discount = request.getDiscount();
////   // Process the request
////   // ....
////   // Return success response to the client.
////   response.setStatus(SUCCESS_STATUS);
////   response.setCode(CODE_SUCCESS);
////  } else {
////   response.setStatus(ERROR_STATUS);
////   response.setCode(AUTH_FAILURE);
////  }
//	 
//	 String val = request.getUserId()+":"+request.getItemId()+":"+request.getDiscount();
//  return val;
// }
//}



