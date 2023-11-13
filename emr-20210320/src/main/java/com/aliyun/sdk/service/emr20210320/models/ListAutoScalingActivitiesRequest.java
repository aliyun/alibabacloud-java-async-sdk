// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAutoScalingActivitiesRequest} extends {@link RequestModel}
 *
 * <p>ListAutoScalingActivitiesRequest</p>
 */
public class ListAutoScalingActivitiesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("NodeGroupId")
    private String nodeGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ScalingActivityStates")
    private java.util.List < String > scalingActivityStates;

    @Query
    @NameInMap("ScalingActivityType")
    private String scalingActivityType;

    @Query
    @NameInMap("ScalingRuleName")
    private String scalingRuleName;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    private ListAutoScalingActivitiesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.endTime = builder.endTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeGroupId = builder.nodeGroupId;
        this.regionId = builder.regionId;
        this.scalingActivityStates = builder.scalingActivityStates;
        this.scalingActivityType = builder.scalingActivityType;
        this.scalingRuleName = builder.scalingRuleName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoScalingActivitiesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scalingActivityStates
     */
    public java.util.List < String > getScalingActivityStates() {
        return this.scalingActivityStates;
    }

    /**
     * @return scalingActivityType
     */
    public String getScalingActivityType() {
        return this.scalingActivityType;
    }

    /**
     * @return scalingRuleName
     */
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAutoScalingActivitiesRequest, Builder> {
        private String clusterId; 
        private Long endTime; 
        private Integer maxResults; 
        private String nextToken; 
        private String nodeGroupId; 
        private String regionId; 
        private java.util.List < String > scalingActivityStates; 
        private String scalingActivityType; 
        private String scalingRuleName; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAutoScalingActivitiesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.endTime = request.endTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeGroupId = request.nodeGroupId;
            this.regionId = request.regionId;
            this.scalingActivityStates = request.scalingActivityStates;
            this.scalingActivityType = request.scalingActivityType;
            this.scalingRuleName = request.scalingRuleName;
            this.startTime = request.startTime;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The end of the time range to query. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the node group.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The status of the scaling activity. Number of elements in the array: 1-20.
         */
        public Builder scalingActivityStates(java.util.List < String > scalingActivityStates) {
            this.putQueryParameter("ScalingActivityStates", scalingActivityStates);
            this.scalingActivityStates = scalingActivityStates;
            return this;
        }

        /**
         * The type of the scaling activity. Valid values:
         * <p>
         * 
         * *   SCALE_OUT
         * *   SCALE_IN
         */
        public Builder scalingActivityType(String scalingActivityType) {
            this.putQueryParameter("ScalingActivityType", scalingActivityType);
            this.scalingActivityType = scalingActivityType;
            return this;
        }

        /**
         * The name of the scaling rule.
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.putQueryParameter("ScalingRuleName", scalingRuleName);
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * The beginning of the time range to query. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListAutoScalingActivitiesRequest build() {
            return new ListAutoScalingActivitiesRequest(this);
        } 

    } 

}
