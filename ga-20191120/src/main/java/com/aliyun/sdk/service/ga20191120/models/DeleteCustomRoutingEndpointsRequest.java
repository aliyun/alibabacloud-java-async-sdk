// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomRoutingEndpointsRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomRoutingEndpointsRequest</p>
 */
public class DeleteCustomRoutingEndpointsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > endpointIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteCustomRoutingEndpointsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointIds = builder.endpointIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomRoutingEndpointsRequest create() {
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
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return endpointIds
     */
    public java.util.List < String > getEndpointIds() {
        return this.endpointIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteCustomRoutingEndpointsRequest, Builder> {
        private String clientToken; 
        private String endpointGroupId; 
        private java.util.List < String > endpointIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomRoutingEndpointsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.endpointGroupId = request.endpointGroupId;
            this.endpointIds = request.endpointIds;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among all requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the endpoint group to which the endpoint that you want to delete belongs.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The IDs of endpoints to be deleted.
         * <p>
         * 
         * If you do not set this parameter, all the endpoints in the specified endpoint group are deleted.
         * 
         * You can specify at most 10 endpoint IDs.
         */
        public Builder endpointIds(java.util.List < String > endpointIds) {
            this.putQueryParameter("EndpointIds", endpointIds);
            this.endpointIds = endpointIds;
            return this;
        }

        /**
         * The region ID of the GA instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteCustomRoutingEndpointsRequest build() {
            return new DeleteCustomRoutingEndpointsRequest(this);
        } 

    } 

}
