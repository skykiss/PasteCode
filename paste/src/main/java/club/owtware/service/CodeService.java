package club.owtware.service;

import club.owtware.entity.Code;

public interface CodeService {

    void addRecord(Code code);

    Code getOneRecord(Integer id);
}
