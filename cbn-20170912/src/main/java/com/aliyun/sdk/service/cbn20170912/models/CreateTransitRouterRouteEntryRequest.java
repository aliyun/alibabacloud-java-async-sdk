// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateTransitRouterRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateTransitRouterRouteEntryRequest</p>
 */
public class CreateTransitRouterRouteEntryRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryDescription")
    private String transitRouterRouteEntryDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryDestinationCidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterRouteEntryDestinationCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryName")
    private String transitRouterRouteEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryNextHopId")
    private String transitRouterRouteEntryNextHopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteEntryNextHopType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterRouteEntryNextHopType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterRouteTableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterRouteTableId;

    private CreateTransitRouterRouteEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterRouteEntryDescription = builder.transitRouterRouteEntryDescription;
        this.transitRouterRouteEntryDestinationCidrBlock = builder.transitRouterRouteEntryDestinationCidrBlock;
        this.transitRouterRouteEntryName = builder.transitRouterRouteEntryName;
        this.transitRouterRouteEntryNextHopId = builder.transitRouterRouteEntryNextHopId;
        this.transitRouterRouteEntryNextHopType = builder.transitRouterRouteEntryNextHopType;
        this.transitRouterRouteTableId = builder.transitRouterRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterRouteEntryRequest create() {
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
     * @return transitRouterRouteEntryDescription
     */
    public String getTransitRouterRouteEntryDescription() {
        return this.transitRouterRouteEntryDescription;
    }

    /**
     * @return transitRouterRouteEntryDestinationCidrBlock
     */
    public String getTransitRouterRouteEntryDestinationCidrBlock() {
        return this.transitRouterRouteEntryDestinationCidrBlock;
    }

    /**
     * @return transitRouterRouteEntryName
     */
    public String getTransitRouterRouteEntryName() {
        return this.transitRouterRouteEntryName;
    }

    /**
     * @return transitRouterRouteEntryNextHopId
     */
    public String getTransitRouterRouteEntryNextHopId() {
        return this.transitRouterRouteEntryNextHopId;
    }

    /**
     * @return transitRouterRouteEntryNextHopType
     */
    public String getTransitRouterRouteEntryNextHopType() {
        return this.transitRouterRouteEntryNextHopType;
    }

    /**
     * @return transitRouterRouteTableId
     */
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public static final class Builder extends Request.Builder<CreateTransitRouterRouteEntryRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterRouteEntryDescription; 
        private String transitRouterRouteEntryDestinationCidrBlock; 
        private String transitRouterRouteEntryName; 
        private String transitRouterRouteEntryNextHopId; 
        private String transitRouterRouteEntryNextHopType; 
        private String transitRouterRouteTableId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransitRouterRouteEntryRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouterRouteEntryDescription = request.transitRouterRouteEntryDescription;
            this.transitRouterRouteEntryDestinationCidrBlock = request.transitRouterRouteEntryDestinationCidrBlock;
            this.transitRouterRouteEntryName = request.transitRouterRouteEntryName;
            this.transitRouterRouteEntryNextHopId = request.transitRouterRouteEntryNextHopId;
            this.transitRouterRouteEntryNextHopType = request.transitRouterRouteEntryNextHopType;
            this.transitRouterRouteTableId = request.transitRouterRouteTableId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> is different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
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
         * <p>The description of the route.</p>
         * <p>The description must be 1 to 256 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>testdesc</p>
         */
        public Builder transitRouterRouteEntryDescription(String transitRouterRouteEntryDescription) {
            this.putQueryParameter("TransitRouterRouteEntryDescription", transitRouterRouteEntryDescription);
            this.transitRouterRouteEntryDescription = transitRouterRouteEntryDescription;
            return this;
        }

        /**
         * <p>The destination CIDR block of the route.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        public Builder transitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
            this.putQueryParameter("TransitRouterRouteEntryDestinationCidrBlock", transitRouterRouteEntryDestinationCidrBlock);
            this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
            return this;
        }

        /**
         * <p>The name of the route.</p>
         * <p>The name must be 1 to 128 characters in length, and cannot start with http:// or https://. You can also leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>testname</p>
         */
        public Builder transitRouterRouteEntryName(String transitRouterRouteEntryName) {
            this.putQueryParameter("TransitRouterRouteEntryName", transitRouterRouteEntryName);
            this.transitRouterRouteEntryName = transitRouterRouteEntryName;
            return this;
        }

        /**
         * <p>The ID of the network instance connection that you want to specify as the next hop.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-nls9fzkfat8934****</p>
         */
        public Builder transitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopId", transitRouterRouteEntryNextHopId);
            this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
            return this;
        }

        /**
         * <p>The type of the next hop. Valid values:</p>
         * <ul>
         * <li><strong>BlackHole</strong>: routes network traffic to a black hole. All packets that match this route are dropped. If you select this option, you do not need to specify the next hop information.</li>
         * <li><strong>Attachment</strong>: routes network traffic to a network instance connection. If you select this option, you must specify the ID of the network instance connection. All packets that match this route are routed to the specified network instance connection.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BlackHole</p>
         */
        public Builder transitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
            this.putQueryParameter("TransitRouterRouteEntryNextHopType", transitRouterRouteEntryNextHopType);
            this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
            return this;
        }

        /**
         * <p>The ID of the route table of the Enterprise Edition transit router.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp1dudbh2d5na6b50****</p>
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            this.putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
            this.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        @Override
        public CreateTransitRouterRouteEntryRequest build() {
            return new CreateTransitRouterRouteEntryRequest(this);
        } 

    } 

}
