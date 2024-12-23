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
         * <p>cpu架构。</p>
         * 
         * <strong>example:</strong>
         * <p>X86</p>
         */
        public Builder cpuArchitecture(String cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }

        /**
         * <p>vCPU内核数目。</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder cpuCore(Integer cpuCore) {
            this.cpuCore = cpuCore;
            return this;
        }

        /**
         * <p>实例规格分类。取值范围：</p>
         * <ul>
         * <li>General-purpose： 通用型。</li>
         * <li>Compute-optimized：计算型。</li>
         * <li>Memory-optimized：内存型。</li>
         * <li>Big data：大数据型。</li>
         * <li>Local SSDs ：本地SSD型。</li>
         * <li>High Clock Speed ：高主频型。</li>
         * <li>Enhanced ：增强型。</li>
         * <li>Shared：共享型。</li>
         * <li>Compute-optimized with GPU ：GPU计算型。</li>
         * <li>Visual Compute-optimized ：视觉计算型。</li>
         * <li>Heterogeneous Service ：异构服务型。</li>
         * <li>Compute-optimized with FPGA ：FPGA计算型。</li>
         * <li>Compute-optimized with NPU ：NPU计算型。</li>
         * <li>ECS Bare Metal ：弹性裸金属服务器。</li>
         * <li>Super Computing Cluster：超级计算集群。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Compute-optimized</p>
         */
        public Builder instanceCategory(String instanceCategory) {
            this.instanceCategory = instanceCategory;
            return this;
        }

        /**
         * <p>实例规格。</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.large</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>实例规格所属的实例规格族。取值请参见DescribeInstanceTypeFamilies。</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6</p>
         */
        public Builder instanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }

        /**
         * <p>实例挂载的本地盘的数量。</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder localStorageAmount(Integer localStorageAmount) {
            this.localStorageAmount = localStorageAmount;
            return this;
        }

        /**
         * <p>实例挂载的本地盘的单盘容量。单位：GiB</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder localStorageCapacity(Long localStorageCapacity) {
            this.localStorageCapacity = localStorageCapacity;
            return this;
        }

        /**
         * <p>是否IO优化类型。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
