// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcPeerConnectionAttributeRequest} extends {@link RequestModel}
 *
 * <p>GetVpcPeerConnectionAttributeRequest</p>
 */
public class GetVpcPeerConnectionAttributeRequest extends Request {
    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    private GetVpcPeerConnectionAttributeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcPeerConnectionAttributeRequest create() {
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static final class Builder extends Request.Builder<GetVpcPeerConnectionAttributeRequest, Builder> {
        private String instanceId; 
        private String resourceOwnerAccount; 

        private Builder() {
            super();
        } 

        private Builder(GetVpcPeerConnectionAttributeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
        } 

        /**
         * The ID of the VPC peering connection that you want to query.
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
        public GetVpcPeerConnectionAttributeRequest build() {
            return new GetVpcPeerConnectionAttributeRequest(this);
        } 

    } 

}
