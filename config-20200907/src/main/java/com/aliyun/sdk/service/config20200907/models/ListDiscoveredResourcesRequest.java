// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListDiscoveredResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListDiscoveredResourcesRequest</p>
 */
public class ListDiscoveredResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUpdateTimestamp")
    private Long endUpdateTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeResourceTypes")
    private String excludeResourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regions")
    private String regions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDeleted")
    private Integer resourceDeleted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private String resourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartUpdateTimestamp")
    private Long startUpdateTimestamp;

    private ListDiscoveredResourcesRequest(Builder builder) {
        super(builder);
        this.endUpdateTimestamp = builder.endUpdateTimestamp;
        this.excludeResourceTypes = builder.excludeResourceTypes;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regions = builder.regions;
        this.resourceDeleted = builder.resourceDeleted;
        this.resourceId = builder.resourceId;
        this.resourceTypes = builder.resourceTypes;
        this.startUpdateTimestamp = builder.startUpdateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDiscoveredResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUpdateTimestamp
     */
    public Long getEndUpdateTimestamp() {
        return this.endUpdateTimestamp;
    }

    /**
     * @return excludeResourceTypes
     */
    public String getExcludeResourceTypes() {
        return this.excludeResourceTypes;
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
     * @return regions
     */
    public String getRegions() {
        return this.regions;
    }

    /**
     * @return resourceDeleted
     */
    public Integer getResourceDeleted() {
        return this.resourceDeleted;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return startUpdateTimestamp
     */
    public Long getStartUpdateTimestamp() {
        return this.startUpdateTimestamp;
    }

    public static final class Builder extends Request.Builder<ListDiscoveredResourcesRequest, Builder> {
        private Long endUpdateTimestamp; 
        private String excludeResourceTypes; 
        private Integer maxResults; 
        private String nextToken; 
        private String regions; 
        private Integer resourceDeleted; 
        private String resourceId; 
        private String resourceTypes; 
        private Long startUpdateTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(ListDiscoveredResourcesRequest request) {
            super(request);
            this.endUpdateTimestamp = request.endUpdateTimestamp;
            this.excludeResourceTypes = request.excludeResourceTypes;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regions = request.regions;
            this.resourceDeleted = request.resourceDeleted;
            this.resourceId = request.resourceId;
            this.resourceTypes = request.resourceTypes;
            this.startUpdateTimestamp = request.startUpdateTimestamp;
        } 

        /**
         * <p>The end time of the time range for querying resources. The value is a timestamp in the UTC format. When you specify this parameter, take note of the following limits:</p>
         * <ul>
         * <li>The value must be a timestamp in milliseconds.</li>
         * <li>The value cannot be less than the value of the StartUpdateTimestamp parameter. The interval between the value and the value of the StartUpdateTimestamp parameter must be less than or equal to 30 days.</li>
         * <li>The StartUpdateTimestamp and EndUpdateTimestamp parameters must be specified at the same time or left empty at the same time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1724947200000</p>
         */
        public Builder endUpdateTimestamp(Long endUpdateTimestamp) {
            this.putQueryParameter("EndUpdateTimestamp", endUpdateTimestamp);
            this.endUpdateTimestamp = endUpdateTimestamp;
            return this;
        }

        /**
         * <p>The types of resources that are excluded. Separate multiple values with commas (,). If this parameter conflicts with the ResourceTypes parameter, this parameter prevails.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance,ACS::ECS::NetworkInterface</p>
         */
        public Builder excludeResourceTypes(String excludeResourceTypes) {
            this.putQueryParameter("ExcludeResourceTypes", excludeResourceTypes);
            this.excludeResourceTypes = excludeResourceTypes;
            return this;
        }

        /**
         * <p>The maximum number of entries returned for a single request. Valid values: 1 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The <code>token</code> that you want to use to initiate the current request. If the response of the previous request is truncated, you can use this token to initiate another request and obtain the remaining entries.</p>
         * 
         * <strong>example:</strong>
         * <p>IWBjqMYSy0is7zSMGu16****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the region where the resource resides. Separate multiple region IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regions(String regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * <p>The status of the resource. Valid values:</p>
         * <ul>
         * <li>0: The resource is deleted. If a resource is deleted from the desired cloud service, <strong>Deleted</strong> is displayed in the resource list in the Cloud Config console.</li>
         * <li>1 (default): The resource is retained. If a resource is managed as expected, <strong>Active</strong> is displayed in the resource list in the Cloud Config console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder resourceDeleted(Integer resourceDeleted) {
            this.putQueryParameter("ResourceDeleted", resourceDeleted);
            this.resourceDeleted = resourceDeleted;
            return this;
        }

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-hp31cqoba96jagtz****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The type of the resource. Separate multiple resource types with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::NetworkInterface</p>
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * <p>The start time of the time range for querying resources. The value is a timestamp in the UTC format. When you specify this parameter, take note of the following limits:</p>
         * <ul>
         * <li>The value must be a timestamp in milliseconds.</li>
         * <li>The value cannot be greater than the value of the EndUpdateTimestamp parameter. The interval between the value and the value of the EndUpdateTimestamp parameter must be less than or equal to 30 days.</li>
         * <li>The StartUpdateTimestamp and EndUpdateTimestamp parameters must be specified at the same time or left blank at the same time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1722441600000</p>
         */
        public Builder startUpdateTimestamp(Long startUpdateTimestamp) {
            this.putQueryParameter("StartUpdateTimestamp", startUpdateTimestamp);
            this.startUpdateTimestamp = startUpdateTimestamp;
            return this;
        }

        @Override
        public ListDiscoveredResourcesRequest build() {
            return new ListDiscoveredResourcesRequest(this);
        } 

    } 

}
