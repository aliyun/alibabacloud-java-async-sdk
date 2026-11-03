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
         * <p>The hostname to which you want to connect. The default value is the IP address of the pod. You may need to specify Host in HttpHeaders.</p>
         * 
         * <strong>example:</strong>
         * <p>172.22.XX.XX</p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>The custom headers that you need to specify in the request. Duplicate headers are allowed in an HTTP request.</p>
         */
        public Builder httpHeaders(java.util.List<HTTPHeader> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }

        /**
         * <p>The path of a URL.</p>
         * 
         * <strong>example:</strong>
         * <p>/path1</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>The port range. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * <p>The scheme that you want to use to connect to the host. Default value: http.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
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
