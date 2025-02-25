// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The logon preference.</p>
         */
        public Builder loginPreference(LoginPreference loginPreference) {
            this.loginPreference = loginPreference;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8CE8B990-193D-50CE-A604-69F3E7DCE740</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLoginPreferenceResponseBody build() {
            return new GetLoginPreferenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLoginPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoginPreferenceResponseBody</p>
     */
    public static class LoginPreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowUserToGetCredentials")
        private Boolean allowUserToGetCredentials;

        @com.aliyun.core.annotation.NameInMap("LoginNetworkMasks")
        private String loginNetworkMasks;

        private LoginPreference(Builder builder) {
            this.allowUserToGetCredentials = builder.allowUserToGetCredentials;
            this.loginNetworkMasks = builder.loginNetworkMasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoginPreference create() {
            return builder().build();
        }

        /**
         * @return allowUserToGetCredentials
         */
        public Boolean getAllowUserToGetCredentials() {
            return this.allowUserToGetCredentials;
        }

        /**
         * @return loginNetworkMasks
         */
        public String getLoginNetworkMasks() {
            return this.loginNetworkMasks;
        }

        public static final class Builder {
            private Boolean allowUserToGetCredentials; 
            private String loginNetworkMasks; 

            /**
             * <p>Whether the user can obtain program access credentials on the portal after logging in. Values: </p>
             * <ul>
             * <li>True: Yes. </li>
             * <li>False (default): No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder allowUserToGetCredentials(Boolean allowUserToGetCredentials) {
                this.allowUserToGetCredentials = allowUserToGetCredentials;
                return this;
            }

            /**
             * <p>The IP address whitelist. CloudSSO users can log on to the CloudSSO user portal only by using the IP addresses in the whitelist.</p>
             * <p>The IP address whitelist takes effect only on CloudSSO users who want to log on to the CloudSSO user portal by using the username-password logon or single sign-on (SSO) method. The IP address whitelist does not take effect on CloudSSO users who access accounts in a resource directory from the CloudSSO user portal.</p>
             * <p>If the return value of this parameter is empty, no IP address whitelists are configured.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16;10.0.0.0/8</p>
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
