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
 * {@link DescribeDomainCcProtectSwitchRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainCcProtectSwitchRequest</p>
 */
public class DescribeDomainCcProtectSwitchRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domains")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> domains;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeDomainCcProtectSwitchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domains = builder.domains;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainCcProtectSwitchRequest create() {
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
     * @return domains
     */
    public java.util.List<String> getDomains() {
        return this.domains;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeDomainCcProtectSwitchRequest, Builder> {
        private String regionId; 
        private java.util.List<String> domains; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainCcProtectSwitchRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domains = request.domains;
            this.resourceGroupId = request.resourceGroupId;
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
         * <p>The domain names of the websites. You can specify up to five domain names.</p>
         * <blockquote>
         * <p>A website forwarding rule must be configured for the domain name. Call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder domains(java.util.List<String> domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the Anti-DDoS Pro instance belongs in Resource Management. If you do not specify this parameter, the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeDomainCcProtectSwitchRequest build() {
            return new DescribeDomainCcProtectSwitchRequest(this);
        } 

    } 

}
