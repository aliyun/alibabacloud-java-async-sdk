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
 * {@link CreateResourceRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceRuleRequest</p>
 */
public class CreateResourceRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricOperationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricOperationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricPullInfo")
    private String metricPullInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MetricPullPeriod")
    private String metricPullPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleComputingDefinition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleComputingDefinition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleItems")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RuleItems> ruleItems;

    private CreateResourceRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.metricOperationType = builder.metricOperationType;
        this.metricPullInfo = builder.metricPullInfo;
        this.metricPullPeriod = builder.metricPullPeriod;
        this.name = builder.name;
        this.ruleComputingDefinition = builder.ruleComputingDefinition;
        this.ruleItems = builder.ruleItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<CreateResourceRuleRequest, Builder> {
        private String regionId; 
        private String description; 
        private String instanceId; 
        private String metricOperationType; 
        private String metricPullInfo; 
        private String metricPullPeriod; 
        private String name; 
        private String ruleComputingDefinition; 
        private java.util.List<RuleItems> ruleItems; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.metricOperationType = request.metricOperationType;
            this.metricPullInfo = request.metricPullInfo;
            this.metricPullPeriod = request.metricPullPeriod;
            this.name = request.name;
            this.ruleComputingDefinition = request.ruleComputingDefinition;
            this.ruleItems = request.ruleItems;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder metricOperationType(String metricOperationType) {
            this.putBodyParameter("MetricOperationType", metricOperationType);
            this.metricOperationType = metricOperationType;
            return this;
        }

        /**
         * MetricPullInfo.
         */
        public Builder metricPullInfo(String metricPullInfo) {
            this.putBodyParameter("MetricPullInfo", metricPullInfo);
            this.metricPullInfo = metricPullInfo;
            return this;
        }

        /**
         * MetricPullPeriod.
         */
        public Builder metricPullPeriod(String metricPullPeriod) {
            this.putBodyParameter("MetricPullPeriod", metricPullPeriod);
            this.metricPullPeriod = metricPullPeriod;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ruleComputingDefinition(String ruleComputingDefinition) {
            this.putBodyParameter("RuleComputingDefinition", ruleComputingDefinition);
            this.ruleComputingDefinition = ruleComputingDefinition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ruleItems(java.util.List<RuleItems> ruleItems) {
            this.putBodyParameter("RuleItems", ruleItems);
            this.ruleItems = ruleItems;
            return this;
        }

        @Override
        public CreateResourceRuleRequest build() {
            return new CreateResourceRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateResourceRuleRequest} extends {@link TeaModel}
     *
     * <p>CreateResourceRuleRequest</p>
     */
    public static class RuleItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MaxValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double maxValue;

        @com.aliyun.core.annotation.NameInMap("MinValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double minValue;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private Double value;

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
        public Double getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Double getMinValue() {
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
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private Double maxValue; 
            private Double minValue; 
            private String name; 
            private Double value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder maxValue(Double maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder minValue(Double minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public RuleItems build() {
                return new RuleItems(this);
            } 

        } 

    }
}
