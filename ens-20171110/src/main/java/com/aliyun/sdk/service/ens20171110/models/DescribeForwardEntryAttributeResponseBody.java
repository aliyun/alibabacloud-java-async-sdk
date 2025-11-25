// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeForwardEntryAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeForwardEntryAttributeResponseBody</p>
 */
public class DescribeForwardEntryAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("ExternalIp")
    private String externalIp;

    @com.aliyun.core.annotation.NameInMap("ExternalPort")
    private String externalPort;

    @com.aliyun.core.annotation.NameInMap("ForwardEntryId")
    private String forwardEntryId;

    @com.aliyun.core.annotation.NameInMap("ForwardEntryName")
    private String forwardEntryName;

    @com.aliyun.core.annotation.NameInMap("HealthCheckPort")
    private String healthCheckPort;

    @com.aliyun.core.annotation.NameInMap("InternalIp")
    private String internalIp;

    @com.aliyun.core.annotation.NameInMap("InternalPort")
    private String internalPort;

    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    private String ipProtocol;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StandbyExternalIp")
    private String standbyExternalIp;

    @com.aliyun.core.annotation.NameInMap("StandbyStatus")
    private String standbyStatus;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeForwardEntryAttributeResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.externalIp = builder.externalIp;
        this.externalPort = builder.externalPort;
        this.forwardEntryId = builder.forwardEntryId;
        this.forwardEntryName = builder.forwardEntryName;
        this.healthCheckPort = builder.healthCheckPort;
        this.internalIp = builder.internalIp;
        this.internalPort = builder.internalPort;
        this.ipProtocol = builder.ipProtocol;
        this.natGatewayId = builder.natGatewayId;
        this.requestId = builder.requestId;
        this.standbyExternalIp = builder.standbyExternalIp;
        this.standbyStatus = builder.standbyStatus;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeForwardEntryAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return externalIp
     */
    public String getExternalIp() {
        return this.externalIp;
    }

    /**
     * @return externalPort
     */
    public String getExternalPort() {
        return this.externalPort;
    }

    /**
     * @return forwardEntryId
     */
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    /**
     * @return forwardEntryName
     */
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    /**
     * @return healthCheckPort
     */
    public String getHealthCheckPort() {
        return this.healthCheckPort;
    }

    /**
     * @return internalIp
     */
    public String getInternalIp() {
        return this.internalIp;
    }

    /**
     * @return internalPort
     */
    public String getInternalPort() {
        return this.internalPort;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return standbyExternalIp
     */
    public String getStandbyExternalIp() {
        return this.standbyExternalIp;
    }

    /**
     * @return standbyStatus
     */
    public String getStandbyStatus() {
        return this.standbyStatus;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String creationTime; 
        private String externalIp; 
        private String externalPort; 
        private String forwardEntryId; 
        private String forwardEntryName; 
        private String healthCheckPort; 
        private String internalIp; 
        private String internalPort; 
        private String ipProtocol; 
        private String natGatewayId; 
        private String requestId; 
        private String standbyExternalIp; 
        private String standbyStatus; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeForwardEntryAttributeResponseBody model) {
            this.creationTime = model.creationTime;
            this.externalIp = model.externalIp;
            this.externalPort = model.externalPort;
            this.forwardEntryId = model.forwardEntryId;
            this.forwardEntryName = model.forwardEntryName;
            this.healthCheckPort = model.healthCheckPort;
            this.internalIp = model.internalIp;
            this.internalPort = model.internalPort;
            this.ipProtocol = model.ipProtocol;
            this.natGatewayId = model.natGatewayId;
            this.requestId = model.requestId;
            this.standbyExternalIp = model.standbyExternalIp;
            this.standbyStatus = model.standbyStatus;
            this.status = model.status;
        } 

        /**
         * CreationTime.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * ExternalIp.
         */
        public Builder externalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }

        /**
         * ExternalPort.
         */
        public Builder externalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }

        /**
         * ForwardEntryId.
         */
        public Builder forwardEntryId(String forwardEntryId) {
            this.forwardEntryId = forwardEntryId;
            return this;
        }

        /**
         * ForwardEntryName.
         */
        public Builder forwardEntryName(String forwardEntryName) {
            this.forwardEntryName = forwardEntryName;
            return this;
        }

        /**
         * HealthCheckPort.
         */
        public Builder healthCheckPort(String healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }

        /**
         * InternalIp.
         */
        public Builder internalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }

        /**
         * InternalPort.
         */
        public Builder internalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }

        /**
         * IpProtocol.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * NatGatewayId.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
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
         * StandbyExternalIp.
         */
        public Builder standbyExternalIp(String standbyExternalIp) {
            this.standbyExternalIp = standbyExternalIp;
            return this;
        }

        /**
         * StandbyStatus.
         */
        public Builder standbyStatus(String standbyStatus) {
            this.standbyStatus = standbyStatus;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeForwardEntryAttributeResponseBody build() {
            return new DescribeForwardEntryAttributeResponseBody(this);
        } 

    } 

}
