// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateVpnPbrRouteEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateVpnPbrRouteEntryRequest</p>
 */
public class CreateVpnPbrRouteEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHop")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextHop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverlayMode")
    private String overlayMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublishVpc")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean publishVpc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteDest")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeDest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpnGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Weight")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer weight;

    private CreateVpnPbrRouteEntryRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.nextHop = builder.nextHop;
        this.overlayMode = builder.overlayMode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
        this.publishVpc = builder.publishVpc;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeDest = builder.routeDest;
        this.routeSource = builder.routeSource;
        this.vpnGatewayId = builder.vpnGatewayId;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpnPbrRouteEntryRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return nextHop
     */
    public String getNextHop() {
        return this.nextHop;
    }

    /**
     * @return overlayMode
     */
    public String getOverlayMode() {
        return this.overlayMode;
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
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return publishVpc
     */
    public Boolean getPublishVpc() {
        return this.publishVpc;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return routeDest
     */
    public String getRouteDest() {
        return this.routeDest;
    }

    /**
     * @return routeSource
     */
    public String getRouteSource() {
        return this.routeSource;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<CreateVpnPbrRouteEntryRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String nextHop; 
        private String overlayMode; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer priority; 
        private Boolean publishVpc; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeDest; 
        private String routeSource; 
        private String vpnGatewayId; 
        private Integer weight; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpnPbrRouteEntryRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.nextHop = request.nextHop;
            this.overlayMode = request.overlayMode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.priority = request.priority;
            this.publishVpc = request.publishVpc;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeDest = request.routeDest;
            this.routeSource = request.routeSource;
            this.vpnGatewayId = request.vpnGatewayId;
            this.weight = request.weight;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID is different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>d7d24a21-f4ba-4454-9173-b3****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the policy-based route.</p>
         * <p>The description must be 1 to 100 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The next hop of the policy-based route.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-bp15oes1py4i66rmd****</p>
         */
        public Builder nextHop(String nextHop) {
            this.putQueryParameter("NextHop", nextHop);
            this.nextHop = nextHop;
            return this;
        }

        /**
         * <p>The tunneling protocol. Set the value to <strong>Ipsec</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Ipsec</p>
         */
        public Builder overlayMode(String overlayMode) {
            this.putQueryParameter("OverlayMode", overlayMode);
            this.overlayMode = overlayMode;
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
         * <p>The priority of the policy-based route. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
         * <p>A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>Specifies whether to advertise the policy-based route to a virtual private cloud (VPC) route table. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder publishVpc(Boolean publishVpc) {
            this.putQueryParameter("PublishVpc", publishVpc);
            this.publishVpc = publishVpc;
            return this;
        }

        /**
         * <p>The region ID of the VPN gateway. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * <p>The destination CIDR block of the policy-based route.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        public Builder routeDest(String routeDest) {
            this.putQueryParameter("RouteDest", routeDest);
            this.routeDest = routeDest;
            return this;
        }

        /**
         * <p>The source CIDR block of the policy-based route.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        public Builder routeSource(String routeSource) {
            this.putQueryParameter("RouteSource", routeSource);
            this.routeSource = routeSource;
            return this;
        }

        /**
         * <p>The VPN gateway ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1a3kqjiiq9legfx****</p>
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        /**
         * <p>The weight of the policy-based route.</p>
         * <p>If you use the same VPN gateway to establish active/standby IPsec-VPN connections, you can configure route weights to specify which connection is active. A value of 100 specifies the active connection, whereas a value of 0 specifies the standby connection.</p>
         * <p>You can configure health checks to automatically check the connectivity of IPsec-VPN connections. If the active connection is down, the standby connection automatically takes over. For more information, see <a href="https://help.aliyun.com/document_detail/120391.html">CreateVpnConnection</a>.</p>
         * <ul>
         * <li><strong>100</strong>: The IPsec-VPN connection associated with the policy-based route serves as an active connection.</li>
         * <li><strong>0</strong>: The IPsec-VPN connection associated with the policy-based route serves as a standby connection.</li>
         * </ul>
         * <blockquote>
         * <p> If you specify active/standby IPsec-VPN connections, the active policy-based route and the standby policy-based route must have the same source and destination CIDR blocks.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder weight(Integer weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public CreateVpnPbrRouteEntryRequest build() {
            return new CreateVpnPbrRouteEntryRequest(this);
        } 

    } 

}
