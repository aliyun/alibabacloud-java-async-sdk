// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link AutoScalingSpec} extends {@link TeaModel}
 *
 * <p>AutoScalingSpec</p>
 */
public class AutoScalingSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoscalingMetricSpec")
    private AutoscalingMetricSpec autoscalingMetricSpec;

    @com.aliyun.core.annotation.NameInMap("MaxReplicas")
    private Integer maxReplicas;

    @com.aliyun.core.annotation.NameInMap("MinReplicas")
    private Integer minReplicas;

    @com.aliyun.core.annotation.NameInMap("PodsToDelete")
    private java.util.List<String> podsToDelete;

    @com.aliyun.core.annotation.NameInMap("ScalingStrategy")
    private String scalingStrategy;

    private AutoScalingSpec(Builder builder) {
        this.autoscalingMetricSpec = builder.autoscalingMetricSpec;
        this.maxReplicas = builder.maxReplicas;
        this.minReplicas = builder.minReplicas;
        this.podsToDelete = builder.podsToDelete;
        this.scalingStrategy = builder.scalingStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutoScalingSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoscalingMetricSpec
     */
    public AutoscalingMetricSpec getAutoscalingMetricSpec() {
        return this.autoscalingMetricSpec;
    }

    /**
     * @return maxReplicas
     */
    public Integer getMaxReplicas() {
        return this.maxReplicas;
    }

    /**
     * @return minReplicas
     */
    public Integer getMinReplicas() {
        return this.minReplicas;
    }

    /**
     * @return podsToDelete
     */
    public java.util.List<String> getPodsToDelete() {
        return this.podsToDelete;
    }

    /**
     * @return scalingStrategy
     */
    public String getScalingStrategy() {
        return this.scalingStrategy;
    }

    public static final class Builder {
        private AutoscalingMetricSpec autoscalingMetricSpec; 
        private Integer maxReplicas; 
        private Integer minReplicas; 
        private java.util.List<String> podsToDelete; 
        private String scalingStrategy; 

        private Builder() {
        } 

        private Builder(AutoScalingSpec model) {
            this.autoscalingMetricSpec = model.autoscalingMetricSpec;
            this.maxReplicas = model.maxReplicas;
            this.minReplicas = model.minReplicas;
            this.podsToDelete = model.podsToDelete;
            this.scalingStrategy = model.scalingStrategy;
        } 

        /**
         * <p>The monitoring metrics configuration for autoscaling.</p>
         */
        public Builder autoscalingMetricSpec(AutoscalingMetricSpec autoscalingMetricSpec) {
            this.autoscalingMetricSpec = autoscalingMetricSpec;
            return this;
        }

        /**
         * <p>The maximum number of replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxReplicas(Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }

        /**
         * <p>The minimum number of replicas.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minReplicas(Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        /**
         * <p>The Pods to delete for scale-in. This can only be modified through UpdateJob, and the number of Pods to delete must match PodCount.</p>
         */
        public Builder podsToDelete(java.util.List<String> podsToDelete) {
            this.podsToDelete = podsToDelete;
            return this;
        }

        /**
         * <p>The autoscaling policy. Valid values: Default, ScaleByAPI, RayAutoscaler, and CloudMonitorMetric.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder scalingStrategy(String scalingStrategy) {
            this.scalingStrategy = scalingStrategy;
            return this;
        }

        public AutoScalingSpec build() {
            return new AutoScalingSpec(this);
        } 

    } 

}
