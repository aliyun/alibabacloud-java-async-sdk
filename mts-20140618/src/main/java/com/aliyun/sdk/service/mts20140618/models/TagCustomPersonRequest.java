// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TagCustomPersonRequest} extends {@link RequestModel}
 *
 * <p>TagCustomPersonRequest</p>
 */
public class TagCustomPersonRequest extends Request {
    @Query
    @NameInMap("CategoryDescription")
    private String categoryDescription;

    @Query
    @NameInMap("CategoryId")
    private String categoryId;

    @Query
    @NameInMap("CategoryName")
    private String categoryName;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PersonDescription")
    private String personDescription;

    @Query
    @NameInMap("PersonId")
    private String personId;

    @Query
    @NameInMap("PersonName")
    private String personName;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
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

        private Builder(TagCustomPersonRequest response) {
            super(response);
            this.categoryDescription = response.categoryDescription;
            this.categoryId = response.categoryId;
            this.categoryName = response.categoryName;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.personDescription = response.personDescription;
            this.personId = response.personId;
            this.personName = response.personName;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
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
