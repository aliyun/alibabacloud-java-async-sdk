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

    @com.aliyun.core.annotation.NameInMap("createSessionWithSnapshotConcurrency")
    private Integer createSessionWithSnapshotConcurrency;

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
        this.createSessionWithSnapshotConcurrency = builder.createSessionWithSnapshotConcurrency;
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
        private Integer createSessionWithSnapshotConcurrency; 
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
            this.createSessionWithSnapshotConcurrency = model.createSessionWithSnapshotConcurrency;
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
         * <p>The concurrent quota for creating sandboxes from snapshots in a team. This indicates the maximum number of requests for creating sandboxes from snapshots that can be executed at the same time. Omit or pass null to retain the original configuration during updates. A positive integer sets an exclusive quota. 0 prohibits creating sandboxes from snapshots. -1 clears the exclusive quota and restores the remaining quota of the shared account. During queries, this field is omitted if not configured, an explicit 0 is retained, and -1 is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder createSessionWithSnapshotConcurrency(Integer createSessionWithSnapshotConcurrency) {
            this.createSessionWithSnapshotConcurrency = createSessionWithSnapshotConcurrency;
            return this;
        }

        /**
         * <p>The concurrent quota for creating snapshots in a team. This indicates the maximum number of snapshot creation requests that can be executed at the same time. Omit or pass null to retain the original configuration during updates. A positive integer sets an exclusive quota. 0 prohibits creating snapshots. -1 clears the exclusive quota and restores the remaining quota of the shared account. During queries, this field is omitted if not configured, an explicit 0 is retained, and -1 is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder createSnapshotConcurrency(Integer createSnapshotConcurrency) {
            this.createSnapshotConcurrency = createSnapshotConcurrency;
            return this;
        }

        /**
         * <p>The quota for the number of running instances.</p>
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
         * <p>The concurrent quota for sandbox hibernation in a team. This indicates the maximum number of sandbox hibernation requests that can be executed at the same time. Omit or pass null to retain the original configuration during updates. A positive integer sets an exclusive quota. 0 prohibits sandbox hibernation. -1 clears the exclusive quota and restores the remaining quota of the shared account. During queries, this field is omitted if not configured, an explicit 0 is retained, and -1 is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pauseConcurrency(Integer pauseConcurrency) {
            this.pauseConcurrency = pauseConcurrency;
            return this;
        }

        /**
         * <p>The concurrent quota for resuming sandboxes in a team. This indicates the maximum number of sandbox resumption requests that can be executed at the same time. Omit or pass null to retain the original configuration during updates. A positive integer sets an exclusive quota. 0 prohibits resuming sandboxes. -1 clears the exclusive quota and restores the remaining quota of the shared account. During queries, this field is omitted if not configured, an explicit 0 is retained, and -1 is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder resumeConcurrency(Integer resumeConcurrency) {
            this.resumeConcurrency = resumeConcurrency;
            return this;
        }

        /**
         * <p>The Team CPU creation rate, in cores per minute. Omit or pass null to retain the original configuration during updates. A positive integer sets an exclusive rate. 0 prohibits adding new CPU capacity. -1 clears the exclusive rate and restores the remaining rate of the shared account. During queries, this field is omitted if not configured, an explicit 0 is retained, and -1 is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder scalingCpuCoresPerMinute(Long scalingCpuCoresPerMinute) {
            this.scalingCpuCoresPerMinute = scalingCpuCoresPerMinute;
            return this;
        }

        /**
         * <p>The quota tag value. This value is the team ID, and quotas are calculated independently based on this dimension.</p>
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
