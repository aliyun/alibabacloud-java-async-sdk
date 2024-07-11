// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigL7UsKeepaliveRequest} extends {@link RequestModel}
 *
 * <p>ConfigL7UsKeepaliveRequest</p>
 */
public class ConfigL7UsKeepaliveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpstreamKeepalive")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upstreamKeepalive;

    private ConfigL7UsKeepaliveRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.upstreamKeepalive = builder.upstreamKeepalive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigL7UsKeepaliveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return upstreamKeepalive
     */
    public String getUpstreamKeepalive() {
        return this.upstreamKeepalive;
    }

    public static final class Builder extends Request.Builder<ConfigL7UsKeepaliveRequest, Builder> {
        private String domain; 
        private String upstreamKeepalive; 

        private Builder() {
            super();
        } 

        private Builder(ConfigL7UsKeepaliveRequest request) {
            super(request);
            this.domain = request.domain;
            this.upstreamKeepalive = request.upstreamKeepalive;
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

        /**
         * The settings for back-to-origin persistent connections. The value is a string that consists of a JSON struct. The JSON struct contains the following fields:
         * <p>
         * 
         * *   **enabled**: the switch for back-to-origin persistent connections. This field is required, and the value is of the Boolean type.
         * *   **keepalive_requests**: the number of requests that reuse a persistent connection. This field is required, and the value is of the integer type.
         * *   **keepalive_timeout**: the timeout period for an idle persistent connection. This field is required, and the value is of the integer type.
         */
        public Builder upstreamKeepalive(String upstreamKeepalive) {
            this.putQueryParameter("UpstreamKeepalive", upstreamKeepalive);
            this.upstreamKeepalive = upstreamKeepalive;
            return this;
        }

        @Override
        public ConfigL7UsKeepaliveRequest build() {
            return new ConfigL7UsKeepaliveRequest(this);
        } 

    } 

}
