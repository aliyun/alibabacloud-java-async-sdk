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
 * {@link ModifyBgpPeerAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyBgpPeerAttributeRequest</p>
 */
public class ModifyBgpPeerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BfdMultiHop")
    private Integer bfdMultiHop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BgpGroupId")
    private String bgpGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BgpPeerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bgpPeerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableBfd")
    private Boolean enableBfd;

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
         * <p>The BFD hop count. Valid values: <strong>1</strong> to <strong>255</strong>.</p>
         * <p>This parameter is required only if you enable BFD. The parameter specifies the maximum number of network devices that a packet can traverse from the source to the destination. Set a value based on your network topology.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder bfdMultiHop(Integer bfdMultiHop) {
            this.putQueryParameter("BfdMultiHop", bfdMultiHop);
            this.bfdMultiHop = bfdMultiHop;
            return this;
        }

        /**
         * <p>The ID of the BGP group to which the BGP peer that you want to modify belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>bgpg-m5eo12jxuw2hc0uqq****</p>
         */
        public Builder bgpGroupId(String bgpGroupId) {
            this.putQueryParameter("BgpGroupId", bgpGroupId);
            this.bgpGroupId = bgpGroupId;
            return this;
        }

        /**
         * <p>The ID of the BGP peer that you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bgp-m5eoyp2mwegk8ce9v****</p>
         */
        public Builder bgpPeerId(String bgpPeerId) {
            this.putQueryParameter("BgpPeerId", bgpPeerId);
            this.bgpPeerId = bgpPeerId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Bidirectional Forwarding Detection (BFD) feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The IP address of the BGP peer that you want to modify.</p>
         * 
         * <strong>example:</strong>
         * <p>116.62.XX.XX</p>
         */
        public Builder peerIpAddress(String peerIpAddress) {
            this.putQueryParameter("PeerIpAddress", peerIpAddress);
            this.peerIpAddress = peerIpAddress;
            return this;
        }

        /**
         * <p>The region ID of the BGP group to which the BGP peer that you want to modify belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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
