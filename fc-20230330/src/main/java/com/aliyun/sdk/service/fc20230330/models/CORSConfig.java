// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link CORSConfig} extends {@link TeaModel}
 *
 * <p>CORSConfig</p>
 */
public class CORSConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allowCredentials")
    private Boolean allowCredentials;

    @com.aliyun.core.annotation.NameInMap("allowHeaders")
    private java.util.List<String> allowHeaders;

    @com.aliyun.core.annotation.NameInMap("allowMethods")
    private java.util.List<String> allowMethods;

    @com.aliyun.core.annotation.NameInMap("allowOrigins")
    private java.util.List<String> allowOrigins;

    @com.aliyun.core.annotation.NameInMap("exposeHeaders")
    private java.util.List<String> exposeHeaders;

    @com.aliyun.core.annotation.NameInMap("maxAge")
    private Integer maxAge;

    private CORSConfig(Builder builder) {
        this.allowCredentials = builder.allowCredentials;
        this.allowHeaders = builder.allowHeaders;
        this.allowMethods = builder.allowMethods;
        this.allowOrigins = builder.allowOrigins;
        this.exposeHeaders = builder.exposeHeaders;
        this.maxAge = builder.maxAge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CORSConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowCredentials
     */
    public Boolean getAllowCredentials() {
        return this.allowCredentials;
    }

    /**
     * @return allowHeaders
     */
    public java.util.List<String> getAllowHeaders() {
        return this.allowHeaders;
    }

    /**
     * @return allowMethods
     */
    public java.util.List<String> getAllowMethods() {
        return this.allowMethods;
    }

    /**
     * @return allowOrigins
     */
    public java.util.List<String> getAllowOrigins() {
        return this.allowOrigins;
    }

    /**
     * @return exposeHeaders
     */
    public java.util.List<String> getExposeHeaders() {
        return this.exposeHeaders;
    }

    /**
     * @return maxAge
     */
    public Integer getMaxAge() {
        return this.maxAge;
    }

    public static final class Builder {
        private Boolean allowCredentials; 
        private java.util.List<String> allowHeaders; 
        private java.util.List<String> allowMethods; 
        private java.util.List<String> allowOrigins; 
        private java.util.List<String> exposeHeaders; 
        private Integer maxAge; 

        private Builder() {
        } 

        private Builder(CORSConfig model) {
            this.allowCredentials = model.allowCredentials;
            this.allowHeaders = model.allowHeaders;
            this.allowMethods = model.allowMethods;
            this.allowOrigins = model.allowOrigins;
            this.exposeHeaders = model.exposeHeaders;
            this.maxAge = model.maxAge;
        } 

        /**
         * allowCredentials.
         */
        public Builder allowCredentials(Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        /**
         * allowHeaders.
         */
        public Builder allowHeaders(java.util.List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }

        /**
         * allowMethods.
         */
        public Builder allowMethods(java.util.List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }

        /**
         * allowOrigins.
         */
        public Builder allowOrigins(java.util.List<String> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }

        /**
         * exposeHeaders.
         */
        public Builder exposeHeaders(java.util.List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }

        /**
         * maxAge.
         */
        public Builder maxAge(Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        public CORSConfig build() {
            return new CORSConfig(this);
        } 

    } 

}
