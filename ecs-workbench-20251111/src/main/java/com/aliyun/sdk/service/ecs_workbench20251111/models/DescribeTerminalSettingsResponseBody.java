// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs_workbench20251111.models;

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
 * {@link DescribeTerminalSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTerminalSettingsResponseBody</p>
 */
public class DescribeTerminalSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PasswordlessLoginConfig")
    private PasswordlessLoginConfig passwordlessLoginConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTerminalSettingsResponseBody(Builder builder) {
        this.passwordlessLoginConfig = builder.passwordlessLoginConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTerminalSettingsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return passwordlessLoginConfig
     */
    public PasswordlessLoginConfig getPasswordlessLoginConfig() {
        return this.passwordlessLoginConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PasswordlessLoginConfig passwordlessLoginConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeTerminalSettingsResponseBody model) {
            this.passwordlessLoginConfig = model.passwordlessLoginConfig;
            this.requestId = model.requestId;
        } 

        /**
         * PasswordlessLoginConfig.
         */
        public Builder passwordlessLoginConfig(PasswordlessLoginConfig passwordlessLoginConfig) {
            this.passwordlessLoginConfig = passwordlessLoginConfig;
            return this;
        }

        /**
         * <p>请求ID</p>
         * 
         * <strong>example:</strong>
         * <p>47348885-C929-489A-93D7-B2E99D50D77B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTerminalSettingsResponseBody build() {
            return new DescribeTerminalSettingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTerminalSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTerminalSettingsResponseBody</p>
     */
    public static class PasswordlessLoginConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private PasswordlessLoginConfig(Builder builder) {
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordlessLoginConfig create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(PasswordlessLoginConfig model) {
                this.enabled = model.enabled;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public PasswordlessLoginConfig build() {
                return new PasswordlessLoginConfig(this);
            } 

        } 

    }
}
