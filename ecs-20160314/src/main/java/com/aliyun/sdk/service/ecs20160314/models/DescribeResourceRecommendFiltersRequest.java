// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceRecommendFiltersRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceRecommendFiltersRequest</p>
 */
public class DescribeResourceRecommendFiltersRequest extends Request {
    @Query
    @NameInMap("AttributeName")
    private String attributeName;

    @Query
    @NameInMap("AttributeValue")
    @Validation(required = true)
    private String attributeValue;

    @Query
    @NameInMap("Global")
    private String global;

    @Query
    @NameInMap("MaxItems")
    @Validation(maximum = 100)
    private Integer maxItems;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RegionNo")
    private String regionNo;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("TemplateTag")
    private java.util.List < TemplateTag> templateTag;

    private DescribeResourceRecommendFiltersRequest(Builder builder) {
        super(builder);
        this.attributeName = builder.attributeName;
        this.attributeValue = builder.attributeValue;
        this.global = builder.global;
        this.maxItems = builder.maxItems;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.product = builder.product;
        this.regionId = builder.regionId;
        this.regionNo = builder.regionNo;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.templateTag = builder.templateTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceRecommendFiltersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributeName
     */
    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * @return attributeValue
     */
    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * @return global
     */
    public String getGlobal() {
        return this.global;
    }

    /**
     * @return maxItems
     */
    public Integer getMaxItems() {
        return this.maxItems;
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
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return templateTag
     */
    public java.util.List < TemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    public static final class Builder extends Request.Builder<DescribeResourceRecommendFiltersRequest, Builder> {
        private String attributeName; 
        private String attributeValue; 
        private String global; 
        private Integer maxItems; 
        private String ownerAccount; 
        private Long ownerId; 
        private String product; 
        private String regionId; 
        private String regionNo; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private java.util.List < TemplateTag> templateTag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceRecommendFiltersRequest response) {
            super(response);
            this.attributeName = response.attributeName;
            this.attributeValue = response.attributeValue;
            this.global = response.global;
            this.maxItems = response.maxItems;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.product = response.product;
            this.regionId = response.regionId;
            this.regionNo = response.regionNo;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.resourceType = response.resourceType;
            this.templateTag = response.templateTag;
        } 

        /**
         * AttributeName.
         */
        public Builder attributeName(String attributeName) {
            this.putQueryParameter("AttributeName", attributeName);
            this.attributeName = attributeName;
            return this;
        }

        /**
         * AttributeValue.
         */
        public Builder attributeValue(String attributeValue) {
            this.putQueryParameter("AttributeValue", attributeValue);
            this.attributeValue = attributeValue;
            return this;
        }

        /**
         * Global.
         */
        public Builder global(String global) {
            this.putQueryParameter("Global", global);
            this.global = global;
            return this;
        }

        /**
         * MaxItems.
         */
        public Builder maxItems(Integer maxItems) {
            this.putQueryParameter("MaxItems", maxItems);
            this.maxItems = maxItems;
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
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
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
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * TemplateTag.
         */
        public Builder templateTag(java.util.List < TemplateTag> templateTag) {
            this.putQueryParameter("TemplateTag", templateTag);
            this.templateTag = templateTag;
            return this;
        }

        @Override
        public DescribeResourceRecommendFiltersRequest build() {
            return new DescribeResourceRecommendFiltersRequest(this);
        } 

    } 

    public static class TemplateTag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private TemplateTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateTag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TemplateTag build() {
                return new TemplateTag(this);
            } 

        } 

    }
}
