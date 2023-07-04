// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpnPbrRouteEntryAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpnPbrRouteEntryAttributeRequest</p>
 */
public class ModifyVpnPbrRouteEntryAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("NewPriority")
    private Integer newPriority;

    @Query
    @NameInMap("NewWeight")
    private Integer newWeight;

    @Query
    @NameInMap("NextHop")
    @Validation(required = true)
    private String nextHop;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Priority")
    @Validation(required = true)
    private Integer priority;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RouteDest")
    @Validation(required = true)
    private String routeDest;

    @Query
    @NameInMap("RouteSource")
    @Validation(required = true)
    private String routeSource;

    @Query
    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    private String vpnGatewayId;

    @Query
    @NameInMap("Weight")
    @Validation(required = true)
    private Integer weight;

    private ModifyVpnPbrRouteEntryAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.newPriority = builder.newPriority;
        this.newWeight = builder.newWeight;
        this.nextHop = builder.nextHop;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
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

    public static ModifyVpnPbrRouteEntryAttributeRequest create() {
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
     * @return newPriority
     */
    public Integer getNewPriority() {
        return this.newPriority;
    }

    /**
     * @return newWeight
     */
    public Integer getNewWeight() {
        return this.newWeight;
    }

    /**
     * @return nextHop
     */
    public String getNextHop() {
        return this.nextHop;
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

    public static final class Builder extends Request.Builder<ModifyVpnPbrRouteEntryAttributeRequest, Builder> {
        private String clientToken; 
        private Integer newPriority; 
        private Integer newWeight; 
        private String nextHop; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer priority; 
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

        private Builder(ModifyVpnPbrRouteEntryAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.newPriority = request.newPriority;
            this.newWeight = request.newWeight;
            this.nextHop = request.nextHop;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.priority = request.priority;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeDest = request.routeDest;
            this.routeSource = request.routeSource;
            this.vpnGatewayId = request.vpnGatewayId;
            this.weight = request.weight;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, the system sets **ClientToken** to the value of **RequestId**. The value of **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The new priority of the policy-based route. Valid values: **1** to **100**.
         * <p>
         * 
         * A smaller value indicates a higher priority.
         * 
         * If you do not set this parameter, the priority of the policy-based route is not modified.
         */
        public Builder newPriority(Integer newPriority) {
            this.putQueryParameter("NewPriority", newPriority);
            this.newPriority = newPriority;
            return this;
        }

        /**
         * The new weight of the policy-based route. Valid values:
         * <p>
         * 
         * *   **100**: The IPsec-VPN connection associated with the policy-based route serves as an active connection.
         * *   **0**: The IPsec-VPN connection associated with the policy-based route serves as a standby connection.
         * 
         * If you do not set this parameter, the weight of the policy-based route is not modified.
         */
        public Builder newWeight(Integer newWeight) {
            this.putQueryParameter("NewWeight", newWeight);
            this.newWeight = newWeight;
            return this;
        }

        /**
         * The next hop of the policy-based route.
         */
        public Builder nextHop(String nextHop) {
            this.putQueryParameter("NextHop", nextHop);
            this.nextHop = nextHop;
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
         * The original priority of the policy-based route. Valid values: **1** to **100**.
         * <p>
         * 
         * A smaller value indicates a higher priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The region ID of the VPN gateway.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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
         * The destination CIDR block of the policy-based route.
         */
        public Builder routeDest(String routeDest) {
            this.putQueryParameter("RouteDest", routeDest);
            this.routeDest = routeDest;
            return this;
        }

        /**
         * The source CIDR block of the policy-based route.
         */
        public Builder routeSource(String routeSource) {
            this.putQueryParameter("RouteSource", routeSource);
            this.routeSource = routeSource;
            return this;
        }

        /**
         * The ID of the VPN gateway.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        /**
         * The original weight of the policy-based route. Valid values:
         * <p>
         * 
         * *   **100**: The IPsec-VPN connection associated with the policy-based route serves as an active connection.
         * *   **0**: The IPsec-VPN connection associated with the policy-based route serves as a standby connection.
         */
        public Builder weight(Integer weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public ModifyVpnPbrRouteEntryAttributeRequest build() {
            return new ModifyVpnPbrRouteEntryAttributeRequest(this);
        } 

    } 

}
