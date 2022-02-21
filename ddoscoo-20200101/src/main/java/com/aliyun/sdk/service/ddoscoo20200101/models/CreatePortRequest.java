// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePortRequest} extends {@link RequestModel}
 *
 * <p>CreatePortRequest</p>
 */
public class CreatePortRequest extends Request {
    @Query
    @NameInMap("BackendPort")
    private String backendPort;

    @Query
    @NameInMap("FrontendPort")
    @Validation(required = true)
    private String frontendPort;

    @Query
    @NameInMap("FrontendProtocol")
    @Validation(required = true)
    private String frontendProtocol;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RealServers")
    @Validation(required = true)
    private java.util.List < String > realServers;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreatePortRequest(Builder builder) {
        super(builder);
        this.backendPort = builder.backendPort;
        this.frontendPort = builder.frontendPort;
        this.frontendProtocol = builder.frontendProtocol;
        this.instanceId = builder.instanceId;
        this.realServers = builder.realServers;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreatePortRequest, Builder> {
        private String backendPort; 
        private String frontendPort; 
        private String frontendProtocol; 
        private String instanceId; 
        private java.util.List < String > realServers; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePortRequest response) {
            super(response);
            this.backendPort = response.backendPort;
            this.frontendPort = response.frontendPort;
            this.frontendProtocol = response.frontendProtocol;
            this.instanceId = response.instanceId;
            this.realServers = response.realServers;
            this.regionId = response.regionId;
        } 

        /**
         * BackendPort.
         */
        public Builder backendPort(String backendPort) {
            this.putQueryParameter("BackendPort", backendPort);
            this.backendPort = backendPort;
            return this;
        }

        /**
         * FrontendPort.
         */
        public Builder frontendPort(String frontendPort) {
            this.putQueryParameter("FrontendPort", frontendPort);
            this.frontendPort = frontendPort;
            return this;
        }

        /**
         * FrontendProtocol.
         */
        public Builder frontendProtocol(String frontendProtocol) {
            this.putQueryParameter("FrontendProtocol", frontendProtocol);
            this.frontendProtocol = frontendProtocol;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RealServers.
         */
        public Builder realServers(java.util.List < String > realServers) {
            this.putQueryParameter("RealServers", realServers);
            this.realServers = realServers;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreatePortRequest build() {
            return new CreatePortRequest(this);
        } 

    } 

}
