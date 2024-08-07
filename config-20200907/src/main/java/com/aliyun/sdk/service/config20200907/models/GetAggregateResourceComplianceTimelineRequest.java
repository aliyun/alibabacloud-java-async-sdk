// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateResourceComplianceTimelineRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateResourceComplianceTimelineRequest</p>
 */
public class GetAggregateResourceComplianceTimelineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceAccountId")
    private Long resourceAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    @Deprecated
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private GetAggregateResourceComplianceTimelineRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.endTime = builder.endTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.region = builder.region;
        this.resourceAccountId = builder.resourceAccountId;
        this.resourceId = builder.resourceId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resourceType = builder.resourceType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceComplianceTimelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceAccountId
     */
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetAggregateResourceComplianceTimelineRequest, Builder> {
        private String aggregatorId; 
        private Long endTime; 
        private Integer maxResults; 
        private String nextToken; 
        private String region; 
        private Long resourceAccountId; 
        private String resourceId; 
        private Long resourceOwnerId; 
        private String resourceType; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateResourceComplianceTimelineRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.endTime = request.endTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.region = request.region;
            this.resourceAccountId = request.resourceAccountId;
            this.resourceId = request.resourceId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resourceType = request.resourceType;
            this.startTime = request.startTime;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For information about how to obtain the ID of the account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The end of the time range to query. The default value indicates the time when the GetAggregateResourceConfigurationTimeline operation is called. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The maximum number of entries returned for a single request. Valid values: 1 to 100.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The `token` that is used to initiate the next request if the response of the current request is truncated. You can use the token to initiate another request and obtain the remaining records.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the region where the resource resides.
         * <p>
         * 
         * For more information about how to obtain the ID of a region, see [ListAggregateDiscoveredResources](~~265983~~).
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the resources in the account group belong.
         * <p>
         * 
         * > You can use either the ResourceAccountId or ResourceOwnerId parameter. We recommend that you use the ResourceAccountId parameter.
         */
        public Builder resourceAccountId(Long resourceAccountId) {
            this.putQueryParameter("ResourceAccountId", resourceAccountId);
            this.resourceAccountId = resourceAccountId;
            return this;
        }

        /**
         * The resource ID.
         * <p>
         * 
         * For more information about how to query the ID of a resource, see [ListAggregateDiscoveredResources](~~265983~~).
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
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
         * The resource type.
         * <p>
         * 
         * For more information about how to obtain the type of a resource, see [ListAggregateDiscoveredResources](~~265983~~).
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The beginning of the time range to query. By default, Cloud Config retrieves the configuration changes in the last 30 days for the specified resource. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetAggregateResourceComplianceTimelineRequest build() {
            return new GetAggregateResourceComplianceTimelineRequest(this);
        } 

    } 

}
