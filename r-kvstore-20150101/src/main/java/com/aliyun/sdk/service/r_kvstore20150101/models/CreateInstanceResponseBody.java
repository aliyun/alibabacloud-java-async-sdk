// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceResponseBody</p>
 */
public class CreateInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Long bandwidth;

    @com.aliyun.core.annotation.NameInMap("Capacity")
    private Long capacity;

    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("ConnectionDomain")
    private String connectionDomain;

    @com.aliyun.core.annotation.NameInMap("Connections")
    private Long connections;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("PrivateIpAddr")
    private String privateIpAddr;

    @com.aliyun.core.annotation.NameInMap("QPS")
    private Long QPS;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateInstanceResponseBody(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.capacity = builder.capacity;
        this.chargeType = builder.chargeType;
        this.config = builder.config;
        this.connectionDomain = builder.connectionDomain;
        this.connections = builder.connections;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.instanceStatus = builder.instanceStatus;
        this.networkType = builder.networkType;
        this.nodeType = builder.nodeType;
        this.orderId = builder.orderId;
        this.port = builder.port;
        this.privateIpAddr = builder.privateIpAddr;
        this.QPS = builder.QPS;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.userName = builder.userName;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return capacity
     */
    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return connectionDomain
     */
    public String getConnectionDomain() {
        return this.connectionDomain;
    }

    /**
     * @return connections
     */
    public Long getConnections() {
        return this.connections;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return privateIpAddr
     */
    public String getPrivateIpAddr() {
        return this.privateIpAddr;
    }

    /**
     * @return QPS
     */
    public Long getQPS() {
        return this.QPS;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private Long bandwidth; 
        private Long capacity; 
        private String chargeType; 
        private String config; 
        private String connectionDomain; 
        private Long connections; 
        private String endTime; 
        private String instanceId; 
        private String instanceName; 
        private String instanceStatus; 
        private String networkType; 
        private String nodeType; 
        private Long orderId; 
        private Integer port; 
        private String privateIpAddr; 
        private Long QPS; 
        private String regionId; 
        private String requestId; 
        private String userName; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        /**
         * The maximum bandwidth of the instance. Unit: MB/s.
         */
        public Builder bandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The storage capacity of the instance. Unit: MB.
         */
        public Builder capacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   **PrePaid**: subscription
         * *   **PostPaid**: pay-as-you-go
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The configurations of the instance.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * The internal endpoint of the instance.
         */
        public Builder connectionDomain(String connectionDomain) {
            this.connectionDomain = connectionDomain;
            return this;
        }

        /**
         * The maximum number of connections supported by the instance.
         */
        public Builder connections(Long connections) {
            this.connections = connections;
            return this;
        }

        /**
         * The time when the subscription expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The GUID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the instance.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The state of the instance. The return value is Creating.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * The network type of the instance. Valid values:
         * <p>
         * 
         * *   **CLASSIC**: classic network
         * *   **VPC**: VPC
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * The node type. Valid values:
         * <p>
         * 
         * *   **STAND_ALONE**: standalone
         * *   **MASTER_SLAVE**: master-replica
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * The ID of the order.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * The port number that is used to connect to the instance.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * The private IP address of the instance.
         */
        public Builder privateIpAddr(String privateIpAddr) {
            this.privateIpAddr = privateIpAddr;
            return this;
        }

        /**
         * The expected maximum queries per second (QPS).
         */
        public Builder QPS(Long QPS) {
            this.QPS = QPS;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The username that is used to connect to the instance. By default, ApsaraDB for Redis provides a username that is named after the instance ID.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * The ID of the vSwitch to which the instance is connected.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the VPC.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The zone ID of the instance.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public CreateInstanceResponseBody build() {
            return new CreateInstanceResponseBody(this);
        } 

    } 

}
