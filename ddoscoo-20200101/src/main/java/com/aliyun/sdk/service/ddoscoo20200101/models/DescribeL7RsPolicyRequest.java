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
 * {@link DescribeL7RsPolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeL7RsPolicyRequest</p>
 */
public class DescribeL7RsPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealServers")
    private java.util.List<String> realServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeL7RsPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.realServers = builder.realServers;
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
     * @return realServers
     */
    public java.util.List<String> getRealServers() {
        return this.realServers;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeL7RsPolicyRequest, Builder> {
        private String regionId; 
        private String domain; 
        private java.util.List<String> realServers; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeL7RsPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.realServers = request.realServers;
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
         * <p>The domain name of the website to query.</p>
         * <blockquote>
         * <p>A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query the domain names for which forwarding rules are configured.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>An array that consists of N addresses of origin servers to query. The maximum value of N is 200. You can specify up to 200 addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>1.<em><strong>.</strong></em>.1</p>
         */
        public Builder realServers(java.util.List<String> realServers) {
            this.putQueryParameter("RealServers", realServers);
            this.realServers = realServers;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
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
        public DescribeL7RsPolicyRequest build() {
            return new DescribeL7RsPolicyRequest(this);
        } 

    } 

}
