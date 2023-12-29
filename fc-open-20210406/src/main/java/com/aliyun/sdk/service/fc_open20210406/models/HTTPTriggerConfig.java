// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HTTPTriggerConfig} extends {@link TeaModel}
 *
 * <p>HTTPTriggerConfig</p>
 */
public class HTTPTriggerConfig extends TeaModel {
    @NameInMap("authConfig")
    private String authConfig;

    @NameInMap("authType")
    private String authType;

    @NameInMap("disableURLInternet")
    private Boolean disableURLInternet;

    @NameInMap("methods")
    private java.util.List < String > methods;

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
    public java.util.List < String > getMethods() {
        return this.methods;
    }

    public static final class Builder {
        private String authConfig; 
        private String authType; 
        private Boolean disableURLInternet; 
        private java.util.List < String > methods; 

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
         * 禁用默认公网域名访问的开关，设置为true 时，访问函数默认提供的公网URL地址会返回403错误。设置为 false 则不会有任何影响。
         */
        public Builder disableURLInternet(Boolean disableURLInternet) {
            this.disableURLInternet = disableURLInternet;
            return this;
        }

        /**
         * methods.
         */
        public Builder methods(java.util.List < String > methods) {
            this.methods = methods;
            return this;
        }

        public HTTPTriggerConfig build() {
            return new HTTPTriggerConfig(this);
        } 

    } 

}
