// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link UpdateModelServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelServiceRequest</p>
 */
public class UpdateModelServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cpu")
    private Long cpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gpu")
    private Long gpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("memory")
    private Long memory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelServiceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceCount")
    private Long serviceCount;

    private UpdateModelServiceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.memory = builder.memory;
        this.modelServiceName = builder.modelServiceName;
        this.modelType = builder.modelType;
        this.serviceCount = builder.serviceCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return cpu
     */
    public Long getCpu() {
        return this.cpu;
    }

    /**
     * @return gpu
     */
    public Long getGpu() {
        return this.gpu;
    }

    /**
     * @return memory
     */
    public Long getMemory() {
        return this.memory;
    }

    /**
     * @return modelServiceName
     */
    public String getModelServiceName() {
        return this.modelServiceName;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return serviceCount
     */
    public Long getServiceCount() {
        return this.serviceCount;
    }

    public static final class Builder extends Request.Builder<UpdateModelServiceRequest, Builder> {
        private String instanceId; 
        private Long cpu; 
        private Long gpu; 
        private Long memory; 
        private String modelServiceName; 
        private String modelType; 
        private Long serviceCount; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelServiceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.cpu = request.cpu;
            this.gpu = request.gpu;
            this.memory = request.memory;
            this.modelServiceName = request.modelServiceName;
            this.modelType = request.modelType;
            this.serviceCount = request.serviceCount;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-xxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * cpu.
         */
        public Builder cpu(Long cpu) {
            this.putBodyParameter("cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * gpu.
         */
        public Builder gpu(Long gpu) {
            this.putBodyParameter("gpu", gpu);
            this.gpu = gpu;
            return this;
        }

        /**
         * memory.
         */
        public Builder memory(Long memory) {
            this.putBodyParameter("memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-qwen</p>
         */
        public Builder modelServiceName(String modelServiceName) {
            this.putBodyParameter("modelServiceName", modelServiceName);
            this.modelServiceName = modelServiceName;
            return this;
        }

        /**
         * modelType.
         */
        public Builder modelType(String modelType) {
            this.putBodyParameter("modelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * serviceCount.
         */
        public Builder serviceCount(Long serviceCount) {
            this.putBodyParameter("serviceCount", serviceCount);
            this.serviceCount = serviceCount;
            return this;
        }

        @Override
        public UpdateModelServiceRequest build() {
            return new UpdateModelServiceRequest(this);
        } 

    } 

}
