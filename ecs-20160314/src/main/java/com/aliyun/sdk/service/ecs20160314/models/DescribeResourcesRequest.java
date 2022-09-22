// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourcesRequest</p>
 */
public class DescribeResourcesRequest extends Request {
    @Query
    @NameInMap("Filter")
    private java.util.List < Filter> filter;

    @Query
    @NameInMap("Global")
    private String global;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("Marker")
    private String marker;

    @Query
    @NameInMap("MaxItems")
    @Validation(maximum = 100, minimum = 10)
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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

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
    @NameInMap("TagFilter")
    private java.util.List < TagFilter> tagFilter;

    @Query
    @NameInMap("TemplateTag")
    private java.util.List < TemplateTag> templateTag;

    private DescribeResourcesRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.global = builder.global;
        this.keyword = builder.keyword;
        this.marker = builder.marker;
        this.maxItems = builder.maxItems;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.product = builder.product;
        this.regionId = builder.regionId;
        this.regionNo = builder.regionNo;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.tagFilter = builder.tagFilter;
        this.templateTag = builder.templateTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public java.util.List < Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return global
     */
    public String getGlobal() {
        return this.global;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return tagFilter
     */
    public java.util.List < TagFilter> getTagFilter() {
        return this.tagFilter;
    }

    /**
     * @return templateTag
     */
    public java.util.List < TemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    public static final class Builder extends Request.Builder<DescribeResourcesRequest, Builder> {
        private java.util.List < Filter> filter; 
        private String global; 
        private String keyword; 
        private String marker; 
        private Integer maxItems; 
        private String ownerAccount; 
        private Long ownerId; 
        private String product; 
        private String regionId; 
        private String regionNo; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private java.util.List < TagFilter> tagFilter; 
        private java.util.List < TemplateTag> templateTag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourcesRequest request) {
            super(request);
            this.filter = request.filter;
            this.global = request.global;
            this.keyword = request.keyword;
            this.marker = request.marker;
            this.maxItems = request.maxItems;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.product = request.product;
            this.regionId = request.regionId;
            this.regionNo = request.regionNo;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
            this.tagFilter = request.tagFilter;
            this.templateTag = request.templateTag;
        } 

        /**
         * Filter.
         */
        public Builder filter(java.util.List < Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
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
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * TagFilter.
         */
        public Builder tagFilter(java.util.List < TagFilter> tagFilter) {
            this.putQueryParameter("TagFilter", tagFilter);
            this.tagFilter = tagFilter;
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
        public DescribeResourcesRequest build() {
            return new DescribeResourcesRequest(this);
        } 

    } 

    public static class Filter extends TeaModel {
        @NameInMap("AttributeName")
        @Validation(required = true)
        private String attributeName;

        @NameInMap("AttributeValue")
        @Validation(required = true)
        private String attributeValue;

        @NameInMap("Operation")
        @Validation(required = true)
        private String operation;

        private Filter(Builder builder) {
            this.attributeName = builder.attributeName;
            this.attributeValue = builder.attributeValue;
            this.operation = builder.operation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
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
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        public static final class Builder {
            private String attributeName; 
            private String attributeValue; 
            private String operation; 

            /**
             * AttributeName.
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * AttributeValue.
             */
            public Builder attributeValue(String attributeValue) {
                this.attributeValue = attributeValue;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
    public static class TagFilter extends TeaModel {
        @NameInMap("Operation")
        @Validation(required = true)
        private String operation;

        @NameInMap("TagKey")
        @Validation(required = true)
        private String tagKey;

        @NameInMap("TagValues")
        private java.util.List < String > tagValues;

        private TagFilter(Builder builder) {
            this.operation = builder.operation;
            this.tagKey = builder.tagKey;
            this.tagValues = builder.tagValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagFilter create() {
            return builder().build();
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValues
         */
        public java.util.List < String > getTagValues() {
            return this.tagValues;
        }

        public static final class Builder {
            private String operation; 
            private String tagKey; 
            private java.util.List < String > tagValues; 

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValues.
             */
            public Builder tagValues(java.util.List < String > tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            public TagFilter build() {
                return new TagFilter(this);
            } 

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
