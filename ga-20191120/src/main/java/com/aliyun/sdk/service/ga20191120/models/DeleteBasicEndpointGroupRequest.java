// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBasicEndpointGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteBasicEndpointGroupRequest</p>
 */
public class DeleteBasicEndpointGroupRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndpointGroupId")
    @Validation(required = true)
    private String endpointGroupId;

    private DeleteBasicEndpointGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.endpointGroupId = builder.endpointGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBasicEndpointGroupRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteBasicEndpointGroupRequest, Builder> {
        private String clientToken; 
        private String endpointGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBasicEndpointGroupRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.endpointGroupId = response.endpointGroupId;
        } 

        /**
         * 客户端Token
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 终端节点组Id
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        @Override
        public DeleteBasicEndpointGroupRequest build() {
            return new DeleteBasicEndpointGroupRequest(this);
        } 

    } 

}
