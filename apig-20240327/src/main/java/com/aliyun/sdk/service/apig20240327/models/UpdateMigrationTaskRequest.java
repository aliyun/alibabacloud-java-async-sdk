// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UpdateMigrationTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateMigrationTaskRequest</p>
 */
public class UpdateMigrationTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clusterNamespace")
    private String clusterNamespace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("slbId")
    private String slbId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("switchType")
    private String switchType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("target")
    private String target;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("virtualServices")
    private java.util.List<VirtualServices> virtualServices;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("weight")
    private Integer weight;

    private UpdateMigrationTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.clusterNamespace = builder.clusterNamespace;
        this.description = builder.description;
        this.serviceName = builder.serviceName;
        this.slbId = builder.slbId;
        this.switchType = builder.switchType;
        this.target = builder.target;
        this.virtualServices = builder.virtualServices;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMigrationTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return clusterNamespace
     */
    public String getClusterNamespace() {
        return this.clusterNamespace;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
    }

    /**
     * @return switchType
     */
    public String getSwitchType() {
        return this.switchType;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return virtualServices
     */
    public java.util.List<VirtualServices> getVirtualServices() {
        return this.virtualServices;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<UpdateMigrationTaskRequest, Builder> {
        private String taskId; 
        private String clusterNamespace; 
        private String description; 
        private String serviceName; 
        private String slbId; 
        private String switchType; 
        private String target; 
        private java.util.List<VirtualServices> virtualServices; 
        private Integer weight; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMigrationTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.clusterNamespace = request.clusterNamespace;
            this.description = request.description;
            this.serviceName = request.serviceName;
            this.slbId = request.slbId;
            this.switchType = request.switchType;
            this.target = request.target;
            this.virtualServices = request.virtualServices;
            this.weight = request.weight;
        } 

        /**
         * <p>The task ID (path parameter). The task must belong to the current user.</p>
         * 
         * <strong>example:</strong>
         * <p>mt-xxxx</p>
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The namespace of the source cluster (for SLB traffic switching).</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder clusterNamespace(String clusterNamespace) {
            this.putBodyParameter("clusterNamespace", clusterNamespace);
            this.clusterNamespace = clusterNamespace;
            return this;
        }

        /**
         * <p>The task description. For DNS-based Engine updates, only this field is modified.</p>
         * 
         * <strong>example:</strong>
         * <p>Migration test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The SLB service name.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx-ingress-lb</p>
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The SLB instance ID. Required when the task is in the Initial state with SLB traffic switching. The type is determined by the prefix (lb- or nlb-).</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1xxxx</p>
         */
        public Builder slbId(String slbId) {
            this.putBodyParameter("slbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * <p>The traffic switching method. Required when advancing from the Initial state.</p>
         * 
         * <strong>example:</strong>
         * <p>SLB</p>
         */
        public Builder switchType(String switchType) {
            this.putBodyParameter("switchType", switchType);
            this.switchType = switchType;
            return this;
        }

        /**
         * <p>Required. The update target. Determines whether to advance the task status or perform an engine operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Task</p>
         */
        public Builder target(String target) {
            this.putBodyParameter("target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The list of backend server group bindings.</p>
         */
        public Builder virtualServices(java.util.List<VirtualServices> virtualServices) {
            this.putBodyParameter("virtualServices", virtualServices);
            this.virtualServices = virtualServices;
            return this;
        }

        /**
         * <p>The traffic switching weight for the legacy flow. Valid values: 0 to 100. Takes effect when the target is set to Engine.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder weight(Integer weight) {
            this.putBodyParameter("weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public UpdateMigrationTaskRequest build() {
            return new UpdateMigrationTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMigrationTaskRequest} extends {@link TeaModel}
     *
     * <p>UpdateMigrationTaskRequest</p>
     */
    public static class VirtualServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("virtualServiceGroupId")
        private String virtualServiceGroupId;

        @com.aliyun.core.annotation.NameInMap("virtualServiceGroupName")
        private String virtualServiceGroupName;

        private VirtualServices(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.virtualServiceGroupId = builder.virtualServiceGroupId;
            this.virtualServiceGroupName = builder.virtualServiceGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VirtualServices create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return virtualServiceGroupId
         */
        public String getVirtualServiceGroupId() {
            return this.virtualServiceGroupId;
        }

        /**
         * @return virtualServiceGroupName
         */
        public String getVirtualServiceGroupName() {
            return this.virtualServiceGroupName;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 
            private String virtualServiceGroupId; 
            private String virtualServiceGroupName; 

            private Builder() {
            } 

            private Builder(VirtualServices model) {
                this.port = model.port;
                this.protocol = model.protocol;
                this.virtualServiceGroupId = model.virtualServiceGroupId;
                this.virtualServiceGroupName = model.virtualServiceGroupName;
            } 

            /**
             * <p>The port. Valid values: 1 to 65535.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol. Required for CLB.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>CLB VServerGroupId / NLB ServerGroupId</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-xxxx</p>
             */
            public Builder virtualServiceGroupId(String virtualServiceGroupId) {
                this.virtualServiceGroupId = virtualServiceGroupId;
                return this;
            }

            /**
             * <p>The group name.</p>
             * 
             * <strong>example:</strong>
             * <p>80-tcp</p>
             */
            public Builder virtualServiceGroupName(String virtualServiceGroupName) {
                this.virtualServiceGroupName = virtualServiceGroupName;
                return this;
            }

            public VirtualServices build() {
                return new VirtualServices(this);
            } 

        } 

    }
}
