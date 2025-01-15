// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link InstancePatterns} extends {@link TeaModel}
 *
 * <p>InstancePatterns</p>
 */
public class InstancePatterns extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("architectures")
    @Deprecated
    private java.util.List<String> architectures;

    @com.aliyun.core.annotation.NameInMap("burst_performance_option")
    @Deprecated
    private String burstPerformanceOption;

    @com.aliyun.core.annotation.NameInMap("core")
    @Deprecated
    private Long core;

    @com.aliyun.core.annotation.NameInMap("cores")
    private Long cores;

    @com.aliyun.core.annotation.NameInMap("cpu_architectures")
    private java.util.List<String> cpuArchitectures;

    @com.aliyun.core.annotation.NameInMap("excluded_instance_types")
    private java.util.List<String> excludedInstanceTypes;

    @com.aliyun.core.annotation.NameInMap("instance_categories")
    private java.util.List<String> instanceCategories;

    @com.aliyun.core.annotation.NameInMap("instance_family_level")
    private String instanceFamilyLevel;

    @com.aliyun.core.annotation.NameInMap("max_cpu_cores")
    private Long maxCpuCores;

    @com.aliyun.core.annotation.NameInMap("max_memory_size")
    private Float maxMemorySize;

    @com.aliyun.core.annotation.NameInMap("max_price")
    @Deprecated
    private Float maxPrice;

    @com.aliyun.core.annotation.NameInMap("memory")
    private Float memory;

    @com.aliyun.core.annotation.NameInMap("min_cpu_cores")
    private Long minCpuCores;

    @com.aliyun.core.annotation.NameInMap("min_memory_size")
    private Float minMemorySize;

    private InstancePatterns(Builder builder) {
        this.architectures = builder.architectures;
        this.burstPerformanceOption = builder.burstPerformanceOption;
        this.core = builder.core;
        this.cores = builder.cores;
        this.cpuArchitectures = builder.cpuArchitectures;
        this.excludedInstanceTypes = builder.excludedInstanceTypes;
        this.instanceCategories = builder.instanceCategories;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.maxCpuCores = builder.maxCpuCores;
        this.maxMemorySize = builder.maxMemorySize;
        this.maxPrice = builder.maxPrice;
        this.memory = builder.memory;
        this.minCpuCores = builder.minCpuCores;
        this.minMemorySize = builder.minMemorySize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstancePatterns create() {
        return builder().build();
    }

    /**
     * @return architectures
     */
    public java.util.List<String> getArchitectures() {
        return this.architectures;
    }

    /**
     * @return burstPerformanceOption
     */
    public String getBurstPerformanceOption() {
        return this.burstPerformanceOption;
    }

    /**
     * @return core
     */
    public Long getCore() {
        return this.core;
    }

    /**
     * @return cores
     */
    public Long getCores() {
        return this.cores;
    }

    /**
     * @return cpuArchitectures
     */
    public java.util.List<String> getCpuArchitectures() {
        return this.cpuArchitectures;
    }

    /**
     * @return excludedInstanceTypes
     */
    public java.util.List<String> getExcludedInstanceTypes() {
        return this.excludedInstanceTypes;
    }

    /**
     * @return instanceCategories
     */
    public java.util.List<String> getInstanceCategories() {
        return this.instanceCategories;
    }

    /**
     * @return instanceFamilyLevel
     */
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
    }

    /**
     * @return maxCpuCores
     */
    public Long getMaxCpuCores() {
        return this.maxCpuCores;
    }

    /**
     * @return maxMemorySize
     */
    public Float getMaxMemorySize() {
        return this.maxMemorySize;
    }

    /**
     * @return maxPrice
     */
    public Float getMaxPrice() {
        return this.maxPrice;
    }

    /**
     * @return memory
     */
    public Float getMemory() {
        return this.memory;
    }

    /**
     * @return minCpuCores
     */
    public Long getMinCpuCores() {
        return this.minCpuCores;
    }

    /**
     * @return minMemorySize
     */
    public Float getMinMemorySize() {
        return this.minMemorySize;
    }

    public static final class Builder {
        private java.util.List<String> architectures; 
        private String burstPerformanceOption; 
        private Long core; 
        private Long cores; 
        private java.util.List<String> cpuArchitectures; 
        private java.util.List<String> excludedInstanceTypes; 
        private java.util.List<String> instanceCategories; 
        private String instanceFamilyLevel; 
        private Long maxCpuCores; 
        private Float maxMemorySize; 
        private Float maxPrice; 
        private Float memory; 
        private Long minCpuCores; 
        private Float minMemorySize; 

        /**
         * architectures.
         */
        public Builder architectures(java.util.List<String> architectures) {
            this.architectures = architectures;
            return this;
        }

        /**
         * burst_performance_option.
         */
        public Builder burstPerformanceOption(String burstPerformanceOption) {
            this.burstPerformanceOption = burstPerformanceOption;
            return this;
        }

        /**
         * core.
         */
        public Builder core(Long core) {
            this.core = core;
            return this;
        }

        /**
         * cores.
         */
        public Builder cores(Long cores) {
            this.cores = cores;
            return this;
        }

        /**
         * cpu_architectures.
         */
        public Builder cpuArchitectures(java.util.List<String> cpuArchitectures) {
            this.cpuArchitectures = cpuArchitectures;
            return this;
        }

        /**
         * excluded_instance_types.
         */
        public Builder excludedInstanceTypes(java.util.List<String> excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
            return this;
        }

        /**
         * instance_categories.
         */
        public Builder instanceCategories(java.util.List<String> instanceCategories) {
            this.instanceCategories = instanceCategories;
            return this;
        }

        /**
         * instance_family_level.
         */
        public Builder instanceFamilyLevel(String instanceFamilyLevel) {
            this.instanceFamilyLevel = instanceFamilyLevel;
            return this;
        }

        /**
         * max_cpu_cores.
         */
        public Builder maxCpuCores(Long maxCpuCores) {
            this.maxCpuCores = maxCpuCores;
            return this;
        }

        /**
         * max_memory_size.
         */
        public Builder maxMemorySize(Float maxMemorySize) {
            this.maxMemorySize = maxMemorySize;
            return this;
        }

        /**
         * max_price.
         */
        public Builder maxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }

        /**
         * memory.
         */
        public Builder memory(Float memory) {
            this.memory = memory;
            return this;
        }

        /**
         * min_cpu_cores.
         */
        public Builder minCpuCores(Long minCpuCores) {
            this.minCpuCores = minCpuCores;
            return this;
        }

        /**
         * min_memory_size.
         */
        public Builder minMemorySize(Float minMemorySize) {
            this.minMemorySize = minMemorySize;
            return this;
        }

        public InstancePatterns build() {
            return new InstancePatterns(this);
        } 

    } 

}
