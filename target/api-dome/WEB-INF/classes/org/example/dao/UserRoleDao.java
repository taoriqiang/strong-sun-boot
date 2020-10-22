package org.example.dao;




import strong.sun.framework.annotation.Dao;
import strong.sun.framework.jdbc.JdbcTemplate;


import java.sql.SQLException;


@Dao
public class UserRoleDao {

    /**
     * 删除 权限 根据
     *
     * @param sso
     * @throws SQLException
     */
    public void deleteTitle(String sso) throws SQLException {
        String sql = "DELETE FROM tta_emptitle te where te.empSSO = ?";
        JdbcTemplate.dbUpdate(sql, sso);
    }




}
