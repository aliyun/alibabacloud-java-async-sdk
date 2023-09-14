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
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 查询伸缩活动创建时间的结束时间戳。单位为毫秒。
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 一次获取的最大记录数。取值范围：1~100。
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 标记当前开始读取的位置，置空表示从头开始。
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 节点组ID。节点组 Id-针对 ACK 集群，此字段为空。
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * 区域ID。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 伸缩活动状态。数组元数个数N的取值范围：1~20。默认取值：
         * <p>
         * - REJECTED：拒绝。
         * - SUCCESSFUL：成功。
         * - FAILED：失败。
         * - IN_PROGRESS：进行中。
         */
        public Builder scalingActivityStates(java.util.List < String > scalingActivityStates) {
            this.putQueryParameter("ScalingActivityStates", scalingActivityStates);
            this.scalingActivityStates = scalingActivityStates;
            return this;
        }

        /**
         * 伸缩活动类型。数组元数个数N的取值范围：1~20。取值范围：
         * <p>
         * - SCALE_OUT：扩容。
         * - SCALE_IN：缩容。
         */
        public Builder scalingActivityType(String scalingActivityType) {
            this.putQueryParameter("ScalingActivityType", scalingActivityType);
            this.scalingActivityType = scalingActivityType;
            return this;
        }

        /**
         * 伸缩规则名称。
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.putQueryParameter("ScalingRuleName", scalingRuleName);
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * 查询伸缩活动创建时间的时间戳。单位为毫秒。
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
