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
         * ExpiredTime.
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * Hostname.
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * HpnZone.
         */
        public Builder hpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
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
         * <p>镜像名称</p>
         * 
         * <strong>example:</strong>
         * <p>Centos7.9_all_0811</p>
         */
        public Builder imageName(String imageName) {
            this.imageName = imageName;
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
         * Networks.
         */
        public Builder networks(java.util.List<Networks> networks) {
            this.networks = networks;
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
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * OperatingState.
         */
        public Builder operatingState(String operatingState) {
            this.operatingState = operatingState;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Sn.
         */
        public Builder sn(String sn) {
            this.sn = sn;
            return this;
        }

        /**
         * ZoneId.
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
             * BondName.
             */
            public Builder bondName(String bondName) {
                this.bondName = bondName;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * SubnetId.
             */
            public Builder subnetId(String subnetId) {
                this.subnetId = subnetId;
                return this;
            }

            /**
             * VpdId.
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
