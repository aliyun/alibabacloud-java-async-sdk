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
 * {@link ListClusterNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterNodesResponseBody</p>
 */
public class ListClusterNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClusterNodesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nodes
     */
    public java.util.List<Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<Nodes> nodes; 
        private String requestId; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List<Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterNodesResponseBody build() {
            return new ListClusterNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterNodesResponseBody</p>
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
    /**
     * 
     * {@link ListClusterNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterNodesResponseBody</p>
     */
    public static class Nodes extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Sn")
        private String sn;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Nodes(Builder builder) {
            this.createTime = builder.createTime;
            this.expiredTime = builder.expiredTime;
            this.hostname = builder.hostname;
            this.hpnZone = builder.hpnZone;
            this.imageId = builder.imageId;
            this.machineType = builder.machineType;
            this.networks = builder.networks;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeGroupName = builder.nodeGroupName;
            this.nodeId = builder.nodeId;
            this.operatingState = builder.operatingState;
            this.sn = builder.sn;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
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
            private String createTime; 
            private String expiredTime; 
            private String hostname; 
            private String hpnZone; 
            private String imageId; 
            private String machineType; 
            private java.util.List<Networks> networks; 
            private String nodeGroupId; 
            private String nodeGroupName; 
            private String nodeId; 
            private String operatingState; 
            private String sn; 
            private String zoneId; 

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

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
