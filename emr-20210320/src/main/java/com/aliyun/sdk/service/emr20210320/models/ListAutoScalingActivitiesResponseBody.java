// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAutoScalingActivitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAutoScalingActivitiesResponseBody</p>
 */
public class ListAutoScalingActivitiesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingActivities")
    private java.util.List < ScalingActivities> scalingActivities;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAutoScalingActivitiesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.scalingActivities = builder.scalingActivities;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAutoScalingActivitiesResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingActivities
     */
    public java.util.List < ScalingActivities> getScalingActivities() {
        return this.scalingActivities;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < ScalingActivities> scalingActivities; 
        private Integer totalCount; 

        /**
         * 本次请求所返回的最大记录条数。
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 返回读取到的数据位置，空代表数据已经读取完毕。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScalingActivities.
         */
        public Builder scalingActivities(java.util.List < ScalingActivities> scalingActivities) {
            this.scalingActivities = scalingActivities;
            return this;
        }

        /**
         * 本次请求条件下的数据总量。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAutoScalingActivitiesResponseBody build() {
            return new ListAutoScalingActivitiesResponseBody(this);
        } 

    } 

    public static class ScalingActivities extends TeaModel {
        @NameInMap("ActivityId")
        private String activityId;

        @NameInMap("ActivityState")
        private String activityState;

        @NameInMap("ActivityType")
        private String activityType;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExpectNum")
        private Integer expectNum;

        @NameInMap("NodeGroupId")
        private String nodeGroupId;

        @NameInMap("NodeGroupName")
        private String nodeGroupName;

        @NameInMap("OperationId")
        private String operationId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("StartTime")
        private Long startTime;

        private ScalingActivities(Builder builder) {
            this.activityId = builder.activityId;
            this.activityState = builder.activityState;
            this.activityType = builder.activityType;
            this.clusterId = builder.clusterId;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.expectNum = builder.expectNum;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeGroupName = builder.nodeGroupName;
            this.operationId = builder.operationId;
            this.ruleName = builder.ruleName;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingActivities create() {
            return builder().build();
        }

        /**
         * @return activityId
         */
        public String getActivityId() {
            return this.activityId;
        }

        /**
         * @return activityState
         */
        public String getActivityState() {
            return this.activityState;
        }

        /**
         * @return activityType
         */
        public String getActivityType() {
            return this.activityType;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return expectNum
         */
        public Integer getExpectNum() {
            return this.expectNum;
        }

        /**
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return nodeGroupName
         */
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String activityId; 
            private String activityState; 
            private String activityType; 
            private String clusterId; 
            private String description; 
            private Long endTime; 
            private Integer expectNum; 
            private String nodeGroupId; 
            private String nodeGroupName; 
            private String operationId; 
            private String ruleName; 
            private Long startTime; 

            /**
             * 伸缩活动ID。
             */
            public Builder activityId(String activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * 伸缩活动状态。取值范围：
             * <p>
             * - REJECTED：拒绝
             * - SUCCESSFUL：成功
             * - FAILED：失败
             * - IN_PROGRESS：进行中
             */
            public Builder activityState(String activityState) {
                this.activityState = activityState;
                return this;
            }

            /**
             * 伸缩活动类型。取值范围：
             * <p>
             * - SCALE_IN：缩容
             * - SCALE_OUT：扩容
             */
            public Builder activityType(String activityType) {
                this.activityType = activityType;
                return this;
            }

            /**
             * 集群ID。
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * 伸缩活动描述。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 伸缩结束时间。
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 本次扩缩数量。
             */
            public Builder expectNum(Integer expectNum) {
                this.expectNum = expectNum;
                return this;
            }

            /**
             * 节点组ID。
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * 节点组名称。
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            /**
             * 操作ID。
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * 伸缩规则名称。
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * 伸缩启动时间。
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public ScalingActivities build() {
                return new ScalingActivities(this);
            } 

        } 

    }
}
