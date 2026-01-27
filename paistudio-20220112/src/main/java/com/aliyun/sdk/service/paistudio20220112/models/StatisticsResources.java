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
 * {@link StatisticsResources} extends {@link TeaModel}
 *
 * <p>StatisticsResources</p>
 */
public class StatisticsResources extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CPU")
    private String CPU;

    @com.aliyun.core.annotation.NameInMap("GPU")
    private String GPU;

    @com.aliyun.core.annotation.NameInMap("HyperNodeNum")
    private Long hyperNodeNum;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    @com.aliyun.core.annotation.NameInMap("NodeNum")
    private Long nodeNum;

    private StatisticsResources(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.hyperNodeNum = builder.hyperNodeNum;
        this.memory = builder.memory;
        this.nodeNum = builder.nodeNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatisticsResources create() {
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
     * @return GPU
     */
    public String getGPU() {
        return this.GPU;
    }

    /**
     * @return hyperNodeNum
     */
    public Long getHyperNodeNum() {
        return this.hyperNodeNum;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    /**
     * @return nodeNum
     */
    public Long getNodeNum() {
        return this.nodeNum;
    }

    public static final class Builder {
        private String CPU; 
        private String GPU; 
        private Long hyperNodeNum; 
        private String memory; 
        private Long nodeNum; 

        private Builder() {
        } 

        private Builder(StatisticsResources model) {
            this.CPU = model.CPU;
            this.GPU = model.GPU;
            this.hyperNodeNum = model.hyperNodeNum;
            this.memory = model.memory;
            this.nodeNum = model.nodeNum;
        } 

        /**
         * CPU.
         */
        public Builder CPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        /**
         * GPU.
         */
        public Builder GPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        /**
         * HyperNodeNum.
         */
        public Builder hyperNodeNum(Long hyperNodeNum) {
            this.hyperNodeNum = hyperNodeNum;
            return this;
        }

        /**
         * Memory.
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        /**
         * NodeNum.
         */
        public Builder nodeNum(Long nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }

        public StatisticsResources build() {
            return new StatisticsResources(this);
        } 

    } 

}
