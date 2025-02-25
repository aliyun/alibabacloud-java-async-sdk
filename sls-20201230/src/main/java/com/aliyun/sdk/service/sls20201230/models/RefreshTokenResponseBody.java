// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link RefreshTokenResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshTokenResponseBody</p>
 */
public class RefreshTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    private RefreshTokenResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    public static final class Builder {
        private String accessToken; 

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public RefreshTokenResponseBody build() {
            return new RefreshTokenResponseBody(this);
        } 

    } 

}
