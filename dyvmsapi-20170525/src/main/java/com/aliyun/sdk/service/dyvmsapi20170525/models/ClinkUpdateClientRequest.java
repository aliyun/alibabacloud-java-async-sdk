// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ClinkUpdateClientRequest} extends {@link RequestModel}
 *
 * <p>ClinkUpdateClientRequest</p>
 */
public class ClinkUpdateClientRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Active")
    private Long active;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AreaCode")
    private String areaCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssignType")
    private Long assignType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clid")
    private java.util.List<String> clid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClidArea")
    private java.util.List<ClidArea> clidArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClidDefault")
    private java.util.List<String> clidDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClidRule")
    private Long clidRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClidType")
    private Long clidType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudNumberEnabled")
    private Long cloudNumberEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudNumberModes")
    private java.util.List<Long> cloudNumberModes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cno")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long cno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrmId")
    private Long crmId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicTelGroupIdDefault")
    private Long dynamicTelGroupIdDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicTelGroupName")
    private String dynamicTelGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiddenTel")
    private Long hiddenTel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IbWrapupTime")
    private Long ibWrapupTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IbWrapupType")
    private Long ibWrapupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObClidDefaultType")
    private Long obClidDefaultType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObHangupSms")
    private Long obHangupSms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PauseLogin")
    private Long pauseLogin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permission")
    @com.aliyun.core.annotation.Validation(required = true)
    private Permission permission;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Qnos")
    private java.util.List<String> qnos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecurrentselectionType")
    private Long recurrentselectionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecurrentselectionValue")
    private Long recurrentselectionValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private Long role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServeArea")
    private java.util.List<String> serveArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WechatMiniProgramRtc")
    private Long wechatMiniProgramRtc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WrapupTime")
    private Long wrapupTime;

    private ClinkUpdateClientRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.areaCode = builder.areaCode;
        this.assignType = builder.assignType;
        this.clid = builder.clid;
        this.clidArea = builder.clidArea;
        this.clidDefault = builder.clidDefault;
        this.clidRule = builder.clidRule;
        this.clidType = builder.clidType;
        this.cloudNumberEnabled = builder.cloudNumberEnabled;
        this.cloudNumberModes = builder.cloudNumberModes;
        this.cno = builder.cno;
        this.crmId = builder.crmId;
        this.dynamicTelGroupIdDefault = builder.dynamicTelGroupIdDefault;
        this.dynamicTelGroupName = builder.dynamicTelGroupName;
        this.enterpriseId = builder.enterpriseId;
        this.hiddenTel = builder.hiddenTel;
        this.ibWrapupTime = builder.ibWrapupTime;
        this.ibWrapupType = builder.ibWrapupType;
        this.name = builder.name;
        this.obClidDefaultType = builder.obClidDefaultType;
        this.obHangupSms = builder.obHangupSms;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.pauseLogin = builder.pauseLogin;
        this.permission = builder.permission;
        this.qnos = builder.qnos;
        this.recurrentselectionType = builder.recurrentselectionType;
        this.recurrentselectionValue = builder.recurrentselectionValue;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.role = builder.role;
        this.serveArea = builder.serveArea;
        this.wechatMiniProgramRtc = builder.wechatMiniProgramRtc;
        this.wrapupTime = builder.wrapupTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkUpdateClientRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Long getActive() {
        return this.active;
    }

    /**
     * @return areaCode
     */
    public String getAreaCode() {
        return this.areaCode;
    }

    /**
     * @return assignType
     */
    public Long getAssignType() {
        return this.assignType;
    }

    /**
     * @return clid
     */
    public java.util.List<String> getClid() {
        return this.clid;
    }

    /**
     * @return clidArea
     */
    public java.util.List<ClidArea> getClidArea() {
        return this.clidArea;
    }

    /**
     * @return clidDefault
     */
    public java.util.List<String> getClidDefault() {
        return this.clidDefault;
    }

    /**
     * @return clidRule
     */
    public Long getClidRule() {
        return this.clidRule;
    }

    /**
     * @return clidType
     */
    public Long getClidType() {
        return this.clidType;
    }

    /**
     * @return cloudNumberEnabled
     */
    public Long getCloudNumberEnabled() {
        return this.cloudNumberEnabled;
    }

    /**
     * @return cloudNumberModes
     */
    public java.util.List<Long> getCloudNumberModes() {
        return this.cloudNumberModes;
    }

    /**
     * @return cno
     */
    public Long getCno() {
        return this.cno;
    }

    /**
     * @return crmId
     */
    public Long getCrmId() {
        return this.crmId;
    }

    /**
     * @return dynamicTelGroupIdDefault
     */
    public Long getDynamicTelGroupIdDefault() {
        return this.dynamicTelGroupIdDefault;
    }

    /**
     * @return dynamicTelGroupName
     */
    public String getDynamicTelGroupName() {
        return this.dynamicTelGroupName;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return hiddenTel
     */
    public Long getHiddenTel() {
        return this.hiddenTel;
    }

    /**
     * @return ibWrapupTime
     */
    public Long getIbWrapupTime() {
        return this.ibWrapupTime;
    }

    /**
     * @return ibWrapupType
     */
    public Long getIbWrapupType() {
        return this.ibWrapupType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return obClidDefaultType
     */
    public Long getObClidDefaultType() {
        return this.obClidDefaultType;
    }

    /**
     * @return obHangupSms
     */
    public Long getObHangupSms() {
        return this.obHangupSms;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return pauseLogin
     */
    public Long getPauseLogin() {
        return this.pauseLogin;
    }

    /**
     * @return permission
     */
    public Permission getPermission() {
        return this.permission;
    }

    /**
     * @return qnos
     */
    public java.util.List<String> getQnos() {
        return this.qnos;
    }

    /**
     * @return recurrentselectionType
     */
    public Long getRecurrentselectionType() {
        return this.recurrentselectionType;
    }

    /**
     * @return recurrentselectionValue
     */
    public Long getRecurrentselectionValue() {
        return this.recurrentselectionValue;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return role
     */
    public Long getRole() {
        return this.role;
    }

    /**
     * @return serveArea
     */
    public java.util.List<String> getServeArea() {
        return this.serveArea;
    }

    /**
     * @return wechatMiniProgramRtc
     */
    public Long getWechatMiniProgramRtc() {
        return this.wechatMiniProgramRtc;
    }

    /**
     * @return wrapupTime
     */
    public Long getWrapupTime() {
        return this.wrapupTime;
    }

    public static final class Builder extends Request.Builder<ClinkUpdateClientRequest, Builder> {
        private Long active; 
        private String areaCode; 
        private Long assignType; 
        private java.util.List<String> clid; 
        private java.util.List<ClidArea> clidArea; 
        private java.util.List<String> clidDefault; 
        private Long clidRule; 
        private Long clidType; 
        private Long cloudNumberEnabled; 
        private java.util.List<Long> cloudNumberModes; 
        private Long cno; 
        private Long crmId; 
        private Long dynamicTelGroupIdDefault; 
        private String dynamicTelGroupName; 
        private Long enterpriseId; 
        private Long hiddenTel; 
        private Long ibWrapupTime; 
        private Long ibWrapupType; 
        private String name; 
        private Long obClidDefaultType; 
        private Long obHangupSms; 
        private Long ownerId; 
        private String password; 
        private Long pauseLogin; 
        private Permission permission; 
        private java.util.List<String> qnos; 
        private Long recurrentselectionType; 
        private Long recurrentselectionValue; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long role; 
        private java.util.List<String> serveArea; 
        private Long wechatMiniProgramRtc; 
        private Long wrapupTime; 

        private Builder() {
            super();
        } 

        private Builder(ClinkUpdateClientRequest request) {
            super(request);
            this.active = request.active;
            this.areaCode = request.areaCode;
            this.assignType = request.assignType;
            this.clid = request.clid;
            this.clidArea = request.clidArea;
            this.clidDefault = request.clidDefault;
            this.clidRule = request.clidRule;
            this.clidType = request.clidType;
            this.cloudNumberEnabled = request.cloudNumberEnabled;
            this.cloudNumberModes = request.cloudNumberModes;
            this.cno = request.cno;
            this.crmId = request.crmId;
            this.dynamicTelGroupIdDefault = request.dynamicTelGroupIdDefault;
            this.dynamicTelGroupName = request.dynamicTelGroupName;
            this.enterpriseId = request.enterpriseId;
            this.hiddenTel = request.hiddenTel;
            this.ibWrapupTime = request.ibWrapupTime;
            this.ibWrapupType = request.ibWrapupType;
            this.name = request.name;
            this.obClidDefaultType = request.obClidDefaultType;
            this.obHangupSms = request.obHangupSms;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.pauseLogin = request.pauseLogin;
            this.permission = request.permission;
            this.qnos = request.qnos;
            this.recurrentselectionType = request.recurrentselectionType;
            this.recurrentselectionValue = request.recurrentselectionValue;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.role = request.role;
            this.serveArea = request.serveArea;
            this.wechatMiniProgramRtc = request.wechatMiniProgramRtc;
            this.wrapupTime = request.wrapupTime;
        } 

        /**
         * <p>启用状态， 0: 停用；1: 启用。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder active(Long active) {
            this.putQueryParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * <p>所属区号</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        public Builder areaCode(String areaCode) {
            this.putQueryParameter("AreaCode", areaCode);
            this.areaCode = areaCode;
            return this;
        }

        /**
         * <p>号码类型，默认值为0，0: 号码；1: 动态号码组</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder assignType(Long assignType) {
            this.putQueryParameter("AssignType", assignType);
            this.assignType = assignType;
            return this;
        }

        /**
         * <p>可外显号码集合，当外显类型非全部时需指定此参数值。</p>
         */
        public Builder clid(java.util.List<String> clid) {
            String clidShrink = shrink(clid, "Clid", "json");
            this.putQueryParameter("Clid", clidShrink);
            this.clid = clid;
            return this;
        }

        /**
         * <p>按地区外显配置，当clidType（外显号码类型）值为3且clidRule（外显规则）值为2（自定义）时有意义，具体配置项见 clidArea 对象</p>
         */
        public Builder clidArea(java.util.List<ClidArea> clidArea) {
            String clidAreaShrink = shrink(clidArea, "ClidArea", "json");
            this.putQueryParameter("ClidArea", clidAreaShrink);
            this.clidArea = clidArea;
            return this;
        }

        /**
         * <p>缺省外显号码集合，当clidType（外显号码类型）值为3且clidRule（外显规则）值为1（动态）时，支持配置缺省外显</p>
         */
        public Builder clidDefault(java.util.List<String> clidDefault) {
            String clidDefaultShrink = shrink(clidDefault, "ClidDefault", "json");
            this.putQueryParameter("ClidDefault", clidDefaultShrink);
            this.clidDefault = clidDefault;
            return this;
        }

        /**
         * <p>外显规则， 当clidType（外显号码类型）值为0（全部）时，1:随机；2: 轮选。 当clidType（外显号码类型）值为3（智能外显）时，1:动态；2: 自定义。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clidRule(Long clidRule) {
            this.putQueryParameter("ClidRule", clidRule);
            this.clidRule = clidRule;
            return this;
        }

        /**
         * <p>外显号码类型，0: 全部；2: 座席指定；3: 智能外显</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder clidType(Long clidType) {
            this.putQueryParameter("ClidType", clidType);
            this.clidType = clidType;
            return this;
        }

        /**
         * <p>云号码外呼开关，0-关，1-开</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cloudNumberEnabled(Long cloudNumberEnabled) {
            this.putQueryParameter("CloudNumberEnabled", cloudNumberEnabled);
            this.cloudNumberEnabled = cloudNumberEnabled;
            return this;
        }

        /**
         * <p>云号码四种呼叫模式；数组长度 为 4，依次对应云号码外呼的四种模式（实体卡、工作卡、两端呼、RTC)的开启状态； 例如：[0,0,0,1] 表示 座席只可使用 RTC 外呼模式。 注意：仅当企业开启了云手机外呼功能，才能为座席设置该属性，否则，座席将创建失败</p>
         */
        public Builder cloudNumberModes(java.util.List<Long> cloudNumberModes) {
            String cloudNumberModesShrink = shrink(cloudNumberModes, "CloudNumberModes", "json");
            this.putQueryParameter("CloudNumberModes", cloudNumberModesShrink);
            this.cloudNumberModes = cloudNumberModes;
            return this;
        }

        /**
         * <p>座席工号，4-11位数字，要求唯一</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder cno(Long cno) {
            this.putQueryParameter("Cno", cno);
            this.cno = cno;
            return this;
        }

        /**
         * <p>CRM 编号，与第三方 CRM 系统对接时，可作为唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        public Builder crmId(Long crmId) {
            this.putQueryParameter("CrmId", crmId);
            this.crmId = crmId;
            return this;
        }

        /**
         * <p>缺省动态外呼组id，当obClidDefaultType值为1时为必填项</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        public Builder dynamicTelGroupIdDefault(Long dynamicTelGroupIdDefault) {
            this.putQueryParameter("DynamicTelGroupIdDefault", dynamicTelGroupIdDefault);
            this.dynamicTelGroupIdDefault = dynamicTelGroupIdDefault;
            return this;
        }

        /**
         * <p>动态号码组名称，当assignType（号码类型）值为1（动态号码组）时为必填项</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder dynamicTelGroupName(String dynamicTelGroupName) {
            this.putQueryParameter("DynamicTelGroupName", dynamicTelGroupName);
            this.dynamicTelGroupName = dynamicTelGroupName;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8004970</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>号码隐藏类型，0: 不隐藏；1: 隐藏规则与全局设置保持一致。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder hiddenTel(Long hiddenTel) {
            this.putQueryParameter("HiddenTel", hiddenTel);
            this.hiddenTel = hiddenTel;
            return this;
        }

        /**
         * <p>呼入整理时长，客户来电座席接听，双方通话结束后座席的话后处理时长，此期间座席不接收新的客户来电。取值范围：0～3600秒。</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder ibWrapupTime(Long ibWrapupTime) {
            this.putQueryParameter("IbWrapupTime", ibWrapupTime);
            this.ibWrapupTime = ibWrapupTime;
            return this;
        }

        /**
         * <p>呼入整理类型，1：队列；2：座席。</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder ibWrapupType(Long ibWrapupType) {
            this.putQueryParameter("IbWrapupType", ibWrapupType);
            this.ibWrapupType = ibWrapupType;
            return this;
        }

        /**
         * <p>座席名称，只允许输入中文，字母，数字，下划线，长度不超过 20 个字符</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>缺省号码类型 0：号码 1：动态号码组 默认0</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder obClidDefaultType(Long obClidDefaultType) {
            this.putQueryParameter("ObClidDefaultType", obClidDefaultType);
            this.obClidDefaultType = obClidDefaultType;
            return this;
        }

        /**
         * <p>外呼挂机短信开关 0：关闭， 1：开启。开启后，当座席发起外呼时，系统会依据【短信中心 - 短信设置 - 外呼双方接听通知 / 外呼客户未接听通知】中的配置条件发送短信。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder obHangupSms(Long obHangupSms) {
            this.putQueryParameter("ObHangupSms", obHangupSms);
            this.obHangupSms = obHangupSms;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>座席密码，采用 AES加密 ，默认长度为 8 位。如果企业开启了密码安全设置，则需要按照设置的规则设置</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>是否可置忙登录，关闭后，座席不允许置忙登录，0：关闭，1：开启。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pauseLogin(Long pauseLogin) {
            this.putQueryParameter("PauseLogin", pauseLogin);
            this.pauseLogin = pauseLogin;
            return this;
        }

        /**
         * <p>permission</p>
         * <p>This parameter is required.</p>
         */
        public Builder permission(Permission permission) {
            String permissionShrink = shrink(permission, "Permission", "json");
            this.putQueryParameter("Permission", permissionShrink);
            this.permission = permission;
            return this;
        }

        /**
         * <p>所属队列号集合</p>
         */
        public Builder qnos(java.util.List<String> qnos) {
            String qnosShrink = shrink(qnos, "Qnos", "json");
            this.putQueryParameter("Qnos", qnosShrink);
            this.qnos = qnos;
            return this;
        }

        /**
         * <p>轮选方式，1: 按天轮选；2: 按次轮选，当外显号码类型为全部、外显规则为轮选时配置才生效</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recurrentselectionType(Long recurrentselectionType) {
            this.putQueryParameter("RecurrentselectionType", recurrentselectionType);
            this.recurrentselectionType = recurrentselectionType;
            return this;
        }

        /**
         * <p>轮选值设置，当外显号码类型为全部、外显规则为轮选时配置才生效 1: 按天轮选，每 n 天外呼更换一次外显号码，可设置 1-30 天 2: 按次轮选，每 n 次外呼更换一次外显号码，可设置 1-30 次</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recurrentselectionValue(Long recurrentselectionValue) {
            this.putQueryParameter("RecurrentselectionValue", recurrentselectionValue);
            this.recurrentselectionValue = recurrentselectionValue;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>座席角色，0: 普通座席；1: 班长座席。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder role(Long role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * <p>座席服务地区，区号数组 配置座席服务的地区，可用于外呼任务中“按服务地区分配”的策略。</p>
         */
        public Builder serveArea(java.util.List<String> serveArea) {
            String serveAreaShrink = shrink(serveArea, "ServeArea", "json");
            this.putQueryParameter("ServeArea", serveAreaShrink);
            this.serveArea = serveArea;
            return this;
        }

        /**
         * <p>微信小程序RTC开关 1：开启 0：关闭 默认关闭</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder wechatMiniProgramRtc(Long wechatMiniProgramRtc) {
            this.putQueryParameter("WechatMiniProgramRtc", wechatMiniProgramRtc);
            this.wechatMiniProgramRtc = wechatMiniProgramRtc;
            return this;
        }

        /**
         * <p>整理时长，座席进行外呼操作后的整理时间，取值范围 0-300 秒。</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
         */
        public Builder wrapupTime(Long wrapupTime) {
            this.putQueryParameter("WrapupTime", wrapupTime);
            this.wrapupTime = wrapupTime;
            return this;
        }

        @Override
        public ClinkUpdateClientRequest build() {
            return new ClinkUpdateClientRequest(this);
        } 

    } 

    /**
     * 
     * {@link ClinkUpdateClientRequest} extends {@link TeaModel}
     *
     * <p>ClinkUpdateClientRequest</p>
     */
    public static class ClidArea extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaGroupName")
        private String areaGroupName;

        @com.aliyun.core.annotation.NameInMap("AssignType")
        private Long assignType;

        @com.aliyun.core.annotation.NameInMap("DynamicTelGroupName")
        private String dynamicTelGroupName;

        @com.aliyun.core.annotation.NameInMap("ObClids")
        private java.util.List<String> obClids;

        private ClidArea(Builder builder) {
            this.areaGroupName = builder.areaGroupName;
            this.assignType = builder.assignType;
            this.dynamicTelGroupName = builder.dynamicTelGroupName;
            this.obClids = builder.obClids;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClidArea create() {
            return builder().build();
        }

        /**
         * @return areaGroupName
         */
        public String getAreaGroupName() {
            return this.areaGroupName;
        }

        /**
         * @return assignType
         */
        public Long getAssignType() {
            return this.assignType;
        }

        /**
         * @return dynamicTelGroupName
         */
        public String getDynamicTelGroupName() {
            return this.dynamicTelGroupName;
        }

        /**
         * @return obClids
         */
        public java.util.List<String> getObClids() {
            return this.obClids;
        }

        public static final class Builder {
            private String areaGroupName; 
            private Long assignType; 
            private String dynamicTelGroupName; 
            private java.util.List<String> obClids; 

            private Builder() {
            } 

            private Builder(ClidArea model) {
                this.areaGroupName = model.areaGroupName;
                this.assignType = model.assignType;
                this.dynamicTelGroupName = model.dynamicTelGroupName;
                this.obClids = model.obClids;
            } 

            /**
             * <p>地区组名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder areaGroupName(String areaGroupName) {
                this.areaGroupName = areaGroupName;
                return this;
            }

            /**
             * <p>号码类型，默认值为0，0: 号码；1: 动态号码组</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder assignType(Long assignType) {
                this.assignType = assignType;
                return this;
            }

            /**
             * <p>动态号码组名称，当assignType（号码类型）值为1（动态号码组）时为必填项</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder dynamicTelGroupName(String dynamicTelGroupName) {
                this.dynamicTelGroupName = dynamicTelGroupName;
                return this;
            }

            /**
             * <p>外显号码</p>
             */
            public Builder obClids(java.util.List<String> obClids) {
                this.obClids = obClids;
                return this;
            }

            public ClidArea build() {
                return new ClidArea(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkUpdateClientRequest} extends {@link TeaModel}
     *
     * <p>ClinkUpdateClientRequest</p>
     */
    public static class Permission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Asr")
        private Long asr;

        @com.aliyun.core.annotation.NameInMap("Call")
        private Long call;

        @com.aliyun.core.annotation.NameInMap("Cdr")
        private Long cdr;

        @com.aliyun.core.annotation.NameInMap("Chat")
        private Long chat;

        @com.aliyun.core.annotation.NameInMap("OtherData")
        private Long otherData;

        @com.aliyun.core.annotation.NameInMap("Record")
        private Long record;

        @com.aliyun.core.annotation.NameInMap("RecordDownload")
        private Long recordDownload;

        @com.aliyun.core.annotation.NameInMap("Sms")
        private Long sms;

        @com.aliyun.core.annotation.NameInMap("TaskInventory")
        private Long taskInventory;

        @com.aliyun.core.annotation.NameInMap("Transfer")
        private Long transfer;

        private Permission(Builder builder) {
            this.asr = builder.asr;
            this.call = builder.call;
            this.cdr = builder.cdr;
            this.chat = builder.chat;
            this.otherData = builder.otherData;
            this.record = builder.record;
            this.recordDownload = builder.recordDownload;
            this.sms = builder.sms;
            this.taskInventory = builder.taskInventory;
            this.transfer = builder.transfer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permission create() {
            return builder().build();
        }

        /**
         * @return asr
         */
        public Long getAsr() {
            return this.asr;
        }

        /**
         * @return call
         */
        public Long getCall() {
            return this.call;
        }

        /**
         * @return cdr
         */
        public Long getCdr() {
            return this.cdr;
        }

        /**
         * @return chat
         */
        public Long getChat() {
            return this.chat;
        }

        /**
         * @return otherData
         */
        public Long getOtherData() {
            return this.otherData;
        }

        /**
         * @return record
         */
        public Long getRecord() {
            return this.record;
        }

        /**
         * @return recordDownload
         */
        public Long getRecordDownload() {
            return this.recordDownload;
        }

        /**
         * @return sms
         */
        public Long getSms() {
            return this.sms;
        }

        /**
         * @return taskInventory
         */
        public Long getTaskInventory() {
            return this.taskInventory;
        }

        /**
         * @return transfer
         */
        public Long getTransfer() {
            return this.transfer;
        }

        public static final class Builder {
            private Long asr; 
            private Long call; 
            private Long cdr; 
            private Long chat; 
            private Long otherData; 
            private Long record; 
            private Long recordDownload; 
            private Long sms; 
            private Long taskInventory; 
            private Long transfer; 

            private Builder() {
            } 

            private Builder(Permission model) {
                this.asr = model.asr;
                this.call = model.call;
                this.cdr = model.cdr;
                this.chat = model.chat;
                this.otherData = model.otherData;
                this.record = model.record;
                this.recordDownload = model.recordDownload;
                this.sms = model.sms;
                this.taskInventory = model.taskInventory;
                this.transfer = model.transfer;
            } 

            /**
             * <p>语音转写，0: 关闭；1: 呼入开启；2 外呼开启；3 全部开启；默认值为 0</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder asr(Long asr) {
                this.asr = asr;
                return this;
            }

            /**
             * <p>外呼权限，0:关闭；1: 无限制；2: 国内长途；3: 国内本地</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder call(Long call) {
                this.call = call;
                return this;
            }

            /**
             * <p>通话记录查看权限，1: 全部；2: 所属队列；3: 本座席</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cdr(Long cdr) {
                this.cdr = cdr;
                return this;
            }

            /**
             * <p>在线客服查看会话记录权限 ，0：全部、1：所属队列、2：本座席； 默认值为 0</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chat(Long chat) {
                this.chat = chat;
                return this;
            }

            /**
             * <p>其他数据查看权限：1：全部 2：所属员工组 3：自己 4:指定员工组 ,默认所属员工组</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder otherData(Long otherData) {
                this.otherData = otherData;
                return this;
            }

            /**
             * <p>通话录音权限，0: 关闭；1: 呼入；2: 外呼；3: 全部</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder record(Long record) {
                this.record = record;
                return this;
            }

            /**
             * <p>录音试听下载权限， 0: 关闭；1: 试听；2: 试听下载</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder recordDownload(Long recordDownload) {
                this.recordDownload = recordDownload;
                return this;
            }

            /**
             * <p>短信发送权限，0: 关闭；1: 开启。默认值为 0</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sms(Long sms) {
                this.sms = sms;
                return this;
            }

            /**
             * <p>外呼任务查看权限，1：全部 3：自己，默认全部</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskInventory(Long taskInventory) {
                this.taskInventory = taskInventory;
                return this;
            }

            /**
             * <p>通话转移/咨询权限，可选范围，0：全部，1：所属员工组, 默认所属员工组</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder transfer(Long transfer) {
                this.transfer = transfer;
                return this;
            }

            public Permission build() {
                return new Permission(this);
            } 

        } 

    }
}
