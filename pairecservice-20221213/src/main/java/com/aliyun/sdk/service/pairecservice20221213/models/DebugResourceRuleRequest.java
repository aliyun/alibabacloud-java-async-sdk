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
 * {@link DebugResourceRuleRequest} extends {@link RequestModel}
 *
 * <p>DebugResourceRuleRequest</p>
 */
public class DebugResourceRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> metricInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DebugResourceRuleRequest(Builder builder) {
        super(builder);
        this.resourceRuleId = builder.resourceRuleId;
        this.instanceId = builder.instanceId;
        this.metricInfo = builder.metricInfo;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebugResourceRuleRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return metricInfo
     */
    public java.util.Map<String, ?> getMetricInfo() {
        return this.metricInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DebugResourceRuleRequest, Builder> {
        private String resourceRuleId; 
        private String instanceId; 
        private java.util.Map<String, ?> metricInfo; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DebugResourceRuleRequest request) {
            super(request);
            this.resourceRuleId = request.resourceRuleId;
            this.instanceId = request.instanceId;
            this.metricInfo = request.metricInfo;
            this.regionId = request.regionId;
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
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder metricInfo(java.util.Map<String, ?> metricInfo) {
            String metricInfoShrink = shrink(metricInfo, "MetricInfo", "json");
            this.putQueryParameter("MetricInfo", metricInfoShrink);
            this.metricInfo = metricInfo;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DebugResourceRuleRequest build() {
            return new DebugResourceRuleRequest(this);
        } 

    } 

}
