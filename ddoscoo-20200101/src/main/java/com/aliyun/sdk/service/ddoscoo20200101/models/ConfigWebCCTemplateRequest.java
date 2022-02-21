// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigWebCCTemplateRequest} extends {@link RequestModel}
 *
 * <p>ConfigWebCCTemplateRequest</p>
 */
public class ConfigWebCCTemplateRequest extends Request {
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
    @NameInMap("Template")
    @Validation(required = true)
    private String template;

    private ConfigWebCCTemplateRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigWebCCTemplateRequest create() {
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
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<ConfigWebCCTemplateRequest, Builder> {
        private String domain; 
        private String regionId; 
        private String resourceGroupId; 
        private String template; 

        private Builder() {
            super();
        } 

        private Builder(ConfigWebCCTemplateRequest response) {
            super(response);
            this.domain = response.domain;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.template = response.template;
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
         * Template.
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        @Override
        public ConfigWebCCTemplateRequest build() {
            return new ConfigWebCCTemplateRequest(this);
        } 

    } 

}
