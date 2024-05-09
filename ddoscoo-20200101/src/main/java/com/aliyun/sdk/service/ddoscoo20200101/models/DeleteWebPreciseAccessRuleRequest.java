// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWebPreciseAccessRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteWebPreciseAccessRuleRequest</p>
 */
public class DeleteWebPreciseAccessRuleRequest extends Request {
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
    private java.util.List < String > ruleNames;

    private DeleteWebPreciseAccessRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.resourceGroupId = builder.resourceGroupId;
        this.ruleNames = builder.ruleNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWebPreciseAccessRuleRequest create() {
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
    public java.util.List < String > getRuleNames() {
        return this.ruleNames;
    }

    public static final class Builder extends Request.Builder<DeleteWebPreciseAccessRuleRequest, Builder> {
        private String regionId; 
        private String domain; 
        private String resourceGroupId; 
        private java.util.List < String > ruleNames; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWebPreciseAccessRuleRequest request) {
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
         * The domain name of the website.
         * <p>
         * 
         * > A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * An array that consists of the names of rules to delete.
         */
        public Builder ruleNames(java.util.List < String > ruleNames) {
            this.putQueryParameter("RuleNames", ruleNames);
            this.ruleNames = ruleNames;
            return this;
        }

        @Override
        public DeleteWebPreciseAccessRuleRequest build() {
            return new DeleteWebPreciseAccessRuleRequest(this);
        } 

    } 

}
