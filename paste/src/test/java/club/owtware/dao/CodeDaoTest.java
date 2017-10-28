package club.owtware.dao;

import club.owtware.entity.Code;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CodeDaoTest {
    @Autowired
    private CodeDao cd;

    @Test
    public void add() throws Exception{
        Code code = new Code();
        code.setLanguage("C++");
        code.setCode("#include");
        cd.save(code);
    }

}