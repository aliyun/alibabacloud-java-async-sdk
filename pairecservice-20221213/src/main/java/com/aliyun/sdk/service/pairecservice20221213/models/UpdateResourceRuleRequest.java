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
 * {@link UpdateResourceRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceRuleRequest</p>
 */
public class UpdateResourceRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceRuleId;

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

    private UpdateResourceRuleRequest(Builder builder) {
        super(builder);
        this.resourceRuleId = builder.resourceRuleId;
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.metricOperationType = builder.metricOperationType;
        this.metricPullInfo = builder.metricPullInfo;
        this.metricPullPeriod = builder.metricPullPeriod;
        this.name = builder.name;
        this.ruleComputingDefinition = builder.ruleComputingDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceRuleId
     */
    public String getResourceRuleId() {
        return this.resourceRuleId;
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

    public static final class Builder extends Request.Builder<UpdateResourceRuleRequest, Builder> {
        private String resourceRuleId; 
        private String regionId; 
        private String description; 
        private String instanceId; 
        private String metricOperationType; 
        private String metricPullInfo; 
        private String metricPullPeriod; 
        private String name; 
        private String ruleComputingDefinition; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceRuleRequest request) {
            super(request);
            this.resourceRuleId = request.resourceRuleId;
            this.regionId = request.regionId;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.metricOperationType = request.metricOperationType;
            this.metricPullInfo = request.metricPullInfo;
            this.metricPullPeriod = request.metricPullPeriod;
            this.name = request.name;
            this.ruleComputingDefinition = request.ruleComputingDefinition;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder resourceRuleId(String resourceRuleId) {
            this.putPathParameter("ResourceRuleId", resourceRuleId);
            this.resourceRuleId = resourceRuleId;
            return this;
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

        @Override
        public UpdateResourceRuleRequest build() {
            return new UpdateResourceRuleRequest(this);
        } 

    } 

}
