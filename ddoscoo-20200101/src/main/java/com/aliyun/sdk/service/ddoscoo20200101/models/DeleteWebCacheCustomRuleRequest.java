// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWebCacheCustomRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteWebCacheCustomRuleRequest</p>
 */
public class DeleteWebCacheCustomRuleRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RuleNames")
    @Validation(required = true)
    private java.util.List < String > ruleNames;

    private DeleteWebCacheCustomRuleRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.regionId = builder.regionId;
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DeleteWebCacheCustomRuleRequest, Builder> {
        private String domain; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List < String > ruleNames; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWebCacheCustomRuleRequest response) {
            super(response);
            this.domain = response.domain;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.ruleNames = response.ruleNames;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * RuleNames.
         */
        public Builder ruleNames(java.util.List < String > ruleNames) {
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
