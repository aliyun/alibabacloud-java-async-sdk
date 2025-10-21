// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link JobMetric} extends {@link TeaModel}
 *
 * <p>JobMetric</p>
 */
public class JobMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("totalCpu")
    private Double totalCpu;

    @com.aliyun.core.annotation.NameInMap("totalMemoryByte")
    private Long totalMemoryByte;

    private JobMetric(Builder builder) {
        this.totalCpu = builder.totalCpu;
        this.totalMemoryByte = builder.totalMemoryByte;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobMetric create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return totalCpu
     */
    public Double getTotalCpu() {
        return this.totalCpu;
    }

    /**
     * @return totalMemoryByte
     */
    public Long getTotalMemoryByte() {
        return this.totalMemoryByte;
    }

    public static final class Builder {
        private Double totalCpu; 
        private Long totalMemoryByte; 

        private Builder() {
        } 

        private Builder(JobMetric model) {
            this.totalCpu = model.totalCpu;
            this.totalMemoryByte = model.totalMemoryByte;
        } 

        /**
         * totalCpu.
         */
        public Builder totalCpu(Double totalCpu) {
            this.totalCpu = totalCpu;
            return this;
        }

        /**
         * totalMemoryByte.
         */
        public Builder totalMemoryByte(Long totalMemoryByte) {
            this.totalMemoryByte = totalMemoryByte;
            return this;
        }

        public JobMetric build() {
            return new JobMetric(this);
        } 

    } 

}
