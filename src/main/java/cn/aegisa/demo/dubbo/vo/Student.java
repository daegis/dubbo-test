package cn.aegisa.demo.dubbo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Using IntelliJ IDEA.
 *
 * @author XIANYINGDA at 2020/1/3 21:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private String name;
    private Integer age;
}
