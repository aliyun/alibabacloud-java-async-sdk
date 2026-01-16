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
 * {@link ModifyClusterNodePoolRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterNodePoolRequest</p>
 */
public class ModifyClusterNodePoolRequest extends Request {
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
    private ScalingGroup scalingGroup;

    private ModifyClusterNodePoolRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.kubernetesConfig = builder.kubernetesConfig;
        this.nodepoolInfo = builder.nodepoolInfo;
        this.scalingGroup = builder.scalingGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterNodePoolRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyClusterNodePoolRequest, Builder> {
        private String clusterId; 
        private KubernetesConfig kubernetesConfig; 
        private NodepoolInfo nodepoolInfo; 
        private ScalingGroup scalingGroup; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterNodePoolRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.kubernetesConfig = request.kubernetesConfig;
            this.nodepoolInfo = request.nodepoolInfo;
            this.scalingGroup = request.scalingGroup;
        } 

        /**
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
         * KubernetesConfig.
         */
        public Builder kubernetesConfig(KubernetesConfig kubernetesConfig) {
            String kubernetesConfigShrink = shrink(kubernetesConfig, "KubernetesConfig", "json");
            this.putQueryParameter("KubernetesConfig", kubernetesConfigShrink);
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder nodepoolInfo(NodepoolInfo nodepoolInfo) {
            String nodepoolInfoShrink = shrink(nodepoolInfo, "NodepoolInfo", "json");
            this.putQueryParameter("NodepoolInfo", nodepoolInfoShrink);
            this.nodepoolInfo = nodepoolInfo;
            return this;
        }

        /**
         * ScalingGroup.
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            String scalingGroupShrink = shrink(scalingGroup, "ScalingGroup", "json");
            this.putQueryParameter("ScalingGroup", scalingGroupShrink);
            this.scalingGroup = scalingGroup;
            return this;
        }

        @Override
        public ModifyClusterNodePoolRequest build() {
            return new ModifyClusterNodePoolRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
     */
    public static class NodepoolInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodepoolId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodepoolId;

        private NodepoolInfo(Builder builder) {
            this.nodepoolId = builder.nodepoolId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodepoolInfo create() {
            return builder().build();
        }

        /**
         * @return nodepoolId
         */
        public String getNodepoolId() {
            return this.nodepoolId;
        }

        public static final class Builder {
            private String nodepoolId; 

            private Builder() {
            } 

            private Builder(NodepoolInfo model) {
                this.nodepoolId = model.nodepoolId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>np68mi5y1dd748ky37ojo2kqdrz</p>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
     * {@link ModifyClusterNodePoolRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterNodePoolRequest</p>
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
}
