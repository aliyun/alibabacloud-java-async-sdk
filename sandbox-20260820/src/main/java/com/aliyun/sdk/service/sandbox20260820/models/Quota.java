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
 * {@link Quota} extends {@link TeaModel}
 *
 * <p>Quota</p>
 */
public class Quota extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cpuCores")
    private Integer cpuCores;

    @com.aliyun.core.annotation.NameInMap("createSandboxWithSnapshotConcurrency")
    private Integer createSandboxWithSnapshotConcurrency;

    @com.aliyun.core.annotation.NameInMap("createSnapshotConcurrency")
    private Integer createSnapshotConcurrency;

    @com.aliyun.core.annotation.NameInMap("instanceCount")
    private Integer instanceCount;

    @com.aliyun.core.annotation.NameInMap("memoryGB")
    private Integer memoryGB;

    @com.aliyun.core.annotation.NameInMap("pauseConcurrency")
    private Integer pauseConcurrency;

    @com.aliyun.core.annotation.NameInMap("resumeConcurrency")
    private Integer resumeConcurrency;

    @com.aliyun.core.annotation.NameInMap("scalingCpuCoresPerMinute")
    private Long scalingCpuCoresPerMinute;

    @com.aliyun.core.annotation.NameInMap("tagValue")
    private String tagValue;

    private Quota(Builder builder) {
        this.cpuCores = builder.cpuCores;
        this.createSandboxWithSnapshotConcurrency = builder.createSandboxWithSnapshotConcurrency;
        this.createSnapshotConcurrency = builder.createSnapshotConcurrency;
        this.instanceCount = builder.instanceCount;
        this.memoryGB = builder.memoryGB;
        this.pauseConcurrency = builder.pauseConcurrency;
        this.resumeConcurrency = builder.resumeConcurrency;
        this.scalingCpuCoresPerMinute = builder.scalingCpuCoresPerMinute;
        this.tagValue = builder.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Quota create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuCores
     */
    public Integer getCpuCores() {
        return this.cpuCores;
    }

    /**
     * @return createSandboxWithSnapshotConcurrency
     */
    public Integer getCreateSandboxWithSnapshotConcurrency() {
        return this.createSandboxWithSnapshotConcurrency;
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
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return memoryGB
     */
    public Integer getMemoryGB() {
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
    public Long getScalingCpuCoresPerMinute() {
        return this.scalingCpuCoresPerMinute;
    }

    /**
     * @return tagValue
     */
    public String getTagValue() {
        return this.tagValue;
    }

    public static final class Builder {
        private Integer cpuCores; 
        private Integer createSandboxWithSnapshotConcurrency; 
        private Integer createSnapshotConcurrency; 
        private Integer instanceCount; 
        private Integer memoryGB; 
        private Integer pauseConcurrency; 
        private Integer resumeConcurrency; 
        private Long scalingCpuCoresPerMinute; 
        private String tagValue; 

        private Builder() {
        } 

        private Builder(Quota model) {
            this.cpuCores = model.cpuCores;
            this.createSandboxWithSnapshotConcurrency = model.createSandboxWithSnapshotConcurrency;
            this.createSnapshotConcurrency = model.createSnapshotConcurrency;
            this.instanceCount = model.instanceCount;
            this.memoryGB = model.memoryGB;
            this.pauseConcurrency = model.pauseConcurrency;
            this.resumeConcurrency = model.resumeConcurrency;
            this.scalingCpuCoresPerMinute = model.scalingCpuCoresPerMinute;
            this.tagValue = model.tagValue;
        } 

        /**
         * <p>The vCPU quota, in cores.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder cpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }

        /**
         * <p>The team snapshot-based sandbox creation concurrency quota, in requests. This value represents the maximum number of snapshot-based sandbox creation requests that can be executed at the same time. When updating, omit this parameter or set it to null to retain the original configuration. Set it to a positive integer to specify an exclusive quota. Set it to 0 to prohibit snapshot-based sandbox creation. Set it to -1 to clear the exclusive quota and restore the remaining quota of the shared account. In query responses, this parameter is omitted if it is not configured. An explicit value of 0 is retained, and -1 is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder createSandboxWithSnapshotConcurrency(Integer createSandboxWithSnapshotConcurrency) {
            this.createSandboxWithSnapshotConcurrency = createSandboxWithSnapshotConcurrency;
            return this;
        }

        /**
         * <p>The team snapshot creation concurrency quota, in requests. This value represents the maximum number of snapshot creation requests that can be executed at the same time. When updating, omit this parameter or set it to null to retain the original configuration. Set it to a positive integer to specify an exclusive quota. Set it to 0 to prohibit snapshot creation. Set it to -1 to clear the exclusive quota and restore the remaining quota of the shared account. In query responses, this parameter is omitted if it is not configured. An explicit value of 0 is retained, and -1 is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder createSnapshotConcurrency(Integer createSnapshotConcurrency) {
            this.createSnapshotConcurrency = createSnapshotConcurrency;
            return this;
        }

        /**
         * <p>The quota for active instances.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        /**
         * <p>The memory quota, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder memoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }

        /**
         * <p>The team sandbox hibernation concurrency quota, in requests. This value represents the maximum number of sandbox hibernation requests that can be executed at the same time. When updating, omit this parameter or set it to null to retain the original configuration. Set it to a positive integer to specify an exclusive quota. Set it to 0 to prohibit sandbox hibernation. Set it to -1 to clear the exclusive quota and restore the remaining quota of the shared account. In query responses, this parameter is omitted if it is not configured. An explicit value of 0 is retained, and -1 is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pauseConcurrency(Integer pauseConcurrency) {
            this.pauseConcurrency = pauseConcurrency;
            return this;
        }

        /**
         * <p>The team sandbox wake-up concurrency quota, in requests. This value represents the maximum number of sandbox wake-up requests that can be executed at the same time. When updating, omit this parameter or set it to null to retain the original configuration. Set it to a positive integer to specify an exclusive quota. Set it to 0 to prohibit sandbox wake-up. Set it to -1 to clear the exclusive quota and restore the remaining quota of the shared account. In query responses, this parameter is omitted if it is not configured. An explicit value of 0 is retained, and -1 is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder resumeConcurrency(Integer resumeConcurrency) {
            this.resumeConcurrency = resumeConcurrency;
            return this;
        }

        /**
         * <p>The team CPU creation rate, in cores per minute. When updating, omit this parameter or set it to null to retain the original configuration. Set it to a positive integer to specify an exclusive rate. Set it to 0 to prohibit new CPU capacity. Set it to -1 to clear the exclusive rate and restore the remaining rate of the shared account. In query responses, this parameter is omitted if it is not configured. An explicit value of 0 is retained, and -1 is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder scalingCpuCoresPerMinute(Long scalingCpuCoresPerMinute) {
            this.scalingCpuCoresPerMinute = scalingCpuCoresPerMinute;
            return this;
        }

        /**
         * <p>The quota tag value, which represents the team ID. Quotas are independently calculated based on this dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>7696f4cf-****</p>
         */
        public Builder tagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }

        public Quota build() {
            return new Quota(this);
        } 

    } 

}
