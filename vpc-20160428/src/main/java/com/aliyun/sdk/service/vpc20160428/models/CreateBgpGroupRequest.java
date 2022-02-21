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
        private String routerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBgpGroupRequest response) {
            super(response);
            this.authKey = response.authKey;
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.ipVersion = response.ipVersion;
            this.isFakeAsn = response.isFakeAsn;
            this.localAsn = response.localAsn;
            this.name = response.name;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.peerAsn = response.peerAsn;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.routerId = response.routerId;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IpVersion.
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * IsFakeAsn.
         */
        public Builder isFakeAsn(Boolean isFakeAsn) {
            this.putQueryParameter("IsFakeAsn", isFakeAsn);
            this.isFakeAsn = isFakeAsn;
            return this;
        }

        /**
         * LocalAsn.
         */
        public Builder localAsn(Long localAsn) {
            this.putQueryParameter("LocalAsn", localAsn);
            this.localAsn = localAsn;
            return this;
        }

        /**
         * Name.
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
         * PeerAsn.
         */
        public Builder peerAsn(Long peerAsn) {
            this.putQueryParameter("PeerAsn", peerAsn);
            this.peerAsn = peerAsn;
            return this;
        }

        /**
         * RegionId.
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
         * RouterId.
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
