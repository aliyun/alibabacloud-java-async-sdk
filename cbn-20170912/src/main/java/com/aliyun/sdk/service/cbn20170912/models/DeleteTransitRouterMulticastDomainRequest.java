// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteTransitRouterMulticastDomainRequest} extends {@link RequestModel}
 *
 * <p>DeleteTransitRouterMulticastDomainRequest</p>
 */
public class DeleteTransitRouterMulticastDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterMulticastDomainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterMulticastDomainId;

    private DeleteTransitRouterMulticastDomainRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterMulticastDomainId = builder.transitRouterMulticastDomainId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTransitRouterMulticastDomainRequest create() {
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return transitRouterMulticastDomainId
     */
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    public static final class Builder extends Request.Builder<DeleteTransitRouterMulticastDomainRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterMulticastDomainId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTransitRouterMulticastDomainRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouterMulticastDomainId = request.transitRouterMulticastDomainId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-4266****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The ID of the multicast domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-mcast-domain-40cwj0rgzgdtam****</p>
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            this.putQueryParameter("TransitRouterMulticastDomainId", transitRouterMulticastDomainId);
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        @Override
        public DeleteTransitRouterMulticastDomainRequest build() {
            return new DeleteTransitRouterMulticastDomainRequest(this);
        } 

    } 

}
