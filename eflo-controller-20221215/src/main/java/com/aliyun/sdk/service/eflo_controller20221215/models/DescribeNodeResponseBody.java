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
 * {@link DescribeNodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeResponseBody</p>
 */
public class DescribeNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Disks")
    private java.util.List<Disks> disks;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.NameInMap("HpnZone")
    private String hpnZone;

    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.NameInMap("MachineType")
    private String machineType;

    @com.aliyun.core.annotation.NameInMap("Networks")
    private java.util.List<Networks> networks;

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("NodeGroupName")
    private String nodeGroupName;

    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("OperatingState")
    private String operatingState;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Sn")
    private String sn;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeNodeResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.createTime = builder.createTime;
        this.disks = builder.disks;
        this.expiredTime = builder.expiredTime;
        this.hostname = builder.hostname;
        this.hpnZone = builder.hpnZone;
        this.imageId = builder.imageId;
        this.imageName = builder.imageName;
        this.machineType = builder.machineType;
        this.networks = builder.networks;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeGroupName = builder.nodeGroupName;
        this.nodeId = builder.nodeId;
        this.operatingState = builder.operatingState;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sn = builder.sn;
        this.userData = builder.userData;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeResponseBody create() {
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
     * @return disks
     */
    public java.util.List<Disks> getDisks() {
        return this.disks;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
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
     * @return machineType
     */
    public String getMachineType() {
        return this.machineType;
    }

    /**
     * @return networks
     */
    public java.util.List<Networks> getNetworks() {
        return this.networks;
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
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
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
        private java.util.List<Disks> disks; 
        private String expiredTime; 
        private String hostname; 
        private String hpnZone; 
        private String imageId; 
        private String imageName; 
        private String machineType; 
        private java.util.List<Networks> networks; 
        private String nodeGroupId; 
        private String nodeGroupName; 
        private String nodeId; 
        private String operatingState; 
        private String requestId; 
        private String resourceGroupId; 
        private String sn; 
        private String userData; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(DescribeNodeResponseBody model) {
            this.clusterId = model.clusterId;
            this.clusterName = model.clusterName;
            this.createTime = model.createTime;
            this.disks = model.disks;
            this.expiredTime = model.expiredTime;
            this.hostname = model.hostname;
            this.hpnZone = model.hpnZone;
            this.imageId = model.imageId;
            this.imageName = model.imageName;
            this.machineType = model.machineType;
            this.networks = model.networks;
            this.nodeGroupId = model.nodeGroupId;
            this.nodeGroupName = model.nodeGroupName;
            this.nodeId = model.nodeId;
            this.operatingState = model.operatingState;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.sn = model.sn;
            this.userData = model.userData;
            this.zoneId = model.zoneId;
        } 

        /**
         * <p>Cluster ID</p>
         * 
         * <strong>example:</strong>
         * <p>i116913051662373010974</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Cluster name</p>
         * 
         * <strong>example:</strong>
         * <p>Standard_Cluster</p>
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-30T03:35:53Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Disks.
         */
        public Builder disks(java.util.List<Disks> disks) {
            this.disks = disks;
            return this;
        }

        /**
         * <p>Expiration time</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-23T16:00:00Z</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>Hostname</p>
         * 
         * <strong>example:</strong>
         * <p>31d38530-241e-11ed-bc63-acde48001122</p>
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>Cluster number</p>
         * 
         * <strong>example:</strong>
         * <p>A1</p>
         */
        public Builder hpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }

        /**
         * <p>Image ID</p>
         * 
         * <strong>example:</strong>
         * <p>i190297201634099844192</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>Image name</p>
         * 
         * <strong>example:</strong>
         * <p>Centos7.9_all_0811</p>
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>Machine type</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga1</p>
         */
        public Builder machineType(String machineType) {
            this.machineType = machineType;
            return this;
        }

        /**
         * <p>Network information</p>
         */
        public Builder networks(java.util.List<Networks> networks) {
            this.networks = networks;
            return this;
        }

        /**
         * <p>Node group ID</p>
         * 
         * <strong>example:</strong>
         * <p>ng-ec3c96ff0aa4c60d</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>Node group name</p>
         * 
         * <strong>example:</strong>
         * <p>emr-default</p>
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-zvp2tgykr08</p>
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>Node status</p>
         * 
         * <strong>example:</strong>
         * <p>Using</p>
         */
        public Builder operatingState(String operatingState) {
            this.operatingState = operatingState;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>AC4F0004-7BCE-52E0-891B-CAC7D64E3368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Resource group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmywpvugkh7kq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Unique machine identifier</p>
         * 
         * <strong>example:</strong>
         * <p>sag42ckf4jx</p>
         */
        public Builder sn(String sn) {
            this.sn = sn;
            return this;
        }

        /**
         * <p>The script by user defined</p>
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

        /**
         * <p>Zone ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public DescribeNodeResponseBody build() {
            return new DescribeNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodeResponseBody</p>
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
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
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

            /**
             * Type.
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
     * {@link DescribeNodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodeResponseBody</p>
     */
    public static class Networks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BondName")
        private String bondName;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("SubnetId")
        private String subnetId;

        @com.aliyun.core.annotation.NameInMap("VpdId")
        private String vpdId;

        private Networks(Builder builder) {
            this.bondName = builder.bondName;
            this.ip = builder.ip;
            this.subnetId = builder.subnetId;
            this.vpdId = builder.vpdId;
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

        /**
         * @return subnetId
         */
        public String getSubnetId() {
            return this.subnetId;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        public static final class Builder {
            private String bondName; 
            private String ip; 
            private String subnetId; 
            private String vpdId; 

            private Builder() {
            } 

            private Builder(Networks model) {
                this.bondName = model.bondName;
                this.ip = model.ip;
                this.subnetId = model.subnetId;
                this.vpdId = model.vpdId;
            } 

            /**
             * <p>Network interface port information</p>
             * 
             * <strong>example:</strong>
             * <p>Bond0</p>
             */
            public Builder bondName(String bondName) {
                this.bondName = bondName;
                return this;
            }

            /**
             * <p>Machine IP</p>
             * 
             * <strong>example:</strong>
             * <p>47.254.235.44</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>Cluster subnet ID</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-uf68v51fldm5egmui5a6k</p>
             */
            public Builder subnetId(String subnetId) {
                this.subnetId = subnetId;
                return this;
            }

            /**
             * <p>Cluster network ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-xcuhjyrj</p>
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            public Networks build() {
                return new Networks(this);
            } 

        } 

    }
}
