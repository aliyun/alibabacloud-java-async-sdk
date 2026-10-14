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
    @com.aliyun.core.annotation.NameInMap("EmbeddedHeaders")
    private String embeddedHeaders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyHeadersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customHeaders = builder.customHeaders;
        this.domain = builder.domain;
        this.embeddedHeaders = builder.embeddedHeaders;
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
     * @return embeddedHeaders
     */
    public String getEmbeddedHeaders() {
        return this.embeddedHeaders;
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
        private String embeddedHeaders; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHeadersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customHeaders = request.customHeaders;
            this.domain = request.domain;
            this.embeddedHeaders = request.embeddedHeaders;
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
         * <p>The custom header, specified as a key-value pair. The key is the header name and the value is the header value. You can specify up to 5 key-value pairs. The total length cannot exceed 200 characters.</p>
         * <p>Important:</p>
         * <ul>
         * <li><ul>
         * <li><p>X-Forwarded-ClientSrcPort: Used by default to retrieve the client port that accesses the Layer 7 engine of Anti-DDoS Pro.</p>
         * </li>
         * <li><p>X-Forwarded-ProxyPort: Used by default to retrieve the listening port of the Layer 7 engine of Anti-DDoS Pro.</p>
         * </li>
         * <li><p>X-Forwarded-For: Used by default to retrieve the client IP address that accesses the Layer 7 engine of Anti-DDoS Pro.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Do not use standard HTTP header fields (such as <code>host</code>, <code>user-agent</code>, <code>connection</code>, and <code>upgrade</code>) or common custom HTTP header fields (such as <code>x-real-ip</code>, <code>x-true-ip</code>, <code>x-client-ip</code>, <code>web-server-type</code>, <code>wl-proxy-client-ip</code>, <code>eagleeye-rpcid</code>, <code>eagleeye-traceid</code>, <code>x-forwarded-cluster</code>, and <code>x-forwarded-proto</code>) as they will overwrite the original header values in requests.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>To use the <code>X-Forwarded-ClientSrcPort</code> key to retrieve the client port that accesses the Layer 7 engine of Anti-DDoS Pro, set the value to <code>&quot;&quot;</code>.</p>
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
         * <p>The domain of the website.</p>
         * <blockquote>
         * <p>A website service forwarding rule must be configured for the domain. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all your domains.</p>
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
         * <p>The forwarding configuration for request headers. This parameter is a JSON string of key-value pairs where the key is the header field name and the value is a boolean. Set the value to <code>true</code> to enable forwarding or <code>false</code> to disable it.</p>
         * <p>Field description:</p>
         * <p><code>X-Client-IP</code>: Forwards the client\&quot;s real IP address.</p>
         * <p><code>X-True-IP</code>: Forwards the client\&quot;s connection IP address.</p>
         * <p><code>Web-Server-Type</code>: Informs the back-end server about the type of front-end web server or proxy that is handling the request.</p>
         * <p><code>WL-Proxy-Client-IP</code>: A request header specific to Oracle WebLogic Server that provides the same functionality as <code>X-Client-IP</code>.</p>
         * <p><code>X-Forwarded-Proto</code>: Indicates the protocol used for the connection between the client and the first proxy.</p>
         * <p>Important:</p>
         * <ul>
         * <li><p><strong>Supported Headers</strong>: The configuration supports only the five preset header fields listed above.</p>
         * </li>
         * <li><p><strong>Default settings</strong>: All the listed header fields are enabled by default. To make changes, you must explicitly set the corresponding value to <code>false</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;X-Client-IP&quot;:true,&quot;X-True-IP&quot;:true,&quot;Web-Server-Type&quot;:true,&quot;WL-Proxy-Client-IP&quot;:true,&quot;X-Forwarded-Proto&quot;:true}</p>
         */
        public Builder embeddedHeaders(String embeddedHeaders) {
            this.putQueryParameter("EmbeddedHeaders", embeddedHeaders);
            this.embeddedHeaders = embeddedHeaders;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * <blockquote>
         * <ul>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation or use the console to obtain a list of resource group IDs. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information about a resource group</a>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>To find the current resource group of an instance before changing it, call the <a href="https://help.aliyun.com/document_detail/158866.html">ListResources</a> operation.</li>
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
