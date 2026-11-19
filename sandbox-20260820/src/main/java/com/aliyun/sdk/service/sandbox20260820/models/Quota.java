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

    @com.aliyun.core.annotation.NameInMap("instanceCount")
    private Integer instanceCount;

    @com.aliyun.core.annotation.NameInMap("memoryGB")
    private Integer memoryGB;

    @com.aliyun.core.annotation.NameInMap("scalingCpuCoresPerMinute")
    private Long scalingCpuCoresPerMinute;

    @com.aliyun.core.annotation.NameInMap("tagValue")
    private String tagValue;

    private Quota(Builder builder) {
        this.cpuCores = builder.cpuCores;
        this.instanceCount = builder.instanceCount;
        this.memoryGB = builder.memoryGB;
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
        private Integer instanceCount; 
        private Integer memoryGB; 
        private Long scalingCpuCoresPerMinute; 
        private String tagValue; 

        private Builder() {
        } 

        private Builder(Quota model) {
            this.cpuCores = model.cpuCores;
            this.instanceCount = model.instanceCount;
            this.memoryGB = model.memoryGB;
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
         * <p>The quota for the number of active instances.</p>
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
         * <p>The team CPU creation rate in cores per minute. To retain the original configuration during an update, omit this parameter or set it to null. A positive integer sets an exclusive rate. A value of 0 prevents adding new CPU capacity. A value of -1 clears the exclusive rate and restores the remaining shared account rate. When queried, this parameter is omitted if it is not configured, an explicit 0 is retained, and -1 is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder scalingCpuCoresPerMinute(Long scalingCpuCoresPerMinute) {
            this.scalingCpuCoresPerMinute = scalingCpuCoresPerMinute;
            return this;
        }

        /**
         * <p>The quota tag value, which is set to the team ID. Quotas are independently calculated based on this dimension.</p>
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
