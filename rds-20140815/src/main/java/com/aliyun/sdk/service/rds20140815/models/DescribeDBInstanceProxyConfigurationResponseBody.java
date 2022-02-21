// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceProxyConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceProxyConfigurationResponseBody</p>
 */
public class DescribeDBInstanceProxyConfigurationResponseBody extends TeaModel {
    @NameInMap("AttacksProtectionConfiguration")
    private String attacksProtectionConfiguration;

    @NameInMap("PersistentConnectionsConfiguration")
    private String persistentConnectionsConfiguration;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TransparentSwitchConfiguration")
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
         * AttacksProtectionConfiguration.
         */
        public Builder attacksProtectionConfiguration(String attacksProtectionConfiguration) {
            this.attacksProtectionConfiguration = attacksProtectionConfiguration;
            return this;
        }

        /**
         * PersistentConnectionsConfiguration.
         */
        public Builder persistentConnectionsConfiguration(String persistentConnectionsConfiguration) {
            this.persistentConnectionsConfiguration = persistentConnectionsConfiguration;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TransparentSwitchConfiguration.
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
