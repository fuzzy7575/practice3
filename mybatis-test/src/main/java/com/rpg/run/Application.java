package com.rpg.run;


import com.rpg.view.RPGMenu;

public class Application {

    public static void main(String[] args) {
        RPGMenu menu = new RPGMenu();
        menu.menu();
    }

}

//import com.rpg.user.dao.UserDAO;
//import com.rpg.user.dto.UserDTO;
//import com.rpg.util.common.Template;
//import org.apache.ibatis.session.SqlSession;
//
//public class Application {
//
//    public static void main(String[] args) {
//
//        SqlSession sqlSession = Template.getSqlSession();
//
//        UserDAO userDAO = sqlSession.getMapper(UserDAO.class);
//
//        UserDTO user = userDAO.userInfo();
//
//        System.out.println(user);
//
//    }
//
//}
