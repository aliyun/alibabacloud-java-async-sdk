// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAutoScalingActivitiesRequest} extends {@link RequestModel}
 *
 * <p>ListAutoScalingActivitiesRequest</p>
 */
public class ListAutoScalingActivitiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingActivityStates")
    private java.util.List < String > scalingActivityStates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingActivityType")
    private String scalingActivityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingPolicyType")
    private String scalingPolicyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
    private String scalingRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
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
        this.scalingPolicyType = builder.scalingPolicyType;
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
     * @return scalingPolicyType
     */
    public String getScalingPolicyType() {
        return this.scalingPolicyType;
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
        private String scalingPolicyType; 
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
            this.scalingPolicyType = request.scalingPolicyType;
            this.scalingRuleName = request.scalingRuleName;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The end of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1639718634819</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-869471354ecd****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The status of the scaling activity. Number of elements in the array: 1-20.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;REJECTED&quot;,&quot;SUCCESSFUL&quot;]</p>
         */
        public Builder scalingActivityStates(java.util.List < String > scalingActivityStates) {
            this.putQueryParameter("ScalingActivityStates", scalingActivityStates);
            this.scalingActivityStates = scalingActivityStates;
            return this;
        }

        /**
         * <p>The type of the scaling activity. Valid values:</p>
         * <ul>
         * <li>SCALE_OUT</li>
         * <li>SCALE_IN</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SCALE_IN</p>
         */
        public Builder scalingActivityType(String scalingActivityType) {
            this.putQueryParameter("ScalingActivityType", scalingActivityType);
            this.scalingActivityType = scalingActivityType;
            return this;
        }

        /**
         * ScalingPolicyType.
         */
        public Builder scalingPolicyType(String scalingPolicyType) {
            this.putQueryParameter("ScalingPolicyType", scalingPolicyType);
            this.scalingPolicyType = scalingPolicyType;
            return this;
        }

        /**
         * <p>The name of the scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>scale-out-by-memroy</p>
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.putQueryParameter("ScalingRuleName", scalingRuleName);
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1639714634819</p>
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
