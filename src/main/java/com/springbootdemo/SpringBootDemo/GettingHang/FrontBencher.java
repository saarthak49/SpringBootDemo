package com.springbootdemo.SpringBootDemo.GettingHang;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Component
@Qualifier("FrontBencher")
public class FrontBencher implements Student {

    private String name;

    @Override
    public void study() {
        System.out.println(name + " is studying");
    }
}
