// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RecipeSpec} extends {@link TeaModel}
 *
 * <p>RecipeSpec</p>
 */
public class RecipeSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CPU")
    private String CPU;

    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.NameInMap("GPU")
    private String GPU;

    @com.aliyun.core.annotation.NameInMap("GPUType")
    private String GPUType;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    @com.aliyun.core.annotation.NameInMap("PodCount")
    private Integer podCount;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("SharedMemory")
    private String sharedMemory;

    private RecipeSpec(Builder builder) {
        this.CPU = builder.CPU;
        this.ecsSpec = builder.ecsSpec;
        this.GPU = builder.GPU;
        this.GPUType = builder.GPUType;
        this.memory = builder.memory;
        this.podCount = builder.podCount;
        this.quotaId = builder.quotaId;
        this.sharedMemory = builder.sharedMemory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecipeSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CPU
     */
    public String getCPU() {
        return this.CPU;
    }

    /**
     * @return ecsSpec
     */
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return GPU
     */
    public String getGPU() {
        return this.GPU;
    }

    /**
     * @return GPUType
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    /**
     * @return podCount
     */
    public Integer getPodCount() {
        return this.podCount;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return sharedMemory
     */
    public String getSharedMemory() {
        return this.sharedMemory;
    }

    public static final class Builder {
        private String CPU; 
        private String ecsSpec; 
        private String GPU; 
        private String GPUType; 
        private String memory; 
        private Integer podCount; 
        private String quotaId; 
        private String sharedMemory; 

        private Builder() {
        } 

        private Builder(RecipeSpec model) {
            this.CPU = model.CPU;
            this.ecsSpec = model.ecsSpec;
            this.GPU = model.GPU;
            this.GPUType = model.GPUType;
            this.memory = model.memory;
            this.podCount = model.podCount;
            this.quotaId = model.quotaId;
            this.sharedMemory = model.sharedMemory;
        } 

        /**
         * <p>The CPU specification of a single pod, represented as a Kubernetes quantity string such as &quot;4&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder CPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        /**
         * <p>The name of the ECS instance specification. This field is not supported when starting an RLJob. Omit this field. A non-empty value returns Recipe.InvalidParameter. The example only illustrates the name format.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn7i-c8g1.2xlarge</p>
         */
        public Builder ecsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * <p>The number of GPUs for a single pod, such as &quot;1&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder GPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        /**
         * <p>The GPU type, such as &quot;A100&quot;. You can obtain the supported values from the existing quota or specification API.</p>
         * 
         * <strong>example:</strong>
         * <p>A100</p>
         */
        public Builder GPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }

        /**
         * <p>The memory specification of a single pod, represented as a Kubernetes quantity string such as &quot;8Gi&quot;. This refers to the host memory rather than the GPU memory.</p>
         * 
         * <strong>example:</strong>
         * <p>8Gi</p>
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>The number of pods for the entry. The default value is 1. This parameter takes effect only when the value is greater than 0. Otherwise, the downstream RLJob uses the default value of 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder podCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }

        /**
         * <p>The quota ID. The current RLJob startup path requires a single quota. Multiple quotas are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>quotag2uo09dyp40</p>
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>The shared memory specification of a single pod, represented as a Kubernetes quantity string such as &quot;4Gi&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>4Gi</p>
         */
        public Builder sharedMemory(String sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }

        public RecipeSpec build() {
            return new RecipeSpec(this);
        } 

    } 

}
