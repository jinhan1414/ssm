package mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {
	//195127
	@Select("SELECT * FROM user WHERE id = #{userId}")
	Map getUser(@Param("userId") String userId);

}
 