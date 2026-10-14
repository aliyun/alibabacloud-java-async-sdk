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
 * {@link ModifyTlsConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyTlsConfigRequest</p>
 */
public class ModifyTlsConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ModifyTlsConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.domain = builder.domain;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTlsConfigRequest create() {
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
     * @return config
     */
    public String getConfig() {
        return this.config;
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

    public static final class Builder extends Request.Builder<ModifyTlsConfigRequest, Builder> {
        private String regionId; 
        private String config; 
        private String domain; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTlsConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.config = request.config;
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
         * <p>The details of the TLS security policy, expressed as a JSON-formatted string with the following structure.</p>
         * <ul>
         * <li><strong>ssl_protocols</strong>: String type, required. The TLS version. Valid values:<ul>
         * <li><strong>tls1.0</strong>: TLS 1.0 and later are supported.</li>
         * <li><strong>tls1.1</strong>: TLS 1.1 and later are supported.</li>
         * <li><strong>tls1.2</strong>: TLS 1.2 and later are supported.</li>
         * </ul>
         * </li>
         * <li><strong>ssl_ciphers</strong>: String type, required. The cipher suite type. Valid values:<ul>
         * <li><strong>all</strong>: all cipher suites, including strong and weak cipher suites</li>
         * <li><strong>improved</strong>: enhanced cipher suites</li>
         * <li><strong>strong</strong>: strong cipher suites only</li>
         * <li><strong>default</strong>: default cipher suites, which include only strong cipher suites</li>
         * </ul>
         * </li>
         * <li><strong>ssl_13_enabled</strong>: Boolean type, optional. Specifies whether to enable TLS 1.3. Valid values:<ul>
         * <li><strong>true</strong>: Enables TLS 1.3.</li>
         * <li><strong>false</strong>: Disables TLS 1.3.</li>
         * </ul>
         * </li>
         * <li><strong>custom_ciphers</strong>: Array type, optional. The list of custom cipher suites for TLS versions earlier than 1.3.</li>
         * <li><strong>tls_13_custom_ciphers</strong>: Array type, optional. The list of custom cipher suites for TLS 1.3. If TLS 1.3 is enabled, select at least one cipher suite for TLS versions earlier than 1.3.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;ssl_protocols&quot;: &quot;tls1.2&quot;,
         *   &quot;ssl_ciphers&quot;: &quot;default&quot;,
         *   &quot;ssl_13_enabled&quot;: true,
         *   &quot;custom_ciphers&quot;: [
         *     &quot;ECDHE-ECDSA-AES128-GCM-SHA256&quot;
         *   ],
         *   &quot;tls_13_custom_ciphers&quot;: [
         *     &quot;TLS_AES_256_GCM_SHA384&quot;
         *   ]
         * }</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The domain name of the website.</p>
         * <blockquote>
         * <p>The domain name must have a website forwarding rule configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names.</p>
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
         * <p>The ID of the resource group to which the Anti-DDoS Pro or Anti-DDoS Premium instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ModifyTlsConfigRequest build() {
            return new ModifyTlsConfigRequest(this);
        } 

    } 

}
