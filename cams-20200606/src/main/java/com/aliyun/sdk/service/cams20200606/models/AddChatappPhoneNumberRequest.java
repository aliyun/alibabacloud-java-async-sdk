// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link AddChatappPhoneNumberRequest} extends {@link RequestModel}
 *
 * <p>AddChatappPhoneNumberRequest</p>
 */
public class AddChatappPhoneNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cc")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreValidateId")
    @Deprecated
    private String preValidateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifiedName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifiedName;

    private AddChatappPhoneNumberRequest(Builder builder) {
        super(builder);
        this.cc = builder.cc;
        this.custSpaceId = builder.custSpaceId;
        this.ownerId = builder.ownerId;
        this.phoneNumber = builder.phoneNumber;
        this.preValidateId = builder.preValidateId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.verifiedName = builder.verifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddChatappPhoneNumberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cc
     */
    public String getCc() {
        return this.cc;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return preValidateId
     */
    public String getPreValidateId() {
        return this.preValidateId;
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
     * @return verifiedName
     */
    public String getVerifiedName() {
        return this.verifiedName;
    }

    public static final class Builder extends Request.Builder<AddChatappPhoneNumberRequest, Builder> {
        private String cc; 
        private String custSpaceId; 
        private Long ownerId; 
        private String phoneNumber; 
        private String preValidateId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String verifiedName; 

        private Builder() {
            super();
        } 

        private Builder(AddChatappPhoneNumberRequest request) {
            super(request);
            this.cc = request.cc;
            this.custSpaceId = request.custSpaceId;
            this.ownerId = request.ownerId;
            this.phoneNumber = request.phoneNumber;
            this.preValidateId = request.preValidateId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.verifiedName = request.verifiedName;
        } 

        /**
         * <p>The country code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder cc(String cc) {
            this.putQueryParameter("Cc", cc);
            this.cc = cc;
            return this;
        }

        /**
         * <p>The space ID of the ISV sub-customer.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>93928389****</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
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
         * <p>The phone number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1380000****</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>The pre-validated phone number.</p>
         * <blockquote>
         * <p><strong>[Deprecated]</strong></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1020****</p>
         */
        public Builder preValidateId(String preValidateId) {
            this.putQueryParameter("PreValidateId", preValidateId);
            this.preValidateId = preValidateId;
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
         * <p>The name of the phone number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        public Builder verifiedName(String verifiedName) {
            this.putQueryParameter("VerifiedName", verifiedName);
            this.verifiedName = verifiedName;
            return this;
        }

        @Override
        public AddChatappPhoneNumberRequest build() {
            return new AddChatappPhoneNumberRequest(this);
        } 

    } 

}
