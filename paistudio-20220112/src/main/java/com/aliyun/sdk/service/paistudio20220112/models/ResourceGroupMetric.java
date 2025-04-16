// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link ResourceGroupMetric} extends {@link TeaModel}
 *
 * <p>ResourceGroupMetric</p>
 */
public class ResourceGroupMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GpuType")
    private String gpuType;

    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.List<Metric> metrics;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupID")
    private String resourceGroupID;

    private ResourceGroupMetric(Builder builder) {
        this.gpuType = builder.gpuType;
        this.metrics = builder.metrics;
        this.resourceGroupID = builder.resourceGroupID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceGroupMetric create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gpuType
     */
    public String getGpuType() {
        return this.gpuType;
    }

    /**
     * @return metrics
     */
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public static final class Builder {
        private String gpuType; 
        private java.util.List<Metric> metrics; 
        private String resourceGroupID; 

        private Builder() {
        } 

        private Builder(ResourceGroupMetric model) {
            this.gpuType = model.gpuType;
            this.metrics = model.metrics;
            this.resourceGroupID = model.resourceGroupID;
        } 

        /**
         * GpuType.
         */
        public Builder gpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }

        /**
         * Metrics.
         */
        public Builder metrics(java.util.List<Metric> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        public ResourceGroupMetric build() {
            return new ResourceGroupMetric(this);
        } 

    } 

}
