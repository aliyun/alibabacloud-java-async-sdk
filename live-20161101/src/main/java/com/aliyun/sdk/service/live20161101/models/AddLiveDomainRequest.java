// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveDomainRequest} extends {@link RequestModel}
 *
 * <p>AddLiveDomainRequest</p>
 */
public class AddLiveDomainRequest extends Request {
    @Query
    @NameInMap("CheckUrl")
    private String checkUrl;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("LiveDomainType")
    @Validation(required = true)
    private String liveDomainType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("Scope")
    private String scope;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("TopLevelDomain")
    private String topLevelDomain;

    private AddLiveDomainRequest(Builder builder) {
        super(builder);
        this.checkUrl = builder.checkUrl;
        this.domainName = builder.domainName;
        this.liveDomainType = builder.liveDomainType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.scope = builder.scope;
        this.securityToken = builder.securityToken;
        this.topLevelDomain = builder.topLevelDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkUrl
     */
    public String getCheckUrl() {
        return this.checkUrl;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return liveDomainType
     */
    public String getLiveDomainType() {
        return this.liveDomainType;
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return topLevelDomain
     */
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

    public static final class Builder extends Request.Builder<AddLiveDomainRequest, Builder> {
        private String checkUrl; 
        private String domainName; 
        private String liveDomainType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String region; 
        private String scope; 
        private String securityToken; 
        private String topLevelDomain; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveDomainRequest response) {
            super(response);
            this.checkUrl = response.checkUrl;
            this.domainName = response.domainName;
            this.liveDomainType = response.liveDomainType;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.region = response.region;
            this.scope = response.scope;
            this.securityToken = response.securityToken;
            this.topLevelDomain = response.topLevelDomain;
        } 

        /**
         * CheckUrl.
         */
        public Builder checkUrl(String checkUrl) {
            this.putQueryParameter("CheckUrl", checkUrl);
            this.checkUrl = checkUrl;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * LiveDomainType.
         */
        public Builder liveDomainType(String liveDomainType) {
            this.putQueryParameter("LiveDomainType", liveDomainType);
            this.liveDomainType = liveDomainType;
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
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * TopLevelDomain.
         */
        public Builder topLevelDomain(String topLevelDomain) {
            this.putQueryParameter("TopLevelDomain", topLevelDomain);
            this.topLevelDomain = topLevelDomain;
            return this;
        }

        @Override
        public AddLiveDomainRequest build() {
            return new AddLiveDomainRequest(this);
        } 

    } 

}
