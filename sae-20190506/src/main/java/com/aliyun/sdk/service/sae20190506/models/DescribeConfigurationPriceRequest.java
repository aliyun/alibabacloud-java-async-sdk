// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigurationPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigurationPriceRequest</p>
 */
public class DescribeConfigurationPriceRequest extends Request {
    @Query
    @NameInMap("Cpu")
    @Validation(required = true)
    private Integer cpu;

    @Query
    @NameInMap("Memory")
    @Validation(required = true)
    private Integer memory;

    @Query
    @NameInMap("Workload")
    private String workload;

    private DescribeConfigurationPriceRequest(Builder builder) {
        super(builder);
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.workload = builder.workload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigurationPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return workload
     */
    public String getWorkload() {
        return this.workload;
    }

    public static final class Builder extends Request.Builder<DescribeConfigurationPriceRequest, Builder> {
        private Integer cpu; 
        private Integer memory; 
        private String workload; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigurationPriceRequest request) {
            super(request);
            this.cpu = request.cpu;
            this.memory = request.memory;
            this.workload = request.workload;
        } 

        /**
         * Cpu.
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * Workload.
         */
        public Builder workload(String workload) {
            this.putQueryParameter("Workload", workload);
            this.workload = workload;
            return this;
        }

        @Override
        public DescribeConfigurationPriceRequest build() {
            return new DescribeConfigurationPriceRequest(this);
        } 

    } 

}
