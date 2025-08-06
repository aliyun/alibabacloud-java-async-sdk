// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link FaceRegistrationRequest} extends {@link RequestModel}
 *
 * <p>FaceRegistrationRequest</p>
 */
public class FaceRegistrationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageIds")
    private String imageIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersonId")
    private String personId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersonLibrary")
    private String personLibrary;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersonName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String personName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private String resourceOwnerId;

    private FaceRegistrationRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.imageIds = builder.imageIds;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.personId = builder.personId;
        this.personLibrary = builder.personLibrary;
        this.personName = builder.personName;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FaceRegistrationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return imageIds
     */
    public String getImageIds() {
        return this.imageIds;
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
     * @return personId
     */
    public String getPersonId() {
        return this.personId;
    }

    /**
     * @return personLibrary
     */
    public String getPersonLibrary() {
        return this.personLibrary;
    }

    /**
     * @return personName
     */
    public String getPersonName() {
        return this.personName;
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

    public static final class Builder extends Request.Builder<FaceRegistrationRequest, Builder> {
        private String category; 
        private String imageIds; 
        private String ownerAccount; 
        private String ownerId; 
        private String personId; 
        private String personLibrary; 
        private String personName; 
        private String resourceOwnerAccount; 
        private String resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(FaceRegistrationRequest request) {
            super(request);
            this.category = request.category;
            this.imageIds = request.imageIds;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.personId = request.personId;
            this.personLibrary = request.personLibrary;
            this.personName = request.personName;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * ImageIds.
         */
        public Builder imageIds(String imageIds) {
            this.putQueryParameter("ImageIds", imageIds);
            this.imageIds = imageIds;
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
         * PersonId.
         */
        public Builder personId(String personId) {
            this.putQueryParameter("PersonId", personId);
            this.personId = personId;
            return this;
        }

        /**
         * PersonLibrary.
         */
        public Builder personLibrary(String personLibrary) {
            this.putQueryParameter("PersonLibrary", personLibrary);
            this.personLibrary = personLibrary;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder personName(String personName) {
            this.putQueryParameter("PersonName", personName);
            this.personName = personName;
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

        @Override
        public FaceRegistrationRequest build() {
            return new FaceRegistrationRequest(this);
        } 

    } 

}
