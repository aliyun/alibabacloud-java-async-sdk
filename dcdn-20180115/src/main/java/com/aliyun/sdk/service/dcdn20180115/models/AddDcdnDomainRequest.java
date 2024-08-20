// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The URL that is used for health checks.
         */
        public Builder checkUrl(String checkUrl) {
            this.putQueryParameter("CheckUrl", checkUrl);
            this.checkUrl = checkUrl;
            return this;
        }

        /**
         * The domain name that you want to add. You can specify only one domain name in each request.
         * <p>
         * 
         * Wildcard domain names are supported. A wildcard domain name must start with a period (.), such as .example.com.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Computing service type. Valid values:
         * <p>
         * 
         * *   **routine**
         * *   **image**
         * *   **cloudFunction**
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
         * The ID of the resource group. If you do not specify a value for this parameter, the system automatically assigns the ID of the default resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The Acceleration scen. Supported:
         * <p>
         * 
         * * apiscene:API acceleration.
         * * webservicescene: accelerate website business.
         * * staticscene: video and graphic acceleration.
         * * (Empty): no scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * The acceleration region. Valid values:
         * <p>
         * 
         * *   **domestic**: Chinese mainland
         * *   **overseas**: outside the Chinese mainland
         * *   **global**: global
         * 
         * Default value: **domestic**.
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
         * The information about the tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
        public AddDcdnDomainRequest build() {
            return new AddDcdnDomainRequest(this);
        } 

    } 

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
             * The key of a tag. Valid values of N: **1 to 20**.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of a tag. Valid values of N: **1 to 20**.
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
