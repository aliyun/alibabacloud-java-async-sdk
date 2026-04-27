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
 * {@link CloudBatchUpdateAgentRequest} extends {@link RequestModel}
 *
 * <p>CloudBatchUpdateAgentRequest</p>
 */
public class CloudBatchUpdateAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Active")
    private Long active;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentType")
    private Long agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AreaCode")
    private String areaCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallPower")
    private Long callPower;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cnos")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cnos;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IbRecord")
    private Long ibRecord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAsr")
    private Long isAsr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOb")
    private Long isOb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsObRemember")
    private String isObRemember;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsQualityCheck")
    private Long isQualityCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRandom")
    private String isRandom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObClid")
    private String obClid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObClidProperty")
    private String obClidProperty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObClidType")
    private Long obClidType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObRecord")
    private Long obRecord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermitObPreviewTime")
    private String permitObPreviewTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Power")
    private Long power;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebrtcUrlType")
    private Long webrtcUrlType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Wrapup")
    private Long wrapup;

    private CloudBatchUpdateAgentRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.agentType = builder.agentType;
        this.areaCode = builder.areaCode;
        this.callPower = builder.callPower;
        this.cnos = builder.cnos;
        this.comment = builder.comment;
        this.enterpriseId = builder.enterpriseId;
        this.ibRecord = builder.ibRecord;
        this.isAsr = builder.isAsr;
        this.isOb = builder.isOb;
        this.isObRemember = builder.isObRemember;
        this.isQualityCheck = builder.isQualityCheck;
        this.isRandom = builder.isRandom;
        this.name = builder.name;
        this.obClid = builder.obClid;
        this.obClidProperty = builder.obClidProperty;
        this.obClidType = builder.obClidType;
        this.obRecord = builder.obRecord;
        this.ownerId = builder.ownerId;
        this.permitObPreviewTime = builder.permitObPreviewTime;
        this.power = builder.power;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.webrtcUrlType = builder.webrtcUrlType;
        this.wrapup = builder.wrapup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudBatchUpdateAgentRequest create() {
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
     * @return agentType
     */
    public Long getAgentType() {
        return this.agentType;
    }

    /**
     * @return areaCode
     */
    public String getAreaCode() {
        return this.areaCode;
    }

    /**
     * @return callPower
     */
    public Long getCallPower() {
        return this.callPower;
    }

    /**
     * @return cnos
     */
    public String getCnos() {
        return this.cnos;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return ibRecord
     */
    public Long getIbRecord() {
        return this.ibRecord;
    }

    /**
     * @return isAsr
     */
    public Long getIsAsr() {
        return this.isAsr;
    }

    /**
     * @return isOb
     */
    public Long getIsOb() {
        return this.isOb;
    }

    /**
     * @return isObRemember
     */
    public String getIsObRemember() {
        return this.isObRemember;
    }

    /**
     * @return isQualityCheck
     */
    public Long getIsQualityCheck() {
        return this.isQualityCheck;
    }

    /**
     * @return isRandom
     */
    public String getIsRandom() {
        return this.isRandom;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return obClid
     */
    public String getObClid() {
        return this.obClid;
    }

    /**
     * @return obClidProperty
     */
    public String getObClidProperty() {
        return this.obClidProperty;
    }

    /**
     * @return obClidType
     */
    public Long getObClidType() {
        return this.obClidType;
    }

    /**
     * @return obRecord
     */
    public Long getObRecord() {
        return this.obRecord;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return permitObPreviewTime
     */
    public String getPermitObPreviewTime() {
        return this.permitObPreviewTime;
    }

    /**
     * @return power
     */
    public Long getPower() {
        return this.power;
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
     * @return webrtcUrlType
     */
    public Long getWebrtcUrlType() {
        return this.webrtcUrlType;
    }

    /**
     * @return wrapup
     */
    public Long getWrapup() {
        return this.wrapup;
    }

    public static final class Builder extends Request.Builder<CloudBatchUpdateAgentRequest, Builder> {
        private Long active; 
        private Long agentType; 
        private String areaCode; 
        private Long callPower; 
        private String cnos; 
        private String comment; 
        private Long enterpriseId; 
        private Long ibRecord; 
        private Long isAsr; 
        private Long isOb; 
        private String isObRemember; 
        private Long isQualityCheck; 
        private String isRandom; 
        private String name; 
        private String obClid; 
        private String obClidProperty; 
        private Long obClidType; 
        private Long obRecord; 
        private Long ownerId; 
        private String permitObPreviewTime; 
        private Long power; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long webrtcUrlType; 
        private Long wrapup; 

        private Builder() {
            super();
        } 

        private Builder(CloudBatchUpdateAgentRequest request) {
            super(request);
            this.active = request.active;
            this.agentType = request.agentType;
            this.areaCode = request.areaCode;
            this.callPower = request.callPower;
            this.cnos = request.cnos;
            this.comment = request.comment;
            this.enterpriseId = request.enterpriseId;
            this.ibRecord = request.ibRecord;
            this.isAsr = request.isAsr;
            this.isOb = request.isOb;
            this.isObRemember = request.isObRemember;
            this.isQualityCheck = request.isQualityCheck;
            this.isRandom = request.isRandom;
            this.name = request.name;
            this.obClid = request.obClid;
            this.obClidProperty = request.obClidProperty;
            this.obClidType = request.obClidType;
            this.obRecord = request.obRecord;
            this.ownerId = request.ownerId;
            this.permitObPreviewTime = request.permitObPreviewTime;
            this.power = request.power;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.webrtcUrlType = request.webrtcUrlType;
            this.wrapup = request.wrapup;
        } 

        /**
         * <p>是否激活；取值0或1，取值说明 0：不激活，1激活，默认激活</p>
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
         * <p>座席类型；取值1或2，取值说明 1：电话座席，2：电脑座席，默认电话座席</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder agentType(Long agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * <p>座席所属区号；区号格式</p>
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
         * <p>呼叫权限；取值说明 0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder callPower(Long callPower) {
            this.putQueryParameter("CallPower", callPower);
            this.callPower = callPower;
            return this;
        }

        /**
         * <p>座席工号列表；需要批量更新座席的工号列表，多个之间使用英文标点逗号间隔，最多支持100个座席的批量更新。例如：&quot;0001,0002,00103&quot;；座席工号，正整数，取值3-10位数字</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0001,0002,00103</p>
         */
        public Builder cnos(String cnos) {
            this.putQueryParameter("Cnos", cnos);
            this.cnos = cnos;
            return this;
        }

        /**
         * <p>备注</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder comment(String comment) {
            this.putQueryParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>呼入是否录音；取值说明 0：不录用，1：录音，默认录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ibRecord(Long ibRecord) {
            this.putQueryParameter("IbRecord", ibRecord);
            this.ibRecord = ibRecord;
            return this;
        }

        /**
         * <p>是否开启ASR转写；取值说明：0：不开启，1：开启，默认不开启</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isAsr(Long isAsr) {
            this.putQueryParameter("IsAsr", isAsr);
            this.isAsr = isAsr;
            return this;
        }

        /**
         * <p>是否允许外呼；取值说明 0：不允许，1：可以，默认允许</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isOb(Long isOb) {
            this.putQueryParameter("IsOb", isOb);
            this.isOb = isOb;
            return this;
        }

        /**
         * <p>外呼主叫记忆开关；取值说明：0：关闭 1：开启；默认开启</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isObRemember(String isObRemember) {
            this.putQueryParameter("IsObRemember", isObRemember);
            this.isObRemember = isObRemember;
            return this;
        }

        /**
         * <p>是否开启座席质检；取值说明：0：不开启，1：开启，默认开启</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isQualityCheck(Long isQualityCheck) {
            this.putQueryParameter("IsQualityCheck", isQualityCheck);
            this.isQualityCheck = isQualityCheck;
            return this;
        }

        /**
         * <p>随机外显；取值说明 0:否，1:是。当obClidType值为4时需要传值，默认值为0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isRandom(String isRandom) {
            this.putQueryParameter("IsRandom", isRandom);
            this.isRandom = isRandom;
            return this;
        }

        /**
         * <p>座席姓名；需进行UTF-8格式的URLEncode编码</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>透传号码；可传入企业中继号码或设置好的客户侧外显号码，当obClidType值为2或3时必选</p>
         * 
         * <strong>example:</strong>
         * <p>22223333</p>
         */
        public Builder obClid(String obClid) {
            this.putQueryParameter("ObClid", obClid);
            this.obClid = obClid;
            return this;
        }

        /**
         * <p>外显属性；取值：{&quot;isMatchCapital&quot;:0,&quot;areaCodeRule&quot;:1}；obClidType=4时，isMatchCapital表示是否匹配省会号码，1是 0否，areaCodeRule表示区号匹配规则，1座席区号 2客户号码区号（注意：json格式数据需要URLencode）</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;isMatchCapital&quot;:0,&quot;areaCodeRule&quot;:1}</p>
         */
        public Builder obClidProperty(String obClidProperty) {
            this.putQueryParameter("ObClidProperty", obClidProperty);
            this.obClidProperty = obClidProperty;
            return this;
        }

        /**
         * <p>外显规则；取值：1:默认 2:随机 3:按区号 4 动态外显 ，默认值为1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder obClidType(Long obClidType) {
            this.putQueryParameter("ObClidType", obClidType);
            this.obClidType = obClidType;
            return this;
        }

        /**
         * <p>外呼是否录音；取值说明 0：不录音，1：录音，默认录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder obRecord(Long obRecord) {
            this.putQueryParameter("ObRecord", obRecord);
            this.obRecord = obRecord;
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
         * <p>可外呼时间段；格式：08:00,20:00</p>
         * 
         * <strong>example:</strong>
         * <p>08:00,20:00</p>
         */
        public Builder permitObPreviewTime(String permitObPreviewTime) {
            this.putQueryParameter("PermitObPreviewTime", permitObPreviewTime);
            this.permitObPreviewTime = permitObPreviewTime;
            return this;
        }

        /**
         * <p>座席权限；取值1或0，取值说明 1：班长席，0：普通座席，默认为0 普通座席</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder power(Long power) {
            this.putQueryParameter("Power", power);
            this.power = power;
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
         * <p>webrtc软电话返回地址；取值说明：0：企业默认 1：公网域名 2：专线域名 3：公网IP 4：专线IP</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder webrtcUrlType(Long webrtcUrlType) {
            this.putQueryParameter("WebrtcUrlType", webrtcUrlType);
            this.webrtcUrlType = webrtcUrlType;
            return this;
        }

        /**
         * <p>整理时间；单位秒数，默认10秒</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder wrapup(Long wrapup) {
            this.putQueryParameter("Wrapup", wrapup);
            this.wrapup = wrapup;
            return this;
        }

        @Override
        public CloudBatchUpdateAgentRequest build() {
            return new CloudBatchUpdateAgentRequest(this);
        } 

    } 

}
