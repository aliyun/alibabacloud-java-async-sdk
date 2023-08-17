// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpcPeerConnectionRequest} extends {@link RequestModel}
 *
 * <p>DeleteVpcPeerConnectionRequest</p>
 */
public class DeleteVpcPeerConnectionRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("Force")
    private Boolean force;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteVpcPeerConnectionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.force = builder.force;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVpcPeerConnectionRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteVpcPeerConnectionRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private Boolean force; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVpcPeerConnectionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.force = request.force;
            this.instanceId = request.instanceId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, the system uses **RequestId** as **ClientToken**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to check the request without performing the operation. Valid values:
         * <p>
         * 
         * *   **true**: checks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails to pass the check, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.
         * *   **false** (default): sends the request. If the request passes the check, an HTTP 2xx status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Specifies whether to forcefully delete the VPC peering connection. Valid values:
         * <p>
         * 
         * *   **false** (default): no.
         * *   **true**: yes. If you forcefully delete the VPC peering connection, the system deletes the routes that point to the VPC peering connection from the VPC route table.
         */
        public Builder force(Boolean force) {
            this.putBodyParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * The ID of the VPC peering connection that you want to delete.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteVpcPeerConnectionRequest build() {
            return new DeleteVpcPeerConnectionRequest(this);
        } 

    } 

}
