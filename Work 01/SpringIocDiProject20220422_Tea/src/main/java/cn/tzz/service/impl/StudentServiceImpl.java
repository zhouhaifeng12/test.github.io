package cn.tzz.service.impl;


import cn.tzz.dao.IStudentDao;
import cn.tzz.service.IStudentService;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class StudentServiceImpl implements IStudentService {
    private IStudentDao isDAO;
    @Override
    public void register(String username, String password) throws Exception {
        isDAO.save(username, password);
    }
}
