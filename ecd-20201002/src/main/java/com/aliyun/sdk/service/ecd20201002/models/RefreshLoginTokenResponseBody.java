// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link RefreshLoginTokenResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshLoginTokenResponseBody</p>
 */
public class RefreshLoginTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RefreshLoginTokenResponseBody model) {
            this.loginToken = model.loginToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The logon credential.</p>
         * 
         * <strong>example:</strong>
         * <p>v1c27bab6c205b2fdfac916434306375722776d6aa89e30b7836d18c95ade9137f0f5ac4325260782184e96ee2b3f0****</p>
         */
        public Builder loginToken(String loginToken) {
            this.loginToken = loginToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
