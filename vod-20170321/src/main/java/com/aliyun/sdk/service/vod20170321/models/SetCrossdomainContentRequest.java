// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCrossdomainContentRequest} extends {@link RequestModel}
 *
 * <p>SetCrossdomainContentRequest</p>
 */
public class SetCrossdomainContentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRealOwnerId")
    private String resourceRealOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageLocation;

    private SetCrossdomainContentRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceRealOwnerId = builder.resourceRealOwnerId;
        this.storageLocation = builder.storageLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCrossdomainContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
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
    public String getOwnerId() {
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
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return resourceRealOwnerId
     */
    public String getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    /**
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
    }

    public static final class Builder extends Request.Builder<SetCrossdomainContentRequest, Builder> {
        private String content; 
        private String ownerAccount; 
        private String ownerId; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 
        private String resourceRealOwnerId; 
        private String storageLocation; 

        private Builder() {
            super();
        } 

        private Builder(SetCrossdomainContentRequest request) {
            super(request);
            this.content = request.content;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceRealOwnerId = request.resourceRealOwnerId;
            this.storageLocation = request.storageLocation;
        } 

        /**
         * The content of the cross-domain policy file. The file must be in the XML format and can contain up to 2,048 characters.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
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
        public Builder ownerId(String ownerId) {
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
        public Builder resourceOwnerId(String resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the resource owner.
         */
        public Builder resourceRealOwnerId(String resourceRealOwnerId) {
            this.putQueryParameter("ResourceRealOwnerId", resourceRealOwnerId);
            this.resourceRealOwnerId = resourceRealOwnerId;
            return this;
        }

        /**
         * The URL of the Object Storage Service (OSS) bucket.
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
            return this;
        }

        @Override
        public SetCrossdomainContentRequest build() {
            return new SetCrossdomainContentRequest(this);
        } 

    } 

}
