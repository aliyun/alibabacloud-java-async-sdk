// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBgpPeerRequest} extends {@link RequestModel}
 *
 * <p>CreateBgpPeerRequest</p>
 */
public class CreateBgpPeerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BfdMultiHop")
    private Integer bfdMultiHop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BgpGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bgpGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableBfd")
    private Boolean enableBfd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerIpAddress")
    private String peerIpAddress;

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

    private CreateBgpPeerRequest(Builder builder) {
        super(builder);
        this.bfdMultiHop = builder.bfdMultiHop;
        this.bgpGroupId = builder.bgpGroupId;
        this.clientToken = builder.clientToken;
        this.enableBfd = builder.enableBfd;
        this.ipVersion = builder.ipVersion;
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

    public static CreateBgpPeerRequest create() {
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
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
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

    public static final class Builder extends Request.Builder<CreateBgpPeerRequest, Builder> {
        private Integer bfdMultiHop; 
        private String bgpGroupId; 
        private String clientToken; 
        private Boolean enableBfd; 
        private String ipVersion; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peerIpAddress; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBgpPeerRequest request) {
            super(request);
            this.bfdMultiHop = request.bfdMultiHop;
            this.bgpGroupId = request.bgpGroupId;
            this.clientToken = request.clientToken;
            this.enableBfd = request.enableBfd;
            this.ipVersion = request.ipVersion;
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
         * This parameter is required only if you enable BFD.
         * 
         * The parameter specifies the maximum number of network devices that a packet can traverse from the source to the destination. Set a value based on your network topology.
         */
        public Builder bfdMultiHop(Integer bfdMultiHop) {
            this.putQueryParameter("BfdMultiHop", bfdMultiHop);
            this.bfdMultiHop = bfdMultiHop;
            return this;
        }

        /**
         * The ID of the BGP group.
         */
        public Builder bgpGroupId(String bgpGroupId) {
            this.putQueryParameter("BgpGroupId", bgpGroupId);
            this.bgpGroupId = bgpGroupId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         * 
         * >  If you do not set this parameter, the system uses the value of **RequestId** as **ClientToken**. The value of **RequestId** for each API request is different.
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
         * *   **true**: enables BFD.
         * *   **false**: disables BFD.
         */
        public Builder enableBfd(Boolean enableBfd) {
            this.putQueryParameter("EnableBfd", enableBfd);
            this.enableBfd = enableBfd;
            return this;
        }

        /**
         * The IP version. Valid values:
         * <p>
         * 
         * *   **IPv4**: This is the default value.
         * *   **IPv6**: IPv6 is supported only if the VBR for which you want to create the BGP group has IPv6 enabled.
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
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
         * The IP address of the BGP peer.
         */
        public Builder peerIpAddress(String peerIpAddress) {
            this.putQueryParameter("PeerIpAddress", peerIpAddress);
            this.peerIpAddress = peerIpAddress;
            return this;
        }

        /**
         * The ID of the region to which the BGP group belongs.
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
        public CreateBgpPeerRequest build() {
            return new CreateBgpPeerRequest(this);
        } 

    } 

}
