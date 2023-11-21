// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBgpPeerAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyBgpPeerAttributeRequest</p>
 */
public class ModifyBgpPeerAttributeRequest extends Request {
    @Query
    @NameInMap("BfdMultiHop")
    private Integer bfdMultiHop;

    @Query
    @NameInMap("BgpGroupId")
    private String bgpGroupId;

    @Query
    @NameInMap("BgpPeerId")
    @Validation(required = true)
    private String bgpPeerId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EnableBfd")
    private Boolean enableBfd;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PeerIpAddress")
    private String peerIpAddress;

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

    private ModifyBgpPeerAttributeRequest(Builder builder) {
        super(builder);
        this.bfdMultiHop = builder.bfdMultiHop;
        this.bgpGroupId = builder.bgpGroupId;
        this.bgpPeerId = builder.bgpPeerId;
        this.clientToken = builder.clientToken;
        this.enableBfd = builder.enableBfd;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerIpAddress = builder.peerIpAddress;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBgpPeerAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bfdMultiHop
     */
    public Integer getBfdMultiHop() {
        return this.bfdMultiHop;
    }

    /**
     * @return bgpGroupId
     */
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    /**
     * @return bgpPeerId
     */
    public String getBgpPeerId() {
        return this.bgpPeerId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return enableBfd
     */
    public Boolean getEnableBfd() {
        return this.enableBfd;
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
     * @return peerIpAddress
     */
    public String getPeerIpAddress() {
        return this.peerIpAddress;
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

    public static final class Builder extends Request.Builder<ModifyBgpPeerAttributeRequest, Builder> {
        private Integer bfdMultiHop; 
        private String bgpGroupId; 
        private String bgpPeerId; 
        private String clientToken; 
        private Boolean enableBfd; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peerIpAddress; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBgpPeerAttributeRequest request) {
            super(request);
            this.bfdMultiHop = request.bfdMultiHop;
            this.bgpGroupId = request.bgpGroupId;
            this.bgpPeerId = request.bgpPeerId;
            this.clientToken = request.clientToken;
            this.enableBfd = request.enableBfd;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peerIpAddress = request.peerIpAddress;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The BFD hop count. Valid values: **1** to **255**.
         * <p>
         * 
         * This parameter is required only if you enable BFD. The parameter specifies the maximum number of network devices that a packet can traverse from the source to the destination. Set a value based on your network topology.
         */
        public Builder bfdMultiHop(Integer bfdMultiHop) {
            this.putQueryParameter("BfdMultiHop", bfdMultiHop);
            this.bfdMultiHop = bfdMultiHop;
            return this;
        }

        /**
         * The ID of the BGP group to which the BGP peer that you want to modify belongs.
         */
        public Builder bgpGroupId(String bgpGroupId) {
            this.putQueryParameter("BgpGroupId", bgpGroupId);
            this.bgpGroupId = bgpGroupId;
            return this;
        }

        /**
         * The ID of the BGP peer that you want to modify.
         */
        public Builder bgpPeerId(String bgpPeerId) {
            this.putQueryParameter("BgpPeerId", bgpPeerId);
            this.bgpPeerId = bgpPeerId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         * 
         * >  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to enable the Bidirectional Forwarding Detection (BFD) feature. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder enableBfd(Boolean enableBfd) {
            this.putQueryParameter("EnableBfd", enableBfd);
            this.enableBfd = enableBfd;
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
         * The IP address of the BGP peer that you want to modify.
         */
        public Builder peerIpAddress(String peerIpAddress) {
            this.putQueryParameter("PeerIpAddress", peerIpAddress);
            this.peerIpAddress = peerIpAddress;
            return this;
        }

        /**
         * The region ID of the BGP group to which the BGP peer that you want to modify belongs.
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

        @Override
        public ModifyBgpPeerAttributeRequest build() {
            return new ModifyBgpPeerAttributeRequest(this);
        } 

    } 

}
