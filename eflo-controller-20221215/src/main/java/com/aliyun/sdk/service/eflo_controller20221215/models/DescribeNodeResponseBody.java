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

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeNodeResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.createTime = builder.createTime;
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
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeResponseBody create() {
        return builder().build();
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
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String clusterId; 
        private String clusterName; 
        private String createTime; 
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
        private String zoneId; 

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
         * <p>资源组ID</p>
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
