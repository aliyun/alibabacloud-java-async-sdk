// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTagRequest} extends {@link RequestModel}
 *
 * <p>ModifyTagRequest</p>
 */
public class ModifyTagRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TagDescription")
    private String tagDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer tagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagName;

    private ModifyTagRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tagDescription = builder.tagDescription;
        this.tagId = builder.tagId;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return tagDescription
     */
    public String getTagDescription() {
        return this.tagDescription;
    }

    /**
     * @return tagId
     */
    public Integer getTagId() {
        return this.tagId;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<ModifyTagRequest, Builder> {
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tagDescription; 
        private Integer tagId; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTagRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tagDescription = request.tagDescription;
            this.tagId = request.tagId;
            this.tagName = request.tagName;
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
         * TagDescription.
         */
        public Builder tagDescription(String tagDescription) {
            this.putQueryParameter("TagDescription", tagDescription);
            this.tagDescription = tagDescription;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(Integer tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * TagName.
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        @Override
        public ModifyTagRequest build() {
            return new ModifyTagRequest(this);
        } 

    } 

}
