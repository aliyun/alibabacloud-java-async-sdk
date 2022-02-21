// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeL7RsPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeL7RsPolicyRequest</p>
 */
public class DescribeL7RsPolicyRequest extends Request {
    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("RealServers")
    private java.util.List < String > realServers;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeL7RsPolicyRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.realServers = builder.realServers;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeL7RsPolicyRequest create() {
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
     * @return realServers
     */
    public java.util.List < String > getRealServers() {
        return this.realServers;
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

    public static final class Builder extends Request.Builder<DescribeL7RsPolicyRequest, Builder> {
        private String domain; 
        private java.util.List < String > realServers; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeL7RsPolicyRequest response) {
            super(response);
            this.domain = response.domain;
            this.realServers = response.realServers;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
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
         * RealServers.
         */
        public Builder realServers(java.util.List < String > realServers) {
            this.putQueryParameter("RealServers", realServers);
            this.realServers = realServers;
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
        public DescribeL7RsPolicyRequest build() {
            return new DescribeL7RsPolicyRequest(this);
        } 

    } 

}
