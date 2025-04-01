// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link HTTPGetAction} extends {@link TeaModel}
 *
 * <p>HTTPGetAction</p>
 */
public class HTTPGetAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("HttpHeaders")
    private java.util.List<HTTPHeader> httpHeaders;

    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("Port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("Scheme")
    private String scheme;

    private HTTPGetAction(Builder builder) {
        this.host = builder.host;
        this.httpHeaders = builder.httpHeaders;
        this.path = builder.path;
        this.port = builder.port;
        this.scheme = builder.scheme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HTTPGetAction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return httpHeaders
     */
    public java.util.List<HTTPHeader> getHttpHeaders() {
        return this.httpHeaders;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return scheme
     */
    public String getScheme() {
        return this.scheme;
    }

    public static final class Builder {
        private String host; 
        private java.util.List<HTTPHeader> httpHeaders; 
        private String path; 
        private Integer port; 
        private String scheme; 

        private Builder() {
        } 

        private Builder(HTTPGetAction model) {
            this.host = model.host;
            this.httpHeaders = model.httpHeaders;
            this.path = model.path;
            this.port = model.port;
            this.scheme = model.scheme;
        } 

        /**
         * Host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * HttpHeaders.
         */
        public Builder httpHeaders(java.util.List<HTTPHeader> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * Scheme.
         */
        public Builder scheme(String scheme) {
            this.scheme = scheme;
            return this;
        }

        public HTTPGetAction build() {
            return new HTTPGetAction(this);
        } 

    } 

}
