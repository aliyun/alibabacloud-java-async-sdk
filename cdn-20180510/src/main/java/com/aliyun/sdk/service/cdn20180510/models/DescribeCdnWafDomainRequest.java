// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCdnWafDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnWafDomainRequest</p>
 */
public class DescribeCdnWafDomainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeCdnWafDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnWafDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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

    public static final class Builder extends Request.Builder<DescribeCdnWafDomainRequest, Builder> {
        private String domainName; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnWafDomainRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The domain name that you want to query.</p>
         * <p>You can specify only one domain name in each request. You have three options to configure this parameter:</p>
         * <ul>
         * <li>Specify an exact domain name. For example, if you set this parameter to example.com, configuration information of example.com is queried.</li>
         * <li>Specify a keyword. For example, if you set this parameter to example, configuration information about all domain names that contain example is queried.</li>
         * <li>Leave this parameter empty. If this parameter is left empty, all accelerated domain names for which WAF is configured are queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The region where WAF is enabled. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: inside the Chinese mainland</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
         * </ul>
         * <blockquote>
         * <p>ap-southeast-1 includes Hong Kong (China), Macao (China), Taiwan (China), and other countries and regions.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeCdnWafDomainRequest build() {
            return new DescribeCdnWafDomainRequest(this);
        } 

    } 

}
