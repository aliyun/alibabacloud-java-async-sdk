// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateRecognitionEntityRequest} extends {@link RequestModel}
 *
 * <p>CreateRecognitionEntityRequest</p>
 */
public class CreateRecognitionEntityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityInfo")
    private String entityInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LibId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String libId;

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

    private CreateRecognitionEntityRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.entityInfo = builder.entityInfo;
        this.entityName = builder.entityName;
        this.libId = builder.libId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecognitionEntityRequest create() {
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
     * @return entityInfo
     */
    public String getEntityInfo() {
        return this.entityInfo;
    }

    /**
     * @return entityName
     */
    public String getEntityName() {
        return this.entityName;
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
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

    public static final class Builder extends Request.Builder<CreateRecognitionEntityRequest, Builder> {
        private String algorithm; 
        private String entityInfo; 
        private String entityName; 
        private String libId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRecognitionEntityRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.entityInfo = request.entityInfo;
            this.entityName = request.entityName;
            this.libId = request.libId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The type of recognition algorithm. Valid values:</p>
         * <ul>
         * <li>landmark</li>
         * <li>object</li>
         * <li>logo</li>
         * <li>face</li>
         * <li>label</li>
         * </ul>
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
         * <p>The extra information about the custom entity, provided as a JSON string. Max length: 256 bytes.</p>
         */
        public Builder entityInfo(String entityInfo) {
            this.putQueryParameter("EntityInfo", entityInfo);
            this.entityInfo = entityInfo;
            return this;
        }

        /**
         * <p>The name of the custom entity. Max length: 64 bytes.</p>
         * <p>This parameter is required.</p>
         */
        public Builder entityName(String entityName) {
            this.putQueryParameter("EntityName", entityName);
            this.entityName = entityName;
            return this;
        }

        /**
         * <p>The ID of the recognition library.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><em><strong><strong><strong><strong><strong><strong>24b47865c6</strong></strong></strong></strong></strong></strong></em>*</p>
         */
        public Builder libId(String libId) {
            this.putQueryParameter("LibId", libId);
            this.libId = libId;
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
        public CreateRecognitionEntityRequest build() {
            return new CreateRecognitionEntityRequest(this);
        } 

    } 

}
