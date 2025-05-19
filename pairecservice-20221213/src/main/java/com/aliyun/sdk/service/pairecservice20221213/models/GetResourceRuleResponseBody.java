// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetResourceRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceRuleResponseBody</p>
 */
public class GetResourceRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("MetricOperationType")
    private String metricOperationType;

    @com.aliyun.core.annotation.NameInMap("MetricPullInfo")
    private String metricPullInfo;

    @com.aliyun.core.annotation.NameInMap("MetricPullPeriod")
    private String metricPullPeriod;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceRuleId")
    private String resourceRuleId;

    @com.aliyun.core.annotation.NameInMap("RuleComputingDefinition")
    private String ruleComputingDefinition;

    @com.aliyun.core.annotation.NameInMap("RuleItems")
    private java.util.List<RuleItems> ruleItems;

    private GetResourceRuleResponseBody(Builder builder) {
        this.description = builder.description;
        this.metricOperationType = builder.metricOperationType;
        this.metricPullInfo = builder.metricPullInfo;
        this.metricPullPeriod = builder.metricPullPeriod;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.resourceRuleId = builder.resourceRuleId;
        this.ruleComputingDefinition = builder.ruleComputingDefinition;
        this.ruleItems = builder.ruleItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return metricOperationType
     */
    public String getMetricOperationType() {
        return this.metricOperationType;
    }

    /**
     * @return metricPullInfo
     */
    public String getMetricPullInfo() {
        return this.metricPullInfo;
    }

    /**
     * @return metricPullPeriod
     */
    public String getMetricPullPeriod() {
        return this.metricPullPeriod;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceRuleId
     */
    public String getResourceRuleId() {
        return this.resourceRuleId;
    }

    /**
     * @return ruleComputingDefinition
     */
    public String getRuleComputingDefinition() {
        return this.ruleComputingDefinition;
    }

    /**
     * @return ruleItems
     */
    public java.util.List<RuleItems> getRuleItems() {
        return this.ruleItems;
    }

    public static final class Builder {
        private String description; 
        private String metricOperationType; 
        private String metricPullInfo; 
        private String metricPullPeriod; 
        private String name; 
        private String requestId; 
        private String resourceRuleId; 
        private String ruleComputingDefinition; 
        private java.util.List<RuleItems> ruleItems; 

        private Builder() {
        } 

        private Builder(GetResourceRuleResponseBody model) {
            this.description = model.description;
            this.metricOperationType = model.metricOperationType;
            this.metricPullInfo = model.metricPullInfo;
            this.metricPullPeriod = model.metricPullPeriod;
            this.name = model.name;
            this.requestId = model.requestId;
            this.resourceRuleId = model.resourceRuleId;
            this.ruleComputingDefinition = model.ruleComputingDefinition;
            this.ruleItems = model.ruleItems;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * MetricOperationType.
         */
        public Builder metricOperationType(String metricOperationType) {
            this.metricOperationType = metricOperationType;
            return this;
        }

        /**
         * MetricPullInfo.
         */
        public Builder metricPullInfo(String metricPullInfo) {
            this.metricPullInfo = metricPullInfo;
            return this;
        }

        /**
         * MetricPullPeriod.
         */
        public Builder metricPullPeriod(String metricPullPeriod) {
            this.metricPullPeriod = metricPullPeriod;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * ResourceRuleId.
         */
        public Builder resourceRuleId(String resourceRuleId) {
            this.resourceRuleId = resourceRuleId;
            return this;
        }

        /**
         * RuleComputingDefinition.
         */
        public Builder ruleComputingDefinition(String ruleComputingDefinition) {
            this.ruleComputingDefinition = ruleComputingDefinition;
            return this;
        }

        /**
         * RuleItems.
         */
        public Builder ruleItems(java.util.List<RuleItems> ruleItems) {
            this.ruleItems = ruleItems;
            return this;
        }

        public GetResourceRuleResponseBody build() {
            return new GetResourceRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceRuleResponseBody</p>
     */
    public static class RuleItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private String maxValue;

        @com.aliyun.core.annotation.NameInMap("MinValue")
        private String minValue;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private RuleItems(Builder builder) {
            this.description = builder.description;
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleItems create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return maxValue
         */
        public String getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public String getMinValue() {
            return this.minValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String maxValue; 
            private String minValue; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(RuleItems model) {
                this.description = model.description;
                this.maxValue = model.maxValue;
                this.minValue = model.minValue;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * MaxValue.
             */
            public Builder maxValue(String maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * MinValue.
             */
            public Builder minValue(String minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RuleItems build() {
                return new RuleItems(this);
            } 

        } 

    }
}
