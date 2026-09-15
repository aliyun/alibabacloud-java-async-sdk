// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

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
        this.dryRun = builder.dryRun;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
        private Boolean dryRun; 
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
            this.dryRun = request.dryRun;
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
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
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
         * <p>The description must be 1 to 100 characters in length.</p>
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
         * <p>Specifies whether to perform a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the error code <code>DryRunOperation</code> is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</li>
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
         * <p>The tunneling protocol. Set the value to <strong>Ipsec</strong> (IPsec tunnel protocol).</p>
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
         * <p>The policy priority of the policy-based routing entry. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
         * <p>A smaller value indicates a higher policy priority for the routing entry.</p>
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
         * <p>Specifies whether to publish the policy-based route to the VPC route table. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Publishes the policy-based route to the VPC route table. The system publishes the route only to the VPC system route table, not to VPC custom route tables.</p>
         * <p>If you want the VPC custom route table to contain this route, manually add the route. For more information, see <a href="https://help.aliyun.com/document_detail/448722.html">CreateRouteEntry</a>.</p>
         * </li>
         * <li><p><strong>false</strong>: Does not publish the policy-based route to the VPC route table.</p>
         * <p>You must manually add a policy-based route whose next hop points to the VPN gateway instance in both the VPC system route table and custom route tables. Otherwise, the VPC cannot access resources in the CIDR block through the IPsec-VPN connection.</p>
         * </li>
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
         * <p>The region ID of the VPN gateway instance. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The ID of the VPN gateway instance.</p>
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
         * <p>The weight of the policy-based routing entry.</p>
         * <p>When you use the same VPN gateway instance to establish active/standby IPsec-VPN connections, you can specify the active and standby links by configuring the weight of the policy-based routing entry. A policy-based routing entry with a weight of 100 is the active link by default, and a policy-based routing entry with a weight of 0 is the standby link by default.</p>
         * <p>You can configure health checks for the IPsec-VPN connection to automatically detect link connectivity. If the active link is down, the system automatically switches traffic to the standby link, ensuring high availability of the cloud connection. For more information, see <a href="https://help.aliyun.com/document_detail/120391.html">CreateVpnConnection</a>.</p>
         * <ul>
         * <li><strong>100</strong>: The IPsec-VPN connection associated with the policy-based routing entry serves as the active link.</li>
         * <li><strong>0</strong>: The IPsec-VPN connection associated with the policy-based routing entry serves as the standby link.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>When you specify active and standby links, the source and destination CIDR blocks of the active and standby policy-based routing entries must be the same.</li>
         * <li>For VPN gateway instances that support dual-tunnel pattern IPsec-VPN connections, you do not need to configure this parameter settings. A dual-tunnel pattern IPsec-VPN connection contains two tunnels that automatically form active/standby links. You do not need to specify active/standby links by configuring this parameter. If you configure this parameter, the configuration does not take effect.</li>
         * </ul>
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
