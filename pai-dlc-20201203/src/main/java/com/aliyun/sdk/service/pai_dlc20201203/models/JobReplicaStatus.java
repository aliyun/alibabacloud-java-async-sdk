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
 * {@link JobReplicaStatus} extends {@link TeaModel}
 *
 * <p>JobReplicaStatus</p>
 */
public class JobReplicaStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Active")
    private Integer active;

    @com.aliyun.core.annotation.NameInMap("Dequeued")
    private Integer dequeued;

    @com.aliyun.core.annotation.NameInMap("EstimatedAutoScalingSpec")
    private AutoScalingSpec estimatedAutoScalingSpec;

    @com.aliyun.core.annotation.NameInMap("EstimatedPodCount")
    private Long estimatedPodCount;

    @com.aliyun.core.annotation.NameInMap("EstimatedResourceConfig")
    private ResourceConfig estimatedResourceConfig;

    @com.aliyun.core.annotation.NameInMap("Queuing")
    private Integer queuing;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private JobReplicaStatus(Builder builder) {
        this.active = builder.active;
        this.dequeued = builder.dequeued;
        this.estimatedAutoScalingSpec = builder.estimatedAutoScalingSpec;
        this.estimatedPodCount = builder.estimatedPodCount;
        this.estimatedResourceConfig = builder.estimatedResourceConfig;
        this.queuing = builder.queuing;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobReplicaStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Integer getActive() {
        return this.active;
    }

    /**
     * @return dequeued
     */
    public Integer getDequeued() {
        return this.dequeued;
    }

    /**
     * @return estimatedAutoScalingSpec
     */
    public AutoScalingSpec getEstimatedAutoScalingSpec() {
        return this.estimatedAutoScalingSpec;
    }

    /**
     * @return estimatedPodCount
     */
    public Long getEstimatedPodCount() {
        return this.estimatedPodCount;
    }

    /**
     * @return estimatedResourceConfig
     */
    public ResourceConfig getEstimatedResourceConfig() {
        return this.estimatedResourceConfig;
    }

    /**
     * @return queuing
     */
    public Integer getQueuing() {
        return this.queuing;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Integer active; 
        private Integer dequeued; 
        private AutoScalingSpec estimatedAutoScalingSpec; 
        private Long estimatedPodCount; 
        private ResourceConfig estimatedResourceConfig; 
        private Integer queuing; 
        private String type; 

        private Builder() {
        } 

        private Builder(JobReplicaStatus model) {
            this.active = model.active;
            this.dequeued = model.dequeued;
            this.estimatedAutoScalingSpec = model.estimatedAutoScalingSpec;
            this.estimatedPodCount = model.estimatedPodCount;
            this.estimatedResourceConfig = model.estimatedResourceConfig;
            this.queuing = model.queuing;
            this.type = model.type;
        } 

        /**
         * Active.
         */
        public Builder active(Integer active) {
            this.active = active;
            return this;
        }

        /**
         * Dequeued.
         */
        public Builder dequeued(Integer dequeued) {
            this.dequeued = dequeued;
            return this;
        }

        /**
         * EstimatedAutoScalingSpec.
         */
        public Builder estimatedAutoScalingSpec(AutoScalingSpec estimatedAutoScalingSpec) {
            this.estimatedAutoScalingSpec = estimatedAutoScalingSpec;
            return this;
        }

        /**
         * EstimatedPodCount.
         */
        public Builder estimatedPodCount(Long estimatedPodCount) {
            this.estimatedPodCount = estimatedPodCount;
            return this;
        }

        /**
         * EstimatedResourceConfig.
         */
        public Builder estimatedResourceConfig(ResourceConfig estimatedResourceConfig) {
            this.estimatedResourceConfig = estimatedResourceConfig;
            return this;
        }

        /**
         * Queuing.
         */
        public Builder queuing(Integer queuing) {
            this.queuing = queuing;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public JobReplicaStatus build() {
            return new JobReplicaStatus(this);
        } 

    } 

}
