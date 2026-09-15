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
         * <p>The BFD hop count. Valid values: <strong>1</strong> to <strong>255</strong>.</p>
         * <p>This parameter is required when BFD is enabled.
         * Enter the BFD hop count, which specifies the maximum number of devices that data passes through from the source to the destination. You can configure different hop counts based on the actual physical link factors.</p>
         * <blockquote>
         * <p>If you use BFD in a multi-cloud environment or a direct fiber connection topology with no bridging devices in between, change the default BFD hop count from <strong>255</strong> to <strong>1</strong>.</p>
         * </blockquote>
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
         * <p>The ID of the BGP group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bgpg-wz9f62v4fbg****</p>
         */
        public Builder bgpGroupId(String bgpGroupId) {
            this.putQueryParameter("BgpGroupId", bgpGroupId);
            this.bgpGroupId = bgpGroupId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>The client generates the value. The value must be unique among different requests and cannot exceed 64 ASCII characters in length.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
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
         * <p>Specifies whether to enable Bidirectional Forwarding Detection (BFD). Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables BFD.</p>
         * </li>
         * <li><p><strong>false</strong>: does not enable BFD.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableBfd(Boolean enableBfd) {
            this.putQueryParameter("EnableBfd", enableBfd);
            this.enableBfd = enableBfd;
            return this;
        }

        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong> (default): IPv4.</li>
         * <li><strong>IPv6</strong>: IPv6. IPv6 is supported only when the Virtual Border Router (VBR) on which the BGP group is created has the enable IPv6 feature turned on.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
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
         * <p>The IP address of the BGP peer.</p>
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
         * <p>The region ID of the BGP group.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
        public CreateBgpPeerRequest build() {
            return new CreateBgpPeerRequest(this);
        } 

    } 

}
