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
 * {@link HttpApiVersionInfo} extends {@link TeaModel}
 *
 * <p>HttpApiVersionInfo</p>
 */
public class HttpApiVersionInfo extends TeaModel {
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

    private HttpApiVersionInfo(Builder builder) {
        this.enable = builder.enable;
        this.headerName = builder.headerName;
        this.queryName = builder.queryName;
        this.scheme = builder.scheme;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiVersionInfo create() {
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

        private Builder(HttpApiVersionInfo model) {
            this.enable = model.enable;
            this.headerName = model.headerName;
            this.queryName = model.queryName;
            this.scheme = model.scheme;
            this.version = model.version;
        } 

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * headerName.
         */
        public Builder headerName(String headerName) {
            this.headerName = headerName;
            return this;
        }

        /**
         * queryName.
         */
        public Builder queryName(String queryName) {
            this.queryName = queryName;
            return this;
        }

        /**
         * scheme.
         */
        public Builder scheme(String scheme) {
            this.scheme = scheme;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public HttpApiVersionInfo build() {
            return new HttpApiVersionInfo(this);
        } 

    } 

}
