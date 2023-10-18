// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVcoRouteEntryWeightRequest} extends {@link RequestModel}
 *
 * <p>ModifyVcoRouteEntryWeightRequest</p>
 */
public class ModifyVcoRouteEntryWeightRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("NewWeight")
    @Validation(required = true)
    private Integer newWeight;

    @Query
    @NameInMap("NextHop")
    @Validation(required = true)
    private String nextHop;

    @Query
    @NameInMap("OverlayMode")
    private String overlayMode;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

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
    @NameInMap("VpnConnectionId")
    @Validation(required = true)
    private String vpnConnectionId;

    @Query
    @NameInMap("Weight")
    @Validation(required = true)
    private Integer weight;

    private ModifyVcoRouteEntryWeightRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.newWeight = builder.newWeight;
        this.nextHop = builder.nextHop;
        this.overlayMode = builder.overlayMode;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeDest = builder.routeDest;
        this.vpnConnectionId = builder.vpnConnectionId;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVcoRouteEntryWeightRequest create() {
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
     * @return vpnConnectionId
     */
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<ModifyVcoRouteEntryWeightRequest, Builder> {
        private String clientToken; 
        private Integer newWeight; 
        private String nextHop; 
        private String overlayMode; 
        private String ownerAccount; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String routeDest; 
        private String vpnConnectionId; 
        private Integer weight; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVcoRouteEntryWeightRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.newWeight = request.newWeight;
            this.nextHop = request.nextHop;
            this.overlayMode = request.overlayMode;
            this.ownerAccount = request.ownerAccount;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeDest = request.routeDest;
            this.vpnConnectionId = request.vpnConnectionId;
            this.weight = request.weight;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The new weight of the destination-based route that you want to modify. Valid values:
         * <p>
         * 
         * *   **0**: a low priority
         * *   **100**: a high priority
         */
        public Builder newWeight(Integer newWeight) {
            this.putQueryParameter("NewWeight", newWeight);
            this.newWeight = newWeight;
            return this;
        }

        /**
         * The next hop of the destination-based route that you want to modify.
         */
        public Builder nextHop(String nextHop) {
            this.putQueryParameter("NextHop", nextHop);
            this.nextHop = nextHop;
            return this;
        }

        /**
         * The tunneling protocol. Set the value to **Ipsec**, which specifies the IPsec tunneling protocol.
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
         * The ID of the region where the IPsec-VPN connection is established.
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
         * The destination CIDR block of the destination-based route that you want to modify.
         */
        public Builder routeDest(String routeDest) {
            this.putQueryParameter("RouteDest", routeDest);
            this.routeDest = routeDest;
            return this;
        }

        /**
         * The ID of the IPsec-VPN connection.
         */
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.putQueryParameter("VpnConnectionId", vpnConnectionId);
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }

        /**
         * The current weight of the destination-based route that you want to modify. Valid values:
         * <p>
         * 
         * *   **0**: a low priority
         * *   **100**: a high priority
         */
        public Builder weight(Integer weight) {
            this.putQueryParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public ModifyVcoRouteEntryWeightRequest build() {
            return new ModifyVcoRouteEntryWeightRequest(this);
        } 

    } 

}
