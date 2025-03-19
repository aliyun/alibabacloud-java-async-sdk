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
 * {@link AuthConfig} extends {@link TeaModel}
 *
 * <p>AuthConfig</p>
 */
public class AuthConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authMode")
    private String authMode;

    @com.aliyun.core.annotation.NameInMap("authType")
    private String authType;

    private AuthConfig(Builder builder) {
        this.authMode = builder.authMode;
        this.authType = builder.authType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authMode
     */
    public String getAuthMode() {
        return this.authMode;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    public static final class Builder {
        private String authMode; 
        private String authType; 

        private Builder() {
        } 

        private Builder(AuthConfig model) {
            this.authMode = model.authMode;
            this.authType = model.authType;
        } 

        /**
         * authMode.
         */
        public Builder authMode(String authMode) {
            this.authMode = authMode;
            return this;
        }

        /**
         * authType.
         */
        public Builder authType(String authType) {
            this.authType = authType;
            return this;
        }

        public AuthConfig build() {
            return new AuthConfig(this);
        } 

    } 

}
