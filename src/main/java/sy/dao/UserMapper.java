package sy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import sy.model.PageTool;
import sy.model.User;

public interface UserMapper {
	/**
	 * ɾ���û�
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(String id);
    /**
     * ����û�
     * @param record
     * @return
     */
	int insert(User record);

	int insertSelective(User record);
     /**
      * ʵ���� ͨ��ID��ѯ
      * @param id
      * @return
      */
	 public User selectByPrimaryKey(String id);
     
	int updateByPrimaryKeySelective(User record);
    /**
     * �������ʵ����
     * @param record
     * @return
     */
	int updateByPrimaryKey(User record);
    /**
     * ʵ���� ȫ��ѯ
     * @return
     */
	List<User> getAll();
     int select();
	List<User> getAll2();

	List<User> getAll3();
	List<User> getAllPage(int pageNow, int row);
	List<User> getAllPage(PageTool aPageTool);
	List<User> likeSelect(PageTool aPageTool);
	List<User> likeSelect1(@Param("news")String news);
}