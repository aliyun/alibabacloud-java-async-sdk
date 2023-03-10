// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebPreciseAccessRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebPreciseAccessRuleRequest</p>
 */
public class DescribeWebPreciseAccessRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Domains")
    @Validation(required = true)
    private java.util.List < String > domains;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeWebPreciseAccessRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domains = builder.domains;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebPreciseAccessRuleRequest create() {
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
    public java.util.List < String > getDomains() {
        return this.domains;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeWebPreciseAccessRuleRequest, Builder> {
        private String regionId; 
        private java.util.List < String > domains; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebPreciseAccessRuleRequest request) {
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
         * An array that consists of the domain names of websites.
         * <p>
         * 
         * > A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.
         */
        public Builder domains(java.util.List < String > domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
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

        @Override
        public DescribeWebPreciseAccessRuleRequest build() {
            return new DescribeWebPreciseAccessRuleRequest(this);
        } 

    } 

}
