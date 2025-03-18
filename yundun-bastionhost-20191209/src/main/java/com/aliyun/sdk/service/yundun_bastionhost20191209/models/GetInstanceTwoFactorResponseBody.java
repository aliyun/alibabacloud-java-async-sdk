// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link GetInstanceTwoFactorResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceTwoFactorResponseBody</p>
 */
public class GetInstanceTwoFactorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetInstanceTwoFactorResponseBody model) {
            this.config = model.config;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The settings of two-factor authentication.</p>
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceTwoFactorResponseBody build() {
            return new GetInstanceTwoFactorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceTwoFactorResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceTwoFactorResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableTwoFactor")
        private Boolean enableTwoFactor;

        @com.aliyun.core.annotation.NameInMap("SkipTwoFactorTime")
        private Long skipTwoFactorTime;

        @com.aliyun.core.annotation.NameInMap("TwoFactorMethods")
        private java.util.List<String> twoFactorMethods;

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
        public java.util.List<String> getTwoFactorMethods() {
            return this.twoFactorMethods;
        }

        public static final class Builder {
            private Boolean enableTwoFactor; 
            private Long skipTwoFactorTime; 
            private java.util.List<String> twoFactorMethods; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.enableTwoFactor = model.enableTwoFactor;
                this.skipTwoFactorTime = model.skipTwoFactorTime;
                this.twoFactorMethods = model.twoFactorMethods;
            } 

            /**
             * <p>Indicates whether two-factor authentication is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableTwoFactor(Boolean enableTwoFactor) {
                this.enableTwoFactor = enableTwoFactor;
                return this;
            }

            /**
             * <p>The duration within which two-factor authentication is not required after a local user passes two-factor authentication. Valid values: <code>0 to 168</code>. Unit: hours.</p>
             * <blockquote>
             * <p>If 0 is returned, a local user must pass two-factor authentication every time the local user logs on to the bastion host.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder skipTwoFactorTime(Long skipTwoFactorTime) {
                this.skipTwoFactorTime = skipTwoFactorTime;
                return this;
            }

            /**
             * <p>The two-factor authentication methods.</p>
             */
            public Builder twoFactorMethods(java.util.List<String> twoFactorMethods) {
                this.twoFactorMethods = twoFactorMethods;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
