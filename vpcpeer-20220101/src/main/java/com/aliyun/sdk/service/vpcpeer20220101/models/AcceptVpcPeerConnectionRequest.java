// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptVpcPeerConnectionRequest} extends {@link RequestModel}
 *
 * <p>AcceptVpcPeerConnectionRequest</p>
 */
public class AcceptVpcPeerConnectionRequest extends Request {
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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Body
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private AcceptVpcPeerConnectionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptVpcPeerConnectionRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<AcceptVpcPeerConnectionRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String instanceId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(AcceptVpcPeerConnectionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the VPC peering connection to be accepted by the accepter VPC.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the resource group.
         * <p>
         * 
         * For more information about resource groups, see [What is a resource group?](~~94475~~)
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
        public AcceptVpcPeerConnectionRequest build() {
            return new AcceptVpcPeerConnectionRequest(this);
        } 

    } 

}
