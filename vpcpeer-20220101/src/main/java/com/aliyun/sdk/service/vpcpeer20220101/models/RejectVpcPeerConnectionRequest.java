// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RejectVpcPeerConnectionRequest} extends {@link RequestModel}
 *
 * <p>RejectVpcPeerConnectionRequest</p>
 */
public class RejectVpcPeerConnectionRequest extends Request {
    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private RejectVpcPeerConnectionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RejectVpcPeerConnectionRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<RejectVpcPeerConnectionRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String instanceId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(RejectVpcPeerConnectionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
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
         * The ID of the VPC peering connection to be rejected by the acceptor VPC.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putBodyParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        @Override
        public RejectVpcPeerConnectionRequest build() {
            return new RejectVpcPeerConnectionRequest(this);
        } 

    } 

}
