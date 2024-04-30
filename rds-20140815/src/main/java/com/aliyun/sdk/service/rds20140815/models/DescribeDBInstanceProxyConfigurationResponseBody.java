// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceProxyConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceProxyConfigurationResponseBody</p>
 */
public class DescribeDBInstanceProxyConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttacksProtectionConfiguration")
    private String attacksProtectionConfiguration;

    @com.aliyun.core.annotation.NameInMap("PersistentConnectionsConfiguration")
    private String persistentConnectionsConfiguration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransparentSwitchConfiguration")
    private String transparentSwitchConfiguration;

    private DescribeDBInstanceProxyConfigurationResponseBody(Builder builder) {
        this.attacksProtectionConfiguration = builder.attacksProtectionConfiguration;
        this.persistentConnectionsConfiguration = builder.persistentConnectionsConfiguration;
        this.requestId = builder.requestId;
        this.transparentSwitchConfiguration = builder.transparentSwitchConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceProxyConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return attacksProtectionConfiguration
     */
    public String getAttacksProtectionConfiguration() {
        return this.attacksProtectionConfiguration;
    }

    /**
     * @return persistentConnectionsConfiguration
     */
    public String getPersistentConnectionsConfiguration() {
        return this.persistentConnectionsConfiguration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return transparentSwitchConfiguration
     */
    public String getTransparentSwitchConfiguration() {
        return this.transparentSwitchConfiguration;
    }

    public static final class Builder {
        private String attacksProtectionConfiguration; 
        private String persistentConnectionsConfiguration; 
        private String requestId; 
        private String transparentSwitchConfiguration; 

        /**
         * Indicates whether the mechanism that is used to mitigate brute-force attacks is enabled:
         * <p>
         * 
         * *   **Enable**
         * *   **Disable**
         * 
         * The return value is a JSON string. Example:
         * 
         *     {"status":"Disable", "check_interval_seconds": 60,
         *               "max_failed_login_attempts": 60, "blocking_seconds": 600}
         * 
         * Description:
         * 
         * *   Each client allows {max_failed_login_attempts} logon attempts that fail due to incorrect passwords within {check_interval_seconds} seconds. If one more such attempt is conducted, the client must wait for {blocking_seconds} seconds before you can try again.
         * 
         * *   Valid values:
         * 
         *     *   check_interval_seconds: **30 to 600**. Unit: seconds.
         *     *   max_failed_login_attempts: **10 to 5000**. Unit: times.
         *     *   blocking_seconds: **30 to 3600**. Unit: seconds.
         */
        public Builder attacksProtectionConfiguration(String attacksProtectionConfiguration) {
            this.attacksProtectionConfiguration = attacksProtectionConfiguration;
            return this;
        }

        /**
         * Indicates whether the short-lived connection optimization feature is enabled.
         * <p>
         * 
         * *   **Enable**
         * *   **Disable**
         * 
         * In this case, the return value is a JSON string. Examples:
         * 
         *     {"status":"Disable"}.
         */
        public Builder persistentConnectionsConfiguration(String persistentConnectionsConfiguration) {
            this.persistentConnectionsConfiguration = persistentConnectionsConfiguration;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the transparent switchover feature is enabled.
         * <p>
         * 
         * *   **Enable**
         * *   **Disable**
         * 
         * The return value is a JSON string. Example:
         * 
         *     {"status":"Enable"}
         */
        public Builder transparentSwitchConfiguration(String transparentSwitchConfiguration) {
            this.transparentSwitchConfiguration = transparentSwitchConfiguration;
            return this;
        }

        public DescribeDBInstanceProxyConfigurationResponseBody build() {
            return new DescribeDBInstanceProxyConfigurationResponseBody(this);
        } 

    } 

}
