// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyCdnDomainRequest} extends {@link RequestModel}
 *
 * <p>ModifyCdnDomainRequest</p>
 */
public class ModifyCdnDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sources")
    private String sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopLevelDomain")
    private String topLevelDomain;

    private ModifyCdnDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityToken = builder.securityToken;
        this.sources = builder.sources;
        this.topLevelDomain = builder.topLevelDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCdnDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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

    public static final class Builder extends Request.Builder<ModifyCdnDomainRequest, Builder> {
        private String domainName; 
        private Long ownerId; 
        private String resourceGroupId; 
        private String securityToken; 
        private String sources; 
        private String topLevelDomain; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCdnDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityToken = request.securityToken;
            this.sources = request.sources;
            this.topLevelDomain = request.topLevelDomain;
        } 

        /**
         * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyuji4b6r4**</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * <p>The information about the addresses of origin servers.</p>
         * <blockquote>
         * <p>Do not set <strong>Sources</strong> and <strong>TopLevelDomain</strong> at the same time. If you set <strong>Sources</strong> and <strong>TopLevelDomain</strong> at the same time, <strong>TopLevelDomain</strong> does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;content&quot;:&quot;1.1.1.1&quot;,&quot;type&quot;:&quot;ipaddr&quot;,&quot;priority&quot;:&quot;20&quot;,&quot;port&quot;:80,&quot;weight&quot;:&quot;15&quot;}]</p>
         */
        public Builder sources(String sources) {
            this.putQueryParameter("Sources", sources);
            this.sources = sources;
            return this;
        }

        /**
         * <p>The root domain. To add a root domain name, you must be added to the whitelist specified by the CDN_TOP_LEVEL_DOMAIN_GREY_USER_LIST parameter.</p>
         * <blockquote>
         * <p>Do not set <strong>Sources</strong> and <strong>TopLevelDomain</strong> at the same time. If you set <strong>Sources</strong> and <strong>TopLevelDomain</strong> at the same time, <strong>TopLevelDomain</strong> does not take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc.com</p>
         */
        public Builder topLevelDomain(String topLevelDomain) {
            this.putQueryParameter("TopLevelDomain", topLevelDomain);
            this.topLevelDomain = topLevelDomain;
            return this;
        }

        @Override
        public ModifyCdnDomainRequest build() {
            return new ModifyCdnDomainRequest(this);
        } 

    } 

}
