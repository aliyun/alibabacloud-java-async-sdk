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
 * {@link ModifyForwardEntryRequest} extends {@link RequestModel}
 *
 * <p>ModifyForwardEntryRequest</p>
 */
public class ModifyForwardEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalIp")
    private String externalIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalPort")
    private String externalPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardEntryName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String forwardEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535)
    private Integer healthCheckPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternalIp")
    private String internalIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternalPort")
    private String internalPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    private String ipProtocol;

    private ModifyForwardEntryRequest(Builder builder) {
        super(builder);
        this.externalIp = builder.externalIp;
        this.externalPort = builder.externalPort;
        this.forwardEntryId = builder.forwardEntryId;
        this.forwardEntryName = builder.forwardEntryName;
        this.healthCheckPort = builder.healthCheckPort;
        this.internalIp = builder.internalIp;
        this.internalPort = builder.internalPort;
        this.ipProtocol = builder.ipProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyForwardEntryRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyForwardEntryRequest, Builder> {
        private String externalIp; 
        private String externalPort; 
        private String forwardEntryId; 
        private String forwardEntryName; 
        private Integer healthCheckPort; 
        private String internalIp; 
        private String internalPort; 
        private String ipProtocol; 

        private Builder() {
            super();
        } 

        private Builder(ModifyForwardEntryRequest request) {
            super(request);
            this.externalIp = request.externalIp;
            this.externalPort = request.externalPort;
            this.forwardEntryId = request.forwardEntryId;
            this.forwardEntryName = request.forwardEntryName;
            this.healthCheckPort = request.healthCheckPort;
            this.internalIp = request.internalIp;
            this.internalPort = request.internalPort;
            this.ipProtocol = request.ipProtocol;
        } 

        /**
         * <p>The EIP in the DNAT entry. The public IP address is used to access the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>121.XXX.XXX.28</p>
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
         * <li>To specify a port range, separate the first port and the last port with a forward slash (/), such as 10/20. The first port and the last port are included.</li>
         * <li>If you set ExternalPort to a port range, you must also set InternalPort to a port range. The number of ports in the port ranges must be the same. For example, if you set ExternalPort to 10/20, you can set InternalPort to 80/90.</li>
         * <li>The maximum port range is 1000.</li>
         * </ul>
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
         * <p>The ID of the DNAT entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dnat-5tfjp3537mi6iokl59g5c****</p>
         */
        public Builder forwardEntryId(String forwardEntryId) {
            this.putQueryParameter("ForwardEntryId", forwardEntryId);
            this.forwardEntryId = forwardEntryId;
            return this;
        }

        /**
         * <p>The name of the DNAT entry. The name must be 2 to 128 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * 
         * <strong>example:</strong>
         * <p>10.XXX.XXX.50</p>
         */
        public Builder internalIp(String internalIp) {
            this.putQueryParameter("InternalIp", internalIp);
            this.internalIp = internalIp;
            return this;
        }

        /**
         * <p>The private port or port range that is used in port forwarding.</p>
         * <ul>
         * <li>Valid values: 1 to 65535.</li>
         * <li>To specify a port range, separate the first port and the last port with a forward slash (/), such as 10/20. The first port and the last port are included.</li>
         * <li>If you set InternalPort to a port range, you must also set ExternalPort to a port range. The number of ports in the port ranges must be the same. For example, if you set ExternalPort to 10/20, you can set InternalPort to 80/90.</li>
         * <li>The maximum port range is 1000.</li>
         * </ul>
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

        @Override
        public ModifyForwardEntryRequest build() {
            return new ModifyForwardEntryRequest(this);
        } 

    } 

}
