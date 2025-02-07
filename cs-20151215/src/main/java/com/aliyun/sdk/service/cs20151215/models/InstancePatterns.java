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

    @com.aliyun.core.annotation.NameInMap("instance_type_families")
    private java.util.List<String> instanceTypeFamilies;

    @com.aliyun.core.annotation.NameInMap("max_cpu_cores")
    private Long maxCpuCores;

    @com.aliyun.core.annotation.NameInMap("max_memory_size")
    private Float maxMemorySize;

    @com.aliyun.core.annotation.NameInMap("max_price")
    @Deprecated
    private Float maxPrice;

    @com.aliyun.core.annotation.NameInMap("maximum_gpu_amount")
    private Long maximumGpuAmount;

    @com.aliyun.core.annotation.NameInMap("memory")
    private Float memory;

    @com.aliyun.core.annotation.NameInMap("min_cpu_cores")
    private Long minCpuCores;

    @com.aliyun.core.annotation.NameInMap("min_memory_size")
    private Float minMemorySize;

    @com.aliyun.core.annotation.NameInMap("minimum_eni_ipv6_address_quantity")
    private Long minimumEniIpv6AddressQuantity;

    @com.aliyun.core.annotation.NameInMap("minimum_eni_private_ip_address_quantity")
    private Long minimumEniPrivateIpAddressQuantity;

    @com.aliyun.core.annotation.NameInMap("minimum_eni_quantity")
    private Long minimumEniQuantity;

    private InstancePatterns(Builder builder) {
        this.architectures = builder.architectures;
        this.burstPerformanceOption = builder.burstPerformanceOption;
        this.core = builder.core;
        this.cores = builder.cores;
        this.cpuArchitectures = builder.cpuArchitectures;
        this.excludedInstanceTypes = builder.excludedInstanceTypes;
        this.instanceCategories = builder.instanceCategories;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.instanceTypeFamilies = builder.instanceTypeFamilies;
        this.maxCpuCores = builder.maxCpuCores;
        this.maxMemorySize = builder.maxMemorySize;
        this.maxPrice = builder.maxPrice;
        this.maximumGpuAmount = builder.maximumGpuAmount;
        this.memory = builder.memory;
        this.minCpuCores = builder.minCpuCores;
        this.minMemorySize = builder.minMemorySize;
        this.minimumEniIpv6AddressQuantity = builder.minimumEniIpv6AddressQuantity;
        this.minimumEniPrivateIpAddressQuantity = builder.minimumEniPrivateIpAddressQuantity;
        this.minimumEniQuantity = builder.minimumEniQuantity;
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
     * @return instanceTypeFamilies
     */
    public java.util.List<String> getInstanceTypeFamilies() {
        return this.instanceTypeFamilies;
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
     * @return maximumGpuAmount
     */
    public Long getMaximumGpuAmount() {
        return this.maximumGpuAmount;
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

    /**
     * @return minimumEniIpv6AddressQuantity
     */
    public Long getMinimumEniIpv6AddressQuantity() {
        return this.minimumEniIpv6AddressQuantity;
    }

    /**
     * @return minimumEniPrivateIpAddressQuantity
     */
    public Long getMinimumEniPrivateIpAddressQuantity() {
        return this.minimumEniPrivateIpAddressQuantity;
    }

    /**
     * @return minimumEniQuantity
     */
    public Long getMinimumEniQuantity() {
        return this.minimumEniQuantity;
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
        private java.util.List<String> instanceTypeFamilies; 
        private Long maxCpuCores; 
        private Float maxMemorySize; 
        private Float maxPrice; 
        private Long maximumGpuAmount; 
        private Float memory; 
        private Long minCpuCores; 
        private Float minMemorySize; 
        private Long minimumEniIpv6AddressQuantity; 
        private Long minimumEniPrivateIpAddressQuantity; 
        private Long minimumEniQuantity; 

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
         * instance_type_families.
         */
        public Builder instanceTypeFamilies(java.util.List<String> instanceTypeFamilies) {
            this.instanceTypeFamilies = instanceTypeFamilies;
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
         * maximum_gpu_amount.
         */
        public Builder maximumGpuAmount(Long maximumGpuAmount) {
            this.maximumGpuAmount = maximumGpuAmount;
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

        /**
         * minimum_eni_ipv6_address_quantity.
         */
        public Builder minimumEniIpv6AddressQuantity(Long minimumEniIpv6AddressQuantity) {
            this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
            return this;
        }

        /**
         * minimum_eni_private_ip_address_quantity.
         */
        public Builder minimumEniPrivateIpAddressQuantity(Long minimumEniPrivateIpAddressQuantity) {
            this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
            return this;
        }

        /**
         * minimum_eni_quantity.
         */
        public Builder minimumEniQuantity(Long minimumEniQuantity) {
            this.minimumEniQuantity = minimumEniQuantity;
            return this;
        }

        public InstancePatterns build() {
            return new InstancePatterns(this);
        } 

    } 

}
