# umeng-push-spring-boot-starter
集成友盟推送java服务端SDK

# 安装
 因为没有上传到中央仓库，使用需要将本项目clone到本地，运行安装到本地
 
 # 引用
 
    <!--友盟推送java服务端SDK，本地仓库-->
    <dependency>
        <groupId>com.github.lany192</groupId>
        <artifactId>umeng-push-spring-boot-starter</artifactId>
        <version>1.0.0</version>
    </dependency>
           
  然后在配置
  
    umeng.push.app-key=xxxxxxxxx
    umeng.push.app-secret=xxxxxxxxxxxxxxxxxx
    
 ## 使用
 
    @Autowired
    AliSmsService aliSmsService;
    
    //发送短信
    aliSmsService.sendSms()
    //批量发送
    aliSmsService.sendBatchSms()
    //查询
    aliSmsService.querySendDetails()
