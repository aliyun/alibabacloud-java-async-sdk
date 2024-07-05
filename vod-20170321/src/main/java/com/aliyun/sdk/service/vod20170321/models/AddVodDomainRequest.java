// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVodDomainRequest} extends {@link RequestModel}
 *
 * <p>AddVodDomainRequest</p>
 */
public class AddVodDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckUrl")
    private String checkUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sources")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopLevelDomain")
    private String topLevelDomain;

    private AddVodDomainRequest(Builder builder) {
        super(builder);
        this.checkUrl = builder.checkUrl;
        this.domainName = builder.domainName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.scope = builder.scope;
        this.securityToken = builder.securityToken;
        this.sources = builder.sources;
        this.topLevelDomain = builder.topLevelDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVodDomainRequest create() {
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
     * @return sources
     */
    public String getSources() {
        return this.sources;
    }

    /**
     * @return topLevelDomain
     */
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

    public static final class Builder extends Request.Builder<AddVodDomainRequest, Builder> {
        private String checkUrl; 
        private String domainName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String scope; 
        private String securityToken; 
        private String sources; 
        private String topLevelDomain; 

        private Builder() {
            super();
        } 

        private Builder(AddVodDomainRequest request) {
            super(request);
            this.checkUrl = request.checkUrl;
            this.domainName = request.domainName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.scope = request.scope;
            this.securityToken = request.securityToken;
            this.sources = request.sources;
            this.topLevelDomain = request.topLevelDomain;
        } 

        /**
         * The URL that is used for health checks.
         */
        public Builder checkUrl(String checkUrl) {
            this.putQueryParameter("CheckUrl", checkUrl);
            this.checkUrl = checkUrl;
            return this;
        }

        /**
         * The domain name that you want to accelerate. Wildcard domain names that start with periods (.) are supported. Example: .example.com.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * This parameter is applicable to users of level 3 or higher in the Chinese mainland and users outside the Chinese mainland. Default value: domestic. Valid values:
         * <p>
         * 
         * *   **domestic**: Chinese mainland
         * *   **overseas**: outside the Chinese mainland
         * *   **global**: regions in and outside the Chinese mainland
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
         * The information about the addresses of origin servers. For more information, see the **Sources** table in this topic.
         */
        public Builder sources(String sources) {
            this.putQueryParameter("Sources", sources);
            this.sources = sources;
            return this;
        }

        /**
         * The top-level domain.
         */
        public Builder topLevelDomain(String topLevelDomain) {
            this.putQueryParameter("TopLevelDomain", topLevelDomain);
            this.topLevelDomain = topLevelDomain;
            return this;
        }

        @Override
        public AddVodDomainRequest build() {
            return new AddVodDomainRequest(this);
        } 

    } 

}
