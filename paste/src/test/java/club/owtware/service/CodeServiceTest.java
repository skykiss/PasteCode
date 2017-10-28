package club.owtware.service;

import club.owtware.entity.Code;
import club.owtware.service.impl.CodeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodeServiceTest {
    @Autowired
    private CodeServiceImpl csi;

    @Test
    public void addRecord() throws Exception {
        Code code = new Code();
        code.setLanguage("python");
        code.setCode("print()");
        csi.addRecord(code);
    }

    @Test
    public void getOneRecord() throws Exception {
    }

}