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
 * {@link HTTPTriggerConfig} extends {@link TeaModel}
 *
 * <p>HTTPTriggerConfig</p>
 */
public class HTTPTriggerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aclConfig")
    private AclConfig aclConfig;

    @com.aliyun.core.annotation.NameInMap("authConfig")
    private Object authConfig;

    @com.aliyun.core.annotation.NameInMap("authType")
    private String authType;

    @com.aliyun.core.annotation.NameInMap("disableURLInternet")
    private Boolean disableURLInternet;

    @com.aliyun.core.annotation.NameInMap("safeMode")
    private Boolean safeMode;

    private HTTPTriggerConfig(Builder builder) {
        this.aclConfig = builder.aclConfig;
        this.authConfig = builder.authConfig;
        this.authType = builder.authType;
        this.disableURLInternet = builder.disableURLInternet;
        this.safeMode = builder.safeMode;
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
     * @return aclConfig
     */
    public AclConfig getAclConfig() {
        return this.aclConfig;
    }

    /**
     * @return authConfig
     */
    public Object getAuthConfig() {
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
     * @return safeMode
     */
    public Boolean getSafeMode() {
        return this.safeMode;
    }

    public static final class Builder {
        private AclConfig aclConfig; 
        private Object authConfig; 
        private String authType; 
        private Boolean disableURLInternet; 
        private Boolean safeMode; 

        private Builder() {
        } 

        private Builder(HTTPTriggerConfig model) {
            this.aclConfig = model.aclConfig;
            this.authConfig = model.authConfig;
            this.authType = model.authType;
            this.disableURLInternet = model.disableURLInternet;
            this.safeMode = model.safeMode;
        } 

        /**
         * aclConfig.
         */
        public Builder aclConfig(AclConfig aclConfig) {
            this.aclConfig = aclConfig;
            return this;
        }

        /**
         * authConfig.
         */
        public Builder authConfig(Object authConfig) {
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
         * safeMode.
         */
        public Builder safeMode(Boolean safeMode) {
            this.safeMode = safeMode;
            return this;
        }

        public HTTPTriggerConfig build() {
            return new HTTPTriggerConfig(this);
        } 

    } 

}
