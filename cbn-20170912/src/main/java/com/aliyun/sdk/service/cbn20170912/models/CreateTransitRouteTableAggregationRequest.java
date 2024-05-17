// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransitRouteTableAggregationRequest} extends {@link RequestModel}
 *
 * <p>CreateTransitRouteTableAggregationRequest</p>
 */
public class CreateTransitRouteTableAggregationRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TransitRouteTableAggregationCidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouteTableAggregationCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouteTableAggregationDescription")
    private String transitRouteTableAggregationDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouteTableAggregationName")
    private String transitRouteTableAggregationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouteTableAggregationScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouteTableAggregationScope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouteTableId;

    private CreateTransitRouteTableAggregationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouteTableAggregationCidr = builder.transitRouteTableAggregationCidr;
        this.transitRouteTableAggregationDescription = builder.transitRouteTableAggregationDescription;
        this.transitRouteTableAggregationName = builder.transitRouteTableAggregationName;
        this.transitRouteTableAggregationScope = builder.transitRouteTableAggregationScope;
        this.transitRouteTableId = builder.transitRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouteTableAggregationRequest create() {
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
     * @return transitRouteTableAggregationCidr
     */
    public String getTransitRouteTableAggregationCidr() {
        return this.transitRouteTableAggregationCidr;
    }

    /**
     * @return transitRouteTableAggregationDescription
     */
    public String getTransitRouteTableAggregationDescription() {
        return this.transitRouteTableAggregationDescription;
    }

    /**
     * @return transitRouteTableAggregationName
     */
    public String getTransitRouteTableAggregationName() {
        return this.transitRouteTableAggregationName;
    }

    /**
     * @return transitRouteTableAggregationScope
     */
    public String getTransitRouteTableAggregationScope() {
        return this.transitRouteTableAggregationScope;
    }

    /**
     * @return transitRouteTableId
     */
    public String getTransitRouteTableId() {
        return this.transitRouteTableId;
    }

    public static final class Builder extends Request.Builder<CreateTransitRouteTableAggregationRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouteTableAggregationCidr; 
        private String transitRouteTableAggregationDescription; 
        private String transitRouteTableAggregationName; 
        private String transitRouteTableAggregationScope; 
        private String transitRouteTableId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransitRouteTableAggregationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouteTableAggregationCidr = request.transitRouteTableAggregationCidr;
            this.transitRouteTableAggregationDescription = request.transitRouteTableAggregationDescription;
            this.transitRouteTableAggregationName = request.transitRouteTableAggregationName;
            this.transitRouteTableAggregationScope = request.transitRouteTableAggregationScope;
            this.transitRouteTableId = request.transitRouteTableId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Valid values:
         * <p>
         * 
         * *   **false** (default): performs a dry run and sends the request.
         * *   **true**: performs a dry run. The system checks the required parameters and request syntax. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
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
         * The destination CIDR block of the aggregate route.
         * <p>
         * 
         * >  The following CIDR blocks are not supported:
         * >*   CIDR blocks that start with 0 or 100.64.
         * >*   Multicast CIDR blocks, including 224.0.0.1 to 239.255.255.254.
         */
        public Builder transitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
            this.putQueryParameter("TransitRouteTableAggregationCidr", transitRouteTableAggregationCidr);
            this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
            return this;
        }

        /**
         * The description of the aggregate route.
         * <p>
         * 
         * The description must be 0 to 256 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ \_ -.
         */
        public Builder transitRouteTableAggregationDescription(String transitRouteTableAggregationDescription) {
            this.putQueryParameter("TransitRouteTableAggregationDescription", transitRouteTableAggregationDescription);
            this.transitRouteTableAggregationDescription = transitRouteTableAggregationDescription;
            return this;
        }

        /**
         * The name of the aggregate route.
         * <p>
         * 
         * The name must be 1 to 128 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ \_ -. You can also leave the name empty.
         */
        public Builder transitRouteTableAggregationName(String transitRouteTableAggregationName) {
            this.putQueryParameter("TransitRouteTableAggregationName", transitRouteTableAggregationName);
            this.transitRouteTableAggregationName = transitRouteTableAggregationName;
            return this;
        }

        /**
         * The scope of networks that you want to advertise the aggregate route.
         * <p>
         * 
         * Set the value to **VPC**, which specified that the aggregate route is advertised to VPCs that are in associated forwarding relationship with a route table of the Enterprise Edition transit router and have route synchronization enabled.
         */
        public Builder transitRouteTableAggregationScope(String transitRouteTableAggregationScope) {
            this.putQueryParameter("TransitRouteTableAggregationScope", transitRouteTableAggregationScope);
            this.transitRouteTableAggregationScope = transitRouteTableAggregationScope;
            return this;
        }

        /**
         * The ID of the route table of the Enterprise Edition transit router.
         */
        public Builder transitRouteTableId(String transitRouteTableId) {
            this.putQueryParameter("TransitRouteTableId", transitRouteTableId);
            this.transitRouteTableId = transitRouteTableId;
            return this;
        }

        @Override
        public CreateTransitRouteTableAggregationRequest build() {
            return new CreateTransitRouteTableAggregationRequest(this);
        } 

    } 

}
