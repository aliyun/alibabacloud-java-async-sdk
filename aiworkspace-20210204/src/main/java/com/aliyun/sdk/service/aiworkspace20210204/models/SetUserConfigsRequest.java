// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link SetUserConfigsRequest} extends {@link RequestModel}
 *
 * <p>SetUserConfigsRequest</p>
 */
public class SetUserConfigsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<Configs> configs;

    private SetUserConfigsRequest(Builder builder) {
        super(builder);
        this.configs = builder.configs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetUserConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    public static final class Builder extends Request.Builder<SetUserConfigsRequest, Builder> {
        private java.util.List<Configs> configs; 

        private Builder() {
            super();
        } 

        private Builder(SetUserConfigsRequest request) {
            super(request);
            this.configs = request.configs;
        } 

        /**
         * <p>The configurations list.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.putBodyParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        @Override
        public SetUserConfigsRequest build() {
            return new SetUserConfigsRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetUserConfigsRequest} extends {@link TeaModel}
     *
     * <p>SetUserConfigsRequest</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("ConfigKey")
        private String configKey;

        @com.aliyun.core.annotation.NameInMap("ConfigValue")
        private String configValue;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        private Configs(Builder builder) {
            this.categoryName = builder.categoryName;
            this.configKey = builder.configKey;
            this.configValue = builder.configValue;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return configKey
         */
        public String getConfigKey() {
            return this.configKey;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        public static final class Builder {
            private String categoryName; 
            private String configKey; 
            private String configValue; 
            private String scope; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.categoryName = model.categoryName;
                this.configKey = model.configKey;
                this.configValue = model.configValue;
                this.scope = model.scope;
            } 

            /**
             * <p>The category. Currently, only DataPrivacyConfig is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>DataPrivacyConfig</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The key of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>customizePAIAssumedRole</p>
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>role</p>
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            /**
             * <p>The scope. Currently, subUser and owner are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
