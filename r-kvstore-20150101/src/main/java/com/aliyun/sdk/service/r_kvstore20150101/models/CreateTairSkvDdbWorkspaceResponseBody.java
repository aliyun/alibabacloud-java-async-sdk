// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

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
 * {@link CreateTairSkvDdbWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTairSkvDdbWorkspaceResponseBody</p>
 */
public class CreateTairSkvDdbWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Long bandwidth;

    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("ConnectionDomain")
    private String connectionDomain;

    @com.aliyun.core.annotation.NameInMap("Connections")
    private Long connections;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("InstanceStatus")
    private String instanceStatus;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("QPS")
    private Long QPS;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateTairSkvDdbWorkspaceResponseBody(Builder builder) {
        this.bandwidth = builder.bandwidth;
        this.chargeType = builder.chargeType;
        this.config = builder.config;
        this.connectionDomain = builder.connectionDomain;
        this.connections = builder.connections;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.instanceStatus = builder.instanceStatus;
        this.orderId = builder.orderId;
        this.port = builder.port;
        this.QPS = builder.QPS;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTairSkvDdbWorkspaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private Long bandwidth; 
        private String chargeType; 
        private String config; 
        private String connectionDomain; 
        private Long connections; 
        private String instanceId; 
        private String instanceName; 
        private String instanceStatus; 
        private Long orderId; 
        private Integer port; 
        private Long QPS; 
        private String regionId; 
        private String requestId; 
        private String taskId; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(CreateTairSkvDdbWorkspaceResponseBody model) {
            this.bandwidth = model.bandwidth;
            this.chargeType = model.chargeType;
            this.config = model.config;
            this.connectionDomain = model.connectionDomain;
            this.connections = model.connections;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.instanceStatus = model.instanceStatus;
            this.orderId = model.orderId;
            this.port = model.port;
            this.QPS = model.QPS;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
            this.zoneId = model.zoneId;
        } 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public CreateTairSkvDdbWorkspaceResponseBody build() {
            return new CreateTairSkvDdbWorkspaceResponseBody(this);
        } 

    } 

}
