// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceResponseBody</p>
 */
public class CreateInstanceResponseBody extends TeaModel {
    @NameInMap("Bandwidth")
    private Long bandwidth;

    @NameInMap("Capacity")
    private Long capacity;

    @NameInMap("ChargeType")
    private String chargeType;

    @NameInMap("Config")
    private String config;

    @NameInMap("ConnectionDomain")
    private String connectionDomain;

    @NameInMap("Connections")
    private Long connections;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("InstanceName")
    private String instanceName;

    @NameInMap("InstanceStatus")
    private String instanceStatus;

    @NameInMap("NetworkType")
    private String networkType;

    @NameInMap("NodeType")
    private String nodeType;

    @NameInMap("OrderId")
    @Validation(required = true)
    private Long orderId;

    @NameInMap("Port")
    private Integer port;

    @NameInMap("PrivateIpAddr")
    private String privateIpAddr;

    @NameInMap("QPS")
    private Long QPS;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserName")
    private String userName;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("VpcId")
    private String vpcId;

    @NameInMap("ZoneId")
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
         * Bandwidth.
         */
        public Builder bandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * Capacity.
         */
        public Builder capacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * ConnectionDomain.
         */
        public Builder connectionDomain(String connectionDomain) {
            this.connectionDomain = connectionDomain;
            return this;
        }

        /**
         * Connections.
         */
        public Builder connections(Long connections) {
            this.connections = connections;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstanceStatus.
         */
        public Builder instanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * PrivateIpAddr.
         */
        public Builder privateIpAddr(String privateIpAddr) {
            this.privateIpAddr = privateIpAddr;
            return this;
        }

        /**
         * QPS.
         */
        public Builder QPS(Long QPS) {
            this.QPS = QPS;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * UserName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        /**
         * ZoneId.
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
