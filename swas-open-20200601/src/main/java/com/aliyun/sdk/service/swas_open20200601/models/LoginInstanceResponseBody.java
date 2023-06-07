// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LoginInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>LoginInstanceResponseBody</p>
 */
public class LoginInstanceResponseBody extends TeaModel {
    @NameInMap("RedirectUrl")
    private String redirectUrl;

    @NameInMap("RequestId")
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
         * The ID of the request.
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
