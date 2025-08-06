// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link HttpRequestVodTestToolRequest} extends {@link RequestModel}
 *
 * <p>HttpRequestVodTestToolRequest</p>
 */
public class HttpRequestVodTestToolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Args")
    private String args;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Header")
    private java.util.Map<String, ?> header;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Method")
    @com.aliyun.core.annotation.Validation(required = true)
    private String method;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheme")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheme;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    private HttpRequestVodTestToolRequest(Builder builder) {
        super(builder);
        this.args = builder.args;
        this.body = builder.body;
        this.header = builder.header;
        this.host = builder.host;
        this.method = builder.method;
        this.ownerId = builder.ownerId;
        this.proxyIp = builder.proxyIp;
        this.scheme = builder.scheme;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpRequestVodTestToolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public String getArgs() {
        return this.args;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return header
     */
    public java.util.Map<String, ?> getHeader() {
        return this.header;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return proxyIp
     */
    public String getProxyIp() {
        return this.proxyIp;
    }

    /**
     * @return scheme
     */
    public String getScheme() {
        return this.scheme;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder extends Request.Builder<HttpRequestVodTestToolRequest, Builder> {
        private String args; 
        private String body; 
        private java.util.Map<String, ?> header; 
        private String host; 
        private String method; 
        private Long ownerId; 
        private String proxyIp; 
        private String scheme; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(HttpRequestVodTestToolRequest request) {
            super(request);
            this.args = request.args;
            this.body = request.body;
            this.header = request.header;
            this.host = request.host;
            this.method = request.method;
            this.ownerId = request.ownerId;
            this.proxyIp = request.proxyIp;
            this.scheme = request.scheme;
            this.uri = request.uri;
        } 

        /**
         * Args.
         */
        public Builder args(String args) {
            this.putQueryParameter("Args", args);
            this.args = args;
            return this;
        }

        /**
         * Body.
         */
        public Builder body(String body) {
            this.putQueryParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * Header.
         */
        public Builder header(java.util.Map<String, ?> header) {
            String headerShrink = shrink(header, "Header", "json");
            this.putQueryParameter("Header", headerShrink);
            this.header = header;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder method(String method) {
            this.putQueryParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder proxyIp(String proxyIp) {
            this.putQueryParameter("ProxyIp", proxyIp);
            this.proxyIp = proxyIp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder scheme(String scheme) {
            this.putQueryParameter("Scheme", scheme);
            this.scheme = scheme;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.putQueryParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        @Override
        public HttpRequestVodTestToolRequest build() {
            return new HttpRequestVodTestToolRequest(this);
        } 

    } 

}
