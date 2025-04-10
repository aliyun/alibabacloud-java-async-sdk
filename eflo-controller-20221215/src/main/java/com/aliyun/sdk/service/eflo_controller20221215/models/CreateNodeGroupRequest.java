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
 * {@link CreateNodeGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateNodeGroupRequest</p>
 */
public class CreateNodeGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private NodeGroup nodeGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeUnit")
    private java.util.Map<String, ?> nodeUnit;

    private CreateNodeGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.nodeGroup = builder.nodeGroup;
        this.nodeUnit = builder.nodeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNodeGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return nodeGroup
     */
    public NodeGroup getNodeGroup() {
        return this.nodeGroup;
    }

    /**
     * @return nodeUnit
     */
    public java.util.Map<String, ?> getNodeUnit() {
        return this.nodeUnit;
    }

    public static final class Builder extends Request.Builder<CreateNodeGroupRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private NodeGroup nodeGroup; 
        private java.util.Map<String, ?> nodeUnit; 

        private Builder() {
            super();
        } 

        private Builder(CreateNodeGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.nodeGroup = request.nodeGroup;
            this.nodeUnit = request.nodeUnit;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Cluster ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i118191731740041623425</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Node ID.</p>
         * <p>This parameter is required.</p>
         */
        public Builder nodeGroup(NodeGroup nodeGroup) {
            String nodeGroupShrink = shrink(nodeGroup, "NodeGroup", "json");
            this.putBodyParameter("NodeGroup", nodeGroupShrink);
            this.nodeGroup = nodeGroup;
            return this;
        }

        /**
         * <p>Node information</p>
         */
        public Builder nodeUnit(java.util.Map<String, ?> nodeUnit) {
            String nodeUnitShrink = shrink(nodeUnit, "NodeUnit", "json");
            this.putBodyParameter("NodeUnit", nodeUnitShrink);
            this.nodeUnit = nodeUnit;
            return this;
        }

        @Override
        public CreateNodeGroupRequest build() {
            return new CreateNodeGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateNodeGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateNodeGroupRequest</p>
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
    /**
     * 
     * {@link CreateNodeGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateNodeGroupRequest</p>
     */
    public static class NodeGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Az")
        @com.aliyun.core.annotation.Validation(required = true)
        private String az;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("MachineType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String machineType;

        @com.aliyun.core.annotation.NameInMap("NodeGroupDescription")
        private String nodeGroupDescription;

        @com.aliyun.core.annotation.NameInMap("NodeGroupName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeGroupName;

        @com.aliyun.core.annotation.NameInMap("SystemDisk")
        private SystemDisk systemDisk;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private NodeGroup(Builder builder) {
            this.az = builder.az;
            this.imageId = builder.imageId;
            this.machineType = builder.machineType;
            this.nodeGroupDescription = builder.nodeGroupDescription;
            this.nodeGroupName = builder.nodeGroupName;
            this.systemDisk = builder.systemDisk;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeGroup create() {
            return builder().build();
        }

        /**
         * @return az
         */
        public String getAz() {
            return this.az;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return machineType
         */
        public String getMachineType() {
            return this.machineType;
        }

        /**
         * @return nodeGroupDescription
         */
        public String getNodeGroupDescription() {
            return this.nodeGroupDescription;
        }

        /**
         * @return nodeGroupName
         */
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        /**
         * @return systemDisk
         */
        public SystemDisk getSystemDisk() {
            return this.systemDisk;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String az; 
            private String imageId; 
            private String machineType; 
            private String nodeGroupDescription; 
            private String nodeGroupName; 
            private SystemDisk systemDisk; 
            private String userData; 

            private Builder() {
            } 

            private Builder(NodeGroup model) {
                this.az = model.az;
                this.imageId = model.imageId;
                this.machineType = model.machineType;
                this.nodeGroupDescription = model.nodeGroupDescription;
                this.nodeGroupName = model.nodeGroupName;
                this.systemDisk = model.systemDisk;
                this.userData = model.userData;
            } 

            /**
             * <p>Availability Zone</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-wulanchabu-b</p>
             */
            public Builder az(String az) {
                this.az = az;
                return this;
            }

            /**
             * <p>Image ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i191887641687336652616</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>Machine type</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mock-machine-type3</p>
             */
            public Builder machineType(String machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * <p>Node group description</p>
             * 
             * <strong>example:</strong>
             * <p>describe for node group</p>
             */
            public Builder nodeGroupDescription(String nodeGroupDescription) {
                this.nodeGroupDescription = nodeGroupDescription;
                return this;
            }

            /**
             * <p>Node group name</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PAI-LINGJUN</p>
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
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
             * <p>user data</p>
             * 
             * <strong>example:</strong>
             * <p>#!/bin/bash
             * uptime
             * echo &quot;aaaaaaa&quot; &gt;&gt; /tmp/ttttt20250110141010.sh</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public NodeGroup build() {
                return new NodeGroup(this);
            } 

        } 

    }
}
