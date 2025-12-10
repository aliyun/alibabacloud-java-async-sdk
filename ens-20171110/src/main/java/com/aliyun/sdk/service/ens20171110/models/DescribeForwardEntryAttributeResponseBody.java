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
         * <p>The creation time. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-26T15:38:27Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The EIP in the DNAT entry. The public IP address is used to access the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>36.XXX.XXX.72</p>
         */
        public Builder externalIp(String externalIp) {
            this.externalIp = externalIp;
            return this;
        }

        /**
         * <p>The external port or port range that is used for port forwarding.</p>
         * <ul>
         * <li>Valid values: 1 to 65535.</li>
         * <li>To specify a port range, separate the first port and the last port with a forward slash (/), such as 10/20.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder externalPort(String externalPort) {
            this.externalPort = externalPort;
            return this;
        }

        /**
         * <p>The ID of the DNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>fwd-5tfi6f0rutmd00xrhkag7****</p>
         */
        public Builder forwardEntryId(String forwardEntryId) {
            this.forwardEntryId = forwardEntryId;
            return this;
        }

        /**
         * <p>The name of the DNAT entry.</p>
         * 
         * <strong>example:</strong>
         * <p>test0</p>
         */
        public Builder forwardEntryName(String forwardEntryName) {
            this.forwardEntryName = forwardEntryName;
            return this;
        }

        /**
         * <p>The DNAT probe port. The port must be within the internal port range. By default, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder healthCheckPort(String healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }

        /**
         * <p>The private IP address of the instance that uses the DNAT entry for Internet communication.</p>
         * 
         * <strong>example:</strong>
         * <p>10.XXX.XXX.50</p>
         */
        public Builder internalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }

        /**
         * <p>The internal port or port range that is used for port forwarding.</p>
         * <ul>
         * <li>Valid values: 1 to 65535.</li>
         * <li>To specify a port range, separate the first port and the last port with a forward slash (/), such as 10/20.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder internalPort(String internalPort) {
            this.internalPort = internalPort;
            return this;
        }

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong>: forwards TCP packets.</li>
         * <li><strong>UDP</strong>: forwards UDP packets.</li>
         * <li><strong>Any</strong>: forwards all packets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Any</p>
         */
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * <p>The ID of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-5t7nh1cfm6kxiszlttr38****</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6666C5A5-75ED-422E-A022-7121FA18C968</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The secondary EIP that is used to access the Internet. You need to select a secondary EIP that is bound to NAT. After the DNAT entry is created, the secondary EIP takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>101.XXX.XXX.4</p>
         */
        public Builder standbyExternalIp(String standbyExternalIp) {
            this.standbyExternalIp = standbyExternalIp;
            return this;
        }

        /**
         * <p>The status of the secondary EIP.</p>
         * <ul>
         * <li>Running</li>
         * <li>Stopping</li>
         * <li>Stopped</li>
         * <li>Starting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        public Builder standbyStatus(String standbyStatus) {
            this.standbyStatus = standbyStatus;
            return this;
        }

        /**
         * <p>The status of the DNAT entry.</p>
         * <ul>
         * <li>Pending: The DNAT entry is being created or modified.</li>
         * <li>Available: The DNAT entry is available.</li>
         * <li>Deleting: The DNAT entry is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
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
