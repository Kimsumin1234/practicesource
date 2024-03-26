package service;

import java.util.List;

import dao.ShopDao;
import dto.ShopDto;

public class ShopServiceImpl implements ShopService {

    ShopDao dao = new ShopDao();

    @Override
    public List<ShopDto> listAll() {
        return dao.getList();
    }

}
