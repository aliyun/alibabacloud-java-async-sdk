// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DeleteWebCacheCustomRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteWebCacheCustomRuleRequest</p>
 */
public class DeleteWebCacheCustomRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> ruleNames;

    private DeleteWebCacheCustomRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.resourceGroupId = builder.resourceGroupId;
        this.ruleNames = builder.ruleNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWebCacheCustomRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ruleNames
     */
    public java.util.List<String> getRuleNames() {
        return this.ruleNames;
    }

    public static final class Builder extends Request.Builder<DeleteWebCacheCustomRuleRequest, Builder> {
        private String regionId; 
        private String domain; 
        private String resourceGroupId; 
        private java.util.List<String> ruleNames; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWebCacheCustomRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.resourceGroupId = request.resourceGroupId;
            this.ruleNames = request.ruleNames;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The domain name for which you want to delete the custom rules of the Static Page Caching policy.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all the domain names that are added to Anti-DDoS Pro or Anti-DDoS Premium.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs in Resource Management.</p>
         * <p>If you do not configure this parameter, the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>An array consisting of the names of the rules that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ruleNames(java.util.List<String> ruleNames) {
            this.putQueryParameter("RuleNames", ruleNames);
            this.ruleNames = ruleNames;
            return this;
        }

        @Override
        public DeleteWebCacheCustomRuleRequest build() {
            return new DeleteWebCacheCustomRuleRequest(this);
        } 

    } 

}
