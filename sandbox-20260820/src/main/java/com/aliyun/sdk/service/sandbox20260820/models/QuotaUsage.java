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

    @com.aliyun.core.annotation.NameInMap("instanceCount")
    private Long instanceCount;

    @com.aliyun.core.annotation.NameInMap("memoryGB")
    private Double memoryGB;

    @com.aliyun.core.annotation.NameInMap("scalingCpuCoresPerMinute")
    private Double scalingCpuCoresPerMinute;

    private QuotaUsage(Builder builder) {
        this.cpuCores = builder.cpuCores;
        this.instanceCount = builder.instanceCount;
        this.memoryGB = builder.memoryGB;
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
     * @return scalingCpuCoresPerMinute
     */
    public Double getScalingCpuCoresPerMinute() {
        return this.scalingCpuCoresPerMinute;
    }

    public static final class Builder {
        private Double cpuCores; 
        private Long instanceCount; 
        private Double memoryGB; 
        private Double scalingCpuCoresPerMinute; 

        private Builder() {
        } 

        private Builder(QuotaUsage model) {
            this.cpuCores = model.cpuCores;
            this.instanceCount = model.instanceCount;
            this.memoryGB = model.memoryGB;
            this.scalingCpuCoresPerMinute = model.scalingCpuCoresPerMinute;
        } 

        /**
         * <p>The consumed CPU quota in vCPUs, which does not represent CPU utilization.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cpuCores(Double cpuCores) {
            this.cpuCores = cpuCores;
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
         * <p>The consumed memory quota in GB, which does not represent the actual memory used by processes.</p>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        public Builder memoryGB(Double memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }

        /**
         * <p>The number of cores consumed from the team\&quot;s exclusive CPU creation quota that have not yet been naturally replenished. This is not the cumulative creation volume over the last minute. This field is omitted when no valid exclusive bucket snapshot is available, and actual zeros and decimals are retained.</p>
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
