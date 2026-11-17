// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ResourceSpec} extends {@link TeaModel}
 *
 * <p>ResourceSpec</p>
 */
public class ResourceSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cu")
    private Integer cu;

    @com.aliyun.core.annotation.NameInMap("gpu")
    private Integer gpu;

    @com.aliyun.core.annotation.NameInMap("gpuMachineNum")
    private Integer gpuMachineNum;

    @com.aliyun.core.annotation.NameInMap("instanceTypeId")
    private String instanceTypeId;

    @com.aliyun.core.annotation.NameInMap("maxCu")
    private Integer maxCu;

    private ResourceSpec(Builder builder) {
        this.cu = builder.cu;
        this.gpu = builder.gpu;
        this.gpuMachineNum = builder.gpuMachineNum;
        this.instanceTypeId = builder.instanceTypeId;
        this.maxCu = builder.maxCu;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cu
     */
    public Integer getCu() {
        return this.cu;
    }

    /**
     * @return gpu
     */
    public Integer getGpu() {
        return this.gpu;
    }

    /**
     * @return gpuMachineNum
     */
    public Integer getGpuMachineNum() {
        return this.gpuMachineNum;
    }

    /**
     * @return instanceTypeId
     */
    public String getInstanceTypeId() {
        return this.instanceTypeId;
    }

    /**
     * @return maxCu
     */
    public Integer getMaxCu() {
        return this.maxCu;
    }

    public static final class Builder {
        private Integer cu; 
        private Integer gpu; 
        private Integer gpuMachineNum; 
        private String instanceTypeId; 
        private Integer maxCu; 

        private Builder() {
        } 

        private Builder(ResourceSpec model) {
            this.cu = model.cu;
            this.gpu = model.gpu;
            this.gpuMachineNum = model.gpuMachineNum;
            this.instanceTypeId = model.instanceTypeId;
            this.maxCu = model.maxCu;
        } 

        /**
         * <p>The number of CUs. Currently, 1 CU is equivalent to 1 vCPU and 4 GB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder cu(Integer cu) {
            this.cu = cu;
            return this;
        }

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }

        /**
         * <p>The number of GPU machines.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder gpuMachineNum(Integer gpuMachineNum) {
            this.gpuMachineNum = gpuMachineNum;
            return this;
        }

        /**
         * <p>The instance type ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn7i-c32g1.8xlarge</p>
         */
        public Builder instanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }

        /**
         * <p>The upper limit of the absolute value for the queue quota. If not specified, the backend falls back to the number of CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder maxCu(Integer maxCu) {
            this.maxCu = maxCu;
            return this;
        }

        public ResourceSpec build() {
            return new ResourceSpec(this);
        } 

    } 

}
