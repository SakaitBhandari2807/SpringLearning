package org.springframework.chapter5.JDBC.Dao;

import org.springframework.chapter5.JDBC.Model.Employee;

import java.sql.*;

public class EmployeeDaoImpl implements EmployeeDao{

    private final String DB_URL="jdbc:derby://localhost:1527/db";
    private final String DB_DRIVER="org.apache.derby.jdbc.ClientDriver";

    private void registerDriver(){
        try{
            Class.forName(DB_DRIVER).newInstance();
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        } catch (ClassNotFoundException e) {
        }
    }

    @Override
    public void createEmployee() {
        Connection conn = null;
        try{
            registerDriver();
            conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("create table employee_1 (id integer,name char(30))");
            stmt.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        finally {
                if(conn != null){
                    try{
                        conn.close();
                    }
                    catch (SQLException e){
                        System.out.println(e);
                    }
                }
        }
    }

    @Override
    public Employee getEmployeeById(int id) {

        Connection conn = null;
        Employee employee = null;
        try{
            registerDriver();
            conn = DriverManager.getConnection(DB_URL);
            PreparedStatement ps = conn.prepareStatement("select * from employee_1 where id=?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if( rs.next()){
                employee = new Employee(rs.getString("name"),id);
            }
            rs.close();
            ps.close();
        }
        catch(SQLException e){
            System.out.println(e);
        }
        finally {
            if(conn != null){
                try{
                    conn.close();
                }
                catch (SQLException e){
                    System.out.println(e);
                }
            }
        }
        return employee;
    }

    @Override
    public void insertEmployee(Employee employee) {
        Connection conn = null;
        try{
            registerDriver();
            conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();
            stmt.execute("insert into employee_1 values("+employee.getId()+",'"+employee.getName()+"')");
            stmt.close();
        }
        catch (SQLException e){
            System.out.println(e);
        }
        finally {
            if(conn != null){
                try{
                    conn.close();
                }
                catch (SQLException e){
                    System.out.println(e);
                }
            }
        }
    }
}



