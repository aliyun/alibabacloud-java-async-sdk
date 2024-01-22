// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TomcatConfig} extends {@link TeaModel}
 *
 * <p>TomcatConfig</p>
 */
public class TomcatConfig extends TeaModel {
    @NameInMap("ContextPath")
    private String contextPath;

    @NameInMap("MaxThreads")
    private Integer maxThreads;

    @NameInMap("Port")
    private Integer port;

    @NameInMap("UriEncoding")
    private String uriEncoding;

    @NameInMap("UseBodyEncodingForUri")
    private Boolean useBodyEncodingForUri;

    @NameInMap("Version")
    private String version;

    private TomcatConfig(Builder builder) {
        this.contextPath = builder.contextPath;
        this.maxThreads = builder.maxThreads;
        this.port = builder.port;
        this.uriEncoding = builder.uriEncoding;
        this.useBodyEncodingForUri = builder.useBodyEncodingForUri;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TomcatConfig create() {
        return builder().build();
    }

    /**
     * @return contextPath
     */
    public String getContextPath() {
        return this.contextPath;
    }

    /**
     * @return maxThreads
     */
    public Integer getMaxThreads() {
        return this.maxThreads;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return uriEncoding
     */
    public String getUriEncoding() {
        return this.uriEncoding;
    }

    /**
     * @return useBodyEncodingForUri
     */
    public Boolean getUseBodyEncodingForUri() {
        return this.useBodyEncodingForUri;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String contextPath; 
        private Integer maxThreads; 
        private Integer port; 
        private String uriEncoding; 
        private Boolean useBodyEncodingForUri; 
        private String version; 

        /**
         * ContextPath.
         */
        public Builder contextPath(String contextPath) {
            this.contextPath = contextPath;
            return this;
        }

        /**
         * MaxThreads.
         */
        public Builder maxThreads(Integer maxThreads) {
            this.maxThreads = maxThreads;
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
         * UriEncoding.
         */
        public Builder uriEncoding(String uriEncoding) {
            this.uriEncoding = uriEncoding;
            return this;
        }

        /**
         * UseBodyEncodingForUri.
         */
        public Builder useBodyEncodingForUri(Boolean useBodyEncodingForUri) {
            this.useBodyEncodingForUri = useBodyEncodingForUri;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public TomcatConfig build() {
            return new TomcatConfig(this);
        } 

    } 

}
