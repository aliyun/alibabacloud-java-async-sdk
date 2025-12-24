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
 * {@link ModifyTerminalSettingsRequest} extends {@link RequestModel}
 *
 * <p>ModifyTerminalSettingsRequest</p>
 */
public class ModifyTerminalSettingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordlessLoginConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private PasswordlessLoginConfig passwordlessLoginConfig;

    private ModifyTerminalSettingsRequest(Builder builder) {
        super(builder);
        this.passwordlessLoginConfig = builder.passwordlessLoginConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTerminalSettingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return passwordlessLoginConfig
     */
    public PasswordlessLoginConfig getPasswordlessLoginConfig() {
        return this.passwordlessLoginConfig;
    }

    public static final class Builder extends Request.Builder<ModifyTerminalSettingsRequest, Builder> {
        private PasswordlessLoginConfig passwordlessLoginConfig; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTerminalSettingsRequest request) {
            super(request);
            this.passwordlessLoginConfig = request.passwordlessLoginConfig;
        } 

        /**
         * <p>免密登录配置</p>
         * <p>This parameter is required.</p>
         */
        public Builder passwordlessLoginConfig(PasswordlessLoginConfig passwordlessLoginConfig) {
            String passwordlessLoginConfigShrink = shrink(passwordlessLoginConfig, "PasswordlessLoginConfig", "json");
            this.putQueryParameter("PasswordlessLoginConfig", passwordlessLoginConfigShrink);
            this.passwordlessLoginConfig = passwordlessLoginConfig;
            return this;
        }

        @Override
        public ModifyTerminalSettingsRequest build() {
            return new ModifyTerminalSettingsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyTerminalSettingsRequest} extends {@link TeaModel}
     *
     * <p>ModifyTerminalSettingsRequest</p>
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
             * <p>免密功能开关</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
