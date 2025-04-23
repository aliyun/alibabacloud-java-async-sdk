// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link ValidPhoneCodeRequest} extends {@link RequestModel}
 *
 * <p>ValidPhoneCodeRequest</p>
 */
public class ValidPhoneCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertifyCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certifyCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ValidPhoneCodeRequest(Builder builder) {
        super(builder);
        this.certifyCode = builder.certifyCode;
        this.ownerId = builder.ownerId;
        this.phoneNo = builder.phoneNo;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidPhoneCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certifyCode
     */
    public String getCertifyCode() {
        return this.certifyCode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNo
     */
    public String getPhoneNo() {
        return this.phoneNo;
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

    public static final class Builder extends Request.Builder<ValidPhoneCodeRequest, Builder> {
        private String certifyCode; 
        private Long ownerId; 
        private String phoneNo; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ValidPhoneCodeRequest request) {
            super(request);
            this.certifyCode = request.certifyCode;
            this.ownerId = request.ownerId;
            this.phoneNo = request.phoneNo;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>验证码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder certifyCode(String certifyCode) {
            this.putQueryParameter("CertifyCode", certifyCode);
            this.certifyCode = certifyCode;
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
         * <p>手机号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>137****1234</p>
         */
        public Builder phoneNo(String phoneNo) {
            this.putQueryParameter("PhoneNo", phoneNo);
            this.phoneNo = phoneNo;
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

        @Override
        public ValidPhoneCodeRequest build() {
            return new ValidPhoneCodeRequest(this);
        } 

    } 

}
