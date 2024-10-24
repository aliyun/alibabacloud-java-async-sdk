// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The key-value pair of the custom header. The key specifies the header name, and the value specifies the header value. You can specify up to five key-value pairs. The key-value pairs can be up to 200 characters in length.</p>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>Do not use X-Forwarded-ClientSrcPort as a custom header.</li>
         * <li>Do not use a standard HTTP header such as User-Agent. Otherwise, the original header may be overwritten.</li>
         * </ul>
         * <blockquote>
         * <p> If you specify a key of X-Forwarded-ClientSrcPort, the system obtains the originating port of the client that accesses Anti-DDoS Proxy (a Layer 7 proxy). In this case, the value is an empty string.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;X-Forwarded-ClientSrcPort&quot;:&quot;&quot;}</p>
         */
        public Builder customHeaders(String customHeaders) {
            this.putQueryParameter("CustomHeaders", customHeaders);
            this.customHeaders = customHeaders;
            return this;
        }

        /**
         * <p>The domain name of the website.</p>
         * <blockquote>
         * <p>A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can query resource group IDs in the Anti-DDoS Pro or Anti-DDoS Premium console or by calling the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
         * </li>
         * <li><p>Before you modify the resource group to which an instance belongs, you can call the <a href="https://help.aliyun.com/document_detail/158866.html">ListResources</a> operation to view the current resource group of the instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmz6jbof5****</p>
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
