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
 * {@link ModifyWebRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyWebRuleRequest</p>
 */
public class ModifyWebRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpsExt")
    private String httpsExt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealServers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> realServers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer rsType;

    private ModifyWebRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.httpsExt = builder.httpsExt;
        this.instanceIds = builder.instanceIds;
        this.proxyTypes = builder.proxyTypes;
        this.realServers = builder.realServers;
        this.resourceGroupId = builder.resourceGroupId;
        this.rsType = builder.rsType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWebRuleRequest create() {
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
     * @return httpsExt
     */
    public String getHttpsExt() {
        return this.httpsExt;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return proxyTypes
     */
    public String getProxyTypes() {
        return this.proxyTypes;
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

    /**
     * @return rsType
     */
    public Integer getRsType() {
        return this.rsType;
    }

    public static final class Builder extends Request.Builder<ModifyWebRuleRequest, Builder> {
        private String regionId; 
        private String domain; 
        private String httpsExt; 
        private java.util.List<String> instanceIds; 
        private String proxyTypes; 
        private java.util.List<String> realServers; 
        private String resourceGroupId; 
        private Integer rsType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWebRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.httpsExt = request.httpsExt;
            this.instanceIds = request.instanceIds;
            this.proxyTypes = request.proxyTypes;
            this.realServers = request.realServers;
            this.resourceGroupId = request.resourceGroupId;
            this.rsType = request.rsType;
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
         * <p>The domain name of the website business to operate.</p>
         * <blockquote>
         * <p>The domain name must have a website forwarding rule configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names that have website forwarding rules configured.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The HTTPS advanced settings, which take effect only when the website protocol type supports HTTPS (<strong>ProxyType</strong> includes <strong>https</strong>). This parameter is a string converted from a JSON struct that contains the following fields:</p>
         * <ul>
         * <li><p><strong>Http2https</strong>: Integer type | Optional | Specifies whether to enable the HTTPS force redirect feature. Valid values: <strong>0</strong> (disabled) | <strong>1</strong> (enabled). Default value: 0 (disabled).</p>
         * <p>This is applicable when your website supports both HTTP and HTTPS protocols. After this setting is enabled, all HTTP requests will be forcibly converted to HTTPS requests and redirected to port 443 by default.</p>
         * </li>
         * <li><p><strong>Https2http</strong>: Integer type | Optional | Specifies whether to enable the HTTP back-to-origin feature. Valid values: <strong>0</strong> (disabled) | <strong>1</strong> (enabled). Default value: 0 (disabled).</p>
         * <p>This is applicable when your website does not support HTTPS back-to-origin. After this setting is enabled, all HTTPS protocol requests will be forwarded to the origin through HTTP (Websockets protocol requests will be forwarded through Websocket), and the default back-to-origin port is 80.</p>
         * </li>
         * <li><p><strong>Http2</strong>: Integer type | Optional | Specifies whether to enable the HTTP2.0 protocol type. Valid values: <strong>0</strong> (disabled) | <strong>1</strong> (enabled). Default value: 0 (disabled).</p>
         * <p>After this setting is enabled, the protocol version is HTTP2.0.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Http2&quot;:1,&quot;Http2https&quot;:1,&quot;Https2http&quot;:1}</p>
         */
        public Builder httpsExt(String httpsExt) {
            this.putQueryParameter("HttpsExt", httpsExt);
            this.httpsExt = httpsExt;
            return this;
        }

        /**
         * <p>The list of Anti-DDoS Proxy instance IDs to associate. You can associate up to 100 instances.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The protocol information of the website forwarding rule. This parameter is a string converted from a JSON array. Each element in the JSON array is a JSON struct that contains the following fields:</p>
         * <ul>
         * <li><p><strong>ProxyType</strong>: String type | Required | The website protocol type. Valid values: <strong>http</strong> | <strong>https</strong> | <strong>websocket</strong> | <strong>websockets</strong>.</p>
         * </li>
         * <li><p><strong>ProxyPorts</strong>: array type | Required | The port numbers corresponding to the protocol.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ProxyType&quot;:&quot;https&quot;,&quot;ProxyPorts&quot;:[443]}]</p>
         */
        public Builder proxyTypes(String proxyTypes) {
            this.putQueryParameter("ProxyTypes", proxyTypes);
            this.proxyTypes = proxyTypes;
            return this;
        }

        /**
         * <p>The list of origin server addresses.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.xxx.xxx.1</p>
         */
        public Builder realServers(java.util.List<String> realServers) {
            this.putQueryParameter("RealServers", realServers);
            this.realServers = realServers;
            return this;
        }

        /**
         * <p>The resource group ID of the Anti-DDoS Proxy instance in Resource Management. Default value: empty, which indicates that the instance belongs to the default resource group.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The address type of the origin server. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: indicates the IP address of the origin server.</p>
         * </li>
         * <li><p><strong>1</strong>: indicates the domain name of the origin server. This is typically applicable to scenarios where other proxy services (such as WAF) are deployed between the origin server and Anti-DDoS Proxy, specifically referring to the redirect address of the proxy service (such as the WAF CNAME address).</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder rsType(Integer rsType) {
            this.putQueryParameter("RsType", rsType);
            this.rsType = rsType;
            return this;
        }

        @Override
        public ModifyWebRuleRequest build() {
            return new ModifyWebRuleRequest(this);
        } 

    } 

}
