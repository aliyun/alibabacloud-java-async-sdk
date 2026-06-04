// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListMetaEntitiesRequest} extends {@link RequestModel}
 *
 * <p>ListMetaEntitiesRequest</p>
 */
public class ListMetaEntitiesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AttributeFilters")
    private java.util.List<AttributeFilters> attributeFilters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomAttributeFilters")
    private java.util.List<CustomAttributeFilters> customAttributeFilters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private ListMetaEntitiesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.attributeFilters = builder.attributeFilters;
        this.comment = builder.comment;
        this.customAttributeFilters = builder.customAttributeFilters;
        this.entityType = builder.entityType;
        this.maxResults = builder.maxResults;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaEntitiesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return attributeFilters
     */
    public java.util.List<AttributeFilters> getAttributeFilters() {
        return this.attributeFilters;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return customAttributeFilters
     */
    public java.util.List<CustomAttributeFilters> getCustomAttributeFilters() {
        return this.customAttributeFilters;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<ListMetaEntitiesRequest, Builder> {
        private String regionId; 
        private java.util.List<AttributeFilters> attributeFilters; 
        private String comment; 
        private java.util.List<CustomAttributeFilters> customAttributeFilters; 
        private String entityType; 
        private Integer maxResults; 
        private String name; 
        private String nextToken; 
        private String order; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(ListMetaEntitiesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.attributeFilters = request.attributeFilters;
            this.comment = request.comment;
            this.customAttributeFilters = request.customAttributeFilters;
            this.entityType = request.entityType;
            this.maxResults = request.maxResults;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.sortBy = request.sortBy;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AttributeFilters.
         */
        public Builder attributeFilters(java.util.List<AttributeFilters> attributeFilters) {
            String attributeFiltersShrink = shrink(attributeFilters, "AttributeFilters", "json");
            this.putBodyParameter("AttributeFilters", attributeFiltersShrink);
            this.attributeFilters = attributeFilters;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * CustomAttributeFilters.
         */
        public Builder customAttributeFilters(java.util.List<CustomAttributeFilters> customAttributeFilters) {
            String customAttributeFiltersShrink = shrink(customAttributeFilters, "CustomAttributeFilters", "json");
            this.putBodyParameter("CustomAttributeFilters", customAttributeFiltersShrink);
            this.customAttributeFilters = customAttributeFilters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom_entity-customer_api</p>
         */
        public Builder entityType(String entityType) {
            this.putBodyParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putBodyParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public ListMetaEntitiesRequest build() {
            return new ListMetaEntitiesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListMetaEntitiesRequest} extends {@link TeaModel}
     *
     * <p>ListMetaEntitiesRequest</p>
     */
    public static class AttributeFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private AttributeFilters(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeFilters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(AttributeFilters model) {
                this.key = model.key;
                this.values = model.values;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public AttributeFilters build() {
                return new AttributeFilters(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMetaEntitiesRequest} extends {@link TeaModel}
     *
     * <p>ListMetaEntitiesRequest</p>
     */
    public static class CustomAttributeFilters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private CustomAttributeFilters(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomAttributeFilters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(CustomAttributeFilters model) {
                this.key = model.key;
                this.values = model.values;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>custom_attr_1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public CustomAttributeFilters build() {
                return new CustomAttributeFilters(this);
            } 

        } 

    }
}
