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
            this.requestId = model.requestId;
            this.systemDisk = model.systemDisk;
            this.updateTime = model.updateTime;
            this.userData = model.userData;
            this.virtualGpuEnabled = model.virtualGpuEnabled;
        } 

        /**
         * Az.
         */
        public Builder az(String az) {
            this.az = az;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * FileSystemMountEnabled.
         */
        public Builder fileSystemMountEnabled(Boolean fileSystemMountEnabled) {
            this.fileSystemMountEnabled = fileSystemMountEnabled;
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
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
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
         * LoginType.
         */
        public Builder loginType(String loginType) {
            this.loginType = loginType;
            return this;
        }

        /**
         * MachineType.
         */
        public Builder machineType(String machineType) {
            this.machineType = machineType;
            return this;
        }

        /**
         * NodeCount.
         */
        public Builder nodeCount(String nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * NodeGroupDescription.
         */
        public Builder nodeGroupDescription(String nodeGroupDescription) {
            this.nodeGroupDescription = nodeGroupDescription;
            return this;
        }

        /**
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * NodeGroupName.
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        /**
         * VirtualGpuEnabled.
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
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * Size.
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
