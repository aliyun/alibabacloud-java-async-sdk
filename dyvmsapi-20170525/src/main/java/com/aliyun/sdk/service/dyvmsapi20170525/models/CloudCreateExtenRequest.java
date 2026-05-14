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
 * {@link CloudCreateExtenRequest} extends {@link RequestModel}
 *
 * <p>CloudCreateExtenRequest</p>
 */
public class CloudCreateExtenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Allow")
    private String allow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AreaCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String areaCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallPower")
    private String callPower;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Denoise")
    private String denoise;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Exten")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exten;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IadName")
    private String iadName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IbRecord")
    private Long ibRecord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDirect")
    private Long isDirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOb")
    private String isOb;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JitterBuffer")
    private Long jitterBuffer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObRecord")
    private Long obRecord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Property")
    private String property;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long type;

    private CloudCreateExtenRequest(Builder builder) {
        super(builder);
        this.allow = builder.allow;
        this.areaCode = builder.areaCode;
        this.callPower = builder.callPower;
        this.denoise = builder.denoise;
        this.enterpriseId = builder.enterpriseId;
        this.exten = builder.exten;
        this.iadName = builder.iadName;
        this.ibRecord = builder.ibRecord;
        this.isDirect = builder.isDirect;
        this.isOb = builder.isOb;
        this.jitterBuffer = builder.jitterBuffer;
        this.obRecord = builder.obRecord;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.property = builder.property;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudCreateExtenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allow
     */
    public String getAllow() {
        return this.allow;
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
    public String getCallPower() {
        return this.callPower;
    }

    /**
     * @return denoise
     */
    public String getDenoise() {
        return this.denoise;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return exten
     */
    public String getExten() {
        return this.exten;
    }

    /**
     * @return iadName
     */
    public String getIadName() {
        return this.iadName;
    }

    /**
     * @return ibRecord
     */
    public Long getIbRecord() {
        return this.ibRecord;
    }

    /**
     * @return isDirect
     */
    public Long getIsDirect() {
        return this.isDirect;
    }

    /**
     * @return isOb
     */
    public String getIsOb() {
        return this.isOb;
    }

    /**
     * @return jitterBuffer
     */
    public Long getJitterBuffer() {
        return this.jitterBuffer;
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
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return property
     */
    public String getProperty() {
        return this.property;
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
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CloudCreateExtenRequest, Builder> {
        private String allow; 
        private String areaCode; 
        private String callPower; 
        private String denoise; 
        private Long enterpriseId; 
        private String exten; 
        private String iadName; 
        private Long ibRecord; 
        private Long isDirect; 
        private String isOb; 
        private Long jitterBuffer; 
        private Long obRecord; 
        private Long ownerId; 
        private String password; 
        private String property; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long type; 

        private Builder() {
            super();
        } 

        private Builder(CloudCreateExtenRequest request) {
            super(request);
            this.allow = request.allow;
            this.areaCode = request.areaCode;
            this.callPower = request.callPower;
            this.denoise = request.denoise;
            this.enterpriseId = request.enterpriseId;
            this.exten = request.exten;
            this.iadName = request.iadName;
            this.ibRecord = request.ibRecord;
            this.isDirect = request.isDirect;
            this.isOb = request.isOb;
            this.jitterBuffer = request.jitterBuffer;
            this.obRecord = request.obRecord;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.property = request.property;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.type = request.type;
        } 

        /**
         * <p>允许的语音编码,支持格式: 1. g729 2. g729,alaw,ulaw 3. alaw,ulaw,g729 4. alaw,ulaw 5. myopus,alaw,ulaw5. myopus,alaw,ulaw6. myopus,g729,alaw,ulaw 7. myopus,g729 公网+远程话机支持配置1/2/3;专线+远程话机支持配置1/2;公网+软电话支持配置4;专线+软电话支持配置5;</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder allow(String allow) {
            this.putQueryParameter("Allow", allow);
            this.allow = allow;
            return this;
        }

        /**
         * <p>区号</p>
         * <p>This parameter is required.</p>
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
         * <p>呼叫权限；0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder callPower(String callPower) {
            this.putQueryParameter("CallPower", callPower);
            this.callPower = callPower;
            return this;
        }

        /**
         * <p>降噪开关；0:关闭 1:开启 (该参数只有在类型为注册到webrtc才有效)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder denoise(String denoise) {
            this.putQueryParameter("Denoise", denoise);
            this.denoise = denoise;
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
         * <p>分机号,3-11位</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9000</p>
         */
        public Builder exten(String exten) {
            this.putQueryParameter("Exten", exten);
            this.exten = exten;
            return this;
        }

        /**
         * <p>iad网关；该参数只有在类型为，注册到IAD分机，才有效</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder iadName(String iadName) {
            this.putQueryParameter("IadName", iadName);
            this.iadName = iadName;
            return this;
        }

        /**
         * <p>呼入是否录音；0：不录用，1：录音，默认录音</p>
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
         * <p>是否允许摘机外呼，0：不允许，1：可以，默认允许</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isDirect(Long isDirect) {
            this.putQueryParameter("IsDirect", isDirect);
            this.isDirect = isDirect;
            return this;
        }

        /**
         * <p>是否允许外呼；0：不允许，1：可以，默认允许</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isOb(String isOb) {
            this.putQueryParameter("IsOb", isOb);
            this.isOb = isOb;
            return this;
        }

        /**
         * <p>网络防抖；0：关闭，1：开启，默认关闭</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder jitterBuffer(Long jitterBuffer) {
            this.putQueryParameter("JitterBuffer", jitterBuffer);
            this.jitterBuffer = jitterBuffer;
            return this;
        }

        /**
         * <p>外呼是否录音；0：不录音，1：录音，默认录音</p>
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
         * <p>密码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aa248236</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>属性</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder property(String property) {
            this.putQueryParameter("Property", property);
            this.property = property;
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
         * <p>类型；1. 注册到IAD分机 2.注册到webrtc 3.注册到远程话机</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder type(Long type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CloudCreateExtenRequest build() {
            return new CloudCreateExtenRequest(this);
        } 

    } 

}
