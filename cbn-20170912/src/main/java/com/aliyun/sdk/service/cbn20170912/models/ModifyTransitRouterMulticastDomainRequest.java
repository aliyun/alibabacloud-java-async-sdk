// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTransitRouterMulticastDomainRequest} extends {@link RequestModel}
 *
 * <p>ModifyTransitRouterMulticastDomainRequest</p>
 */
public class ModifyTransitRouterMulticastDomainRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TransitRouterMulticastDomainDescription")
    private String transitRouterMulticastDomainDescription;

    @Query
    @NameInMap("TransitRouterMulticastDomainId")
    @Validation(required = true)
    private String transitRouterMulticastDomainId;

    @Query
    @NameInMap("TransitRouterMulticastDomainName")
    private String transitRouterMulticastDomainName;

    private ModifyTransitRouterMulticastDomainRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterMulticastDomainDescription = builder.transitRouterMulticastDomainDescription;
        this.transitRouterMulticastDomainId = builder.transitRouterMulticastDomainId;
        this.transitRouterMulticastDomainName = builder.transitRouterMulticastDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTransitRouterMulticastDomainRequest create() {
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
     * @return transitRouterMulticastDomainDescription
     */
    public String getTransitRouterMulticastDomainDescription() {
        return this.transitRouterMulticastDomainDescription;
    }

    /**
     * @return transitRouterMulticastDomainId
     */
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    /**
     * @return transitRouterMulticastDomainName
     */
    public String getTransitRouterMulticastDomainName() {
        return this.transitRouterMulticastDomainName;
    }

    public static final class Builder extends Request.Builder<ModifyTransitRouterMulticastDomainRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterMulticastDomainDescription; 
        private String transitRouterMulticastDomainId; 
        private String transitRouterMulticastDomainName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTransitRouterMulticastDomainRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouterMulticastDomainDescription = request.transitRouterMulticastDomainDescription;
            this.transitRouterMulticastDomainId = request.transitRouterMulticastDomainId;
            this.transitRouterMulticastDomainName = request.transitRouterMulticastDomainName;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether only to precheck the request. Valid values:
         * <p>
         * 
         * *   **true**: prechecks the request but does not modify the name or description of the multicast domain. The system checks the required parameters, the request format, and the service limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * *   **false** (default): sends the request. If the request passes the precheck, the name and description of the multicast domain are modified.
         * 
         * >  This parameter is not in use.
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
         * The new description of the multicast domain.
         * <p>
         * 
         * The description must be 0 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (\_), and hyphens (-).
         */
        public Builder transitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
            this.putQueryParameter("TransitRouterMulticastDomainDescription", transitRouterMulticastDomainDescription);
            this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
            return this;
        }

        /**
         * The ID of the multicast domain.
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            this.putQueryParameter("TransitRouterMulticastDomainId", transitRouterMulticastDomainId);
            this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        /**
         * The new name of the multicast domain.
         * <p>
         * 
         * The name must be 0 to 128 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (\_), and hyphens (-).
         */
        public Builder transitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
            this.putQueryParameter("TransitRouterMulticastDomainName", transitRouterMulticastDomainName);
            this.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
            return this;
        }

        @Override
        public ModifyTransitRouterMulticastDomainRequest build() {
            return new ModifyTransitRouterMulticastDomainRequest(this);
        } 

    } 

}
