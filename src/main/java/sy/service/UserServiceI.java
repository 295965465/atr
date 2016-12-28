package sy.service;

import java.util.List;

import sy.model.PageTool;
import sy.model.User;

public interface UserServiceI {
   /**
    * ʵ����ͨ��id����
    * @param id
    * @return
    */
	public User getUserById(String id);
    /**
     * ʵ����ȫ����
     * @return
     */
	List<User> getAll();
    public int addUser(String name,String pwd);//����û�
    public int deletUser(String id);//ɾ���û�
	
	
	
	List<User> getAll2();

	List<User> getAll3();
	/**
	 * ����
	 * @param id
	 * @return
	 */
	public int updateUser(User record);
     int select();
	public List<User> getAllPage(PageTool aPageTool);
	public List<User> likeSelect(PageTool aPageTool);
	public List<User> likeSelect1(String news);
}
