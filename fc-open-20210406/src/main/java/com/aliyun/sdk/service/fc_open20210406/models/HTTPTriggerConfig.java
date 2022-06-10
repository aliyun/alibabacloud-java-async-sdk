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
    @NameInMap("authType")
    private String authType;

    @NameInMap("methods")
    private java.util.List < String > methods;

    private HTTPTriggerConfig(Builder builder) {
        this.authType = builder.authType;
        this.methods = builder.methods;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HTTPTriggerConfig create() {
        return builder().build();
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return methods
     */
    public java.util.List < String > getMethods() {
        return this.methods;
    }

    public static final class Builder {
        private String authType; 
        private java.util.List < String > methods; 

        /**
         * 认证类型
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        /**
         * 允许的HTTP方法列表
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
