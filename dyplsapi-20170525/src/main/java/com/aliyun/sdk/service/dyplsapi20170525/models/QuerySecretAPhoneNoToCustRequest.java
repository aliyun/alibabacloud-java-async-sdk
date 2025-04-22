// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link QuerySecretAPhoneNoToCustRequest} extends {@link RequestModel}
 *
 * <p>QuerySecretAPhoneNoToCustRequest</p>
 */
public class QuerySecretAPhoneNoToCustRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ANoWhiteGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long aNoWhiteGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNoA")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNoA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private QuerySecretAPhoneNoToCustRequest(Builder builder) {
        super(builder);
        this.aNoWhiteGroupId = builder.aNoWhiteGroupId;
        this.ownerId = builder.ownerId;
        this.phoneNoA = builder.phoneNoA;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySecretAPhoneNoToCustRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aNoWhiteGroupId
     */
    public Long getANoWhiteGroupId() {
        return this.aNoWhiteGroupId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNoA
     */
    public String getPhoneNoA() {
        return this.phoneNoA;
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

    public static final class Builder extends Request.Builder<QuerySecretAPhoneNoToCustRequest, Builder> {
        private Long aNoWhiteGroupId; 
        private Long ownerId; 
        private String phoneNoA; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(QuerySecretAPhoneNoToCustRequest request) {
            super(request);
            this.aNoWhiteGroupId = request.aNoWhiteGroupId;
            this.ownerId = request.ownerId;
            this.phoneNoA = request.phoneNoA;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>号码组ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        public Builder aNoWhiteGroupId(Long aNoWhiteGroupId) {
            this.putQueryParameter("ANoWhiteGroupId", aNoWhiteGroupId);
            this.aNoWhiteGroupId = aNoWhiteGroupId;
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
         * <p>A号码</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>130*****8888</p>
         */
        public Builder phoneNoA(String phoneNoA) {
            this.putQueryParameter("PhoneNoA", phoneNoA);
            this.phoneNoA = phoneNoA;
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
        public QuerySecretAPhoneNoToCustRequest build() {
            return new QuerySecretAPhoneNoToCustRequest(this);
        } 

    } 

}
