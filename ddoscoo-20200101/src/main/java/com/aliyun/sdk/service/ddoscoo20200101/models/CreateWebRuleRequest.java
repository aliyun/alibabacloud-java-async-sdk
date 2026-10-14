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
 * {@link CreateWebRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateWebRuleRequest</p>
 */
public class CreateWebRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseId")
    private String defenseId;

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
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer rsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rules;

    private CreateWebRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.defenseId = builder.defenseId;
        this.domain = builder.domain;
        this.httpsExt = builder.httpsExt;
        this.instanceIds = builder.instanceIds;
        this.resourceGroupId = builder.resourceGroupId;
        this.rsType = builder.rsType;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebRuleRequest create() {
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
     * @return defenseId
     */
    public String getDefenseId() {
        return this.defenseId;
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

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<CreateWebRuleRequest, Builder> {
        private String regionId; 
        private String defenseId; 
        private String domain; 
        private String httpsExt; 
        private java.util.List<String> instanceIds; 
        private String resourceGroupId; 
        private Integer rsType; 
        private String rules; 

        private Builder() {
            super();
        } 

        private Builder(CreateWebRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.defenseId = request.defenseId;
            this.domain = request.domain;
            this.httpsExt = request.httpsExt;
            this.instanceIds = request.instanceIds;
            this.resourceGroupId = request.resourceGroupId;
            this.rsType = request.rsType;
            this.rules = request.rules;
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
         * <p>The ID of the protection rule to associate. This parameter is used when an Alibaba Cloud service, such as Object Storage Service (OSS), is integrated with an Anti-DDoS instance.</p>
         * <blockquote>
         * <p>This parameter is for internal use. Do not use this parameter.</p>
         * </blockquote>
         * <p>For example, if your OSS is integrated with an Anti-DDoS Proxy instance, the instance allocates a resource pool of IP addresses to the OSS tenant account. Each IP address has a unique protection ID. The protection ID is a CNAME that resolves to the IP address of the Anti-DDoS instance by default. You can resolve the CNAME to an IP address. This lets you reuse the IP address for flexible scheduling.</p>
         * <blockquote>
         * <p>You cannot specify both <strong>InstanceIds</strong> and <strong>DefenseId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testid</p>
         */
        public Builder defenseId(String defenseId) {
            this.putQueryParameter("DefenseId", defenseId);
            this.defenseId = defenseId;
            return this;
        }

        /**
         * <p>The domain name of the website to add to the Anti-DDoS Proxy instance for protection.</p>
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
         * <p>The advanced HTTPS settings. This parameter takes effect only when the value of <strong>ProxyType</strong> includes <strong>https</strong>. This parameter is a JSON string. The value is a JSON object that contains the following fields:</p>
         * <ul>
         * <li><p><strong>Http2https</strong>: This field is an integer. Optional. Specifies whether to forcibly redirect HTTP requests to HTTPS requests. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled). The default value is 0.</p>
         * <p>This setting is available when your website supports both HTTP and HTTPS. If you enable this setting, all HTTP requests are redirected to HTTPS requests over port 443.</p>
         * </li>
         * <li><p><strong>Https2http</strong>: This field is an integer. Optional. Specifies whether to enable HTTP back-to-origin. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled). The default value is 0.</p>
         * <p>This setting applies to websites that do not support HTTPS back-to-origin. If you enable this setting, all HTTPS requests are sent to the origin server over HTTP on port 80 by default. All WebSockets requests are sent to the origin server over WebSocket.</p>
         * </li>
         * <li><p><strong>Http2</strong>: This field is an integer. Optional. Specifies whether to enable HTTP/2. Valid values: <strong>0</strong> (disabled) and <strong>1</strong> (enabled). The default value is 0.</p>
         * <p>If you enable this setting, HTTP/2 is used.</p>
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
         * <p>The IDs of the Anti-DDoS Proxy instances to associate.</p>
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
         * <p>The ID of the resource group to which the Anti-DDoS Proxy instance belongs in Resource Management. If you leave this parameter empty, the instance belongs to the default resource group.</p>
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

        /**
         * <p>The address type of the origin server. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: IP address.</p>
         * </li>
         * <li><p><strong>1</strong>: domain name. This value is typically used when a proxy service, such as Web Application Firewall (WAF), is deployed between the origin server and the Anti-DDoS Proxy instance. The domain name is the back-to-origin address of the proxy service, such as the canonical name (CNAME) of WAF.</p>
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

        /**
         * <p>The details of the forwarding rule, in a JSON string format. The value is an array of objects. Each object contains the following fields:</p>
         * <ul>
         * <li><p><strong>ProxyRules</strong>: This field is a JSON array. Required. The information about the origin server, including the port number and server address. Each object in the array contains the following fields:</p>
         * <ul>
         * <li><p><strong>ProxyPort</strong>: This field is an integer. Required. The port number that is used by the protocol.</p>
         * </li>
         * <li><p><strong>RealServers</strong>: This field is a string array. Required. The addresses of the origin servers.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>ProxyType</strong>: This field is a string. Required. The protocol of the website. Valid values: <strong>http</strong>, <strong>https</strong>, <strong>websocket</strong>, and <strong>websockets</strong>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ProxyRules&quot;:[{&quot;ProxyPort&quot;:443,&quot;RealServers&quot;:[&quot;192.1.XX.XX&quot;]}],&quot;ProxyType&quot;:&quot;https&quot;}]</p>
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        @Override
        public CreateWebRuleRequest build() {
            return new CreateWebRuleRequest(this);
        } 

    } 

}
