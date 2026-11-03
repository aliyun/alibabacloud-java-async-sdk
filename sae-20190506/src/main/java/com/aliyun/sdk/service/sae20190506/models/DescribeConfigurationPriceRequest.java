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
    @com.aliyun.core.annotation.NameInMap("BestEffortType")
    private String bestEffortType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cpu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cpu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuA10")
    private String gpuA10;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GpuPpu810e")
    private String gpuPpu810e;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer memory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewSaeVersion")
    private String newSaeVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Workload")
    private String workload;

    private DescribeConfigurationPriceRequest(Builder builder) {
        super(builder);
        this.bestEffortType = builder.bestEffortType;
        this.cpu = builder.cpu;
        this.gpuA10 = builder.gpuA10;
        this.gpuPpu810e = builder.gpuPpu810e;
        this.memory = builder.memory;
        this.newSaeVersion = builder.newSaeVersion;
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
     * @return bestEffortType
     */
    public String getBestEffortType() {
        return this.bestEffortType;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return gpuA10
     */
    public String getGpuA10() {
        return this.gpuA10;
    }

    /**
     * @return gpuPpu810e
     */
    public String getGpuPpu810e() {
        return this.gpuPpu810e;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return newSaeVersion
     */
    public String getNewSaeVersion() {
        return this.newSaeVersion;
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
        private String bestEffortType; 
        private Integer cpu; 
        private String gpuA10; 
        private String gpuPpu810e; 
        private Integer memory; 
        private String newSaeVersion; 
        private String resourceType; 
        private String workload; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigurationPriceRequest request) {
            super(request);
            this.bestEffortType = request.bestEffortType;
            this.cpu = request.cpu;
            this.gpuA10 = request.gpuA10;
            this.gpuPpu810e = request.gpuPpu810e;
            this.memory = request.memory;
            this.newSaeVersion = request.newSaeVersion;
            this.resourceType = request.resourceType;
            this.workload = request.workload;
        } 

        /**
         * <p>The BestEffort policy. Valid values:</p>
         * <ul>
         * <li>besteffort: BestEffort.</li>
         * <li>try-besteffort: BestEffort preferred.</li>
         * <li>default: Default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder bestEffortType(String bestEffortType) {
            this.putQueryParameter("BestEffortType", bestEffortType);
            this.bestEffortType = bestEffortType;
            return this;
        }

        /**
         * <p>The required CPU for each instance, in millicores. The value cannot be 0. Only the following defined specifications are supported:</p>
         * <ul>
         * <li><strong>500</strong></li>
         * <li><strong>1000</strong></li>
         * <li><strong>2000</strong></li>
         * <li><strong>4000</strong></li>
         * <li><strong>8000</strong></li>
         * <li><strong>12000</strong></li>
         * <li><strong>16000</strong></li>
         * <li><strong>32000</strong></li>
         * </ul>
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
         * <p>The number of A10 GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder gpuA10(String gpuA10) {
            this.putQueryParameter("GpuA10", gpuA10);
            this.gpuA10 = gpuA10;
            return this;
        }

        /**
         * <p>The number of PPU 810E units.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder gpuPpu810e(String gpuPpu810e) {
            this.putQueryParameter("GpuPpu810e", gpuPpu810e);
            this.gpuPpu810e = gpuPpu810e;
            return this;
        }

        /**
         * <p>The required memory for each instance, in MB. The value cannot be 0. Memory has a one-to-one mapping with CPU. Only the following defined specifications are supported:</p>
         * <ul>
         * <li><strong>1024</strong>: Corresponds to 500 and 1000 millicores.</li>
         * <li><strong>2048</strong>: Corresponds to 500, 1000, and 2000 millicores.</li>
         * <li><strong>4096</strong>: Corresponds to 1000, 2000, and 4000 millicores.</li>
         * <li><strong>8192</strong>: Corresponds to 2000, 4000, and 8000 millicores.</li>
         * <li><strong>12288</strong>: Corresponds to 12000 millicores.</li>
         * <li><strong>16384</strong>: Corresponds to 4000, 8000, and 16000 millicores.</li>
         * <li><strong>24576</strong>: Corresponds to 12000 millicores.</li>
         * <li><strong>32768</strong>: Corresponds to 16000 millicores.</li>
         * <li><strong>65536</strong>: Corresponds to 8000, 16000, and 32000 millicores.</li>
         * <li><strong>131072</strong>: Corresponds to 32000 millicores.</li>
         * </ul>
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
         * <p>The application edition. Valid values:</p>
         * <ul>
         * <li>lite: Lite Edition.</li>
         * <li>std: Standard Edition.</li>
         * <li>pro: Professional Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>std</p>
         */
        public Builder newSaeVersion(String newSaeVersion) {
            this.putQueryParameter("NewSaeVersion", newSaeVersion);
            this.newSaeVersion = newSaeVersion;
            return this;
        }

        /**
         * <p>The resource type. Valid values: NULL (default), default (default), and haiguang (Hygon server).</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>Common scenarios. Valid values:</p>
         * <ul>
         * <li><p>web</p>
         * </li>
         * <li><p>micro_service</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Web</p>
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
