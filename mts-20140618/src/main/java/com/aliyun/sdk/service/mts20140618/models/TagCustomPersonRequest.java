// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagCustomPersonRequest} extends {@link RequestModel}
 *
 * <p>TagCustomPersonRequest</p>
 */
public class TagCustomPersonRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryDescription")
    private String categoryDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private String categoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersonDescription")
    private String personDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersonId")
    private String personId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersonName")
    private String personName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private TagCustomPersonRequest(Builder builder) {
        super(builder);
        this.categoryDescription = builder.categoryDescription;
        this.categoryId = builder.categoryId;
        this.categoryName = builder.categoryName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.personDescription = builder.personDescription;
        this.personId = builder.personId;
        this.personName = builder.personName;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagCustomPersonRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryDescription
     */
    public String getCategoryDescription() {
        return this.categoryDescription;
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
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
     * @return personDescription
     */
    public String getPersonDescription() {
        return this.personDescription;
    }

    /**
     * @return personId
     */
    public String getPersonId() {
        return this.personId;
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
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<TagCustomPersonRequest, Builder> {
        private String categoryDescription; 
        private String categoryId; 
        private String categoryName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String personDescription; 
        private String personId; 
        private String personName; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(TagCustomPersonRequest request) {
            super(request);
            this.categoryDescription = request.categoryDescription;
            this.categoryId = request.categoryId;
            this.categoryName = request.categoryName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.personDescription = request.personDescription;
            this.personId = request.personId;
            this.personName = request.personName;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * CategoryDescription.
         */
        public Builder categoryDescription(String categoryDescription) {
            this.putQueryParameter("CategoryDescription", categoryDescription);
            this.categoryDescription = categoryDescription;
            return this;
        }

        /**
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * CategoryName.
         */
        public Builder categoryName(String categoryName) {
            this.putQueryParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
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
         * PersonDescription.
         */
        public Builder personDescription(String personDescription) {
            this.putQueryParameter("PersonDescription", personDescription);
            this.personDescription = personDescription;
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
         * PersonName.
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
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public TagCustomPersonRequest build() {
            return new TagCustomPersonRequest(this);
        } 

    } 

}
