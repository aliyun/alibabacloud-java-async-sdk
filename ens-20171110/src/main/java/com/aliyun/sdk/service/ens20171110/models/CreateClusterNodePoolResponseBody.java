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
         * Nodepool.
         */
        public Builder nodepool(Nodepool nodepool) {
            this.nodepool = nodepool;
            return this;
        }

        /**
         * RequestId.
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
             * PreUserData.
             */
            public Builder preUserData(String preUserData) {
                this.preUserData = preUserData;
                return this;
            }

            /**
             * UserData.
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
             * EnsRegionId.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodepoolId.
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
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Size.
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
             * DataDisks.
             */
            public Builder dataDisks(java.util.List<DataDisks> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * InstanceChargeType.
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * KeyPairName.
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * SystemDiskCategory.
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * SystemDiskSize.
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * VswitchIds.
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
            private Integer initialNodes; 
            private Integer removingNodes; 
            private Integer servingNodes; 
            private String state; 
            private Integer totalNodes; 

            private Builder() {
            } 

            private Builder(Status model) {
                this.desiredNodes = model.desiredNodes;
                this.initialNodes = model.initialNodes;
                this.removingNodes = model.removingNodes;
                this.servingNodes = model.servingNodes;
                this.state = model.state;
                this.totalNodes = model.totalNodes;
            } 

            /**
             * DesiredNodes.
             */
            public Builder desiredNodes(Integer desiredNodes) {
                this.desiredNodes = desiredNodes;
                return this;
            }

            /**
             * InitialNodes.
             */
            public Builder initialNodes(Integer initialNodes) {
                this.initialNodes = initialNodes;
                return this;
            }

            /**
             * RemovingNodes.
             */
            public Builder removingNodes(Integer removingNodes) {
                this.removingNodes = removingNodes;
                return this;
            }

            /**
             * ServingNodes.
             */
            public Builder servingNodes(Integer servingNodes) {
                this.servingNodes = servingNodes;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TotalNodes.
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
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * KubernetesConfig.
             */
            public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
                this.kubernetesConfig = kubernetesConfig;
                return this;
            }

            /**
             * NodepoolInfo.
             */
            public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
                this.nodepoolInfo = nodepoolInfo;
                return this;
            }

            /**
             * ScalingGroup.
             */
            public Builder scalingGroup(ScalingGroup scalingGroup) {
                this.scalingGroup = scalingGroup;
                return this;
            }

            /**
             * Status.
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
