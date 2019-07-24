package service.impl;

import dao.CodeDao;
import factory.CodeDaoFactory;
import model.Code;
import service.CodeService;

public class CodeServiceImpl implements CodeService {
    
    private static final CodeDao codeDao = CodeDaoFactory.getInstance();

    @Override
    public void add(Code code) {
        codeDao.add(code);
    }

    @Override
    public int getCode(int orderId) {
        return codeDao.getCode(orderId);
    }
}
