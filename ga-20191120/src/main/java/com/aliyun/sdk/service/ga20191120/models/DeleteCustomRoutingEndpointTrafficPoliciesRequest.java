// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomRoutingEndpointTrafficPoliciesRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomRoutingEndpointTrafficPoliciesRequest</p>
 */
public class DeleteCustomRoutingEndpointTrafficPoliciesRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndpointId")
    @Validation(required = true)
    private String endpointId;

    @Query
    @NameInMap("PolicyIds")
    @Validation(required = true)
    private java.util.List < String > policyIds;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteCustomRoutingEndpointTrafficPoliciesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endpointId = builder.endpointId;
        this.policyIds = builder.policyIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomRoutingEndpointTrafficPoliciesRequest create() {
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
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return policyIds
     */
    public java.util.List < String > getPolicyIds() {
        return this.policyIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteCustomRoutingEndpointTrafficPoliciesRequest, Builder> {
        private String clientToken; 
        private String endpointId; 
        private java.util.List < String > policyIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomRoutingEndpointTrafficPoliciesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.endpointId = request.endpointId;
            this.policyIds = request.policyIds;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the endpoint for which you want to delete traffic destinations.
         * <p>
         * 
         * >  This parameter is required.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The IDs of the traffic destinations.
         * <p>
         * 
         * You can specify the IDs of up to 9,000 traffic destinations.
         */
        public Builder policyIds(java.util.List < String > policyIds) {
            this.putQueryParameter("PolicyIds", policyIds);
            this.policyIds = policyIds;
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
        public DeleteCustomRoutingEndpointTrafficPoliciesRequest build() {
            return new DeleteCustomRoutingEndpointTrafficPoliciesRequest(this);
        } 

    } 

}
