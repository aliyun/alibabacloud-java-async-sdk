// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GetPasswordHistoryConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetPasswordHistoryConfigurationResponseBody</p>
 */
public class GetPasswordHistoryConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PasswordHistoryConfiguration")
    private PasswordHistoryConfiguration passwordHistoryConfiguration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The password history configurations.</p>
         */
        public Builder passwordHistoryConfiguration(PasswordHistoryConfiguration passwordHistoryConfiguration) {
            this.passwordHistoryConfiguration = passwordHistoryConfiguration;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPasswordHistoryConfigurationResponseBody build() {
            return new GetPasswordHistoryConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPasswordHistoryConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetPasswordHistoryConfigurationResponseBody</p>
     */
    public static class PasswordHistoryConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PasswordHistoryMaxRetention")
        private Integer passwordHistoryMaxRetention;

        @com.aliyun.core.annotation.NameInMap("PasswordHistoryStatus")
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
             * <p>The maximum number of recent passwords that are retained.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder passwordHistoryMaxRetention(Integer passwordHistoryMaxRetention) {
                this.passwordHistoryMaxRetention = passwordHistoryMaxRetention;
                return this;
            }

            /**
             * <p>Indicates whether the password history feature is enabled. Valid values:</p>
             * <ul>
             * <li>enabled</li>
             * <li>disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
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
