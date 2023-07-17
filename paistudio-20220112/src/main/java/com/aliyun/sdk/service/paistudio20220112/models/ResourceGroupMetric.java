// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResourceGroupMetric} extends {@link TeaModel}
 *
 * <p>ResourceGroupMetric</p>
 */
public class ResourceGroupMetric extends TeaModel {
    @NameInMap("GpuType")
    private String gpuType;

    @NameInMap("Metrics")
    private java.util.List < Metric > metrics;

    @NameInMap("ResourceGroupID")
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

    /**
     * @return gpuType
     */
    public String getGpuType() {
        return this.gpuType;
    }

    /**
     * @return metrics
     */
    public java.util.List < Metric > getMetrics() {
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
        private java.util.List < Metric > metrics; 
        private String resourceGroupID; 

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
        public Builder metrics(java.util.List < Metric > metrics) {
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
