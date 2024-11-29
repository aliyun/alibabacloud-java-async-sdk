// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateBgpGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateBgpGroupRequest</p>
 */
public class CreateBgpGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

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
    @com.aliyun.core.annotation.Validation(required = true)
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routerId;

    private CreateBgpGroupRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.ipVersion = builder.ipVersion;
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
        this.routerId = builder.routerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBgpGroupRequest create() {
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
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
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

    /**
     * @return routerId
     */
    public String getRouterId() {
        return this.routerId;
    }

    public static final class Builder extends Request.Builder<CreateBgpGroupRequest, Builder> {
        private String authKey; 
        private String clientToken; 
        private String description; 
        private String ipVersion; 
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
        private String routerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBgpGroupRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.ipVersion = request.ipVersion;
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
            this.routerId = request.routerId;
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
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
         * <p>The description of the BGP group.</p>
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
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li><strong>IPv4</strong>: This is the default value.</li>
         * <li><strong>IPv6</strong>: IPv6 is supported only if the VBR for which you want to create the BGP group has IPv6 enabled.</li>
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
         * <p>Specifies whether to use a fake ASN. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * <blockquote>
         * <p> A router that runs BGP typically belongs to only one AS. If you need to replace an existing AS with a new AS and you cannot immediately modify BGP configurations, you can use fake ASNs to ensure service continuity.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isFakeAsn(Boolean isFakeAsn) {
            this.putQueryParameter("IsFakeAsn", isFakeAsn);
            this.isFakeAsn = isFakeAsn;
            return this;
        }

        /**
         * <p>The custom ASN on the Alibaba Cloud side. Valid values:</p>
         * <ul>
         * <li><strong>45104</strong></li>
         * <li><strong>64512~65534</strong></li>
         * <li><strong>4200000000~4294967294</strong></li>
         * </ul>
         * <blockquote>
         * <p> <strong>65025</strong> is reserved by Alibaba Cloud. By default, Alibaba Cloud uses <strong>45104</strong> as <strong>LocalAsn</strong>. If you use custom <strong>LocalAsn</strong> in multi-line access scenarios, loops in BGP may occur.</p>
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
         * <p>The name of the BGP group.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name must start with a letter.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>The region ID of the VBR.</p>
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

        /**
         * <p>The ID of the VBR.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-bp1ctxy813985gkuk****</p>
         */
        public Builder routerId(String routerId) {
            this.putQueryParameter("RouterId", routerId);
            this.routerId = routerId;
            return this;
        }

        @Override
        public CreateBgpGroupRequest build() {
            return new CreateBgpGroupRequest(this);
        } 

    } 

}
