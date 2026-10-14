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
 * {@link ConfigL7RsPolicyRequest} extends {@link RequestModel}
 *
 * <p>ConfigL7RsPolicyRequest</p>
 */
public class ConfigL7RsPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpstreamRetry")
    private Integer upstreamRetry;

    private ConfigL7RsPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.policy = builder.policy;
        this.resourceGroupId = builder.resourceGroupId;
        this.upstreamRetry = builder.upstreamRetry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigL7RsPolicyRequest create() {
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
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return upstreamRetry
     */
    public Integer getUpstreamRetry() {
        return this.upstreamRetry;
    }

    public static final class Builder extends Request.Builder<ConfigL7RsPolicyRequest, Builder> {
        private String regionId; 
        private String domain; 
        private String policy; 
        private String resourceGroupId; 
        private Integer upstreamRetry; 

        private Builder() {
            super();
        } 

        private Builder(ConfigL7RsPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.policy = request.policy;
            this.resourceGroupId = request.resourceGroupId;
            this.upstreamRetry = request.upstreamRetry;
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
         * <p>The domain name of the website whose forwarding rules you want to manage.</p>
         * <blockquote>
         * <p>The domain name must have website forwarding rules configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names that have website forwarding rules configured.</p>
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
         * <p>The back-to-origin policy. The value is a character string that represents a JSON structure. The JSON structure contains the following fields:</p>
         * <ul>
         * <li><strong>ProxyMode</strong>: String | Required | The load balancing algorithm for back-to-origin. Valid values:<ul>
         * <li><strong>ip_hash</strong>: IP Hash algorithm. Requests from the same source IP address are directed to the same origin server based on hash mapping.</li>
         * <li><strong>rr</strong>: Polling algorithm. All requests are allocated to different origin servers in turn. When you use this algorithm, you can set weights for servers based on their performance.</li>
         * <li><strong>least_time</strong>: Least Time algorithm. This algorithm uses intelligent DNS resolution to ensure the lowest latency for service traffic across the entire path from the protection node to forward back to the origin server.</li>
         * </ul>
         * </li>
         * <li><strong>Attributes</strong>: JSONArray | Optional | The back-to-origin parameter information. Each element in the array contains the following fields:<ul>
         * <li><strong>RealServer</strong>: String | Optional | The address of the origin server.</li>
         * <li><strong>Attribute</strong>: JSONObject | Optional | The back-to-origin parameters. This field contains the following fields:<ul>
         * <li><strong>Weight</strong>: Integer | Optional | The weight of the server. This property takes effect only when the polling algorithm is used (<strong>ProxyMode</strong> is set to <strong>rr</strong>). Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>100</strong>. A server with a higher weight receives more requests.</li>
         * <li><strong>ConnectTimeout</strong>: Integer | Optional | The timeout period for new connections. Valid values: <strong>1</strong> to <strong>10</strong>. Unit: seconds. Default value: <strong>5</strong>.</li>
         * <li><strong>FailTimeout</strong>: Integer | Optional | The failed timeout period. Valid values: <strong>1</strong> to <strong>3600</strong>. Unit: seconds. Default value: <strong>10</strong>.</li>
         * <li><strong>MaxFails</strong>: Integer | Optional | The maximum number of failures for health checks. Valid values: <strong>1</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</li>
         * <li><strong>Mode</strong>: String | Optional | The primary/secondary property flag. Valid values: <strong>active</strong> indicates primary. <strong>backup</strong> indicates secondary.</li>
         * <li><strong>ReadTimeout</strong>: Integer | Optional | The read timeout period. Valid values: <strong>10</strong> to <strong>300</strong>. Unit: seconds. Default value: <strong>120</strong>.</li>
         * <li><strong>SendTimeout</strong>: Integer | Optional | The write timeout period. Valid values: <strong>10</strong> to <strong>300</strong>. Unit: seconds. Default value: <strong>120</strong>.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProxyMode&quot;:&quot;rr&quot;,&quot;Attributes&quot;:[{&quot;RealServer&quot;:&quot;1.<em><strong>.</strong></em>.1&quot;,&quot;Attribute&quot;:{&quot;Weight&quot;:100,&quot;ConnectTimeout&quot;:5,&quot;FailTimeout&quot;:10,&quot;MaxFails&quot;:3,&quot;Mode&quot;:&quot;active&quot;,&quot;ReadTimeout&quot;:120,&quot;SendTimeout&quot;:120}},{&quot;RealServer&quot;:&quot;2.<em><strong>.</strong></em>.2&quot;,&quot;Attribute&quot;:{&quot;Weight&quot;:100,&quot;ConnectTimeout&quot;:5,&quot;FailTimeout&quot;:10,&quot;MaxFails&quot;:3,&quot;Mode&quot;:&quot;active&quot;,&quot;ReadTimeout&quot;:120,&quot;SendTimeout&quot;:120}}]}</p>
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the Anti-DDoS Pro or Anti-DDoS Premium instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
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
         * <p>Specifies whether to enable back-to-origin retry. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Enabled.</li>
         * <li><strong>0</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder upstreamRetry(Integer upstreamRetry) {
            this.putQueryParameter("UpstreamRetry", upstreamRetry);
            this.upstreamRetry = upstreamRetry;
            return this;
        }

        @Override
        public ConfigL7RsPolicyRequest build() {
            return new ConfigL7RsPolicyRequest(this);
        } 

    } 

}
