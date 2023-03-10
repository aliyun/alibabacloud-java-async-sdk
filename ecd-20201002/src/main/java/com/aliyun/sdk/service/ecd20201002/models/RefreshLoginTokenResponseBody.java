// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshLoginTokenResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshLoginTokenResponseBody</p>
 */
public class RefreshLoginTokenResponseBody extends TeaModel {
    @NameInMap("LoginToken")
    private String loginToken;

    @NameInMap("RequestId")
    private String requestId;

    private RefreshLoginTokenResponseBody(Builder builder) {
        this.loginToken = builder.loginToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshLoginTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String loginToken; 
        private String requestId; 

        /**
         * The logon token.
         */
        public Builder loginToken(String loginToken) {
            this.loginToken = loginToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshLoginTokenResponseBody build() {
            return new RefreshLoginTokenResponseBody(this);
        } 

    } 

}
