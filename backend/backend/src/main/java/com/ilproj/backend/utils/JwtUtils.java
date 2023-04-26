package com.ilproj.backend.utils;

//import com.ilproj.backend.sys.entity.User;
import io.jsonwebtoken.*;

import java.util.Date;
import java.util.UUID;

public class JwtUtils {

    private static long time = 10000 * 60 * 60 * 24;
    private static String signature = "admin";

    /**
     * 使用jwt生成token
     * @param user User对象
     * @return 返回一个token
     */
//    public static String jwtEncode(User user){
//        JwtBuilder jwtBuilder = Jwts.builder();
//        String jwtToken = jwtBuilder
//                //heard
//                .setHeaderParam("typ", "JWT")
//                .setHeaderParam("alg","HS256")
//                //payload
//                .claim("user",user)
//                .setSubject("admin-test")
//                .setExpiration(new Date(System.currentTimeMillis()+time))
//                .setId(UUID.randomUUID().toString())
//                //Signature
//                .signWith(SignatureAlgorithm.HS256,signature)
//                .compact();
//        return jwtToken;
//    }
//
//    /**
//     *对jwt生成的一个token进行解码
//     * @return 返回一个用户对象
//     */
//    public static Object jwtDecode(String token){
////        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VybmFtZSI6InVzZXIuZ2V0VXNlcm5hbWUoKSIsInN1YiI6ImFkbWluLXRlc3QiLCJleHAiOjE2ODMxMzM5MzUsImp0aSI6ImVhZTNhMjVjLTE0ZGQtNDU3OS1iMmVhLTRmZmExZDhjMTFkMSJ9.J-B5WXlevdAxHm0f2BlHRvS68HC-HgoOnSZnQT8kht4";
//        JwtParser jwtParser = Jwts.parser();
//        Jws<Claims> claimsJws = jwtParser.setSigningKey(signature).parseClaimsJws(token);
//        Claims claims = claimsJws.getBody();
//        Object user = claims.get("user");
//        return user;
//    }
}
