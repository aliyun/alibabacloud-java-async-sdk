// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHeadersRequest} extends {@link RequestModel}
 *
 * <p>ModifyHeadersRequest</p>
 */
public class ModifyHeadersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomHeaders")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customHeaders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyHeadersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customHeaders = builder.customHeaders;
        this.domain = builder.domain;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHeadersRequest create() {
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
     * @return customHeaders
     */
    public String getCustomHeaders() {
        return this.customHeaders;
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

    public static final class Builder extends Request.Builder<ModifyHeadersRequest, Builder> {
        private String regionId; 
        private String customHeaders; 
        private String domain; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHeadersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customHeaders = request.customHeaders;
            this.domain = request.domain;
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
         * The key-value pair of the custom header. The key specifies the header name, and the value specifies the header value. You can specify up to five key-value pairs. The key-value pairs can be up to 200 characters in length.
         * <p>
         * 
         * Take note of the following items:
         * 
         * *   Do not use X-Forwarded-ClientSrcPort as a custom header.
         * *   Do not use a standard HTTP header such as User-Agent. Otherwise, the original header may be overwritten.
         * 
         * >  If you specify a key of X-Forwarded-ClientSrcPort, the system obtains the originating port of the client that accesses Anti-DDoS Proxy (a Layer 7 proxy). In this case, the value is an empty string.
         */
        public Builder customHeaders(String customHeaders) {
            this.putQueryParameter("CustomHeaders", customHeaders);
            this.customHeaders = customHeaders;
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
         * The ID of the resource group to which the instance belongs.
         * <p>
         * 
         * > 
         * 
         * *   You can query resource group IDs in the Anti-DDoS Pro or Anti-DDoS Premium console or by calling the [ListResourceGroups](~~158855~~) operation. For more information, see [View basic information of a resource group](~~151181~~).
         * 
         * *   Before you modify the resource group to which an instance belongs, you can call the [ListResources](~~158866~~) operation to view the current resource group of the instance.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ModifyHeadersRequest build() {
            return new ModifyHeadersRequest(this);
        } 

    } 

}
