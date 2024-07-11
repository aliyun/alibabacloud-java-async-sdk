// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigDomainSecurityProfileRequest} extends {@link RequestModel}
 *
 * <p>ConfigDomainSecurityProfileRequest</p>
 */
public class ConfigDomainSecurityProfileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cluster")
    private String cluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    private ConfigDomainSecurityProfileRequest(Builder builder) {
        super(builder);
        this.cluster = builder.cluster;
        this.config = builder.config;
        this.domain = builder.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigDomainSecurityProfileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cluster
     */
    public String getCluster() {
        return this.cluster;
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

    public static final class Builder extends Request.Builder<ConfigDomainSecurityProfileRequest, Builder> {
        private String cluster; 
        private String config; 
        private String domain; 

        private Builder() {
            super();
        } 

        private Builder(ConfigDomainSecurityProfileRequest request) {
            super(request);
            this.cluster = request.cluster;
            this.config = request.config;
            this.domain = request.domain;
        } 

        /**
         * This parameter is unavailable.
         */
        public Builder cluster(String cluster) {
            this.putQueryParameter("Cluster", cluster);
            this.cluster = cluster;
            return this;
        }

        /**
         * The configurations for the global mitigation policy feature. The configurations include the following fields:
         * <p>
         * 
         * *   **global_rule_mode**: optional. The mode for the global mitigation policy feature. Data type: string. Valid values:
         * 
         *     *   **weak**: loose.
         *     *   **default**: normal.
         *     *   **hard**: strict.
         * 
         * *   **global_rule_enable**: optional. Specifies whether to enable the global mitigation policy feature. Data type: string. Valid values:
         * 
         *     *   **0**: disabled.
         *     *   **1**: enabled.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The domain name of the website.
         * <p>
         * 
         * >  A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](~~91724~~) operation to query all domain names.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        @Override
        public ConfigDomainSecurityProfileRequest build() {
            return new ConfigDomainSecurityProfileRequest(this);
        } 

    } 

}
