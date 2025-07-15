// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddLiveDomainRequest} extends {@link RequestModel}
 *
 * <p>AddLiveDomainRequest</p>
 */
public class AddLiveDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckUrl")
    private String checkUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LiveDomainType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String liveDomainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

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
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopLevelDomain")
    private String topLevelDomain;

    private AddLiveDomainRequest(Builder builder) {
        super(builder);
        this.checkUrl = builder.checkUrl;
        this.domainName = builder.domainName;
        this.liveDomainType = builder.liveDomainType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.resourceGroupId = builder.resourceGroupId;
        this.scope = builder.scope;
        this.securityToken = builder.securityToken;
        this.tag = builder.tag;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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
        private String resourceGroupId; 
        private String scope; 
        private String securityToken; 
        private java.util.List<Tag> tag; 
        private String topLevelDomain; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveDomainRequest request) {
            super(request);
            this.checkUrl = request.checkUrl;
            this.domainName = request.domainName;
            this.liveDomainType = request.liveDomainType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.resourceGroupId = request.resourceGroupId;
            this.scope = request.scope;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
            this.topLevelDomain = request.topLevelDomain;
        } 

        /**
         * <p>The URL that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://demo.aliyundoc.com/status.html">http://demo.aliyundoc.com/status.html</a></p>
         */
        public Builder checkUrl(String checkUrl) {
            this.putQueryParameter("CheckUrl", checkUrl);
            this.checkUrl = checkUrl;
            return this;
        }

        /**
         * <p>The ingest domain or streaming domain that you want to add. Wildcard domain names that start with a period (.) are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>liveVideo</strong>: streaming domain. This value is required if you set the DomainName parameter to a streaming domain.</li>
         * <li><strong>liveEdge</strong>: ingest domain. This value is required if you set the DomainName parameter to an ingest domain.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveVideo</p>
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
         * <p>The region in which the domain name resides. Valid values:</p>
         * <ul>
         * <li><strong>cn-beijing</strong>: China (Beijing)</li>
         * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
         * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
         * <li><strong>cn-qingdao</strong>: China (Qingdao)</li>
         * <li><strong>ap-southeast-1</strong>: Singapore</li>
         * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
         * <li><strong>ap-northeast-1</strong>: Japan (Tokyo)</li>
         * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta)</li>
         * </ul>
         * <blockquote>
         * <p> Make sure that the settings of the Region and Scope parameters do not conflict with each other.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The ID of the resource group. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">Resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzw******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The edge group. This parameter is applicable to users of level 3 or higher in mainland China and users outside mainland China. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: mainland China. This is the default value.</li>
         * <li><strong>overseas</strong>: outside mainland China.</li>
         * <li><strong>global</strong>: regions in and outside mainland China.</li>
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
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The top-level domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>learn.aliyundoc.com</p>
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

    /**
     * 
     * {@link AddLiveDomainRequest} extends {@link TeaModel}
     *
     * <p>AddLiveDomainRequest</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
