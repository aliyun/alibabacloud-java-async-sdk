// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstanceType} extends {@link TeaModel}
 *
 * <p>InstanceType</p>
 */
public class InstanceType extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CpuArchitecture")
    private String cpuArchitecture;

    @com.aliyun.core.annotation.NameInMap("CpuCore")
    private Integer cpuCore;

    @com.aliyun.core.annotation.NameInMap("InstanceCategory")
    private String instanceCategory;

    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
    private String instanceTypeFamily;

    @com.aliyun.core.annotation.NameInMap("LocalStorageAmount")
    private Integer localStorageAmount;

    @com.aliyun.core.annotation.NameInMap("LocalStorageCapacity")
    private Long localStorageCapacity;

    @com.aliyun.core.annotation.NameInMap("Optimized")
    private Boolean optimized;

    private InstanceType(Builder builder) {
        this.cpuArchitecture = builder.cpuArchitecture;
        this.cpuCore = builder.cpuCore;
        this.instanceCategory = builder.instanceCategory;
        this.instanceType = builder.instanceType;
        this.instanceTypeFamily = builder.instanceTypeFamily;
        this.localStorageAmount = builder.localStorageAmount;
        this.localStorageCapacity = builder.localStorageCapacity;
        this.optimized = builder.optimized;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceType create() {
        return builder().build();
    }

    /**
     * @return cpuArchitecture
     */
    public String getCpuArchitecture() {
        return this.cpuArchitecture;
    }

    /**
     * @return cpuCore
     */
    public Integer getCpuCore() {
        return this.cpuCore;
    }

    /**
     * @return instanceCategory
     */
    public String getInstanceCategory() {
        return this.instanceCategory;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceTypeFamily
     */
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    /**
     * @return localStorageAmount
     */
    public Integer getLocalStorageAmount() {
        return this.localStorageAmount;
    }

    /**
     * @return localStorageCapacity
     */
    public Long getLocalStorageCapacity() {
        return this.localStorageCapacity;
    }

    /**
     * @return optimized
     */
    public Boolean getOptimized() {
        return this.optimized;
    }

    public static final class Builder {
        private String cpuArchitecture; 
        private Integer cpuCore; 
        private String instanceCategory; 
        private String instanceType; 
        private String instanceTypeFamily; 
        private Integer localStorageAmount; 
        private Long localStorageCapacity; 
        private Boolean optimized; 

        /**
         * cpu架构。
         */
        public Builder cpuArchitecture(String cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }

        /**
         * vCPU内核数目。
         */
        public Builder cpuCore(Integer cpuCore) {
            this.cpuCore = cpuCore;
            return this;
        }

        /**
         * 实例规格分类。取值范围：
         * <p>
         * - General-purpose： 通用型。
         * - Compute-optimized：计算型。
         * - Memory-optimized：内存型。
         * - Big data：大数据型。
         * - Local SSDs ：本地SSD型。
         * - High Clock Speed ：高主频型。
         * - Enhanced ：增强型。
         * - Shared：共享型。
         * - Compute-optimized with GPU ：GPU计算型。
         * - Visual Compute-optimized ：视觉计算型。
         * - Heterogeneous Service ：异构服务型。
         * - Compute-optimized with FPGA ：FPGA计算型。
         * - Compute-optimized with NPU ：NPU计算型。
         * - ECS Bare Metal ：弹性裸金属服务器。
         * - Super Computing Cluster：超级计算集群。
         */
        public Builder instanceCategory(String instanceCategory) {
            this.instanceCategory = instanceCategory;
            return this;
        }

        /**
         * 实例规格。
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * 实例规格所属的实例规格族。取值请参见DescribeInstanceTypeFamilies。
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * 实例挂载的本地盘的数量。
         */
        public Builder localStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }

        /**
         * 实例挂载的本地盘的单盘容量。单位：GiB
         */
        public Builder localStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }

        /**
         * 是否IO优化类型。
         */
        public Builder optimized(Boolean optimized) {
            this.optimized = optimized;
            return this;
        }

        public InstanceType build() {
            return new InstanceType(this);
        } 

    } 

}
