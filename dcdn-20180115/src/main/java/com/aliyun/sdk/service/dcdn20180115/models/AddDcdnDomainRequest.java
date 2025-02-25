// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddDcdnDomainRequest} extends {@link RequestModel}
 *
 * <p>AddDcdnDomainRequest</p>
 */
public class AddDcdnDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckUrl")
    private String checkUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionType")
    private String functionType;

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
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sources")
    private String sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopLevelDomain")
    private String topLevelDomain;

    private AddDcdnDomainRequest(Builder builder) {
        super(builder);
        this.checkUrl = builder.checkUrl;
        this.domainName = builder.domainName;
        this.functionType = builder.functionType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceGroupId = builder.resourceGroupId;
        this.scene = builder.scene;
        this.scope = builder.scope;
        this.securityToken = builder.securityToken;
        this.sources = builder.sources;
        this.tag = builder.tag;
        this.topLevelDomain = builder.topLevelDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDcdnDomainRequest create() {
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
     * @return functionType
     */
    public String getFunctionType() {
        return this.functionType;
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
     * @return scene
     */
    public String getScene() {
        return this.scene;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return topLevelDomain
     */
    public String getTopLevelDomain() {
        return this.topLevelDomain;
    }

    public static final class Builder extends Request.Builder<AddDcdnDomainRequest, Builder> {
        private String checkUrl; 
        private String domainName; 
        private String functionType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceGroupId; 
        private String scene; 
        private String scope; 
        private String securityToken; 
        private String sources; 
        private java.util.List < Tag> tag; 
        private String topLevelDomain; 

        private Builder() {
            super();
        } 

        private Builder(AddDcdnDomainRequest request) {
            super(request);
            this.checkUrl = request.checkUrl;
            this.domainName = request.domainName;
            this.functionType = request.functionType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceGroupId = request.resourceGroupId;
            this.scene = request.scene;
            this.scope = request.scope;
            this.securityToken = request.securityToken;
            this.sources = request.sources;
            this.tag = request.tag;
            this.topLevelDomain = request.topLevelDomain;
        } 

        /**
         * <p>The URL that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder checkUrl(String checkUrl) {
            this.putQueryParameter("CheckUrl", checkUrl);
            this.checkUrl = checkUrl;
            return this;
        }

        /**
         * <p>The domain name that you want to add. You can specify only one domain name in each request.</p>
         * <p>Wildcard domain names are supported. A wildcard domain name must start with a period (.), such as .example.com.</p>
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
         * <p>Computing service type. Valid values:</p>
         * <ul>
         * <li><strong>routine</strong></li>
         * <li><strong>image</strong></li>
         * <li><strong>cloudFunction</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>routine</p>
         */
        public Builder functionType(String functionType) {
            this.putQueryParameter("FunctionType", functionType);
            this.functionType = functionType;
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
         * <p>The ID of the resource group. If you do not specify a value for this parameter, the system automatically assigns the ID of the default resource group.</p>
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
         * <p>The Acceleration scen. Supported:</p>
         * <ul>
         * <li>apiscene:API acceleration.</li>
         * <li>webservicescene: accelerate website business.</li>
         * <li>staticscene: video and graphic acceleration.</li>
         * <li>(Empty): no scene.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>apiscene</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>The acceleration region. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: Chinese mainland</li>
         * <li><strong>overseas</strong>: outside the Chinese mainland</li>
         * <li><strong>global</strong>: global</li>
         * </ul>
         * <p>Default value: <strong>domestic</strong>.</p>
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
         * 
         * <strong>example:</strong>
         * <p>[{&quot;content&quot;:&quot;10.10.10.10&quot;,&quot;type&quot;:&quot;ipaddr&quot;,&quot;priority&quot;:&quot;20&quot;,&quot;port&quot;:80}]</p>
         */
        public Builder sources(String sources) {
            this.putQueryParameter("Sources", sources);
            this.sources = sources;
            return this;
        }

        /**
         * <p>The information about the tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The top-level domain.</p>
         * 
         * <strong>example:</strong>
         * <p>yourTopLevelDomain</p>
         */
        public Builder topLevelDomain(String topLevelDomain) {
            this.putQueryParameter("TopLevelDomain", topLevelDomain);
            this.topLevelDomain = topLevelDomain;
            return this;
        }

        @Override
        public AddDcdnDomainRequest build() {
            return new AddDcdnDomainRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddDcdnDomainRequest} extends {@link TeaModel}
     *
     * <p>AddDcdnDomainRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of a tag. Valid values of N: <strong>1 to 20</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of a tag. Valid values of N: <strong>1 to 20</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
