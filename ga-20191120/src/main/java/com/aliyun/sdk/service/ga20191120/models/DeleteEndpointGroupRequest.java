// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEndpointGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteEndpointGroupRequest</p>
 */
public class DeleteEndpointGroupRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndpointGroupId")
    @Validation(required = true)
    private String endpointGroupId;

    private DeleteEndpointGroupRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.endpointGroupId = builder.endpointGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEndpointGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public static final class Builder extends Request.Builder<DeleteEndpointGroupRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private String endpointGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEndpointGroupRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.clientToken = response.clientToken;
            this.endpointGroupId = response.endpointGroupId;
        } 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EndpointGroupId.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        @Override
        public DeleteEndpointGroupRequest build() {
            return new DeleteEndpointGroupRequest(this);
        } 

    } 

}
