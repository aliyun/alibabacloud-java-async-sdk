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
 * {@link AuthConfig} extends {@link TeaModel}
 *
 * <p>AuthConfig</p>
 */
public class AuthConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authInfo")
    private String authInfo;

    @com.aliyun.core.annotation.NameInMap("authType")
    private String authType;

    private AuthConfig(Builder builder) {
        this.authInfo = builder.authInfo;
        this.authType = builder.authType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthConfig create() {
        return builder().build();
    }

    /**
     * @return authInfo
     */
    public String getAuthInfo() {
        return this.authInfo;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    public static final class Builder {
        private String authInfo; 
        private String authType; 

        /**
         * authInfo.
         */
        public Builder authInfo(String authInfo) {
            this.authInfo = authInfo;
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
