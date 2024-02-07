// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoginPreferenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoginPreferenceResponseBody</p>
 */
public class GetLoginPreferenceResponseBody extends TeaModel {
    @NameInMap("LoginPreference")
    private LoginPreference loginPreference;

    @NameInMap("RequestId")
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
         * LoginPreference.
         */
        public Builder loginPreference(LoginPreference loginPreference) {
            this.loginPreference = loginPreference;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("LoginNetworkMasks")
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
             * LoginNetworkMasks.
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
