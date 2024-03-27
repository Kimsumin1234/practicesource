package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import dto.ShopDto;
import service.ShopService;
import service.ShopServiceImpl;

public class ShopListAction implements Action {
    private String path;

    public ShopListAction(String path) {
        this.path = path;
    }

    @Override
    public ActionForward execute(HttpServletRequest req) throws Exception {
        ShopService service = new ShopServiceImpl();
        List<ShopDto> list = service.listAll();

        req.setAttribute("list", list);

        return new ActionForward(path, false);
    }

}
