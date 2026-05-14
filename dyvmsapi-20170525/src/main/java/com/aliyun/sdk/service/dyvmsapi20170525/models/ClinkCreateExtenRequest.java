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
 * {@link ClinkCreateExtenRequest} extends {@link RequestModel}
 *
 * <p>ClinkCreateExtenRequest</p>
 */
public class ClinkCreateExtenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Allow")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long allow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AreaCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String areaCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtenNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extenNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDirect")
    private Long isDirect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JittBuffer")
    private Long jittBuffer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

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

    private ClinkCreateExtenRequest(Builder builder) {
        super(builder);
        this.allow = builder.allow;
        this.areaCode = builder.areaCode;
        this.enterpriseId = builder.enterpriseId;
        this.extenNumber = builder.extenNumber;
        this.isDirect = builder.isDirect;
        this.jittBuffer = builder.jittBuffer;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkCreateExtenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allow
     */
    public Long getAllow() {
        return this.allow;
    }

    /**
     * @return areaCode
     */
    public String getAreaCode() {
        return this.areaCode;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return extenNumber
     */
    public String getExtenNumber() {
        return this.extenNumber;
    }

    /**
     * @return isDirect
     */
    public Long getIsDirect() {
        return this.isDirect;
    }

    /**
     * @return jittBuffer
     */
    public Long getJittBuffer() {
        return this.jittBuffer;
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

    public static final class Builder extends Request.Builder<ClinkCreateExtenRequest, Builder> {
        private Long allow; 
        private String areaCode; 
        private Long enterpriseId; 
        private String extenNumber; 
        private Long isDirect; 
        private Long jittBuffer; 
        private Long ownerId; 
        private String password; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long type; 

        private Builder() {
            super();
        } 

        private Builder(ClinkCreateExtenRequest request) {
            super(request);
            this.allow = request.allow;
            this.areaCode = request.areaCode;
            this.enterpriseId = request.enterpriseId;
            this.extenNumber = request.extenNumber;
            this.isDirect = request.isDirect;
            this.jittBuffer = request.jittBuffer;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.type = request.type;
        } 

        /**
         * <p>语音编码。 IP话机支持的语音编码：1、2、3、4、5 软电话支持的语音编码：5、6 1：g729(已弃用) 2：g729,alaw,ulaw 3：alaw,ulaw,g729 4：myopus,alaw,ulaw,g729 5：alaw,ulaw 6：myopus,alaw,ulaw</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder allow(Long allow) {
            this.putQueryParameter("Allow", allow);
            this.allow = allow;
            return this;
        }

        /**
         * <p>话机区号。以 0 开头 3-4 位数字</p>
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
         * <p>话机号码。3-6 位数字，要求唯一</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12235</p>
         */
        public Builder extenNumber(String extenNumber) {
            this.putQueryParameter("ExtenNumber", extenNumber);
            this.extenNumber = extenNumber;
            return this;
        }

        /**
         * <p>是否允许主叫外呼，1：允许；0：不允许。话机类型为IP话机时，可以开启主叫外呼功能，直接通过IP话机进行外呼。若要使用主叫外呼功能，需要开启企业级开关。</p>
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
         * <p>网络防抖，0：关闭；1：开启，默认关闭，当开启时，语音编码类型默认为5</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        public Builder jittBuffer(Long jittBuffer) {
            this.putQueryParameter("JittBuffer", jittBuffer);
            this.jittBuffer = jittBuffer;
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
         * <p>话机密码，密码规则参见企业配置</p>
         * <p>This parameter is required.</p>
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
         * <p>话机类型。1: IP话机， 2: 软电话</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Long type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ClinkCreateExtenRequest build() {
            return new ClinkCreateExtenRequest(this);
        } 

    } 

}
