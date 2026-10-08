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
 * {@link HTTPTriggerConfig} extends {@link TeaModel}
 *
 * <p>HTTPTriggerConfig</p>
 */
public class HTTPTriggerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authConfig")
    private String authConfig;

    @com.aliyun.core.annotation.NameInMap("authType")
    private String authType;

    @com.aliyun.core.annotation.NameInMap("corsConfig")
    private CORSConfig corsConfig;

    @com.aliyun.core.annotation.NameInMap("disableURLInternet")
    private Boolean disableURLInternet;

    @com.aliyun.core.annotation.NameInMap("methods")
    private java.util.List<String> methods;

    private HTTPTriggerConfig(Builder builder) {
        this.authConfig = builder.authConfig;
        this.authType = builder.authType;
        this.corsConfig = builder.corsConfig;
        this.disableURLInternet = builder.disableURLInternet;
        this.methods = builder.methods;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HTTPTriggerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authConfig
     */
    public String getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return corsConfig
     */
    public CORSConfig getCorsConfig() {
        return this.corsConfig;
    }

    /**
     * @return disableURLInternet
     */
    public Boolean getDisableURLInternet() {
        return this.disableURLInternet;
    }

    /**
     * @return methods
     */
    public java.util.List<String> getMethods() {
        return this.methods;
    }

    public static final class Builder {
        private String authConfig; 
        private String authType; 
        private CORSConfig corsConfig; 
        private Boolean disableURLInternet; 
        private java.util.List<String> methods; 

        private Builder() {
        } 

        private Builder(HTTPTriggerConfig model) {
            this.authConfig = model.authConfig;
            this.authType = model.authType;
            this.corsConfig = model.corsConfig;
            this.disableURLInternet = model.disableURLInternet;
            this.methods = model.methods;
        } 

        /**
         * <p>The authentication configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;JWKS&quot;:{&quot;foo&quot;:&quot;bar&quot;},&quot;TokenLookup&quot;:&quot;header:Authorization:Bearer,cookie:AuthorizationCookie&quot;,&quot;ClaimPassBy&quot;:&quot;query:uid:uid,header:name:name&quot;}</p>
         */
        public Builder authConfig(String authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * <p>The authentication type. Valid values:</p>
         * <ul>
         * <li><p><strong>function</strong>: Authentication is required.</p>
         * </li>
         * <li><p><strong>anonymous</strong>: Authentication is not required.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The default value is <strong>function</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>anonymous</p>
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * <p>The CORS configuration.</p>
         */
        public Builder corsConfig(CORSConfig corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }

        /**
         * <p>Specifies whether to disable access through the default public domain name. If set to true, accessing the default public URL of the function returns a 403 error. If set to false, access is not affected.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableURLInternet(Boolean disableURLInternet) {
            this.disableURLInternet = disableURLInternet;
            return this;
        }

        /**
         * <p>The list of request methods. Multiple methods can be supported simultaneously.</p>
         */
        public Builder methods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }

        public HTTPTriggerConfig build() {
            return new HTTPTriggerConfig(this);
        } 

    } 

}
