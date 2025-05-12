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
 * {@link UpdateConfigsRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigsRequest</p>
 */
public class UpdateConfigsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.List<Configs> configs;

    private UpdateConfigsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.configs = builder.configs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return configs
     */
    public java.util.List<Configs> getConfigs() {
        return this.configs;
    }

    public static final class Builder extends Request.Builder<UpdateConfigsRequest, Builder> {
        private String workspaceId; 
        private java.util.List<Configs> configs; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.configs = request.configs;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>83***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The list of workspace configurations to update or add.</p>
         */
        public Builder configs(java.util.List<Configs> configs) {
            this.putBodyParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        @Override
        public UpdateConfigsRequest build() {
            return new UpdateConfigsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateConfigsRequest} extends {@link TeaModel}
     *
     * <p>UpdateConfigsRequest</p>
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
    /**
     * 
     * {@link UpdateConfigsRequest} extends {@link TeaModel}
     *
     * <p>UpdateConfigsRequest</p>
     */
    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("ConfigKey")
        private String configKey;

        @com.aliyun.core.annotation.NameInMap("ConfigValue")
        private String configValue;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        private Configs(Builder builder) {
            this.categoryName = builder.categoryName;
            this.configKey = builder.configKey;
            this.configValue = builder.configValue;
            this.labels = builder.labels;
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
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private String categoryName; 
            private String configKey; 
            private String configValue; 
            private java.util.List<Labels> labels; 

            private Builder() {
            } 

            private Builder(Configs model) {
                this.categoryName = model.categoryName;
                this.configKey = model.configKey;
                this.configValue = model.configValue;
                this.labels = model.labels;
            } 

            /**
             * <p>The category of the configuration item. Supported categories:</p>
             * <ul>
             * <li>CommonResourceConfig</li>
             * <li>DLCAutoRecycle</li>
             * <li>DLCPriorityConfig</li>
             * <li>DSWPriorityConfig</li>
             * <li>QuotaMaximumDuration</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CommonResourceConfig</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The key of the configuration item. Supported keys:</p>
             * <ul>
             * <li>tempStoragePath: Temporary storage path. This key can be used only when CategoryName is set to CommonResourceConfig.</li>
             * <li>isAutoRecycle: Automatic recycle configuration. This key can be used only when CategoryName is set to DLCAutoRecycle.</li>
             * <li>priorityConfig: Priority configuration. This key can be used only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</li>
             * <li>quotaMaximumDuration Maximum run time of DLC jobs for a quota. This key can be used only when CategoryName is set to QuotaMaximumDuration.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tempStoragePath</p>
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test/s/</p>
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            /**
             * <p>The tags of the configuration item.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
