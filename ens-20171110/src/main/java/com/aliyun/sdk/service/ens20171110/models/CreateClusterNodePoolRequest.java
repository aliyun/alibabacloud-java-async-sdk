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
 * {@link CreateClusterNodePoolRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterNodePoolRequest</p>
 */
public class CreateClusterNodePoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KubernetesConfig")
    private KubernetesConfig kubernetesConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodepoolInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private NodepoolInfo nodepoolInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private ScalingGroup scalingGroup;

    private CreateClusterNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.kubernetesConfig = builder.kubernetesConfig;
        this.nodepoolInfo = builder.nodepoolInfo;
        this.scalingGroup = builder.scalingGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterNodePoolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateClusterNodePoolRequest, Builder> {
        private String clusterId; 
        private KubernetesConfig kubernetesConfig; 
        private NodepoolInfo nodepoolInfo; 
        private ScalingGroup scalingGroup; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.kubernetesConfig = request.kubernetesConfig;
            this.nodepoolInfo = request.nodepoolInfo;
            this.scalingGroup = request.scalingGroup;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eck-xxxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The cluster-related configurations.</p>
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            String kubernetesConfigShrink = shrink(kubernetesConfig, "KubernetesConfig", "json");
            this.putQueryParameter("KubernetesConfig", kubernetesConfigShrink);
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * <p>The node pool configurations.</p>
         * <p>This parameter is required.</p>
         */
        public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
            String nodepoolInfoShrink = shrink(nodepoolInfo, "NodepoolInfo", "json");
            this.putQueryParameter("NodepoolInfo", nodepoolInfoShrink);
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }

        /**
         * <p>The scaling group configurations.</p>
         * <p>This parameter is required.</p>
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            String scalingGroupShrink = shrink(scalingGroup, "ScalingGroup", "json");
            this.putQueryParameter("ScalingGroup", scalingGroupShrink);
            this.scalingGroup = scalingGroup;
            return this;
        }

        @Override
        public CreateClusterNodePoolRequest build() {
            return new CreateClusterNodePoolRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p>The script to be executed after the machine is created and before it is added to the cluster. The content must be Base64-encoded.</p>
             * 
             * <strong>example:</strong>
             * <p>ZWNobyBvawo=</p>
             */
            public Builder preUserData(String preUserData) {
                this.preUserData = preUserData;
                return this;
            }

            /**
             * <p>The script to be executed after the machine is created and added to the cluster. The content must be Base64-encoded.</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
     */
    public static class NodepoolInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private NodepoolInfo(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodepoolInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(NodepoolInfo model) {
                this.name = model.name;
            } 

            /**
             * <p>The name of the node pool.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public NodepoolInfo build() {
                return new NodepoolInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
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
             * <p>The size of the data cloud disk. Unit: GB. Minimum value: 20. The value must be a multiple of 10.</p>
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
     * {@link CreateClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>CreateClusterNodePoolRequest</p>
     */
    public static class ScalingGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataDisks")
        private java.util.List<DataDisks> dataDisks;

        @com.aliyun.core.annotation.NameInMap("DesiredSize")
        private Integer desiredSize;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
        private String instanceChargeType;

        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        @com.aliyun.core.annotation.Validation(required = true)
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
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> vswitchIds;

        private ScalingGroup(Builder builder) {
            this.dataDisks = builder.dataDisks;
            this.desiredSize = builder.desiredSize;
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
         * @return desiredSize
         */
        public Integer getDesiredSize() {
            return this.desiredSize;
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
            private Integer desiredSize; 
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
                this.desiredSize = model.desiredSize;
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
             * <p>The size of the data cloud disk. Unit: GB.</p>
             */
            public Builder dataDisks(java.util.List<DataDisks> dataDisks) {
                this.dataDisks = dataDisks;
                return this;
            }

            /**
             * <p>The expected number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder desiredSize(Integer desiredSize) {
                this.desiredSize = desiredSize;
                return this;
            }

            /**
             * <p>The image ID of the instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>m-6734fzvcwcv2o8jj201cpa7ox</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The billing method of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder instanceChargeType(String instanceChargeType) {
                this.instanceChargeType = instanceChargeType;
                return this;
            }

            /**
             * <p>The list of instance types for the nodes in the node pool.</p>
             * <p>This parameter is required.</p>
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            /**
             * <p>The key pair of the instance. This parameter and Password are mutually exclusive.</p>
             * 
             * <strong>example:</strong>
             * <p>key-pair-name</p>
             */
            public Builder keyPairName(String keyPairName) {
                this.keyPairName = keyPairName;
                return this;
            }

            /**
             * <p>The password used when creating instances in the node pool. This parameter and KeyPairName are mutually exclusive.</p>
             * 
             * <strong>example:</strong>
             * <p>some-test-password</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The category of the system cloud disk. Valid values: local_ssd, local_hdd, cloud_efficiency, and cloud_ssd.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_efficiency</p>
             */
            public Builder systemDiskCategory(String systemDiskCategory) {
                this.systemDiskCategory = systemDiskCategory;
                return this;
            }

            /**
             * <p>The size of the system cloud disk. Unit: GB. Minimum value: 20. The value must be a multiple of 10.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder systemDiskSize(Integer systemDiskSize) {
                this.systemDiskSize = systemDiskSize;
                return this;
            }

            /**
             * <p>The vSwitches used by the instances.</p>
             * <p>This parameter is required.</p>
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
}
