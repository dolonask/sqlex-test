package kg.megacom.sqlextest.services.impl;

import kg.megacom.sqlextest.dao.PCRepository;
import kg.megacom.sqlextest.models.Pc;
import kg.megacom.sqlextest.models.pojo.Task1;
import kg.megacom.sqlextest.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private PCRepository pcRepository;

    @Override
    public Object task1(double price) {

        List<Pc> pcs = pcRepository.findAllByPriceLessThan(price);

       /* List<Task1> task1s = new ArrayList<>();

        for (Pc pc: pcs) {
            Task1 task1 = new Task1();
            task1.setHd(pc.getHd());
            task1.setSpeed(pc.getSpeed());
            task1.setModel(pc.getProduct().getModel());

            task1s.add(task1);

        }*/

       /* List<Map<String, Object>> task1s = new ArrayList<>();

        for (Pc pc: pcs
             ) {
            Map<String, Object> map = new HashMap<>();
            map.put("model", pc.getProduct().getModel());
            map.put("hd", pc.getHd());
            map.put("speed", pc.getSpeed());

            task1s.add(map);

        }*/



        return pcRepository.findTask3ByPriceNative();

    }
}
