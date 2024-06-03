// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoginPreferenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoginPreferenceResponseBody</p>
 */
public class GetLoginPreferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoginPreference")
    private LoginPreference loginPreference;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLoginPreferenceResponseBody(Builder builder) {
        this.loginPreference = builder.loginPreference;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginPreferenceResponseBody create() {
        return builder().build();
    }

    /**
     * @return loginPreference
     */
    public LoginPreference getLoginPreference() {
        return this.loginPreference;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LoginPreference loginPreference; 
        private String requestId; 

        /**
         * The logon preference.
         */
        public Builder loginPreference(LoginPreference loginPreference) {
            this.loginPreference = loginPreference;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLoginPreferenceResponseBody build() {
            return new GetLoginPreferenceResponseBody(this);
        } 

    } 

    public static class LoginPreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoginNetworkMasks")
        private String loginNetworkMasks;

        private LoginPreference(Builder builder) {
            this.loginNetworkMasks = builder.loginNetworkMasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginPreference create() {
            return builder().build();
        }

        /**
         * @return loginNetworkMasks
         */
        public String getLoginNetworkMasks() {
            return this.loginNetworkMasks;
        }

        public static final class Builder {
            private String loginNetworkMasks; 

            /**
             * The IP address whitelist. CloudSSO users can log on to the CloudSSO user portal only by using the IP addresses in the whitelist.
             * <p>
             * 
             * The IP address whitelist takes effect only on CloudSSO users who want to log on to the CloudSSO user portal by using the username-password logon or single sign-on (SSO) method. The IP address whitelist does not take effect on CloudSSO users who access accounts in a resource directory from the CloudSSO user portal.
             * 
             * If the return value of this parameter is empty, no IP address whitelists are configured.
             */
            public Builder loginNetworkMasks(String loginNetworkMasks) {
                this.loginNetworkMasks = loginNetworkMasks;
                return this;
            }

            public LoginPreference build() {
                return new LoginPreference(this);
            } 

        } 

    }
}
