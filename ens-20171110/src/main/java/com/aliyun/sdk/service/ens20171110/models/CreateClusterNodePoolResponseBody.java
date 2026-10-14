// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateClusterNodePoolResponseBody} extends {@link TeaModel}
 *
 * <p>CreateClusterNodePoolResponseBody</p>
 */
public class CreateClusterNodePoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Nodepool")
    private Nodepool nodepool;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateClusterNodePoolResponseBody(Builder builder) {
        this.nodepool = builder.nodepool;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterNodePoolResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodepool
     */
    public Nodepool getNodepool() {
        return this.nodepool;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Nodepool nodepool; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateClusterNodePoolResponseBody model) {
            this.nodepool = model.nodepool;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The node pool configurations.</p>
         */
        public Builder nodepool(Nodepool nodepool) {
            this.nodepool = nodepool;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateClusterNodePoolResponseBody build() {
            return new CreateClusterNodePoolResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateClusterNodePoolResponseBody} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolResponseBody</p>
     */
    public static class KubernetesConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PreUserData")
        private String preUserData;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private KubernetesConfig(Builder builder) {
            this.preUserData = builder.preUserData;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KubernetesConfig create() {
            return builder().build();
        }

        /**
         * @return preUserData
         */
        public String getPreUserData() {
            return this.preUserData;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String preUserData; 
            private String userData; 

            private Builder() {
            } 

            private Builder(KubernetesConfig model) {
                this.preUserData = model.preUserData;
                this.userData = model.userData;
            } 

            /**
             * <p>The script to be executed after the instance is created and before it is added to the cluster. The content must be Base64-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWNobyBvawo=</p>
             */
            public Builder preUserData(String preUserData) {
                this.preUserData = preUserData;
                return this;
            }

            /**
             * <p>The script to be executed after the instance is created and added to the cluster. The content must be Base64-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWNobyBvawo=</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public KubernetesConfig build() {
                return new KubernetesConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterNodePoolResponseBody} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolResponseBody</p>
     */
    public static class NodepoolInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodepoolId")
        private String nodepoolId;

        private NodepoolInfo(Builder builder) {
            this.ensRegionId = builder.ensRegionId;
            this.name = builder.name;
            this.nodepoolId = builder.nodepoolId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodepoolInfo create() {
            return builder().build();
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodepoolId
         */
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        public static final class Builder {
            private String ensRegionId; 
            private String name; 
            private String nodepoolId; 

            private Builder() {
            } 

            private Builder(NodepoolInfo model) {
                this.ensRegionId = model.ensRegionId;
                this.name = model.name;
                this.nodepoolId = model.nodepoolId;
            } 

            /**
             * <p>The ENS region ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-guiyang-14</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node pool ID.</p>
             * 
             * <strong>example:</strong>
             * <p>np1176939548ac49e59febe82dcbf1ad56</p>
             */
            public Builder nodepoolId(String nodepoolId) {
                this.nodepoolId = nodepoolId;
                return this;
            }

            public NodepoolInfo build() {
                return new NodepoolInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterNodePoolResponseBody} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolResponseBody</p>
     */
    public static class DataDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private DataDisks(Builder builder) {
            this.category = builder.category;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisks create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(DataDisks model) {
                this.category = model.category;
                this.size = model.size;
            } 

            /**
             * <p>The disk category.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The size of the data cloud disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public DataDisks build() {
                return new DataDisks(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterNodePoolResponseBody} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolResponseBody</p>
     */
    public static class ScalingGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDisks")
        private java.util.List<DataDisks> dataDisks;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        private java.util.List<String> instanceTypes;

        @com.aliyun.core.annotation.NameInMap("KeyPairName")
        private String keyPairName;

        @com.aliyun.core.annotation.NameInMap("Password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("SystemDiskCategory")
        private String systemDiskCategory;

        @com.aliyun.core.annotation.NameInMap("SystemDiskSize")
        private Integer systemDiskSize;

        @com.aliyun.core.annotation.NameInMap("VswitchIds")
        private java.util.List<String> vswitchIds;

        private ScalingGroup(Builder builder) {
            this.dataDisks = builder.dataDisks;
            this.imageId = builder.imageId;
            this.instanceChargeType = builder.instanceChargeType;
            this.instanceTypes = builder.instanceTypes;
            this.keyPairName = builder.keyPairName;
            this.password = builder.password;
            this.systemDiskCategory = builder.systemDiskCategory;
            this.systemDiskSize = builder.systemDiskSize;
            this.vswitchIds = builder.vswitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingGroup create() {
            return builder().build();
        }

        /**
         * @return dataDisks
         */
        public java.util.List<DataDisks> getDataDisks() {
            return this.dataDisks;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return instanceChargeType
         */
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        /**
         * @return instanceTypes
         */
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        /**
         * @return keyPairName
         */
        public String getKeyPairName() {
            return this.keyPairName;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return systemDiskCategory
         */
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        /**
         * @return systemDiskSize
         */
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        /**
         * @return vswitchIds
         */
        public java.util.List<String> getVswitchIds() {
            return this.vswitchIds;
        }

        public static final class Builder {
            private java.util.List<DataDisks> dataDisks; 
            private String imageId; 
            private String instanceChargeType; 
            private java.util.List<String> instanceTypes; 
            private String keyPairName; 
            private String password; 
            private String systemDiskCategory; 
            private Integer systemDiskSize; 
            private java.util.List<String> vswitchIds; 

            private Builder() {
            } 

            private Builder(ScalingGroup model) {
                this.dataDisks = model.dataDisks;
                this.imageId = model.imageId;
                this.instanceChargeType = model.instanceChargeType;
                this.instanceTypes = model.instanceTypes;
                this.keyPairName = model.keyPairName;
                this.password = model.password;
                this.systemDiskCategory = model.systemDiskCategory;
                this.systemDiskSize = model.systemDiskSize;
                this.vswitchIds = model.vswitchIds;
            } 

            /**
             * <p>The data cloud disk information of the nodes.</p>
             */
            public Builder dataDisks(java.util.List<DataDisks> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * <p>The image ID of the control plane virtual machine.</p>
             * 
             * <strong>example:</strong>
             * <p>m-67bdk1kpu1ylmt7k33h5dbiov</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The billing method of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The list of instance types for the nodes in the node pool.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The name of the key pair.</p>
             * 
             * <strong>example:</strong>
             * <p>key-pair-name</p>
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * <p>The logon password of the instance.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The system cloud disk category of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The size of the system cloud disk. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The IDs of the vSwitches where the cluster nodes reside.</p>
             */
            public Builder vswitchIds(java.util.List<String> vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            public ScalingGroup build() {
                return new ScalingGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterNodePoolResponseBody} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolResponseBody</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesiredNodes")
        private Integer desiredNodes;

        @com.aliyun.core.annotation.NameInMap("FailedNodes")
        private Integer failedNodes;

        @com.aliyun.core.annotation.NameInMap("InitialNodes")
        private Integer initialNodes;

        @com.aliyun.core.annotation.NameInMap("RemovingNodes")
        private Integer removingNodes;

        @com.aliyun.core.annotation.NameInMap("ServingNodes")
        private Integer servingNodes;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TotalNodes")
        private Integer totalNodes;

        private Status(Builder builder) {
            this.desiredNodes = builder.desiredNodes;
            this.failedNodes = builder.failedNodes;
            this.initialNodes = builder.initialNodes;
            this.removingNodes = builder.removingNodes;
            this.servingNodes = builder.servingNodes;
            this.state = builder.state;
            this.totalNodes = builder.totalNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return desiredNodes
         */
        public Integer getDesiredNodes() {
            return this.desiredNodes;
        }

        /**
         * @return failedNodes
         */
        public Integer getFailedNodes() {
            return this.failedNodes;
        }

        /**
         * @return initialNodes
         */
        public Integer getInitialNodes() {
            return this.initialNodes;
        }

        /**
         * @return removingNodes
         */
        public Integer getRemovingNodes() {
            return this.removingNodes;
        }

        /**
         * @return servingNodes
         */
        public Integer getServingNodes() {
            return this.servingNodes;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return totalNodes
         */
        public Integer getTotalNodes() {
            return this.totalNodes;
        }

        public static final class Builder {
            private Integer desiredNodes; 
            private Integer failedNodes; 
            private Integer initialNodes; 
            private Integer removingNodes; 
            private Integer servingNodes; 
            private String state; 
            private Integer totalNodes; 

            private Builder() {
            } 

            private Builder(Status model) {
                this.desiredNodes = model.desiredNodes;
                this.failedNodes = model.failedNodes;
                this.initialNodes = model.initialNodes;
                this.removingNodes = model.removingNodes;
                this.servingNodes = model.servingNodes;
                this.state = model.state;
                this.totalNodes = model.totalNodes;
            } 

            /**
             * <p>The expected number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder desiredNodes(Integer desiredNodes) {
                this.desiredNodes = desiredNodes;
                return this;
            }

            /**
             * <p>The nodes that failed to be created in the node pool.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedNodes(Integer failedNodes) {
                this.failedNodes = failedNodes;
                return this;
            }

            /**
             * <p>The number of instances that are being created.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder initialNodes(Integer initialNodes) {
                this.initialNodes = initialNodes;
                return this;
            }

            /**
             * <p>The number of instances that are being deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder removingNodes(Integer removingNodes) {
                this.removingNodes = removingNodes;
                return this;
            }

            /**
             * <p>The number of instances that are in use.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder servingNodes(Integer servingNodes) {
                this.servingNodes = servingNodes;
                return this;
            }

            /**
             * <p>The state of the node pool. Valid values:</p>
             * <ul>
             * <li>active: The desired state is reached.</li>
             * <li>scaling: The node pool is scaling out.</li>
             * <li>removing_nodes: The node pool is scaling in.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The total number of instances, including instances that are being created, in use, and being deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalNodes(Integer totalNodes) {
                this.totalNodes = totalNodes;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterNodePoolResponseBody} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolResponseBody</p>
     */
    public static class Nodepool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("KubernetesConfig")
        private KubernetesConfig kubernetesConfig;

        @com.aliyun.core.annotation.NameInMap("NodepoolInfo")
        private NodepoolInfo nodepoolInfo;

        @com.aliyun.core.annotation.NameInMap("ScalingGroup")
        private ScalingGroup scalingGroup;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Status status;

        private Nodepool(Builder builder) {
            this.clusterId = builder.clusterId;
            this.kubernetesConfig = builder.kubernetesConfig;
            this.nodepoolInfo = builder.nodepoolInfo;
            this.scalingGroup = builder.scalingGroup;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodepool create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return kubernetesConfig
         */
        public KubernetesConfig getKubernetesConfig() {
            return this.kubernetesConfig;
        }

        /**
         * @return nodepoolInfo
         */
        public NodepoolInfo getNodepoolInfo() {
            return this.nodepoolInfo;
        }

        /**
         * @return scalingGroup
         */
        public ScalingGroup getScalingGroup() {
            return this.scalingGroup;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterId; 
            private KubernetesConfig kubernetesConfig; 
            private NodepoolInfo nodepoolInfo; 
            private ScalingGroup scalingGroup; 
            private Status status; 

            private Builder() {
            } 

            private Builder(Nodepool model) {
                this.clusterId = model.clusterId;
                this.kubernetesConfig = model.kubernetesConfig;
                this.nodepoolInfo = model.nodepoolInfo;
                this.scalingGroup = model.scalingGroup;
                this.status = model.status;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>eck-d2666c5f</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The Kubernetes-related configurations.</p>
             */
            public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
                this.kubernetesConfig = kubernetesConfig;
                return this;
            }

            /**
             * <p>The node pool information.</p>
             */
            public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
                this.nodepoolInfo = nodepoolInfo;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the newly created scaling group belongs. You can assign the newly created scaling group to a specified resource group. If you do not specify this parameter, the scaling group is assigned to the default resource group.</p>
             */
            public Builder scalingGroup(ScalingGroup scalingGroup) {
                this.scalingGroup = scalingGroup;
                return this;
            }

            /**
             * <p>The status information of the node pool.</p>
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            public Nodepool build() {
                return new Nodepool(this);
            } 

        } 

    }
}
