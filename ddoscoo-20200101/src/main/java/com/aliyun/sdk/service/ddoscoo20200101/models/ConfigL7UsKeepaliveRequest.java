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
 * {@link ConfigL7UsKeepaliveRequest} extends {@link RequestModel}
 *
 * <p>ConfigL7UsKeepaliveRequest</p>
 */
public class ConfigL7UsKeepaliveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DownstreamKeepalive")
    private String downstreamKeepalive;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpstreamKeepalive")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upstreamKeepalive;

    private ConfigL7UsKeepaliveRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.downstreamKeepalive = builder.downstreamKeepalive;
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
     * @return downstreamKeepalive
     */
    public String getDownstreamKeepalive() {
        return this.downstreamKeepalive;
    }

    /**
     * @return upstreamKeepalive
     */
    public String getUpstreamKeepalive() {
        return this.upstreamKeepalive;
    }

    public static final class Builder extends Request.Builder<ConfigL7UsKeepaliveRequest, Builder> {
        private String domain; 
        private String downstreamKeepalive; 
        private String upstreamKeepalive; 

        private Builder() {
            super();
        } 

        private Builder(ConfigL7UsKeepaliveRequest request) {
            super(request);
            this.domain = request.domain;
            this.downstreamKeepalive = request.downstreamKeepalive;
            this.upstreamKeepalive = request.upstreamKeepalive;
        } 

        /**
         * <p>The domain name of the website service.</p>
         * <blockquote>
         * <p>The domain name must have a website service forwarding rule configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names.</p>
         * </blockquote>
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
         * <p>The idle timeout period of the persistent connection between the client and Anti-DDoS Proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder downstreamKeepalive(String downstreamKeepalive) {
            this.putQueryParameter("DownstreamKeepalive", downstreamKeepalive);
            this.downstreamKeepalive = downstreamKeepalive;
            return this;
        }

        /**
         * <p>The persistent connection settings for back-to-origin requests of Anti-DDoS Proxy. The value is a string that represents a JSON struct. The JSON struct contains the following fields:</p>
         * <ul>
         * <li><strong>enabled</strong>: Boolean | Required | Specifies whether to enable persistent connections for back-to-origin requests.</li>
         * <li><strong>keepalive_requests</strong>: Integer | Required | The number of requests that can be sent over a persistent connection.</li>
         * <li><strong>keepalive_timeout</strong>: Integer | Required | The idle timeout period of a persistent connection.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enabled&quot;: true, &quot;keepalive_requests&quot;: 1000,&quot;keepalive_timeout&quot;: 30}</p>
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
