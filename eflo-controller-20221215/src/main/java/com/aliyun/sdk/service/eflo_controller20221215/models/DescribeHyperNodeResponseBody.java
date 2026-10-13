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
 * {@link DescribeHyperNodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHyperNodeResponseBody</p>
 */
public class DescribeHyperNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("FileSystemMountEnabled")
    private Boolean fileSystemMountEnabled;

    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.NameInMap("HpnZone")
    private String hpnZone;

    @com.aliyun.core.annotation.NameInMap("HyperNodeId")
    private String hyperNodeId;

    @com.aliyun.core.annotation.NameInMap("MachineType")
    private String machineType;

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("NodeGroupName")
    private String nodeGroupName;

    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("OperatingState")
    private String operatingState;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Status")
    @Deprecated
    private String status;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeHyperNodeResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.createTime = builder.createTime;
        this.expireTime = builder.expireTime;
        this.fileSystemMountEnabled = builder.fileSystemMountEnabled;
        this.hostname = builder.hostname;
        this.hpnZone = builder.hpnZone;
        this.hyperNodeId = builder.hyperNodeId;
        this.machineType = builder.machineType;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeGroupName = builder.nodeGroupName;
        this.nodes = builder.nodes;
        this.operatingState = builder.operatingState;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHyperNodeResponseBody create() {
        return builder().build();
    }

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
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return fileSystemMountEnabled
     */
    public Boolean getFileSystemMountEnabled() {
        return this.fileSystemMountEnabled;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return hpnZone
     */
    public String getHpnZone() {
        return this.hpnZone;
    }

    /**
     * @return hyperNodeId
     */
    public String getHyperNodeId() {
        return this.hyperNodeId;
    }

    /**
     * @return machineType
     */
    public String getMachineType() {
        return this.machineType;
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
     * @return nodes
     */
    public java.util.List<Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return operatingState
     */
    public String getOperatingState() {
        return this.operatingState;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String clusterId; 
        private String clusterName; 
        private String createTime; 
        private String expireTime; 
        private Boolean fileSystemMountEnabled; 
        private String hostname; 
        private String hpnZone; 
        private String hyperNodeId; 
        private String machineType; 
        private String nodeGroupId; 
        private String nodeGroupName; 
        private java.util.List<Nodes> nodes; 
        private String operatingState; 
        private String requestId; 
        private String resourceGroupId; 
        private String status; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(DescribeHyperNodeResponseBody model) {
            this.clusterId = model.clusterId;
            this.clusterName = model.clusterName;
            this.createTime = model.createTime;
            this.expireTime = model.expireTime;
            this.fileSystemMountEnabled = model.fileSystemMountEnabled;
            this.hostname = model.hostname;
            this.hpnZone = model.hpnZone;
            this.hyperNodeId = model.hyperNodeId;
            this.machineType = model.machineType;
            this.nodeGroupId = model.nodeGroupId;
            this.nodeGroupName = model.nodeGroupName;
            this.nodes = model.nodes;
            this.operatingState = model.operatingState;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.status = model.status;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i119982311660892626523</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard_Cluster</p>
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The creation time. The time is in ISO 8601 format. The Z in the example indicates UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-30T02:00:00.852Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The expiration time. The time is in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2125-06-24T16:52:44.318000</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
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
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>alywlcb-lingjun-gpu-0025</p>
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>The cluster number.</p>
         * 
         * <strong>example:</strong>
         * <p>A1</p>
         */
        public Builder hpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }

        /**
         * <p>The hypernode ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-zvp2tgykr08</p>
         */
        public Builder hyperNodeId(String hyperNodeId) {
            this.hyperNodeId = hyperNodeId;
            return this;
        }

        /**
         * <p>The machine type.</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga1</p>
         */
        public Builder machineType(String machineType) {
            this.machineType = machineType;
            return this;
        }

        /**
         * <p>The node group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-ec3c96ff0aa4c60d</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>The node group name.</p>
         * 
         * <strong>example:</strong>
         * <p>lisan-nodegroup</p>
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * <p>The list of nodes.</p>
         */
        public Builder nodes(java.util.List<Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>The hypernode status.</p>
         * 
         * <strong>example:</strong>
         * <p>Using</p>
         */
        public Builder operatingState(String operatingState) {
            this.operatingState = operatingState;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D6058705-1C45-35C9-9461-02504897D4D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxno4vh5****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The node status.</p>
         * 
         * <strong>example:</strong>
         * <p>Operating</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-c</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeHyperNodeResponseBody build() {
            return new DescribeHyperNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHyperNodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHyperNodeResponseBody</p>
     */
    public static class Disks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Disks(Builder builder) {
            this.category = builder.category;
            this.diskId = builder.diskId;
            this.performanceLevel = builder.performanceLevel;
            this.size = builder.size;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String category; 
            private String diskId; 
            private String performanceLevel; 
            private Integer size; 
            private String type; 

            private Builder() {
            } 

            private Builder(Disks model) {
                this.category = model.category;
                this.diskId = model.diskId;
                this.performanceLevel = model.performanceLevel;
                this.size = model.size;
                this.type = model.type;
            } 

            /**
             * <p>The packet category. Valid values:</p>
             * <ul>
             * <li><strong>DOWNLINK_PACKET</strong>: downlink packet.</li>
             * <li><strong>UPLINK_PACKET</strong>: uplink packet.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DOWNLINK_PACKET</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The disk ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp1564bcc2306uui4zpk</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The performance level (PL) of the cloud disk when an ESSD is created as the system cloud disk. Settings:</p>
             * <ul>
             * <li>PL0: A maximum of 10,000 random read/write IOPS per standard SSD.</li>
             * <li>PL1: A maximum of 50,000 random read/write IOPS per standard SSD.</li>
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
             * <p>The disk size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The disk type. Valid values:</p>
             * <ul>
             * <li>system: system cloud disk.</li>
             * <li>data: data cloud disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHyperNodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHyperNodeResponseBody</p>
     */
    public static class Networks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BondName")
        private String bondName;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        private Networks(Builder builder) {
            this.bondName = builder.bondName;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Networks create() {
            return builder().build();
        }

        /**
         * @return bondName
         */
        public String getBondName() {
            return this.bondName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String bondName; 
            private String ip; 

            private Builder() {
            } 

            private Builder(Networks model) {
                this.bondName = model.bondName;
                this.ip = model.ip;
            } 

            /**
             * <p>The bond interface name of the machine.</p>
             * 
             * <strong>example:</strong>
             * <p>bond0</p>
             */
            public Builder bondName(String bondName) {
                this.bondName = bondName;
                return this;
            }

            /**
             * <p>The IP address of the machine in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.22.2</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            public Networks build() {
                return new Networks(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHyperNodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHyperNodeResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Disks")
        private java.util.List<Disks> disks;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageName")
        private String imageName;

        @com.aliyun.core.annotation.NameInMap("Networks")
        private Networks networks;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("OperatingState")
        private String operatingState;

        @com.aliyun.core.annotation.NameInMap("Status")
        @Deprecated
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Nodes(Builder builder) {
            this.disks = builder.disks;
            this.hostname = builder.hostname;
            this.imageId = builder.imageId;
            this.imageName = builder.imageName;
            this.networks = builder.networks;
            this.nodeId = builder.nodeId;
            this.operatingState = builder.operatingState;
            this.status = builder.status;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return disks
         */
        public java.util.List<Disks> getDisks() {
            return this.disks;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
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
         * @return networks
         */
        public Networks getNetworks() {
            return this.networks;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return operatingState
         */
        public String getOperatingState() {
            return this.operatingState;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private java.util.List<Disks> disks; 
            private String hostname; 
            private String imageId; 
            private String imageName; 
            private Networks networks; 
            private String nodeId; 
            private String operatingState; 
            private String status; 
            private String userData; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.disks = model.disks;
                this.hostname = model.hostname;
                this.imageId = model.imageId;
                this.imageName = model.imageName;
                this.networks = model.networks;
                this.nodeId = model.nodeId;
                this.operatingState = model.operatingState;
                this.status = model.status;
                this.userData = model.userData;
            } 

            /**
             * <p>The disk information.</p>
             */
            public Builder disks(java.util.List<Disks> disks) {
                this.disks = disks;
                return this;
            }

            /**
             * <p>The hostname.</p>
             * 
             * <strong>example:</strong>
             * <p>457db5ca-241d-11ed-9fd7-acde48001122</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The image ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i190297201669099844192</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The image name.</p>
             * 
             * <strong>example:</strong>
             * <p>Alinux3_x86_gu8xf_P_Host_D3_C7E3_550.127_Legacy_N_241230</p>
             */
            public Builder imageName(String imageName) {
                this.imageName = imageName;
                return this;
            }

            /**
             * <p>The network information.</p>
             */
            public Builder networks(Networks networks) {
                this.networks = networks;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e01-cn-zvp2tgykr0b</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node status.</p>
             * 
             * <strong>example:</strong>
             * <p>Using</p>
             */
            public Builder operatingState(String operatingState) {
                this.operatingState = operatingState;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>InProgress</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The user-defined script.</p>
             * 
             * <strong>example:</strong>
             * <p>#!/bin/bash
             * uptime
             * echo &quot;aaaaaaa&quot; &gt;&gt; /tmp/ttttttest.sh</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
