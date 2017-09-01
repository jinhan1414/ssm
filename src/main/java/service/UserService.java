package service;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserService {
	//195127
	@Select("SELECT * FROM tauser WHERE userid = #{userId}")
	Map getUser(@Param("userId") String userId);

}
 