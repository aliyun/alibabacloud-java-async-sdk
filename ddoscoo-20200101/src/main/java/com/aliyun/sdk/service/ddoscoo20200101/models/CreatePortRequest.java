// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePortRequest} extends {@link RequestModel}
 *
 * <p>CreatePortRequest</p>
 */
public class CreatePortRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendPort")
    private String backendPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrontendPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private String frontendPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrontendProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String frontendProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealServers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > realServers;

    private CreatePortRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backendPort = builder.backendPort;
        this.frontendPort = builder.frontendPort;
        this.frontendProtocol = builder.frontendProtocol;
        this.instanceId = builder.instanceId;
        this.realServers = builder.realServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePortRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backendPort
     */
    public String getBackendPort() {
        return this.backendPort;
    }

    /**
     * @return frontendPort
     */
    public String getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * @return frontendProtocol
     */
    public String getFrontendProtocol() {
        return this.frontendProtocol;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return realServers
     */
    public java.util.List < String > getRealServers() {
        return this.realServers;
    }

    public static final class Builder extends Request.Builder<CreatePortRequest, Builder> {
        private String regionId; 
        private String backendPort; 
        private String frontendPort; 
        private String frontendProtocol; 
        private String instanceId; 
        private java.util.List < String > realServers; 

        private Builder() {
            super();
        } 

        private Builder(CreatePortRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backendPort = request.backendPort;
            this.frontendPort = request.frontendPort;
            this.frontendProtocol = request.frontendProtocol;
            this.instanceId = request.instanceId;
            this.realServers = request.realServers;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The port of the origin server. Valid values: **0** to **65535**.
         */
        public Builder backendPort(String backendPort) {
            this.putQueryParameter("BackendPort", backendPort);
            this.backendPort = backendPort;
            return this;
        }

        /**
         * The forwarding port. Valid values: **0** to **65535**.
         */
        public Builder frontendPort(String frontendPort) {
            this.putQueryParameter("FrontendPort", frontendPort);
            this.frontendPort = frontendPort;
            return this;
        }

        /**
         * The type of the protocol. Valid values:
         * <p>
         * 
         * *   **tcp**
         * *   **udp**
         */
        public Builder frontendProtocol(String frontendProtocol) {
            this.putQueryParameter("FrontendProtocol", frontendProtocol);
            this.frontendProtocol = frontendProtocol;
            return this;
        }

        /**
         * The ID of the Anti-DDoS Pro or Anti-DDoS Premium instance to which the port forwarding rule belongs.
         * <p>
         * 
         * > You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * An array that consists of the IP addresses of origin servers.
         */
        public Builder realServers(java.util.List < String > realServers) {
            this.putQueryParameter("RealServers", realServers);
            this.realServers = realServers;
            return this;
        }

        @Override
        public CreatePortRequest build() {
            return new CreatePortRequest(this);
        } 

    } 

}
