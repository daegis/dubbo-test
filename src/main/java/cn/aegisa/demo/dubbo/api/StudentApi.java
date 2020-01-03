package cn.aegisa.demo.dubbo.api;

import cn.aegisa.demo.dubbo.vo.Student;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2020/1/3 21:51
 */
public interface StudentApi {
    Student getStudent(String name, Integer age);
}
