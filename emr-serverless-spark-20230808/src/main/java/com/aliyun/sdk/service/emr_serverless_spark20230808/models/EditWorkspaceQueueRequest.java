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
 * {@link EditWorkspaceQueueRequest} extends {@link RequestModel}
 *
 * <p>EditWorkspaceQueueRequest</p>
 */
public class EditWorkspaceQueueRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("environments")
    private java.util.List<String> environments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gpuSpec")
    private java.util.List<String> gpuSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceSpec")
    private ResourceSpec resourceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceQueueName")
    private String workspaceQueueName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private EditWorkspaceQueueRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.environments = builder.environments;
        this.gpuSpec = builder.gpuSpec;
        this.instanceId = builder.instanceId;
        this.resourceSpec = builder.resourceSpec;
        this.workspaceId = builder.workspaceId;
        this.workspaceQueueName = builder.workspaceQueueName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditWorkspaceQueueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return environments
     */
    public java.util.List<String> getEnvironments() {
        return this.environments;
    }

    /**
     * @return gpuSpec
     */
    public java.util.List<String> getGpuSpec() {
        return this.gpuSpec;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceSpec
     */
    public ResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceQueueName
     */
    public String getWorkspaceQueueName() {
        return this.workspaceQueueName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<EditWorkspaceQueueRequest, Builder> {
        private String description; 
        private java.util.List<String> environments; 
        private java.util.List<String> gpuSpec; 
        private String instanceId; 
        private ResourceSpec resourceSpec; 
        private String workspaceId; 
        private String workspaceQueueName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(EditWorkspaceQueueRequest request) {
            super(request);
            this.description = request.description;
            this.environments = request.environments;
            this.gpuSpec = request.gpuSpec;
            this.instanceId = request.instanceId;
            this.resourceSpec = request.resourceSpec;
            this.workspaceId = request.workspaceId;
            this.workspaceQueueName = request.workspaceQueueName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test queue</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The environment type of the queue.</p>
         */
        public Builder environments(java.util.List<String> environments) {
            this.putBodyParameter("environments", environments);
            this.environments = environments;
            return this;
        }

        /**
         * <p>The list of GPU models.</p>
         */
        public Builder gpuSpec(java.util.List<String> gpuSpec) {
            this.putBodyParameter("gpuSpec", gpuSpec);
            this.gpuSpec = gpuSpec;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The resource quota.</p>
         */
        public Builder resourceSpec(ResourceSpec resourceSpec) {
            this.putBodyParameter("resourceSpec", resourceSpec);
            this.resourceSpec = resourceSpec;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-975bcfda9625****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The name of the workspace queue.</p>
         * 
         * <strong>example:</strong>
         * <p>dev_queue</p>
         */
        public Builder workspaceQueueName(String workspaceQueueName) {
            this.putBodyParameter("workspaceQueueName", workspaceQueueName);
            this.workspaceQueueName = workspaceQueueName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public EditWorkspaceQueueRequest build() {
            return new EditWorkspaceQueueRequest(this);
        } 

    } 

    /**
     * 
     * {@link EditWorkspaceQueueRequest} extends {@link TeaModel}
     *
     * <p>EditWorkspaceQueueRequest</p>
     */
    public static class ResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cu")
        private Long cu;

        @com.aliyun.core.annotation.NameInMap("gpu")
        private Integer gpu;

        @com.aliyun.core.annotation.NameInMap("gpuMachineNum")
        @com.aliyun.core.annotation.Validation(maximum = 8)
        private Integer gpuMachineNum;

        @com.aliyun.core.annotation.NameInMap("maxCu")
        private Long maxCu;

        private ResourceSpec(Builder builder) {
            this.cu = builder.cu;
            this.gpu = builder.gpu;
            this.gpuMachineNum = builder.gpuMachineNum;
            this.maxCu = builder.maxCu;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Long getCu() {
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
         * @return maxCu
         */
        public Long getMaxCu() {
            return this.maxCu;
        }

        public static final class Builder {
            private Long cu; 
            private Integer gpu; 
            private Integer gpuMachineNum; 
            private Long maxCu; 

            private Builder() {
            } 

            private Builder(ResourceSpec model) {
                this.cu = model.cu;
                this.gpu = model.gpu;
                this.gpuMachineNum = model.gpuMachineNum;
                this.maxCu = model.maxCu;
            } 

            /**
             * <p>The resource upper limit of the workspace queue.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder cu(Long cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The number of GPU cards.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder gpu(Integer gpu) {
                this.gpu = gpu;
                return this;
            }

            /**
             * <p>The number of GPU machines.</p>
             */
            public Builder gpuMachineNum(Integer gpuMachineNum) {
                this.gpuMachineNum = gpuMachineNum;
                return this;
            }

            /**
             * <p>The maximum number of CUs.</p>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder maxCu(Long maxCu) {
                this.maxCu = maxCu;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
}
