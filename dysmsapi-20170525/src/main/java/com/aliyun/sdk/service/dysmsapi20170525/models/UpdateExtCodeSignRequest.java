// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateExtCodeSignRequest} extends {@link RequestModel}
 *
 * <p>UpdateExtCodeSignRequest</p>
 */
public class UpdateExtCodeSignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExistExtCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String existExtCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewExtCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newExtCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signName;

    private UpdateExtCodeSignRequest(Builder builder) {
        super(builder);
        this.existExtCode = builder.existExtCode;
        this.newExtCode = builder.newExtCode;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signName = builder.signName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExtCodeSignRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return existExtCode
     */
    public String getExistExtCode() {
        return this.existExtCode;
    }

    /**
     * @return newExtCode
     */
    public String getNewExtCode() {
        return this.newExtCode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    public static final class Builder extends Request.Builder<UpdateExtCodeSignRequest, Builder> {
        private String existExtCode; 
        private String newExtCode; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String signName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExtCodeSignRequest request) {
            super(request);
            this.existExtCode = request.existExtCode;
            this.newExtCode = request.newExtCode;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signName = request.signName;
        } 

        /**
         * <p>要修改的扩展码A3</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        public Builder existExtCode(String existExtCode) {
            this.putQueryParameter("ExistExtCode", existExtCode);
            this.existExtCode = existExtCode;
            return this;
        }

        /**
         * <p>修改后的扩展码A3</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>02</p>
         */
        public Builder newExtCode(String newExtCode) {
            this.putQueryParameter("NewExtCode", newExtCode);
            this.newExtCode = newExtCode;
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
         * <p>签名</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        @Override
        public UpdateExtCodeSignRequest build() {
            return new UpdateExtCodeSignRequest(this);
        } 

    } 

}
