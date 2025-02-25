// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushResourceRuleRequest} extends {@link RequestModel}
 *
 * <p>PushResourceRuleRequest</p>
 */
public class PushResourceRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceRuleId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map < String, ? > metricInfo;

    private PushResourceRuleRequest(Builder builder) {
        super(builder);
        this.resourceRuleId = builder.resourceRuleId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.metricInfo = builder.metricInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushResourceRuleRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return metricInfo
     */
    public java.util.Map < String, ? > getMetricInfo() {
        return this.metricInfo;
    }

    public static final class Builder extends Request.Builder<PushResourceRuleRequest, Builder> {
        private String resourceRuleId; 
        private String regionId; 
        private String instanceId; 
        private java.util.Map < String, ? > metricInfo; 

        private Builder() {
            super();
        } 

        private Builder(PushResourceRuleRequest request) {
            super(request);
            this.resourceRuleId = request.resourceRuleId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.metricInfo = request.metricInfo;
        } 

        /**
         * ResourceRuleId.
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MetricInfo.
         */
        public Builder metricInfo(java.util.Map < String, ? > metricInfo) {
            String metricInfoShrink = shrink(metricInfo, "MetricInfo", "json");
            this.putQueryParameter("MetricInfo", metricInfoShrink);
            this.metricInfo = metricInfo;
            return this;
        }

        @Override
        public PushResourceRuleRequest build() {
            return new PushResourceRuleRequest(this);
        } 

    } 

}
