// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
         * <p>Indicates whether the mechanism that is used to mitigate brute-force attacks is enabled:</p>
         * <ul>
         * <li><strong>Enable</strong></li>
         * <li><strong>Disable</strong></li>
         * </ul>
         * <p>The return value is a JSON string. Example:</p>
         * <pre><code>{&quot;status&quot;:&quot;Disable&quot;, &quot;check_interval_seconds&quot;: 60,
         *           &quot;max_failed_login_attempts&quot;: 60, &quot;blocking_seconds&quot;: 600}
         * </code></pre>
         * <p>Description:</p>
         * <ul>
         * <li><p>Each client allows {max_failed_login_attempts} logon attempts that fail due to incorrect passwords within {check_interval_seconds} seconds. If one more such attempt is conducted, the client must wait for {blocking_seconds} seconds before you can try again.</p>
         * </li>
         * <li><p>Valid values:</p>
         * <ul>
         * <li>check_interval_seconds: <strong>30 to 600</strong>. Unit: seconds.</li>
         * <li>max_failed_login_attempts: <strong>10 to 5000</strong>. Unit: times.</li>
         * <li>blocking_seconds: <strong>30 to 3600</strong>. Unit: seconds.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;check_interval_seconds&quot;:&quot;0&quot;,&quot;max_failed_login_attempts&quot;:&quot;0&quot;,&quot;blocking_seconds&quot;:&quot;0&quot;,&quot;status&quot;:&quot;Disable&quot;}</p>
         */
        public Builder attacksProtectionConfiguration(String attacksProtectionConfiguration) {
            this.attacksProtectionConfiguration = attacksProtectionConfiguration;
            return this;
        }

        /**
         * <p>Indicates whether the short-lived connection optimization feature is enabled.</p>
         * <ul>
         * <li><strong>Enable</strong></li>
         * <li><strong>Disable</strong></li>
         * </ul>
         * <p>In this case, the return value is a JSON string. Examples:</p>
         * <pre><code>{&quot;status&quot;:&quot;Disable&quot;}.
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{&quot;status&quot;:&quot;Disable&quot;}</p>
         */
        public Builder persistentConnectionsConfiguration(String persistentConnectionsConfiguration) {
            this.persistentConnectionsConfiguration = persistentConnectionsConfiguration;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E9DD55F4-1A5F-48CA-BA57-DFB3CA8C4C34</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the transparent switchover feature is enabled.</p>
         * <ul>
         * <li><strong>Enable</strong></li>
         * <li><strong>Disable</strong></li>
         * </ul>
         * <p>The return value is a JSON string. Example:</p>
         * <pre><code>{&quot;status&quot;:&quot;Enable&quot;}
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>{&quot;status&quot;:&quot;Enable&quot;}</p>
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
