// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingActivityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingActivityResponseBody</p>
 */
public class DescribeScalingActivityResponseBody extends TeaModel {
    @NameInMap("BizId")
    private String bizId;

    @NameInMap("Cause")
    private String cause;

    @NameInMap("Description")
    private String description;

    @NameInMap("EndTime")
    private Long endTime;

    @NameInMap("ExpectNum")
    private Integer expectNum;

    @NameInMap("InstanceIds")
    private String instanceIds;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingRuleId")
    private String scalingRuleId;

    @NameInMap("StartTime")
    private Long startTime;

    @NameInMap("Status")
    private String status;

    @NameInMap("TotalCapacity")
    private Integer totalCapacity;

    @NameInMap("Transition")
    private String transition;

    private DescribeScalingActivityResponseBody(Builder builder) {
        this.bizId = builder.bizId;
        this.cause = builder.cause;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.expectNum = builder.expectNum;
        this.instanceIds = builder.instanceIds;
        this.requestId = builder.requestId;
        this.scalingRuleId = builder.scalingRuleId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.totalCapacity = builder.totalCapacity;
        this.transition = builder.transition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingActivityResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return cause
     */
    public String getCause() {
        return this.cause;
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
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingRuleId
     */
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalCapacity
     */
    public Integer getTotalCapacity() {
        return this.totalCapacity;
    }

    /**
     * @return transition
     */
    public String getTransition() {
        return this.transition;
    }

    public static final class Builder {
        private String bizId; 
        private String cause; 
        private String description; 
        private Long endTime; 
        private Integer expectNum; 
        private String instanceIds; 
        private String requestId; 
        private String scalingRuleId; 
        private Long startTime; 
        private String status; 
        private Integer totalCapacity; 
        private String transition; 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * Cause.
         */
        public Builder cause(String cause) {
            this.cause = cause;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * ExpectNum.
         */
        public Builder expectNum(Integer expectNum) {
            this.expectNum = expectNum;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScalingRuleId.
         */
        public Builder scalingRuleId(String scalingRuleId) {
            this.scalingRuleId = scalingRuleId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TotalCapacity.
         */
        public Builder totalCapacity(Integer totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }

        /**
         * Transition.
         */
        public Builder transition(String transition) {
            this.transition = transition;
            return this;
        }

        public DescribeScalingActivityResponseBody build() {
            return new DescribeScalingActivityResponseBody(this);
        } 

    } 

}
