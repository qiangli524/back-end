package com.yoooho.mall.service;

import com.yoooho.mall.common.CommonResult;
import com.yoooho.mall.model.UmsMember;
import org.springframework.transaction.annotation.Transactional;

/**
 * 会员管理Service
 * Created by yoooho on 2019/8/3.
 */
public interface UmsMemberService {
    /**
     * 根据username获取会员
     */
    UmsMember getByUsername(String username);

    /**
     * 根据会员编号获取会员
     */
    UmsMember getById(Long id);

    /**
     * 用户注册
     */
    @Transactional
    CommonResult register(String username, String password, String telephone, String authCode);

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 验证码登录
     * */

    String smsCodeLogin(String telephone, String authCode);

    /**
     * 修改密码
     */
    @Transactional
    CommonResult updatePassword(String telephone, String password, String authCode);

    /**
     * 获取当前登录会员
     */
    UmsMember getCurrentMember();

    /**
     * 根据会员id修改会员积分
     */
    void updateIntegration(Long id,Integer integration);

    /**
     * 刷新token
     */
    public String refreshToken(String oldToken);


    public String  weChatLogin(String code);


    /**
     * 获取用户中心数据
     */

    CommonResult getMemberCenterInfo();

    /**
     * 更新用户数据
     * */
    CommonResult updateMemberCenterInfo(int type, String value);

    int getShopCarNumber(Long userId);


    /**
     * 绑定微信
     * */
    boolean bindWX(String openId, Long userId,String union_id);

    /**
     * 取消绑定微信
     * */
    public void cancelBindWX();

    /**
     * 获取绑定微信的openid
     * */

    public String  getMemberOpenId(Long userId);


}
