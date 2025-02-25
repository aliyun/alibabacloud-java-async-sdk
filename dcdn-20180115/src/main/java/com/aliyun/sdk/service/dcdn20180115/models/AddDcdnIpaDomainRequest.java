// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddDcdnIpaDomainRequest} extends {@link RequestModel}
 *
 * <p>AddDcdnIpaDomainRequest</p>
 */
public class AddDcdnIpaDomainRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

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

    private AddDcdnIpaDomainRequest(Builder builder) {
        super(builder);
        this.checkUrl = builder.checkUrl;
        this.domainName = builder.domainName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.protocol = builder.protocol;
        this.resourceGroupId = builder.resourceGroupId;
        this.scope = builder.scope;
        this.securityToken = builder.securityToken;
        this.sources = builder.sources;
        this.topLevelDomain = builder.topLevelDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDcdnIpaDomainRequest create() {
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
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
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

    public static final class Builder extends Request.Builder<AddDcdnIpaDomainRequest, Builder> {
        private String checkUrl; 
        private String domainName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String protocol; 
        private String resourceGroupId; 
        private String scope; 
        private String securityToken; 
        private String sources; 
        private String topLevelDomain; 

        private Builder() {
            super();
        } 

        private Builder(AddDcdnIpaDomainRequest request) {
            super(request);
            this.checkUrl = request.checkUrl;
            this.domainName = request.domainName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.protocol = request.protocol;
            this.resourceGroupId = request.resourceGroupId;
            this.scope = request.scope;
            this.securityToken = request.securityToken;
            this.sources = request.sources;
            this.topLevelDomain = request.topLevelDomain;
        } 

        /**
         * <p>The URL that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com/image_01.png</p>
         */
        public Builder checkUrl(String checkUrl) {
            this.putQueryParameter("CheckUrl", checkUrl);
            this.checkUrl = checkUrl;
            return this;
        }

        /**
         * <p>The domain name to be added to IPA.</p>
         * <p>A wildcard domain that starts with a period (.) is supported, such as .example.com.</p>
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
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>udp</strong></li>
         * <li><strong>tcp</strong></li>
         * </ul>
         * <p>**</p>
         * <p><strong>Description</strong> For example: <code>{&quot;protocol&quot;:&quot;udp&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>udp</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The ID of the resource group. If you do not specify a value for this parameter, the system automatically assigns the ID of the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The acceleration region. Default value: domestic. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: Chinese mainland</li>
         * <li><strong>overseas</strong>: outside the Chinese mainland</li>
         * <li><strong>global</strong>: global</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
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
         * <p>The information about the addresses of origin servers.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;content&quot;:&quot;10.10.10.10&quot;,&quot;type&quot;:&quot;ipaddr&quot;,&quot;priority&quot;:&quot;20&quot;,&quot;port&quot;:80,&quot;weight&quot;:&quot;15&quot;}]</p>
         */
        public Builder sources(String sources) {
            this.putQueryParameter("Sources", sources);
            this.sources = sources;
            return this;
        }

        /**
         * <p>The top-level domain.</p>
         * 
         * <strong>example:</strong>
         * <p>*.com</p>
         */
        public Builder topLevelDomain(String topLevelDomain) {
            this.putQueryParameter("TopLevelDomain", topLevelDomain);
            this.topLevelDomain = topLevelDomain;
            return this;
        }

        @Override
        public AddDcdnIpaDomainRequest build() {
            return new AddDcdnIpaDomainRequest(this);
        } 

    } 

}
