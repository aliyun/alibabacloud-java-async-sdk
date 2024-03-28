// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicAccelerateIpEndpointRelationsRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicAccelerateIpEndpointRelationsRequest</p>
 */
public class CreateBasicAccelerateIpEndpointRelationsRequest extends Request {
    @Query
    @NameInMap("AccelerateIpEndpointRelations")
    @Validation(required = true)
    private java.util.List < AccelerateIpEndpointRelations> accelerateIpEndpointRelations;

    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateBasicAccelerateIpEndpointRelationsRequest(Builder builder) {
        super(builder);
        this.accelerateIpEndpointRelations = builder.accelerateIpEndpointRelations;
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicAccelerateIpEndpointRelationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateIpEndpointRelations
     */
    public java.util.List < AccelerateIpEndpointRelations> getAccelerateIpEndpointRelations() {
        return this.accelerateIpEndpointRelations;
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateBasicAccelerateIpEndpointRelationsRequest, Builder> {
        private java.util.List < AccelerateIpEndpointRelations> accelerateIpEndpointRelations; 
        private String acceleratorId; 
        private String clientToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBasicAccelerateIpEndpointRelationsRequest request) {
            super(request);
            this.accelerateIpEndpointRelations = request.accelerateIpEndpointRelations;
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
        } 

        /**
         * A list of accelerated IP addresses and the endpoints with which the accelerated IP addresses are associated.
         */
        public Builder accelerateIpEndpointRelations(java.util.List < AccelerateIpEndpointRelations> accelerateIpEndpointRelations) {
            this.putQueryParameter("AccelerateIpEndpointRelations", accelerateIpEndpointRelations);
            this.accelerateIpEndpointRelations = accelerateIpEndpointRelations;
            return this;
        }

        /**
         * The ID of the basic GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
        public CreateBasicAccelerateIpEndpointRelationsRequest build() {
            return new CreateBasicAccelerateIpEndpointRelationsRequest(this);
        } 

    } 

    public static class AccelerateIpEndpointRelations extends TeaModel {
        @NameInMap("AccelerateIpId")
        private String accelerateIpId;

        @NameInMap("EndpointId")
        private String endpointId;

        private AccelerateIpEndpointRelations(Builder builder) {
            this.accelerateIpId = builder.accelerateIpId;
            this.endpointId = builder.endpointId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccelerateIpEndpointRelations create() {
            return builder().build();
        }

        /**
         * @return accelerateIpId
         */
        public String getAccelerateIpId() {
            return this.accelerateIpId;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        public static final class Builder {
            private String accelerateIpId; 
            private String endpointId; 

            /**
             * The IDs of the accelerated IP addresses.
             * <p>
             * 
             * You can call the [ListBasicAccelerateIps](~~2253393~~) operation to query the IDs of the accelerated IP addresses.
             * 
             * You can specify up to 20 IP address IDs.
             */
            public Builder accelerateIpId(String accelerateIpId) {
                this.accelerateIpId = accelerateIpId;
                return this;
            }

            /**
             * The IDs of the endpoints.
             * <p>
             * 
             * You can call the [ListBasicEndpoints](~~2253406~~) to query the IDs of the endpoints.
             * 
             * You can specify up to 20 endpoint IDs.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            public AccelerateIpEndpointRelations build() {
                return new AccelerateIpEndpointRelations(this);
            } 

        } 

    }
}
