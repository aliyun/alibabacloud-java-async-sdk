// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCustomEntityRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomEntityRequest</p>
 */
public class CreateCustomEntityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomEntityInfo")
    private String customEntityInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomEntityName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customEntityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customGroupId;

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

    private CreateCustomEntityRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.customEntityInfo = builder.customEntityInfo;
        this.customEntityName = builder.customEntityName;
        this.customGroupId = builder.customGroupId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomEntityRequest create() {
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
     * @return customEntityInfo
     */
    public String getCustomEntityInfo() {
        return this.customEntityInfo;
    }

    /**
     * @return customEntityName
     */
    public String getCustomEntityName() {
        return this.customEntityName;
    }

    /**
     * @return customGroupId
     */
    public String getCustomGroupId() {
        return this.customGroupId;
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

    public static final class Builder extends Request.Builder<CreateCustomEntityRequest, Builder> {
        private String algorithm; 
        private String customEntityInfo; 
        private String customEntityName; 
        private String customGroupId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomEntityRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.customEntityInfo = request.customEntityInfo;
            this.customEntityName = request.customEntityName;
            this.customGroupId = request.customGroupId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>landmark</p>
         */
        public Builder algorithm(String algorithm) {
            this.putQueryParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * CustomEntityInfo.
         */
        public Builder customEntityInfo(String customEntityInfo) {
            this.putQueryParameter("CustomEntityInfo", customEntityInfo);
            this.customEntityInfo = customEntityInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder customEntityName(String customEntityName) {
            this.putQueryParameter("CustomEntityName", customEntityName);
            this.customEntityName = customEntityName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder customGroupId(String customGroupId) {
            this.putQueryParameter("CustomGroupId", customGroupId);
            this.customGroupId = customGroupId;
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
        public CreateCustomEntityRequest build() {
            return new CreateCustomEntityRequest(this);
        } 

    } 

}
