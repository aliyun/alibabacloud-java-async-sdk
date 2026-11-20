// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link QuotaUsage} extends {@link TeaModel}
 *
 * <p>QuotaUsage</p>
 */
public class QuotaUsage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpuCores")
    private Double cpuCores;

    @com.aliyun.core.annotation.NameInMap("createSessionWithSnapshotConcurrency")
    private Integer createSessionWithSnapshotConcurrency;

    @com.aliyun.core.annotation.NameInMap("createSnapshotConcurrency")
    private Integer createSnapshotConcurrency;

    @com.aliyun.core.annotation.NameInMap("instanceCount")
    private Long instanceCount;

    @com.aliyun.core.annotation.NameInMap("memoryGB")
    private Double memoryGB;

    @com.aliyun.core.annotation.NameInMap("pauseConcurrency")
    private Integer pauseConcurrency;

    @com.aliyun.core.annotation.NameInMap("resumeConcurrency")
    private Integer resumeConcurrency;

    @com.aliyun.core.annotation.NameInMap("scalingCpuCoresPerMinute")
    private Double scalingCpuCoresPerMinute;

    private QuotaUsage(Builder builder) {
        this.cpuCores = builder.cpuCores;
        this.createSessionWithSnapshotConcurrency = builder.createSessionWithSnapshotConcurrency;
        this.createSnapshotConcurrency = builder.createSnapshotConcurrency;
        this.instanceCount = builder.instanceCount;
        this.memoryGB = builder.memoryGB;
        this.pauseConcurrency = builder.pauseConcurrency;
        this.resumeConcurrency = builder.resumeConcurrency;
        this.scalingCpuCoresPerMinute = builder.scalingCpuCoresPerMinute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaUsage create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuCores
     */
    public Double getCpuCores() {
        return this.cpuCores;
    }

    /**
     * @return createSessionWithSnapshotConcurrency
     */
    public Integer getCreateSessionWithSnapshotConcurrency() {
        return this.createSessionWithSnapshotConcurrency;
    }

    /**
     * @return createSnapshotConcurrency
     */
    public Integer getCreateSnapshotConcurrency() {
        return this.createSnapshotConcurrency;
    }

    /**
     * @return instanceCount
     */
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return memoryGB
     */
    public Double getMemoryGB() {
        return this.memoryGB;
    }

    /**
     * @return pauseConcurrency
     */
    public Integer getPauseConcurrency() {
        return this.pauseConcurrency;
    }

    /**
     * @return resumeConcurrency
     */
    public Integer getResumeConcurrency() {
        return this.resumeConcurrency;
    }

    /**
     * @return scalingCpuCoresPerMinute
     */
    public Double getScalingCpuCoresPerMinute() {
        return this.scalingCpuCoresPerMinute;
    }

    public static final class Builder {
        private Double cpuCores; 
        private Integer createSessionWithSnapshotConcurrency; 
        private Integer createSnapshotConcurrency; 
        private Long instanceCount; 
        private Double memoryGB; 
        private Integer pauseConcurrency; 
        private Integer resumeConcurrency; 
        private Double scalingCpuCoresPerMinute; 

        private Builder() {
        } 

        private Builder(QuotaUsage model) {
            this.cpuCores = model.cpuCores;
            this.createSessionWithSnapshotConcurrency = model.createSessionWithSnapshotConcurrency;
            this.createSnapshotConcurrency = model.createSnapshotConcurrency;
            this.instanceCount = model.instanceCount;
            this.memoryGB = model.memoryGB;
            this.pauseConcurrency = model.pauseConcurrency;
            this.resumeConcurrency = model.resumeConcurrency;
            this.scalingCpuCoresPerMinute = model.scalingCpuCoresPerMinute;
        } 

        /**
         * <p>The consumed CPU quota in vCPUs, not the CPU utilization.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpuCores(Double cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }

        /**
         * <p>The number of unreleased snapshot-based sandbox creation concurrency authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder createSessionWithSnapshotConcurrency(Integer createSessionWithSnapshotConcurrency) {
            this.createSessionWithSnapshotConcurrency = createSessionWithSnapshotConcurrency;
            return this;
        }

        /**
         * <p>The number of unreleased snapshot creation concurrency authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder createSnapshotConcurrency(Integer createSnapshotConcurrency) {
            this.createSnapshotConcurrency = createSnapshotConcurrency;
            return this;
        }

        /**
         * <p>The number of unreleased instance authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder instanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * <p>The consumed memory quota in GB, not the actual memory used by processes.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        public Builder memoryGB(Double memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }

        /**
         * <p>The number of unreleased sandbox hibernation concurrency authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pauseConcurrency(Integer pauseConcurrency) {
            this.pauseConcurrency = pauseConcurrency;
            return this;
        }

        /**
         * <p>The number of unreleased sandbox resume concurrency authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder resumeConcurrency(Integer resumeConcurrency) {
            this.resumeConcurrency = resumeConcurrency;
            return this;
        }

        /**
         * <p>The number of cores consumed from the team\&quot;s exclusive CPU creation quota that have not yet been naturally replenished. This is not the cumulative creation volume in the last minute. This field is omitted when there is no valid exclusive bucket snapshot, and actual zeros and decimal values are preserved.</p>
         * 
         * <strong>example:</strong>
         * <p>19.875</p>
         */
        public Builder scalingCpuCoresPerMinute(Double scalingCpuCoresPerMinute) {
            this.scalingCpuCoresPerMinute = scalingCpuCoresPerMinute;
            return this;
        }

        public QuotaUsage build() {
            return new QuotaUsage(this);
        } 

    } 

}
