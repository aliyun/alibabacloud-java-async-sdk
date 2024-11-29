// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyBgpGroupAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyBgpGroupAttributeRequest</p>
 */
public class ModifyBgpGroupAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BgpGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bgpGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClearAuthKey")
    private Boolean clearAuthKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsFakeAsn")
    private Boolean isFakeAsn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalAsn")
    private Long localAsn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeerAsn")
    private Long peerAsn;

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
    @com.aliyun.core.annotation.NameInMap("RouteQuota")
    private Integer routeQuota;

    private ModifyBgpGroupAttributeRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.bgpGroupId = builder.bgpGroupId;
        this.clearAuthKey = builder.clearAuthKey;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.isFakeAsn = builder.isFakeAsn;
        this.localAsn = builder.localAsn;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerAsn = builder.peerAsn;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.routeQuota = builder.routeQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBgpGroupAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return bgpGroupId
     */
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    /**
     * @return clearAuthKey
     */
    public Boolean getClearAuthKey() {
        return this.clearAuthKey;
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
     * @return isFakeAsn
     */
    public Boolean getIsFakeAsn() {
        return this.isFakeAsn;
    }

    /**
     * @return localAsn
     */
    public Long getLocalAsn() {
        return this.localAsn;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return peerAsn
     */
    public Long getPeerAsn() {
        return this.peerAsn;
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
     * @return routeQuota
     */
    public Integer getRouteQuota() {
        return this.routeQuota;
    }

    public static final class Builder extends Request.Builder<ModifyBgpGroupAttributeRequest, Builder> {
        private String authKey; 
        private String bgpGroupId; 
        private Boolean clearAuthKey; 
        private String clientToken; 
        private String description; 
        private Boolean isFakeAsn; 
        private Long localAsn; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private Long peerAsn; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer routeQuota; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBgpGroupAttributeRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.bgpGroupId = request.bgpGroupId;
            this.clearAuthKey = request.clearAuthKey;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.isFakeAsn = request.isFakeAsn;
            this.localAsn = request.localAsn;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peerAsn = request.peerAsn;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.routeQuota = request.routeQuota;
        } 

        /**
         * <p>The authentication key of the BGP group.</p>
         * 
         * <strong>example:</strong>
         * <p>!PWZ2****</p>
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * <p>The BGP group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bgpg-wz9f62v4fbg2g****</p>
         */
        public Builder bgpGroupId(String bgpGroupId) {
            this.putQueryParameter("BgpGroupId", bgpGroupId);
            this.bgpGroupId = bgpGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to clear the secret key. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder clearAuthKey(Boolean clearAuthKey) {
            this.putQueryParameter("ClearAuthKey", clearAuthKey);
            this.clearAuthKey = clearAuthKey;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
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
         * <p>The BGP group description.</p>
         * <p>The description must be 2 to 256 characters in length. It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to use a fake AS number. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * <blockquote>
         * <p>A router that runs BGP typically belongs to only one AS. If you need to replace an AS with a new one, but you cannot immediately modify BGP configurations due to business requirements, you can specify a fake AS number to establish a connection with the local end. This ensures service continuity in scenarios such as AS migration or AS merging.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isFakeAsn(Boolean isFakeAsn) {
            this.putQueryParameter("IsFakeAsn", isFakeAsn);
            this.isFakeAsn = isFakeAsn;
            return this;
        }

        /**
         * <p>The custom autonomous system number (ASN) of the BGP on the Alibaba Cloud side. Valid values:</p>
         * <ul>
         * <li><strong>45104</strong></li>
         * <li><strong>64512~65534</strong></li>
         * <li><strong>4200000000~4294967294</strong></li>
         * </ul>
         * <blockquote>
         * <p> <strong>65025</strong> is reserved by Alibaba Cloud. Alibaba Cloud uses <strong>45104</strong> as the <strong>local ASN</strong> by default. Custom <strong>local ASNs</strong> may cause loops in multi-line scenarios. Proceed with caution.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>45104</p>
         */
        public Builder localAsn(Long localAsn) {
            this.putQueryParameter("LocalAsn", localAsn);
            this.localAsn = localAsn;
            return this;
        }

        /**
         * <p>The BGP group name.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter but cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The ASN of the gateway device in the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>1****</p>
         */
        public Builder peerAsn(Long peerAsn) {
            this.putQueryParameter("PeerAsn", peerAsn);
            this.peerAsn = peerAsn;
            return this;
        }

        /**
         * <p>The region ID of the BGP group.</p>
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

        /**
         * <p>The maximum number of routes supported by a BGP peer. Default value: <strong>110</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>110</p>
         */
        public Builder routeQuota(Integer routeQuota) {
            this.putQueryParameter("RouteQuota", routeQuota);
            this.routeQuota = routeQuota;
            return this;
        }

        @Override
        public ModifyBgpGroupAttributeRequest build() {
            return new ModifyBgpGroupAttributeRequest(this);
        } 

    } 

}
