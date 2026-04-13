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
 * {@link ScalingRule} extends {@link TeaModel}
 *
 * <p>ScalingRule</p>
 */
public class ScalingRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("adjustInfos")
    private java.util.List<AdjustInfos> adjustInfos;

    @com.aliyun.core.annotation.NameInMap("cronStr")
    private String cronStr;

    @com.aliyun.core.annotation.NameInMap("disabled")
    private Boolean disabled;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.NameInMap("scalingRuleName")
    private String scalingRuleName;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("timeZone")
    private String timeZone;

    private ScalingRule(Builder builder) {
        this.adjustInfos = builder.adjustInfos;
        this.cronStr = builder.cronStr;
        this.disabled = builder.disabled;
        this.endTime = builder.endTime;
        this.ruleId = builder.ruleId;
        this.scalingRuleName = builder.scalingRuleName;
        this.startTime = builder.startTime;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adjustInfos
     */
    public java.util.List<AdjustInfos> getAdjustInfos() {
        return this.adjustInfos;
    }

    /**
     * @return cronStr
     */
    public String getCronStr() {
        return this.cronStr;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
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
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder {
        private java.util.List<AdjustInfos> adjustInfos; 
        private String cronStr; 
        private Boolean disabled; 
        private Long endTime; 
        private String ruleId; 
        private String scalingRuleName; 
        private Long startTime; 
        private String timeZone; 

        private Builder() {
        } 

        private Builder(ScalingRule model) {
            this.adjustInfos = model.adjustInfos;
            this.cronStr = model.cronStr;
            this.disabled = model.disabled;
            this.endTime = model.endTime;
            this.ruleId = model.ruleId;
            this.scalingRuleName = model.scalingRuleName;
            this.startTime = model.startTime;
            this.timeZone = model.timeZone;
        } 

        /**
         * adjustInfos.
         */
        public Builder adjustInfos(java.util.List<AdjustInfos> adjustInfos) {
            this.adjustInfos = adjustInfos;
            return this;
        }

        /**
         * cronStr.
         */
        public Builder cronStr(String cronStr) {
            this.cronStr = cronStr;
            return this;
        }

        /**
         * disabled.
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * ruleId.
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
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
        public Builder startTime(Long startTime) {
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

        public ScalingRule build() {
            return new ScalingRule(this);
        } 

    } 

    /**
     * 
     * {@link ScalingRule} extends {@link TeaModel}
     *
     * <p>ScalingRule</p>
     */
    public static class AdjustInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("componentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("targetValue")
        private String targetValue;

        private AdjustInfos(Builder builder) {
            this.componentType = builder.componentType;
            this.targetValue = builder.targetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdjustInfos create() {
            return builder().build();
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return targetValue
         */
        public String getTargetValue() {
            return this.targetValue;
        }

        public static final class Builder {
            private String componentType; 
            private String targetValue; 

            private Builder() {
            } 

            private Builder(AdjustInfos model) {
                this.componentType = model.componentType;
                this.targetValue = model.targetValue;
            } 

            /**
             * componentType.
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * targetValue.
             */
            public Builder targetValue(String targetValue) {
                this.targetValue = targetValue;
                return this;
            }

            public AdjustInfos build() {
                return new AdjustInfos(this);
            } 

        } 

    }
}
