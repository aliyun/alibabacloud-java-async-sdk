// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
         * <p>The domain name of the website.</p>
         * <blockquote>
         * <p>A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query the domain names for which forwarding rules are configured.</p>
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
         * <p>The back-to-origin policy. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><p><strong>ProxyMode</strong>: The load balancing algorithm for back-to-origin traffic. This field is required and must be a string. Valid values:</p>
         * <ul>
         * <li><strong>ip_hash</strong>: the IP hash algorithm. This algorithm is used to redirect requests from the same IP address to the same origin server.</li>
         * <li><strong>rr</strong>: the round-robin algorithm. This algorithm is used to redirect requests to origin servers in turn. If you use this algorithm, you can specify a weight for each server based on server performance.</li>
         * <li><strong>least_time</strong>: the least response time algorithm. This algorithm is used to minimize the latency when requests are forwarded from the instance to origin servers based on the intelligent DNS resolution feature.</li>
         * </ul>
         * </li>
         * <li><p><strong>Attributes</strong>: the parameters for back-to-origin processing. This field is optional and must be a JSON array. Each element in the array contains the following fields:</p>
         * <ul>
         * <li><p><strong>RealServer</strong>: the address of the origin server. This field is optional and must be a string.</p>
         * </li>
         * <li><p><strong>Attribute</strong>: the parameter for back-to-origin processing. This field is optional and must be a JSON object. Valid values:</p>
         * <ul>
         * <li><strong>Weight</strong>: the weight of the server. This field is optional and must be an integer. This field takes effect only when <strong>ProxyMode</strong> is set to <strong>rr</strong>. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>100</strong>. An origin server with a higher weight receives more requests.</li>
         * <li><strong>ConnectTimeout</strong>: the timeout period for new connections. This field is optional and must be an integer. Valid values: <strong>1</strong> to <strong>10</strong>. Unit: seconds. Default value: <strong>5</strong>.</li>
         * <li><strong>FailTimeout</strong>: the period after which a connection is considered to have failed. This field is optional and must be an integer. Valid values: <strong>1</strong> to <strong>3600</strong>. Unit: seconds. Default value: <strong>10</strong>.</li>
         * <li><strong>MaxFails</strong>: the maximum number of failures allowed. This field is related to health checks. This field is optional and must be an integer. Valid values: <strong>1</strong> to <strong>10</strong>. Unit: seconds. Default value: <strong>3</strong>.</li>
         * <li><strong>Mode</strong>: the primary/secondary attribute flag. This parameter is optional and must be a string. Valid values: <strong>active</strong> (primary) and <strong>backup</strong> (secondary).</li>
         * <li><strong>ReadTimeout</strong>: the read timeout period. This field is optional and must be an integer. Valid values: <strong>10</strong> to <strong>300</strong>. Unit: seconds. Default value: <strong>120</strong>.</li>
         * <li><strong>SendTimeout</strong>: the write timeout period. This field is optional and must be an integer. Valid values: <strong>10</strong> to <strong>300</strong>. Unit: seconds. Default value: <strong>120</strong>.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProxyMode&quot;:&quot;rr&quot;,&quot;Attributes&quot;:[{&quot;RealServer&quot;:&quot;1.<em><strong>.</strong></em>.1&quot;,&quot;Attribute&quot;:{&quot;Weight&quot;:100}},{&quot;RealServer&quot;:&quot;2.<em><strong>.</strong></em>.2&quot;,&quot;Attribute&quot;:{&quot;Weight&quot;:100}}]}</p>
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
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
         * <p>The retry switch. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: on</li>
         * <li><strong>0</strong>: off</li>
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
