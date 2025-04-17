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
 * {@link ListUserConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserConfigsResponseBody</p>
 */
public class ListUserConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<Configs> configs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListUserConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Configs> configs; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListUserConfigsResponseBody model) {
            this.configs = model.configs;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The configurations list.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sdjksdk-******-dsfds</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of items returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserConfigsResponseBody build() {
            return new ListUserConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserConfigsResponseBody</p>
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
             * <p>subUser</p>
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
