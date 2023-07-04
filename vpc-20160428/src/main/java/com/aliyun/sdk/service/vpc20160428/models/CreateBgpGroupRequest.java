// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBgpGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateBgpGroupRequest</p>
 */
public class CreateBgpGroupRequest extends Request {
    @Query
    @NameInMap("AuthKey")
    private String authKey;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("IpVersion")
    private String ipVersion;

    @Query
    @NameInMap("IsFakeAsn")
    private Boolean isFakeAsn;

    @Query
    @NameInMap("LocalAsn")
    private Long localAsn;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PeerAsn")
    @Validation(required = true)
    private Long peerAsn;

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
    @NameInMap("RouteQuota")
    private Integer routeQuota;

    @Query
    @NameInMap("RouterId")
    @Validation(required = true)
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
         * The authentication key of the BGP group.
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among all requests. ClientToken can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the BGP group.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. It must start with a letter and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * Specifies whether to use a fake ASN. Valid values:
         * <p>
         * 
         * *   **false** (default): no
         * *   **true**: yes
         * 
         * >  In most cases, a router that runs BGP belongs to only one AS. If you want to use a different ASN to communicate with the peer but you cannot modify the BGP configuration because it may cause service downtime, you can use a fake ASN. For example, you can use a fake ASN to communicate with the peer when you migrate or merge ASs. This prevents service interruptions.
         */
        public Builder isFakeAsn(Boolean isFakeAsn) {
            this.putQueryParameter("IsFakeAsn", isFakeAsn);
            this.isFakeAsn = isFakeAsn;
            return this;
        }

        /**
         * The custom ASN on the Alibaba Cloud side. Valid values:
         * <p>
         * 
         * *   **45104**
         * *   **64512~65534**
         * *   **4200000000~4294967294**
         * 
         * >  **65025** is reserved by Alibaba Cloud. By default, Alibaba Cloud uses **45104** as **LocalAsn**. If you use a custom **LocalAsn** in scenarios where multiple connections are used, BGP loops may occur. Proceed with caution.
         */
        public Builder localAsn(Long localAsn) {
            this.putQueryParameter("LocalAsn", localAsn);
            this.localAsn = localAsn;
            return this;
        }

        /**
         * The name of the BGP group.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
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
         * The ASN of the gateway device in the data center.
         */
        public Builder peerAsn(Long peerAsn) {
            this.putQueryParameter("PeerAsn", peerAsn);
            this.peerAsn = peerAsn;
            return this;
        }

        /**
         * The region ID of the VBR.
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
         * The maximum number of routes supported by a BGP peer. Default value: **110**.
         */
        public Builder routeQuota(Integer routeQuota) {
            this.putQueryParameter("RouteQuota", routeQuota);
            this.routeQuota = routeQuota;
            return this;
        }

        /**
         * The ID of the VBR.
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
