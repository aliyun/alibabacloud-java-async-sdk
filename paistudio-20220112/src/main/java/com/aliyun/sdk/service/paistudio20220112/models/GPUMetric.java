// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link GPUMetric} extends {@link TeaModel}
 *
 * <p>GPUMetric</p>
 */
public class GPUMetric extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Index")
    private Long index;

    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    @com.aliyun.core.annotation.NameInMap("UsageRate")
    private Float usageRate;

    private GPUMetric(Builder builder) {
        this.index = builder.index;
        this.model = builder.model;
        this.status = builder.status;
        this.usageRate = builder.usageRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GPUMetric create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return index
     */
    public Long getIndex() {
        return this.index;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return usageRate
     */
    public Float getUsageRate() {
        return this.usageRate;
    }

    public static final class Builder {
        private Long index; 
        private String model; 
        private Long status; 
        private Float usageRate; 

        private Builder() {
        } 

        private Builder(GPUMetric model) {
            this.index = model.index;
            this.model = model.model;
            this.status = model.status;
            this.usageRate = model.usageRate;
        } 

        /**
         * <p>The GPU index.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder index(Long index) {
            this.index = index;
            return this;
        }

        /**
         * <p>The GPU model.</p>
         * 
         * <strong>example:</strong>
         * <p>NVIDIA V100</p>
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * <p>The card status.</p>
         * 
         * <strong>example:</strong>
         * <p>0：异常；1：正常</p>
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The GPU utilization.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder usageRate(Float usageRate) {
            this.usageRate = usageRate;
            return this;
        }

        public GPUMetric build() {
            return new GPUMetric(this);
        } 

    } 

}
