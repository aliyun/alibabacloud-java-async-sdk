// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddDcdnDomainRequest} extends {@link RequestModel}
 *
 * <p>BatchAddDcdnDomainRequest</p>
 */
public class BatchAddDcdnDomainRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

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

    private BatchAddDcdnDomainRequest(Builder builder) {
        super(builder);
        this.checkUrl = builder.checkUrl;
        this.domainName = builder.domainName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.scope = builder.scope;
        this.securityToken = builder.securityToken;
        this.sources = builder.sources;
        this.topLevelDomain = builder.topLevelDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddDcdnDomainRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<BatchAddDcdnDomainRequest, Builder> {
        private String checkUrl; 
        private String domainName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceGroupId; 
        private String scope; 
        private String securityToken; 
        private String sources; 
        private String topLevelDomain; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddDcdnDomainRequest request) {
            super(request);
            this.checkUrl = request.checkUrl;
            this.domainName = request.domainName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
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
         * You can add up to 20 domain names to DCDN for each of your Alibaba Cloud account. If you specify multiple domain names, separate them with commas (,).
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
         * The ID of the resource group. If you do not specify a value for this parameter, the system uses the ID of the default resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The acceleration region. Default value: domestic. Valid values:
         * <p>
         * 
         * *   domestic: Chinese mainland
         * *   overseas: global (excluding the Chinese mainland)
         * *   global: global
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
         * The information about the addresses of origin servers.
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
        public BatchAddDcdnDomainRequest build() {
            return new BatchAddDcdnDomainRequest(this);
        } 

    } 

}
