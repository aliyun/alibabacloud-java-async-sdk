// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LoginInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>LoginInstanceResponseBody</p>
 */
public class LoginInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RedirectUrl")
    private String redirectUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private LoginInstanceResponseBody(Builder builder) {
        this.redirectUrl = builder.redirectUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoginInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String redirectUrl; 
        private String requestId; 

        /**
         * The URL that you use to log on to the server.
         */
        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LoginInstanceResponseBody build() {
            return new LoginInstanceResponseBody(this);
        } 

    } 

}
