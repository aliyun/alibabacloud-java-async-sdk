// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcEndpointRequest} extends {@link RequestModel}
 *
 * <p>DeleteVpcEndpointRequest</p>
 */
public class DeleteVpcEndpointRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("EndpointId")
    @Validation(required = true)
    private String endpointId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    private DeleteVpcEndpointRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endpointId = builder.endpointId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVpcEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DeleteVpcEndpointRequest, Builder> {
        private String instanceId; 
        private String endpointId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVpcEndpointRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.endpointId = response.endpointId;
            this.clientToken = response.clientToken;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * EndpointId.
         */
        public Builder endpointId(String endpointId) {
            this.putPathParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
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

        @Override
        public DeleteVpcEndpointRequest build() {
            return new DeleteVpcEndpointRequest(this);
        } 

    } 

}
