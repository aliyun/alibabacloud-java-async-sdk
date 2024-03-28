// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicAccelerateIpEndpointRelationRequest} extends {@link RequestModel}
 *
 * <p>GetBasicAccelerateIpEndpointRelationRequest</p>
 */
public class GetBasicAccelerateIpEndpointRelationRequest extends Request {
    @Query
    @NameInMap("AccelerateIpId")
    private String accelerateIpId;

    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndpointId")
    private String endpointId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private GetBasicAccelerateIpEndpointRelationRequest(Builder builder) {
        super(builder);
        this.accelerateIpId = builder.accelerateIpId;
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.endpointId = builder.endpointId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBasicAccelerateIpEndpointRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateIpId
     */
    public String getAccelerateIpId() {
        return this.accelerateIpId;
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
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetBasicAccelerateIpEndpointRelationRequest, Builder> {
        private String accelerateIpId; 
        private String acceleratorId; 
        private String clientToken; 
        private String endpointId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetBasicAccelerateIpEndpointRelationRequest request) {
            super(request);
            this.accelerateIpId = request.accelerateIpId;
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.endpointId = request.endpointId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the accelerated IP address.
         * <p>
         * 
         * >  You must specify **EndpointId** or **AccelerateIpId**.
         */
        public Builder accelerateIpId(String accelerateIpId) {
            this.putQueryParameter("AccelerateIpId", accelerateIpId);
            this.accelerateIpId = accelerateIpId;
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
         * The ID of the endpoint.
         * <p>
         * 
         * >  You must specify **EndpointId** or **AccelerateIpId**.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
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
        public GetBasicAccelerateIpEndpointRelationRequest build() {
            return new GetBasicAccelerateIpEndpointRelationRequest(this);
        } 

    } 

}
