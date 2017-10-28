package club.owtware.service.impl;

import club.owtware.dao.CodeDao;
import club.owtware.entity.Code;
import club.owtware.service.CodeService;
import club.owtware.util.RandomNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private CodeDao repository;
    @Override
    public void addRecord(Code code) {
        repository.save(code);
    }

    @Override
    public Code getOneRecord(Integer id) {
        return repository.findOne(id);
    }
}
