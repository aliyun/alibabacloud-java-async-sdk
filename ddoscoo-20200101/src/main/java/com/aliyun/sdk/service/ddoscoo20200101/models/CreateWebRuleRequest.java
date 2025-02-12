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
         * <p>The ID of the associated defense. This parameter applies to scenarios in which other cloud services, such as Object Storage Service (OSS), are integrated with Anti-DDoS Pro or Anti-DDoS Premium.</p>
         * <blockquote>
         * <p>This parameter is in internal preview. Do not use this parameter.</p>
         * </blockquote>
         * <p>For example, if you integrate OSS with Anti-DDoS Pro or Anti-DDoS Premium, Anti-DDoS Pro or Anti-DDoS Premium allocates an IP address pool for the OSS production account. Each IP address corresponds to a unique defense ID. A defense ID is a CNAME, which is automatically resolved to the IP address of the required Anti-DDoS Pro or Anti-DDoS Premium instance. A defense ID can be resolved to the same IP address to facilitate scheduling.</p>
         * <blockquote>
         * <p>You can specify only one of the following parameters: <strong>InstanceIds</strong> and <strong>DefenseId</strong>.</p>
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
         * <p>The domain name of the website that you want to add to the instance.</p>
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
         * <p>The advanced HTTPS settings. This parameter takes effect only when the value of the <strong>ProxyType</strong> parameter includes <strong>https</strong>. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><p><strong>Http2https</strong>: specifies whether to turn on Enforce HTTPS Routing. This field is optional and must be an integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that Enforce HTTPS Routing is turned off. The value 1 indicates that Enforce HTTPS Routing is turned on. The default value is 0.</p>
         * <p>If your website supports both HTTP and HTTPS, this feature meets your business requirements. If you enable this feature, all HTTP requests to access the website are redirected to HTTPS requests on the standard port 443.</p>
         * </li>
         * <li><p><strong>Https2http</strong>: specifies whether to turn on Enable HTTP. This field is optional and must be an integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that Enable HTTP is turned off. The value 1 indicates that Enable HTTP is turned on. The default value is 0.</p>
         * <p>If your website does not support HTTPS, this feature meets your business requirements If this feature is enabled, all HTTPS requests are redirected to HTTP requests and forwarded to origin servers. This feature can redirect WebSockets requests to WebSocket requests. Requests are redirected over the standard port 80.</p>
         * </li>
         * <li><p><strong>Http2</strong>: specifies whether to turn on Enable HTTP/2. This field is optional and must be an integer. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that Enable HTTP/2 is turned off. The value 1 indicates that Enable HTTP/2 is turned on. The default value is 0.</p>
         * <p>After you turn on Enable HTTP/2, the protocol type is HTTP/2.</p>
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
         * <p>An array consisting of the IDs of instances that you want to associate.</p>
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

        /**
         * <p>The address type of the origin server. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: IP address</li>
         * <li><strong>1</strong>: domain name The domain name of the origin server is returned if you deploy proxies, such as Web Application Firewall (WAF), between the origin server and the instance. In this case, the address of the proxy, such as the CNAME provided by WAF, is returned.</li>
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
         * <p>The details of the forwarding rule. The value is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that contains the following fields:</p>
         * <ul>
         * <li><p><strong>ProxyRules</strong>: the information about the origin server. The information includes the port number and IP address. This field is required and must be a JSON array. Each element in a JSON array is a JSON struct that contains the following fields:</p>
         * <ul>
         * <li><strong>ProxyPort</strong>: the port number. This field is required and must be an integer.</li>
         * <li><strong>RealServers</strong>: the IP address. This field is required and must be a string array.</li>
         * </ul>
         * </li>
         * <li><p><strong>ProxyType</strong>: the protocol type. This field is required and must be a string. Valid values: <strong>http</strong>, <strong>https</strong>, <strong>websocket</strong>, and <strong>websockets</strong>.</p>
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
