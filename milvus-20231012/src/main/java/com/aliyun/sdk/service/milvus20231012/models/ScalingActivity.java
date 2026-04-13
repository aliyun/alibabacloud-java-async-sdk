// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

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
    @com.aliyun.core.annotation.NameInMap("componentTypes")
    private String componentTypes;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("policyType")
    private String policyType;

    @com.aliyun.core.annotation.NameInMap("scalingActivityId")
    private String scalingActivityId;

    @com.aliyun.core.annotation.NameInMap("scalingActivityState")
    private String scalingActivityState;

    @com.aliyun.core.annotation.NameInMap("scalingPolicyId")
    private String scalingPolicyId;

    @com.aliyun.core.annotation.NameInMap("scalingRuleDetail")
    private String scalingRuleDetail;

    @com.aliyun.core.annotation.NameInMap("scalingRuleId")
    private String scalingRuleId;

    @com.aliyun.core.annotation.NameInMap("scalingRuleName")
    private String scalingRuleName;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("timeZone")
    private String timeZone;

    private ScalingActivity(Builder builder) {
        this.componentTypes = builder.componentTypes;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.policyType = builder.policyType;
        this.scalingActivityId = builder.scalingActivityId;
        this.scalingActivityState = builder.scalingActivityState;
        this.scalingPolicyId = builder.scalingPolicyId;
        this.scalingRuleDetail = builder.scalingRuleDetail;
        this.scalingRuleId = builder.scalingRuleId;
        this.scalingRuleName = builder.scalingRuleName;
        this.startTime = builder.startTime;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingActivity create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentTypes
     */
    public String getComponentTypes() {
        return this.componentTypes;
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
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return scalingActivityId
     */
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    /**
     * @return scalingActivityState
     */
    public String getScalingActivityState() {
        return this.scalingActivityState;
    }

    /**
     * @return scalingPolicyId
     */
    public String getScalingPolicyId() {
        return this.scalingPolicyId;
    }

    /**
     * @return scalingRuleDetail
     */
    public String getScalingRuleDetail() {
        return this.scalingRuleDetail;
    }

    /**
     * @return scalingRuleId
     */
    public String getScalingRuleId() {
        return this.scalingRuleId;
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
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder {
        private String componentTypes; 
        private String description; 
        private String endTime; 
        private String instanceId; 
        private String policyType; 
        private String scalingActivityId; 
        private String scalingActivityState; 
        private String scalingPolicyId; 
        private String scalingRuleDetail; 
        private String scalingRuleId; 
        private String scalingRuleName; 
        private String startTime; 
        private String timeZone; 

        private Builder() {
        } 

        private Builder(ScalingActivity model) {
            this.componentTypes = model.componentTypes;
            this.description = model.description;
            this.endTime = model.endTime;
            this.instanceId = model.instanceId;
            this.policyType = model.policyType;
            this.scalingActivityId = model.scalingActivityId;
            this.scalingActivityState = model.scalingActivityState;
            this.scalingPolicyId = model.scalingPolicyId;
            this.scalingRuleDetail = model.scalingRuleDetail;
            this.scalingRuleId = model.scalingRuleId;
            this.scalingRuleName = model.scalingRuleName;
            this.startTime = model.startTime;
            this.timeZone = model.timeZone;
        } 

        /**
         * componentTypes.
         */
        public Builder componentTypes(String componentTypes) {
            this.componentTypes = componentTypes;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * policyType.
         */
        public Builder policyType(String policyType) {
            this.policyType = policyType;
            return this;
        }

        /**
         * scalingActivityId.
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        /**
         * scalingActivityState.
         */
        public Builder scalingActivityState(String scalingActivityState) {
            this.scalingActivityState = scalingActivityState;
            return this;
        }

        /**
         * scalingPolicyId.
         */
        public Builder scalingPolicyId(String scalingPolicyId) {
            this.scalingPolicyId = scalingPolicyId;
            return this;
        }

        /**
         * scalingRuleDetail.
         */
        public Builder scalingRuleDetail(String scalingRuleDetail) {
            this.scalingRuleDetail = scalingRuleDetail;
            return this;
        }

        /**
         * scalingRuleId.
         */
        public Builder scalingRuleId(String scalingRuleId) {
            this.scalingRuleId = scalingRuleId;
            return this;
        }

        /**
         * scalingRuleName.
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * timeZone.
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public ScalingActivity build() {
            return new ScalingActivity(this);
        } 

    } 

}
