// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link HttpApiVersionConfig} extends {@link TeaModel}
 *
 * <p>HttpApiVersionConfig</p>
 */
public class HttpApiVersionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("headerName")
    private String headerName;

    @com.aliyun.core.annotation.NameInMap("queryName")
    private String queryName;

    @com.aliyun.core.annotation.NameInMap("scheme")
    private String scheme;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private HttpApiVersionConfig(Builder builder) {
        this.enable = builder.enable;
        this.headerName = builder.headerName;
        this.queryName = builder.queryName;
        this.scheme = builder.scheme;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiVersionConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return headerName
     */
    public String getHeaderName() {
        return this.headerName;
    }

    /**
     * @return queryName
     */
    public String getQueryName() {
        return this.queryName;
    }

    /**
     * @return scheme
     */
    public String getScheme() {
        return this.scheme;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private Boolean enable; 
        private String headerName; 
        private String queryName; 
        private String scheme; 
        private String version; 

        private Builder() {
        } 

        private Builder(HttpApiVersionConfig model) {
            this.enable = model.enable;
            this.headerName = model.headerName;
            this.queryName = model.queryName;
            this.scheme = model.scheme;
            this.version = model.version;
        } 

        /**
         * <p>Indicates whether versioning control is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The key in the specified header parameter when the header-based versioning scheme is used.</p>
         * 
         * <strong>example:</strong>
         * <p>my-version</p>
         */
        public Builder headerName(String headerName) {
            this.headerName = headerName;
            return this;
        }

        /**
         * <p>The key in the specified query parameter when the query parameter-based versioning scheme is used.</p>
         * 
         * <strong>example:</strong>
         * <p>myVersion</p>
         */
        public Builder queryName(String queryName) {
            this.queryName = queryName;
            return this;
        }

        /**
         * <p>The versioning scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>Query</p>
         */
        public Builder scheme(String scheme) {
            this.scheme = scheme;
            return this;
        }

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public HttpApiVersionConfig build() {
            return new HttpApiVersionConfig(this);
        } 

    } 

}
