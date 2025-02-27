// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeConfigurationPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigurationPriceRequest</p>
 */
public class DescribeConfigurationPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workload")
    private String workload;

    private DescribeConfigurationPriceRequest(Builder builder) {
        super(builder);
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.resourceType = builder.resourceType;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
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
        private String resourceType; 
        private String workload; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigurationPriceRequest request) {
            super(request);
            this.cpu = request.cpu;
            this.memory = request.memory;
            this.resourceType = request.resourceType;
            this.workload = request.workload;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
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
