// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link DescribeNodeGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeGroupResponseBody</p>
 */
public class DescribeNodeGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Az")
    private String az;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("FileSystemMountEnabled")
    private Boolean fileSystemMountEnabled;

    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.NameInMap("LoginType")
    private String loginType;

    @com.aliyun.core.annotation.NameInMap("MachineType")
    private String machineType;

    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private String nodeCount;

    @com.aliyun.core.annotation.NameInMap("NodeGroupDescription")
    private String nodeGroupDescription;

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("NodeGroupName")
    private String nodeGroupName;

    @com.aliyun.core.annotation.NameInMap("RamRoleName")
    private String ramRoleName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.NameInMap("VirtualGpuEnabled")
    private Boolean virtualGpuEnabled;

    private DescribeNodeGroupResponseBody(Builder builder) {
        this.az = builder.az;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.createTime = builder.createTime;
        this.fileSystemMountEnabled = builder.fileSystemMountEnabled;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.keyPairName = builder.keyPairName;
        this.loginType = builder.loginType;
        this.machineType = builder.machineType;
        this.nodeCount = builder.nodeCount;
        this.nodeGroupDescription = builder.nodeGroupDescription;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeGroupName = builder.nodeGroupName;
        this.ramRoleName = builder.ramRoleName;
        this.requestId = builder.requestId;
        this.systemDisk = builder.systemDisk;
        this.updateTime = builder.updateTime;
        this.userData = builder.userData;
        this.virtualGpuEnabled = builder.virtualGpuEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return az
     */
    public String getAz() {
        return this.az;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return fileSystemMountEnabled
     */
    public Boolean getFileSystemMountEnabled() {
        return this.fileSystemMountEnabled;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return loginType
     */
    public String getLoginType() {
        return this.loginType;
    }

    /**
     * @return machineType
     */
    public String getMachineType() {
        return this.machineType;
    }

    /**
     * @return nodeCount
     */
    public String getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return nodeGroupDescription
     */
    public String getNodeGroupDescription() {
        return this.nodeGroupDescription;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return virtualGpuEnabled
     */
    public Boolean getVirtualGpuEnabled() {
        return this.virtualGpuEnabled;
    }

    public static final class Builder {
        private String az; 
        private String clusterId; 
        private String clusterName; 
        private String createTime; 
        private Boolean fileSystemMountEnabled; 
        private String imageId; 
        private String imageName; 
        private String keyPairName; 
        private String loginType; 
        private String machineType; 
        private String nodeCount; 
        private String nodeGroupDescription; 
        private String nodeGroupId; 
        private String nodeGroupName; 
        private String ramRoleName; 
        private String requestId; 
        private SystemDisk systemDisk; 
        private String updateTime; 
        private String userData; 
        private Boolean virtualGpuEnabled; 

        private Builder() {
        } 

        private Builder(DescribeNodeGroupResponseBody model) {
            this.az = model.az;
            this.clusterId = model.clusterId;
            this.clusterName = model.clusterName;
            this.createTime = model.createTime;
            this.fileSystemMountEnabled = model.fileSystemMountEnabled;
            this.imageId = model.imageId;
            this.imageName = model.imageName;
            this.keyPairName = model.keyPairName;
            this.loginType = model.loginType;
            this.machineType = model.machineType;
            this.nodeCount = model.nodeCount;
            this.nodeGroupDescription = model.nodeGroupDescription;
            this.nodeGroupId = model.nodeGroupId;
            this.nodeGroupName = model.nodeGroupName;
            this.ramRoleName = model.ramRoleName;
            this.requestId = model.requestId;
            this.systemDisk = model.systemDisk;
            this.updateTime = model.updateTime;
            this.userData = model.userData;
            this.virtualGpuEnabled = model.virtualGpuEnabled;
        } 

        /**
         * <p>The zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-a</p>
         */
        public Builder az(String az) {
            this.az = az;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i111987311754895199538</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-basic-cluster</p>
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The creation time. The time is in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-07T17:19:42.980000</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether file storage mounting is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder fileSystemMountEnabled(Boolean fileSystemMountEnabled) {
            this.fileSystemMountEnabled = fileSystemMountEnabled;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i190720111752146430748</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alinux3_x86_5.10.134-16.3_NV_RunC_D3_E3C7_570.133.20_V1.0_250428</p>
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The name of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-key</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>Valid values:
         * • password: The group supports only password-based logon. 
         * • keypair: The group supports only key pair-based logon. 
         * • both: The group supports both password-based and key pair-based logon.</p>
         * <p>If the value is empty, no logon method is configured for the group.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        public Builder loginType(String loginType) {
            this.loginType = loginType;
            return this;
        }

        /**
         * <p>The machine type.</p>
         * 
         * <strong>example:</strong>
         * <p>efg2.NH2cn</p>
         */
        public Builder machineType(String machineType) {
            this.machineType = machineType;
            return this;
        }

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nodeCount(String nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * <p>The node group description.</p>
         * 
         * <strong>example:</strong>
         * <p>lingjun alinux node group</p>
         */
        public Builder nodeGroupDescription(String nodeGroupDescription) {
            this.nodeGroupDescription = nodeGroupDescription;
            return this;
        }

        /**
         * <p>The node group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i120982301752461697971</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>The node group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-ack</p>
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * <p>The name of the RAM role for the node. You can call the RAM API ListRoles to query the RAM roles that you have created.</p>
         * 
         * <strong>example:</strong>
         * <p>xianwen-test-ram-role</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>83896080-59E3-5775-BDDC-8084691C3D96</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The system cloud disk information.</p>
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * <p>The update time. The time is in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-20T11:18:11.164000</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The user-defined script.</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/bash
         * uptime
         * echo &quot;aaaaaaa&quot; &gt;&gt; /tmp/tttest.sh</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        /**
         * <p>Indicates whether GPU virtualization slicing is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder virtualGpuEnabled(Boolean virtualGpuEnabled) {
            this.virtualGpuEnabled = virtualGpuEnabled;
            return this;
        }

        public DescribeNodeGroupResponseBody build() {
            return new DescribeNodeGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNodeGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodeGroupResponseBody</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private String performanceLevel; 
            private Integer size; 

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.category = model.category;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
            } 

            /**
             * <p>The category of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The performance level (PL) of the ESSD used as the system cloud disk. Valid values:</p>
             * <ul>
             * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
             * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The size of the system cloud disk. Unit: GiB. Valid values:</p>
             * <ul>
             * <li>Premium performance disk: 20 to 500.</li>
             * <li>ESSD:<ul>
             * <li>PL0: 1 to 2048.</li>
             * <li>PL1: 20 to 2048.</li>
             * <li>PL2: 461 to 2048.</li>
             * <li>PL3: 1261 to 2048.</li>
             * </ul>
             * </li>
             * <li>ESSD AutoPL: 1 to 2048.</li>
             * <li>Other cloud disk types: 20 to 2048.</li>
             * </ul>
             * <p>Default value: max{20, size of the image specified by the parameter ImageId}.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
}
