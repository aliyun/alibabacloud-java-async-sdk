// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateForwardEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateForwardEntryRequest</p>
 */
public class CreateForwardEntryRequest extends Request {
    @Query
    @NameInMap("ExternalIp")
    @Validation(required = true)
    private String externalIp;

    @Query
    @NameInMap("ExternalPort")
    @Validation(required = true)
    private String externalPort;

    @Query
    @NameInMap("ForwardEntryName")
    @Validation(maxLength = 128)
    private String forwardEntryName;

    @Query
    @NameInMap("HealthCheckPort")
    @Validation(maximum = 65535, minimum = 1)
    private Integer healthCheckPort;

    @Query
    @NameInMap("InternalIp")
    @Validation(required = true)
    private String internalIp;

    @Query
    @NameInMap("InternalPort")
    @Validation(required = true)
    private String internalPort;

    @Query
    @NameInMap("IpProtocol")
    private String ipProtocol;

    @Query
    @NameInMap("NatGatewayId")
    @Validation(required = true)
    private String natGatewayId;

    @Query
    @NameInMap("StandbyExternalIp")
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
         * The elastic IP address (EIP) that is used to access the Internet.
         */
        public Builder externalIp(String externalIp) {
            this.putQueryParameter("ExternalIp", externalIp);
            this.externalIp = externalIp;
            return this;
        }

        /**
         * The external port or port range that is used for port forwarding.
         * <p>
         * 
         * *   Valid values: 1 to 65535.
         * *   To specify a port range, separate the first port and the last port with a forward slash (/), such as 10/20.
         * *   If you set ExternalPort to a port range, you must also set InternalPort to a port range, and the number of ports specified must be the same for both parameters. For example, if you set ExternalPort to 10/20, you can set InternalPort to 80/90.
         */
        public Builder externalPort(String externalPort) {
            this.putQueryParameter("ExternalPort", externalPort);
            this.externalPort = externalPort;
            return this;
        }

        /**
         * The name of the DNAT entry. The name must be 2 to 128 characters in length. The name cannot start with `http://` or `https://`.
         */
        public Builder forwardEntryName(String forwardEntryName) {
            this.putQueryParameter("ForwardEntryName", forwardEntryName);
            this.forwardEntryName = forwardEntryName;
            return this;
        }

        /**
         * The probe port. The port must be within the internal port range. By default, this parameter is left empty.
         */
        public Builder healthCheckPort(Integer healthCheckPort) {
            this.putQueryParameter("HealthCheckPort", healthCheckPort);
            this.healthCheckPort = healthCheckPort;
            return this;
        }

        /**
         * The private IP address of the instance that uses the DNAT entry for Internet communication.
         */
        public Builder internalIp(String internalIp) {
            this.putQueryParameter("InternalIp", internalIp);
            this.internalIp = internalIp;
            return this;
        }

        /**
         * The internal port or port range that is used for port forwarding.
         * <p>
         * 
         * *   Valid values: 1 to 65535.
         * *   To specify a port range, separate the first port and the last port with a forward slash (/), such as 10/20.
         */
        public Builder internalPort(String internalPort) {
            this.putQueryParameter("InternalPort", internalPort);
            this.internalPort = internalPort;
            return this;
        }

        /**
         * The protocol. Valid values:
         * <p>
         * 
         * *   **TCP**: forwards TCP packets.
         * *   **UDP**: forwards UDP packets.
         * *   **Any** (default): forwards all packets.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * The ID of the Network Address Translation (NAT) gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * The secondary EIP that is used to access the Internet. You need to select a secondary EIP that is bound to NAT. After the DNAT entry is created, the secondary EIP takes effect.
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
