// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomRoutingEndpointGroupDestinationsRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomRoutingEndpointGroupDestinationsRequest</p>
 */
public class UpdateCustomRoutingEndpointGroupDestinationsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DestinationConfigurations")
    @Validation(required = true)
    private java.util.List < DestinationConfigurations> destinationConfigurations;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EndpointGroupId")
    @Validation(required = true)
    private String endpointGroupId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateCustomRoutingEndpointGroupDestinationsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.destinationConfigurations = builder.destinationConfigurations;
        this.dryRun = builder.dryRun;
        this.endpointGroupId = builder.endpointGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomRoutingEndpointGroupDestinationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return destinationConfigurations
     */
    public java.util.List < DestinationConfigurations> getDestinationConfigurations() {
        return this.destinationConfigurations;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateCustomRoutingEndpointGroupDestinationsRequest, Builder> {
        private String clientToken; 
        private java.util.List < DestinationConfigurations> destinationConfigurations; 
        private Boolean dryRun; 
        private String endpointGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomRoutingEndpointGroupDestinationsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.destinationConfigurations = request.destinationConfigurations;
            this.dryRun = request.dryRun;
            this.endpointGroupId = request.endpointGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must ensure that it is unique among all requests. The client token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The mapping configurations of endpoint group.
         * <p>
         * 
         * You must specify the backend service port range and protocol of the endpoint group. The specified information is used to map the port range of the associated listener.
         * 
         * You can specify at most 20 mapping configurations, which include port ranges and protocol types.
         */
        public Builder destinationConfigurations(java.util.List < DestinationConfigurations> destinationConfigurations) {
            this.putQueryParameter("DestinationConfigurations", destinationConfigurations);
            this.destinationConfigurations = destinationConfigurations;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false**: performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the endpoint group.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateCustomRoutingEndpointGroupDestinationsRequest build() {
            return new UpdateCustomRoutingEndpointGroupDestinationsRequest(this);
        } 

    } 

    public static class DestinationConfigurations extends TeaModel {
        @NameInMap("DestinationId")
        @Validation(required = true)
        private String destinationId;

        @NameInMap("FromPort")
        private Integer fromPort;

        @NameInMap("Protocols")
        private java.util.List < String > protocols;

        @NameInMap("ToPort")
        private Integer toPort;

        private DestinationConfigurations(Builder builder) {
            this.destinationId = builder.destinationId;
            this.fromPort = builder.fromPort;
            this.protocols = builder.protocols;
            this.toPort = builder.toPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationConfigurations create() {
            return builder().build();
        }

        /**
         * @return destinationId
         */
        public String getDestinationId() {
            return this.destinationId;
        }

        /**
         * @return fromPort
         */
        public Integer getFromPort() {
            return this.fromPort;
        }

        /**
         * @return protocols
         */
        public java.util.List < String > getProtocols() {
            return this.protocols;
        }

        /**
         * @return toPort
         */
        public Integer getToPort() {
            return this.toPort;
        }

        public static final class Builder {
            private String destinationId; 
            private Integer fromPort; 
            private java.util.List < String > protocols; 
            private Integer toPort; 

            /**
             * The ID of the mapping configuration of the endpoint group.
             */
            public Builder destinationId(String destinationId) {
                this.destinationId = destinationId;
                return this;
            }

            /**
             * The start port of the backend service port range of the endpoint group.
             * <p>
             * 
             * Valid values: **1** to **65499**. The **FromPort** value must be smaller than or equal to the **ToPort** value.
             * 
             * You can specify up to 20 start ports in each request.
             */
            public Builder fromPort(Integer fromPort) {
                this.fromPort = fromPort;
                return this;
            }

            /**
             * The backend service protocol of the endpoint group. Valid values:
             * <p>
             * 
             * *   **tcp**: TCP
             * *   **udp**: UDP
             * *   **tcp,udp**: TCP and UDP
             * 
             * You can specify up to four backend service protocols in each configuration.
             */
            public Builder protocols(java.util.List < String > protocols) {
                this.protocols = protocols;
                return this;
            }

            /**
             * The end port of the backend service port range of the endpoint group.
             * <p>
             * 
             * Valid values: **1** to **65499**. The **FromPort** value must be smaller than or equal to the **ToPort** value.
             * 
             * You can specify up to 20 end ports in each request.
             */
            public Builder toPort(Integer toPort) {
                this.toPort = toPort;
                return this;
            }

            public DestinationConfigurations build() {
                return new DestinationConfigurations(this);
            } 

        } 

    }
}
