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
         * <p>Not in use.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder cluster(String cluster) {
            this.putQueryParameter("Cluster", cluster);
            this.cluster = cluster;
            return this;
        }

        /**
         * <p>The Anti-DDoS Global Mitigation Policy for Protection for Website Services. The structure is as follows:</p>
         * <ul>
         * <li><strong>global_rule_mode</strong>: String type. Optional. The protection level of the DDoS global mitigation feature. Valid values:<ul>
         * <li><strong>weak</strong>: Loose.</li>
         * <li><strong>default</strong>: Normal.</li>
         * <li><strong>hard</strong>: Strict.</li>
         * </ul>
         * </li>
         * <li><strong>global_rule_enable</strong>: Integer type. Optional. The switch of the DDoS global mitigation feature. Valid values:<ul>
         * <li><strong>0</strong>: Shutdown.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>The Blacklist/Whitelist feature of the custom mitigation policies for Protection for Website Services. The structure is as follows:</p>
         * <ul>
         * <li><strong>bwlist_enable</strong>: Integer type. Optional. The switch of the custom mitigation policy blacklist/whitelist. Valid values:<ul>
         * <li><strong>0</strong>: Shutdown.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;global_rule_mode&quot;:&quot;hard&quot;}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The domain name of the website service.</p>
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

        @Override
        public ConfigDomainSecurityProfileRequest build() {
            return new ConfigDomainSecurityProfileRequest(this);
        } 

    } 

}
