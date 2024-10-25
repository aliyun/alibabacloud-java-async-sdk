// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateForwardEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateForwardEntryRequest</p>
 */
public class CreateForwardEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String externalIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private String externalPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardEntryName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String forwardEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer healthCheckPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternalIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String internalIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternalPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private String internalPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    private String ipProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyExternalIp")
    private String standbyExternalIp;

    private CreateForwardEntryRequest(Builder builder) {
        super(builder);
        this.externalIp = builder.externalIp;
        this.externalPort = builder.externalPort;
        this.forwardEntryName = builder.forwardEntryName;
        this.healthCheckPort = builder.healthCheckPort;
        this.internalIp = builder.internalIp;
        this.internalPort = builder.internalPort;
        this.ipProtocol = builder.ipProtocol;
        this.natGatewayId = builder.natGatewayId;
        this.standbyExternalIp = builder.standbyExternalIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateForwardEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return forwardEntryName
     */
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    /**
     * @return healthCheckPort
     */
    public Integer getHealthCheckPort() {
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
     * @return standbyExternalIp
     */
    public String getStandbyExternalIp() {
        return this.standbyExternalIp;
    }

    public static final class Builder extends Request.Builder<CreateForwardEntryRequest, Builder> {
        private String externalIp; 
        private String externalPort; 
        private String forwardEntryName; 
        private Integer healthCheckPort; 
        private String internalIp; 
        private String internalPort; 
        private String ipProtocol; 
        private String natGatewayId; 
        private String standbyExternalIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateForwardEntryRequest request) {
            super(request);
            this.externalIp = request.externalIp;
            this.externalPort = request.externalPort;
            this.forwardEntryName = request.forwardEntryName;
            this.healthCheckPort = request.healthCheckPort;
            this.internalIp = request.internalIp;
            this.internalPort = request.internalPort;
            this.ipProtocol = request.ipProtocol;
            this.natGatewayId = request.natGatewayId;
            this.standbyExternalIp = request.standbyExternalIp;
        } 

        /**
         * <p>The elastic IP address (EIP) that is used to access the Internet.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>121.11.36.28</p>
         */
        public Builder externalIp(String externalIp) {
            this.putQueryParameter("ExternalIp", externalIp);
            this.externalIp = externalIp;
            return this;
        }

        /**
         * <p>The external port or port range that is used for port forwarding.</p>
         * <ul>
         * <li>Valid values: 1 to 65535.</li>
         * <li>To specify a port range, separate the first port and the last port with a forward slash (/), such as 10/20.</li>
         * <li>If you set ExternalPort to a port range, you must also set InternalPort to a port range. The number of ports in the port ranges must be the same. For example, if you set ExternalPort to 10/20, you can set InternalPort to 80/90.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder externalPort(String externalPort) {
            this.putQueryParameter("ExternalPort", externalPort);
            this.externalPort = externalPort;
            return this;
        }

        /**
         * <p>The name of the DNAT entry. The name must be 2 to 128 characters in length. The name cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test0</p>
         */
        public Builder forwardEntryName(String forwardEntryName) {
            this.putQueryParameter("ForwardEntryName", forwardEntryName);
            this.forwardEntryName = forwardEntryName;
            return this;
        }

        /**
         * <p>The probe port. The port must be within the internal port range. By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder healthCheckPort(Integer healthCheckPort) {
            this.putQueryParameter("HealthCheckPort", healthCheckPort);
            this.healthCheckPort = healthCheckPort;
            return this;
        }

        /**
         * <p>The private IP address of the instance that uses the DNAT entry for Internet communication.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.13</p>
         */
        public Builder internalIp(String internalIp) {
            this.putQueryParameter("InternalIp", internalIp);
            this.internalIp = internalIp;
            return this;
        }

        /**
         * <p>The internal port or port range that is used for port forwarding.</p>
         * <ul>
         * <li>Valid values: 1 to 65535.</li>
         * <li>To specify a port range, separate the first port and the last port with a forward slash (/), such as 10/20.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder internalPort(String internalPort) {
            this.putQueryParameter("InternalPort", internalPort);
            this.internalPort = internalPort;
            return this;
        }

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong>: forwards TCP packets.</li>
         * <li><strong>UDP</strong>: forwards UDP packets.</li>
         * <li><strong>Any</strong> (default): forwards all packets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Any</p>
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * <p>The ID of the Network Address Translation (NAT) gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nat-5t7nh1cfm6kxiszlttr383xpo</p>
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * <p>The secondary EIP that is used to access the Internet. You need to select a secondary EIP that is bound to NAT. After the DNAT entry is created, the secondary EIP takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>101.XXX.XXX.4</p>
         */
        public Builder standbyExternalIp(String standbyExternalIp) {
            this.putQueryParameter("StandbyExternalIp", standbyExternalIp);
            this.standbyExternalIp = standbyExternalIp;
            return this;
        }

        @Override
        public CreateForwardEntryRequest build() {
            return new CreateForwardEntryRequest(this);
        } 

    } 

}
