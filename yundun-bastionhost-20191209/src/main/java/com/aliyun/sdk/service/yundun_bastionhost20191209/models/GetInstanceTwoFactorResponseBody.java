// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceTwoFactorResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceTwoFactorResponseBody</p>
 */
public class GetInstanceTwoFactorResponseBody extends TeaModel {
    @NameInMap("Config")
    private Config config;

    @NameInMap("RequestId")
    private String requestId;

    private GetInstanceTwoFactorResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceTwoFactorResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Config config; 
        private String requestId; 

        /**
         * The settings of two-factor authentication.
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceTwoFactorResponseBody build() {
            return new GetInstanceTwoFactorResponseBody(this);
        } 

    } 

    public static class Config extends TeaModel {
        @NameInMap("EnableTwoFactor")
        private Boolean enableTwoFactor;

        @NameInMap("SkipTwoFactorTime")
        private Long skipTwoFactorTime;

        @NameInMap("TwoFactorMethods")
        private java.util.List < String > twoFactorMethods;

        private Config(Builder builder) {
            this.enableTwoFactor = builder.enableTwoFactor;
            this.skipTwoFactorTime = builder.skipTwoFactorTime;
            this.twoFactorMethods = builder.twoFactorMethods;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return enableTwoFactor
         */
        public Boolean getEnableTwoFactor() {
            return this.enableTwoFactor;
        }

        /**
         * @return skipTwoFactorTime
         */
        public Long getSkipTwoFactorTime() {
            return this.skipTwoFactorTime;
        }

        /**
         * @return twoFactorMethods
         */
        public java.util.List < String > getTwoFactorMethods() {
            return this.twoFactorMethods;
        }

        public static final class Builder {
            private Boolean enableTwoFactor; 
            private Long skipTwoFactorTime; 
            private java.util.List < String > twoFactorMethods; 

            /**
             * Indicates whether two-factor authentication is enabled. Valid values:
             * <p>
             * 
             * *   **true**: enabled
             * *   **false**: disabled
             */
            public Builder enableTwoFactor(Boolean enableTwoFactor) {
                this.enableTwoFactor = enableTwoFactor;
                return this;
            }

            /**
             * The duration within which two-factor authentication is not required after a local user passes two-factor authentication. Valid values: `0 to 168`. Unit: hours.
             * <p>
             * 
             * >  If 0 is returned, a local user must pass two-factor authentication every time the local user logs on to the bastion host.
             */
            public Builder skipTwoFactorTime(Long skipTwoFactorTime) {
                this.skipTwoFactorTime = skipTwoFactorTime;
                return this;
            }

            /**
             * Indicates one or more methods that are used to send verification codes if two-factor authentication is enabled.
             */
            public Builder twoFactorMethods(java.util.List < String > twoFactorMethods) {
                this.twoFactorMethods = twoFactorMethods;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
