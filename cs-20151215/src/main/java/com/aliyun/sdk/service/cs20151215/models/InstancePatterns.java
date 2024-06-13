// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstancePatterns} extends {@link TeaModel}
 *
 * <p>InstancePatterns</p>
 */
public class InstancePatterns extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("architectures")
    private java.util.List < String > architectures;

    @com.aliyun.core.annotation.NameInMap("burst_performance_option")
    private String burstPerformanceOption;

    @com.aliyun.core.annotation.NameInMap("core")
    private Long core;

    @com.aliyun.core.annotation.NameInMap("excluded_instance_types")
    private java.util.List < String > excludedInstanceTypes;

    @com.aliyun.core.annotation.NameInMap("instance_family_level")
    private String instanceFamilyLevel;

    @com.aliyun.core.annotation.NameInMap("max_price")
    private Float maxPrice;

    @com.aliyun.core.annotation.NameInMap("memory")
    private Float memory;

    private InstancePatterns(Builder builder) {
        this.architectures = builder.architectures;
        this.burstPerformanceOption = builder.burstPerformanceOption;
        this.core = builder.core;
        this.excludedInstanceTypes = builder.excludedInstanceTypes;
        this.instanceFamilyLevel = builder.instanceFamilyLevel;
        this.maxPrice = builder.maxPrice;
        this.memory = builder.memory;
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
    public java.util.List < String > getArchitectures() {
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
     * @return excludedInstanceTypes
     */
    public java.util.List < String > getExcludedInstanceTypes() {
        return this.excludedInstanceTypes;
    }

    /**
     * @return instanceFamilyLevel
     */
    public String getInstanceFamilyLevel() {
        return this.instanceFamilyLevel;
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

    public static final class Builder {
        private java.util.List < String > architectures; 
        private String burstPerformanceOption; 
        private Long core; 
        private java.util.List < String > excludedInstanceTypes; 
        private String instanceFamilyLevel; 
        private Float maxPrice; 
        private Float memory; 

        /**
         * architectures.
         */
        public Builder architectures(java.util.List < String > architectures) {
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
         * excluded_instance_types.
         */
        public Builder excludedInstanceTypes(java.util.List < String > excludedInstanceTypes) {
            this.excludedInstanceTypes = excludedInstanceTypes;
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

        public InstancePatterns build() {
            return new InstancePatterns(this);
        } 

    } 

}
