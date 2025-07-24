// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ResourceSummary} extends {@link TeaModel}
 *
 * <p>ResourceSummary</p>
 */
public class ResourceSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InefficientTaskRate")
    private DoubleMetric inefficientTaskRate;

    @com.aliyun.core.annotation.NameInMap("MemoryUtilizationRate")
    private DoubleMetric memoryUtilizationRate;

    @com.aliyun.core.annotation.NameInMap("OriginalTotalVcore")
    private IntegerMetric originalTotalVcore;

    @com.aliyun.core.annotation.NameInMap("VcoreUtilizationRate")
    private DoubleMetric vcoreUtilizationRate;

    private ResourceSummary(Builder builder) {
        this.inefficientTaskRate = builder.inefficientTaskRate;
        this.memoryUtilizationRate = builder.memoryUtilizationRate;
        this.originalTotalVcore = builder.originalTotalVcore;
        this.vcoreUtilizationRate = builder.vcoreUtilizationRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceSummary create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inefficientTaskRate
     */
    public DoubleMetric getInefficientTaskRate() {
        return this.inefficientTaskRate;
    }

    /**
     * @return memoryUtilizationRate
     */
    public DoubleMetric getMemoryUtilizationRate() {
        return this.memoryUtilizationRate;
    }

    /**
     * @return originalTotalVcore
     */
    public IntegerMetric getOriginalTotalVcore() {
        return this.originalTotalVcore;
    }

    /**
     * @return vcoreUtilizationRate
     */
    public DoubleMetric getVcoreUtilizationRate() {
        return this.vcoreUtilizationRate;
    }

    public static final class Builder {
        private DoubleMetric inefficientTaskRate; 
        private DoubleMetric memoryUtilizationRate; 
        private IntegerMetric originalTotalVcore; 
        private DoubleMetric vcoreUtilizationRate; 

        private Builder() {
        } 

        private Builder(ResourceSummary model) {
            this.inefficientTaskRate = model.inefficientTaskRate;
            this.memoryUtilizationRate = model.memoryUtilizationRate;
            this.originalTotalVcore = model.originalTotalVcore;
            this.vcoreUtilizationRate = model.vcoreUtilizationRate;
        } 

        /**
         * InefficientTaskRate.
         */
        public Builder inefficientTaskRate(DoubleMetric inefficientTaskRate) {
            this.inefficientTaskRate = inefficientTaskRate;
            return this;
        }

        /**
         * MemoryUtilizationRate.
         */
        public Builder memoryUtilizationRate(DoubleMetric memoryUtilizationRate) {
            this.memoryUtilizationRate = memoryUtilizationRate;
            return this;
        }

        /**
         * OriginalTotalVcore.
         */
        public Builder originalTotalVcore(IntegerMetric originalTotalVcore) {
            this.originalTotalVcore = originalTotalVcore;
            return this;
        }

        /**
         * VcoreUtilizationRate.
         */
        public Builder vcoreUtilizationRate(DoubleMetric vcoreUtilizationRate) {
            this.vcoreUtilizationRate = vcoreUtilizationRate;
            return this;
        }

        public ResourceSummary build() {
            return new ResourceSummary(this);
        } 

    } 

}
