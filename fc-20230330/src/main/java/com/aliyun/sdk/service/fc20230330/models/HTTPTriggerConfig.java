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

    @com.aliyun.core.annotation.NameInMap("disableURLInternet")
    private Boolean disableURLInternet;

    @com.aliyun.core.annotation.NameInMap("methods")
    private java.util.List<String> methods;

    private HTTPTriggerConfig(Builder builder) {
        this.authConfig = builder.authConfig;
        this.authType = builder.authType;
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
        private Boolean disableURLInternet; 
        private java.util.List<String> methods; 

        private Builder() {
        } 

        private Builder(HTTPTriggerConfig model) {
            this.authConfig = model.authConfig;
            this.authType = model.authType;
            this.disableURLInternet = model.disableURLInternet;
            this.methods = model.methods;
        } 

        /**
         * authConfig.
         */
        public Builder authConfig(String authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * authType.
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * disableURLInternet.
         */
        public Builder disableURLInternet(Boolean disableURLInternet) {
            this.disableURLInternet = disableURLInternet;
            return this;
        }

        /**
         * methods.
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
