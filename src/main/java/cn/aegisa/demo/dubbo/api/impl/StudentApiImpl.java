package cn.aegisa.demo.dubbo.api.impl;

import cn.aegisa.demo.dubbo.api.StudentApi;
import cn.aegisa.demo.dubbo.vo.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2020/1/3 21:52
 */
@Component
@Slf4j
@Service
public class StudentApiImpl implements StudentApi {
    @Override
    public Student getStudent(String name, Integer age) {
        return new Student(name, age + 5);
    }
}
