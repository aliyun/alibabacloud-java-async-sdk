// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ScalingActivity} extends {@link TeaModel}
 *
 * <p>ScalingActivity</p>
 */
public class ScalingActivity extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cause")
    private String cause;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("EssScalingRuleId")
    private String essScalingRuleId;

    @com.aliyun.core.annotation.NameInMap("ExpectNum")
    private Integer expectNum;

    @com.aliyun.core.annotation.NameInMap("HostGroupName")
    private String hostGroupName;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    private String scalingGroupId;

    @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
    private String scalingRuleName;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalCapacity")
    private Integer totalCapacity;

    @com.aliyun.core.annotation.NameInMap("Transition")
    private String transition;

    private ScalingActivity(Builder builder) {
        this.cause = builder.cause;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.essScalingRuleId = builder.essScalingRuleId;
        this.expectNum = builder.expectNum;
        this.hostGroupName = builder.hostGroupName;
        this.id = builder.id;
        this.instanceIds = builder.instanceIds;
        this.scalingGroupId = builder.scalingGroupId;
        this.scalingRuleName = builder.scalingRuleName;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.totalCapacity = builder.totalCapacity;
        this.transition = builder.transition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingActivity create() {
        return builder().build();
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
     * @return essScalingRuleId
     */
    public String getEssScalingRuleId() {
        return this.essScalingRuleId;
    }

    /**
     * @return expectNum
     */
    public Integer getExpectNum() {
        return this.expectNum;
    }

    /**
     * @return hostGroupName
     */
    public String getHostGroupName() {
        return this.hostGroupName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
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
        private String cause; 
        private String description; 
        private Long endTime; 
        private String essScalingRuleId; 
        private Integer expectNum; 
        private String hostGroupName; 
        private String id; 
        private String instanceIds; 
        private String scalingGroupId; 
        private String scalingRuleName; 
        private Long startTime; 
        private String status; 
        private Integer totalCapacity; 
        private String transition; 

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
         * EssScalingRuleId.
         */
        public Builder essScalingRuleId(String essScalingRuleId) {
            this.essScalingRuleId = essScalingRuleId;
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
         * HostGroupName.
         */
        public Builder hostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
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
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * ScalingRuleName.
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
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

        public ScalingActivity build() {
            return new ScalingActivity(this);
        } 

    } 

}
