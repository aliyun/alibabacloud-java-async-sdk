// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomViewRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomViewRequest</p>
 */
public class DeleteCustomViewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomEntityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customEntityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomViewId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customViewId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DeleteCustomViewRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.customEntityId = builder.customEntityId;
        this.customGroupId = builder.customGroupId;
        this.customViewId = builder.customViewId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomViewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return customEntityId
     */
    public String getCustomEntityId() {
        return this.customEntityId;
    }

    /**
     * @return customGroupId
     */
    public String getCustomGroupId() {
        return this.customGroupId;
    }

    /**
     * @return customViewId
     */
    public String getCustomViewId() {
        return this.customViewId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
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

    public static final class Builder extends Request.Builder<DeleteCustomViewRequest, Builder> {
        private String algorithm; 
        private String customEntityId; 
        private String customGroupId; 
        private String customViewId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomViewRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.customEntityId = request.customEntityId;
            this.customGroupId = request.customGroupId;
            this.customViewId = request.customViewId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * CustomEntityId.
         */
        public Builder customEntityId(String customEntityId) {
            this.putQueryParameter("CustomEntityId", customEntityId);
            this.customEntityId = customEntityId;
            return this;
        }

        /**
         * CustomGroupId.
         */
        public Builder customGroupId(String customGroupId) {
            this.putQueryParameter("CustomGroupId", customGroupId);
            this.customGroupId = customGroupId;
            return this;
        }

        /**
         * CustomViewId.
         */
        public Builder customViewId(String customViewId) {
            this.putQueryParameter("CustomViewId", customViewId);
            this.customViewId = customViewId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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

        @Override
        public DeleteCustomViewRequest build() {
            return new DeleteCustomViewRequest(this);
        } 

    } 

}
