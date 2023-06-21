// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordHistoryConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetPasswordHistoryConfigurationResponseBody</p>
 */
public class GetPasswordHistoryConfigurationResponseBody extends TeaModel {
    @NameInMap("PasswordHistoryConfiguration")
    private PasswordHistoryConfiguration passwordHistoryConfiguration;

    @NameInMap("RequestId")
    private String requestId;

    private GetPasswordHistoryConfigurationResponseBody(Builder builder) {
        this.passwordHistoryConfiguration = builder.passwordHistoryConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPasswordHistoryConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return passwordHistoryConfiguration
     */
    public PasswordHistoryConfiguration getPasswordHistoryConfiguration() {
        return this.passwordHistoryConfiguration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PasswordHistoryConfiguration passwordHistoryConfiguration; 
        private String requestId; 

        /**
         * The password history configurations.
         */
        public Builder passwordHistoryConfiguration(PasswordHistoryConfiguration passwordHistoryConfiguration) {
            this.passwordHistoryConfiguration = passwordHistoryConfiguration;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPasswordHistoryConfigurationResponseBody build() {
            return new GetPasswordHistoryConfigurationResponseBody(this);
        } 

    } 

    public static class PasswordHistoryConfiguration extends TeaModel {
        @NameInMap("PasswordHistoryMaxRetention")
        private Integer passwordHistoryMaxRetention;

        @NameInMap("PasswordHistoryStatus")
        private String passwordHistoryStatus;

        private PasswordHistoryConfiguration(Builder builder) {
            this.passwordHistoryMaxRetention = builder.passwordHistoryMaxRetention;
            this.passwordHistoryStatus = builder.passwordHistoryStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordHistoryConfiguration create() {
            return builder().build();
        }

        /**
         * @return passwordHistoryMaxRetention
         */
        public Integer getPasswordHistoryMaxRetention() {
            return this.passwordHistoryMaxRetention;
        }

        /**
         * @return passwordHistoryStatus
         */
        public String getPasswordHistoryStatus() {
            return this.passwordHistoryStatus;
        }

        public static final class Builder {
            private Integer passwordHistoryMaxRetention; 
            private String passwordHistoryStatus; 

            /**
             * The maximum number of recent passwords that are retained.
             */
            public Builder passwordHistoryMaxRetention(Integer passwordHistoryMaxRetention) {
                this.passwordHistoryMaxRetention = passwordHistoryMaxRetention;
                return this;
            }

            /**
             * Indicates whether the password history feature is enabled. Valid values:
             * <p>
             * 
             * *   enabled
             * *   disabled
             */
            public Builder passwordHistoryStatus(String passwordHistoryStatus) {
                this.passwordHistoryStatus = passwordHistoryStatus;
                return this;
            }

            public PasswordHistoryConfiguration build() {
                return new PasswordHistoryConfiguration(this);
            } 

        } 

    }
}
