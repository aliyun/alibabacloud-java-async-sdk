// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link DescribeResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourcesRequest</p>
 */
public class DescribeResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataRedundancyType")
    private String dataRedundancyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailedRuleTemplate")
    private String failedRuleTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceArn")
    private String resourceArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceCategoryId")
    private String resourceCategoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerIds")
    private java.util.List<Long> resourceOwnerIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    private String resourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageClass")
    private String storageClass;

    private DescribeResourcesRequest(Builder builder) {
        super(builder);
        this.dataRedundancyType = builder.dataRedundancyType;
        this.failedRuleTemplate = builder.failedRuleTemplate;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceArn = builder.resourceArn;
        this.resourceCategoryId = builder.resourceCategoryId;
        this.resourceId = builder.resourceId;
        this.resourceOwnerIds = builder.resourceOwnerIds;
        this.resourceRegionId = builder.resourceRegionId;
        this.resourceType = builder.resourceType;
        this.sortBy = builder.sortBy;
        this.sortOrder = builder.sortOrder;
        this.storageClass = builder.storageClass;
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
     * @return dataRedundancyType
     */
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    /**
     * @return failedRuleTemplate
     */
    public String getFailedRuleTemplate() {
        return this.failedRuleTemplate;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return resourceArn
     */
    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * @return resourceCategoryId
     */
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceOwnerIds
     */
    public java.util.List<Long> getResourceOwnerIds() {
        return this.resourceOwnerIds;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder extends Request.Builder<DescribeResourcesRequest, Builder> {
        private String dataRedundancyType; 
        private String failedRuleTemplate; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceArn; 
        private String resourceCategoryId; 
        private String resourceId; 
        private java.util.List<Long> resourceOwnerIds; 
        private String resourceRegionId; 
        private String resourceType; 
        private String sortBy; 
        private String sortOrder; 
        private String storageClass; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourcesRequest request) {
            super(request);
            this.dataRedundancyType = request.dataRedundancyType;
            this.failedRuleTemplate = request.failedRuleTemplate;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceArn = request.resourceArn;
            this.resourceCategoryId = request.resourceCategoryId;
            this.resourceId = request.resourceId;
            this.resourceOwnerIds = request.resourceOwnerIds;
            this.resourceRegionId = request.resourceRegionId;
            this.resourceType = request.resourceType;
            this.sortBy = request.sortBy;
            this.sortOrder = request.sortOrder;
            this.storageClass = request.storageClass;
        } 

        /**
         * DataRedundancyType.
         */
        public Builder dataRedundancyType(String dataRedundancyType) {
            this.putQueryParameter("DataRedundancyType", dataRedundancyType);
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }

        /**
         * FailedRuleTemplate.
         */
        public Builder failedRuleTemplate(String failedRuleTemplate) {
            this.putQueryParameter("FailedRuleTemplate", failedRuleTemplate);
            this.failedRuleTemplate = failedRuleTemplate;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ResourceArn.
         */
        public Builder resourceArn(String resourceArn) {
            this.putQueryParameter("ResourceArn", resourceArn);
            this.resourceArn = resourceArn;
            return this;
        }

        /**
         * ResourceCategoryId.
         */
        public Builder resourceCategoryId(String resourceCategoryId) {
            this.putQueryParameter("ResourceCategoryId", resourceCategoryId);
            this.resourceCategoryId = resourceCategoryId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceOwnerIds.
         */
        public Builder resourceOwnerIds(java.util.List<Long> resourceOwnerIds) {
            String resourceOwnerIdsShrink = shrink(resourceOwnerIds, "ResourceOwnerIds", "json");
            this.putQueryParameter("ResourceOwnerIds", resourceOwnerIdsShrink);
            this.resourceOwnerIds = resourceOwnerIds;
            return this;
        }

        /**
         * ResourceRegionId.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
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
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * StorageClass.
         */
        public Builder storageClass(String storageClass) {
            this.putQueryParameter("StorageClass", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        @Override
        public DescribeResourcesRequest build() {
            return new DescribeResourcesRequest(this);
        } 

    } 

}
