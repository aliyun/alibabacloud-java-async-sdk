// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAIDBClusterResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIDBClusterResourceUsageResponseBody</p>
 */
public class DescribeAIDBClusterResourceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    private String engineVersion;

    @com.aliyun.core.annotation.NameInMap("NodeItems")
    private java.util.List<NodeItems> nodeItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAIDBClusterResourceUsageResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.DBClusterId = builder.DBClusterId;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.nodeItems = builder.nodeItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterResourceUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return nodeItems
     */
    public java.util.List<NodeItems> getNodeItems() {
        return this.nodeItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String createTime; 
        private String DBClusterId; 
        private String engine; 
        private String engineVersion; 
        private java.util.List<NodeItems> nodeItems; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAIDBClusterResourceUsageResponseBody model) {
            this.createTime = model.createTime;
            this.DBClusterId = model.DBClusterId;
            this.engine = model.engine;
            this.engineVersion = model.engineVersion;
            this.nodeItems = model.nodeItems;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The time when the cluster was created, in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-13T15:45:27Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the AI database cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2zeu0t5v0p98*****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The database engine of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The DPI engine version of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The resource usage information of the nodes in the cluster.</p>
         */
        public Builder nodeItems(java.util.List<NodeItems> nodeItems) {
            this.nodeItems = nodeItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAIDBClusterResourceUsageResponseBody build() {
            return new DescribeAIDBClusterResourceUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIDBClusterResourceUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterResourceUsageResponseBody</p>
     */
    public static class PodItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameSpace")
        private String nameSpace;

        @com.aliyun.core.annotation.NameInMap("PodIP")
        private String podIP;

        @com.aliyun.core.annotation.NameInMap("ResourceRequest")
        private String resourceRequest;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PodItems(Builder builder) {
            this.createTime = builder.createTime;
            this.name = builder.name;
            this.nameSpace = builder.nameSpace;
            this.podIP = builder.podIP;
            this.resourceRequest = builder.resourceRequest;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PodItems create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameSpace
         */
        public String getNameSpace() {
            return this.nameSpace;
        }

        /**
         * @return podIP
         */
        public String getPodIP() {
            return this.podIP;
        }

        /**
         * @return resourceRequest
         */
        public String getResourceRequest() {
            return this.resourceRequest;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String name; 
            private String nameSpace; 
            private String podIP; 
            private String resourceRequest; 
            private String status; 

            private Builder() {
            } 

            private Builder(PodItems model) {
                this.createTime = model.createTime;
                this.name = model.name;
                this.nameSpace = model.nameSpace;
                this.podIP = model.podIP;
                this.resourceRequest = model.resourceRequest;
                this.status = model.status;
            } 

            /**
             * <p>The time when the pod was created, in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-13T15:45:27Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The name of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>ai-db-pod-001</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace to which the pod belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder nameSpace(String nameSpace) {
                this.nameSpace = nameSpace;
                return this;
            }

            /**
             * <p>The IP address of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.12</p>
             */
            public Builder podIP(String podIP) {
                this.podIP = podIP;
                return this;
            }

            /**
             * <p>The requested resources of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu=1,memory=2Gi</p>
             */
            public Builder resourceRequest(String resourceRequest) {
                this.resourceRequest = resourceRequest;
                return this;
            }

            /**
             * <p>The status of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PodItems build() {
                return new PodItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAIDBClusterResourceUsageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterResourceUsageResponseBody</p>
     */
    public static class NodeItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private String CPU;

        @com.aliyun.core.annotation.NameInMap("CPUUsed")
        private String CPUUsed;

        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private String GPU;

        @com.aliyun.core.annotation.NameInMap("GPUModel")
        private String GPUModel;

        @com.aliyun.core.annotation.NameInMap("GPUUsed")
        private String GPUUsed;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("MemoryUsed")
        private String memoryUsed;

        @com.aliyun.core.annotation.NameInMap("PodItems")
        private java.util.List<PodItems> podItems;

        @com.aliyun.core.annotation.NameInMap("VNodeId")
        private String vNodeId;

        private NodeItems(Builder builder) {
            this.CPU = builder.CPU;
            this.CPUUsed = builder.CPUUsed;
            this.DBNodeId = builder.DBNodeId;
            this.GPU = builder.GPU;
            this.GPUModel = builder.GPUModel;
            this.GPUUsed = builder.GPUUsed;
            this.memory = builder.memory;
            this.memoryUsed = builder.memoryUsed;
            this.podItems = builder.podItems;
            this.vNodeId = builder.vNodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeItems create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public String getCPU() {
            return this.CPU;
        }

        /**
         * @return CPUUsed
         */
        public String getCPUUsed() {
            return this.CPUUsed;
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return GPU
         */
        public String getGPU() {
            return this.GPU;
        }

        /**
         * @return GPUModel
         */
        public String getGPUModel() {
            return this.GPUModel;
        }

        /**
         * @return GPUUsed
         */
        public String getGPUUsed() {
            return this.GPUUsed;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return memoryUsed
         */
        public String getMemoryUsed() {
            return this.memoryUsed;
        }

        /**
         * @return podItems
         */
        public java.util.List<PodItems> getPodItems() {
            return this.podItems;
        }

        /**
         * @return vNodeId
         */
        public String getVNodeId() {
            return this.vNodeId;
        }

        public static final class Builder {
            private String CPU; 
            private String CPUUsed; 
            private String DBNodeId; 
            private String GPU; 
            private String GPUModel; 
            private String GPUUsed; 
            private String memory; 
            private String memoryUsed; 
            private java.util.List<PodItems> podItems; 
            private String vNodeId; 

            private Builder() {
            } 

            private Builder(NodeItems model) {
                this.CPU = model.CPU;
                this.CPUUsed = model.CPUUsed;
                this.DBNodeId = model.DBNodeId;
                this.GPU = model.GPU;
                this.GPUModel = model.GPUModel;
                this.GPUUsed = model.GPUUsed;
                this.memory = model.memory;
                this.memoryUsed = model.memoryUsed;
                this.podItems = model.podItems;
                this.vNodeId = model.vNodeId;
            } 

            /**
             * <p>The total CPU capacity of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The used CPU capacity of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder CPUUsed(String CPUUsed) {
                this.CPUUsed = CPUUsed;
                return this;
            }

            /**
             * <p>The ID of the database node.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-2ze7sztqv1*****</p>
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * <p>The total GPU capacity of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder GPU(String GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>The GPU model of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>NVIDIA A10</p>
             */
            public Builder GPUModel(String GPUModel) {
                this.GPUModel = GPUModel;
                return this;
            }

            /**
             * <p>The used GPU capacity of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder GPUUsed(String GPUUsed) {
                this.GPUUsed = GPUUsed;
                return this;
            }

            /**
             * <p>The total memory capacity of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>16Gi</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The used memory capacity of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>8Gi</p>
             */
            public Builder memoryUsed(String memoryUsed) {
                this.memoryUsed = memoryUsed;
                return this;
            }

            /**
             * <p>The resource information of the pods on the node.</p>
             */
            public Builder podItems(java.util.List<PodItems> podItems) {
                this.podItems = podItems;
                return this;
            }

            /**
             * <p>The ID of the virtual node associated with the database node.</p>
             * 
             * <strong>example:</strong>
             * <p>vnode-001</p>
             */
            public Builder vNodeId(String vNodeId) {
                this.vNodeId = vNodeId;
                return this;
            }

            public NodeItems build() {
                return new NodeItems(this);
            } 

        } 

    }
}
