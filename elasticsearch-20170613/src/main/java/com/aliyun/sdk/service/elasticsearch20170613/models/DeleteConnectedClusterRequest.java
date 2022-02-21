// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConnectedClusterRequest} extends {@link RequestModel}
 *
 * <p>DeleteConnectedClusterRequest</p>
 */
public class DeleteConnectedClusterRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Query
    @NameInMap("connectedInstanceId")
    @Validation(required = true)
    private String connectedInstanceId;

    private DeleteConnectedClusterRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.connectedInstanceId = builder.connectedInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConnectedClusterRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return connectedInstanceId
     */
    public String getConnectedInstanceId() {
        return this.connectedInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteConnectedClusterRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private String connectedInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConnectedClusterRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.clientToken = response.clientToken;
            this.connectedInstanceId = response.connectedInstanceId;
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
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * connectedInstanceId.
         */
        public Builder connectedInstanceId(String connectedInstanceId) {
            this.putQueryParameter("connectedInstanceId", connectedInstanceId);
            this.connectedInstanceId = connectedInstanceId;
            return this;
        }

        @Override
        public DeleteConnectedClusterRequest build() {
            return new DeleteConnectedClusterRequest(this);
        } 

    } 

}
