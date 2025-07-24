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
 * {@link AdviseSummary} extends {@link TeaModel}
 *
 * <p>AdviseSummary</p>
 */
public class AdviseSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MemoryUtilizationRate")
    private DoubleMetric memoryUtilizationRate;

    @com.aliyun.core.annotation.NameInMap("VcoreUtilizationRate")
    private DoubleMetric vcoreUtilizationRate;

    private AdviseSummary(Builder builder) {
        this.memoryUtilizationRate = builder.memoryUtilizationRate;
        this.vcoreUtilizationRate = builder.vcoreUtilizationRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AdviseSummary create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memoryUtilizationRate
     */
    public DoubleMetric getMemoryUtilizationRate() {
        return this.memoryUtilizationRate;
    }

    /**
     * @return vcoreUtilizationRate
     */
    public DoubleMetric getVcoreUtilizationRate() {
        return this.vcoreUtilizationRate;
    }

    public static final class Builder {
        private DoubleMetric memoryUtilizationRate; 
        private DoubleMetric vcoreUtilizationRate; 

        private Builder() {
        } 

        private Builder(AdviseSummary model) {
            this.memoryUtilizationRate = model.memoryUtilizationRate;
            this.vcoreUtilizationRate = model.vcoreUtilizationRate;
        } 

        /**
         * MemoryUtilizationRate.
         */
        public Builder memoryUtilizationRate(DoubleMetric memoryUtilizationRate) {
            this.memoryUtilizationRate = memoryUtilizationRate;
            return this;
        }

        /**
         * VcoreUtilizationRate.
         */
        public Builder vcoreUtilizationRate(DoubleMetric vcoreUtilizationRate) {
            this.vcoreUtilizationRate = vcoreUtilizationRate;
            return this;
        }

        public AdviseSummary build() {
            return new AdviseSummary(this);
        } 

    } 

}
