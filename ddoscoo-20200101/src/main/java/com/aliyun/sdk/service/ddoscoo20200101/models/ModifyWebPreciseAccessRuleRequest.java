// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebPreciseAccessRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebPreciseAccessRuleRequest</p>
 */
public class ModifyWebPreciseAccessRuleRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Expires")
    private Integer expires;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Rules")
    @Validation(required = true)
    private String rules;

    private ModifyWebPreciseAccessRuleRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.expires = builder.expires;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebPreciseAccessRuleRequest create() {
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
     * @return expires
     */
    public Integer getExpires() {
        return this.expires;
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
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<ModifyWebPreciseAccessRuleRequest, Builder> {
        private String domain; 
        private Integer expires; 
        private String regionId; 
        private String resourceGroupId; 
        private String rules; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebPreciseAccessRuleRequest response) {
            super(response);
            this.domain = response.domain;
            this.expires = response.expires;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.rules = response.rules;
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
         * Expires.
         */
        public Builder expires(Integer expires) {
            this.putQueryParameter("Expires", expires);
            this.expires = expires;
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
         * Rules.
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        @Override
        public ModifyWebPreciseAccessRuleRequest build() {
            return new ModifyWebPreciseAccessRuleRequest(this);
        } 

    } 

}
