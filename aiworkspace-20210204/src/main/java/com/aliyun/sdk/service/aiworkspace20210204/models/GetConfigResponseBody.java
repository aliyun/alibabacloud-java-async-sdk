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
 * {@link GetConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetConfigResponseBody</p>
 */
public class GetConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

    @com.aliyun.core.annotation.NameInMap("ConfigKey")
    private String configKey;

    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    private String configValue;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetConfigResponseBody(Builder builder) {
        this.categoryName = builder.categoryName;
        this.configKey = builder.configKey;
        this.configValue = builder.configValue;
        this.labels = builder.labels;
        this.requestId = builder.requestId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String categoryName; 
        private String configKey; 
        private String configValue; 
        private java.util.List<Labels> labels; 
        private String requestId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetConfigResponseBody model) {
            this.categoryName = model.categoryName;
            this.configKey = model.configKey;
            this.configValue = model.configValue;
            this.labels = model.labels;
            this.requestId = model.requestId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * CategoryName.
         */
        public Builder categoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        /**
         * ConfigKey.
         */
        public Builder configKey(String configKey) {
            this.configKey = configKey;
            return this;
        }

        /**
         * ConfigValue.
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
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
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetConfigResponseBody build() {
            return new GetConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
