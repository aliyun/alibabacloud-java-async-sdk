// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The domain name of the website.
         * <p>
         * 
         * > A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query the domain names for which forwarding rules are configured.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The back-to-origin policy. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:
         * <p>
         * 
         * *   **ProxyMode**: The load balancing algorithm for back-to-origin traffic. This field is required and must be a string. Valid values:
         * 
         *     *   **ip_hash**: the IP hash algorithm. This algorithm is used to redirect requests from the same IP address to the same origin server.
         *     *   **rr**: the round-robin algorithm. This algorithm is used to redirect requests to origin servers in turn. If you use this algorithm, you can specify a weight for each server based on server performance.
         *     *   **least_time**: the least response time algorithm. This algorithm is used to minimize the latency when requests are forwarded from the instance to origin servers based on the intelligent DNS resolution feature.
         * 
         * *   **Attributes**: the parameters for back-to-origin processing. This field is optional and must be a JSON array. Each element in the array contains the following fields:
         * 
         *     *   **RealServer**: the address of the origin server. This field is optional and must be a string.
         * 
         *     *   **Attribute**: the parameter for back-to-origin processing. This field is optional and must be a JSON object. Valid values:
         * 
         *         *   **Weight**: the weight of the server. This field is optional and must be an integer. This field takes effect only when **ProxyMode** is set to **rr**. Valid values: **1** to **100**. Default value: **100**. An origin server with a higher weight receives more requests.
         *         *   **ConnectTimeout**: the timeout period for new connections. This field is optional and must be an integer. Valid values: **1** to **10**. Unit: seconds. Default value: **5**.
         *         *   **FailTimeout**: the period after which a connection is considered to have failed. This field is optional and must be an integer. Valid values: **1** to **3600**. Unit: seconds. Default value: **10**.
         *         *   **MaxFails**: the maximum number of failures allowed. This field is related to health checks. This field is optional and must be an integer. Valid values: **1** to **10**. Unit: seconds. Default value: **3**.
         *         *   **Mode**: the primary/secondary attribute flag. This parameter is optional and must be a string. Valid values: **active** (primary) and **backup** (secondary).
         *         *   **ReadTimeout**: the read timeout period. This field is optional and must be an integer. Valid values: **10** to **300**. Unit: seconds. Default value: **120**.
         *         *   **SendTimeout**: the write timeout period. This field is optional and must be an integer. Valid values: **10** to **300**. Unit: seconds. Default value: **120**.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.
         * <p>
         * 
         * For more information about resource groups, see [Create a resource group](~~94485~~).
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The retry switch. Valid values:
         * <p>
         * 
         * *   **1**: on
         * *   **0**: off
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
