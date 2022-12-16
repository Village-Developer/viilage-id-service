package village.farmer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import village.farmer.service.AuthorizationService;
import village.farmer.service.etc.Jwt;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

    @Autowired
    Jwt jwt;

    @Override
    public String checkToken(String token) throws Exception {

        String test = jwt.getUserFromToken(token);
        System.out.println(test);

        return null;

    }
}
