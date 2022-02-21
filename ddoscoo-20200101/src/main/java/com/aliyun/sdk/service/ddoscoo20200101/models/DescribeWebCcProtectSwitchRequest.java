// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebCcProtectSwitchRequest} extends {@link RequestModel}
 *
 * <p>DescribeWebCcProtectSwitchRequest</p>
 */
public class DescribeWebCcProtectSwitchRequest extends Request {
    @Query
    @NameInMap("Domains")
    @Validation(required = true)
    private java.util.List < String > domains;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeWebCcProtectSwitchRequest(Builder builder) {
        super(builder);
        this.domains = builder.domains;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebCcProtectSwitchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domains
     */
    public java.util.List < String > getDomains() {
        return this.domains;
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

    public static final class Builder extends Request.Builder<DescribeWebCcProtectSwitchRequest, Builder> {
        private java.util.List < String > domains; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWebCcProtectSwitchRequest response) {
            super(response);
            this.domains = response.domains;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
        } 

        /**
         * Domains.
         */
        public Builder domains(java.util.List < String > domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
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

        @Override
        public DescribeWebCcProtectSwitchRequest build() {
            return new DescribeWebCcProtectSwitchRequest(this);
        } 

    } 

}
