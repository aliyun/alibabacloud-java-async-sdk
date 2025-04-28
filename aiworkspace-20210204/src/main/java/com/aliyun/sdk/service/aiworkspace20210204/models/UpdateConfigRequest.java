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
 * {@link UpdateConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateConfigRequest</p>
 */
public class UpdateConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigKey")
    private String configKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    private String configValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    private UpdateConfigRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.categoryName = builder.categoryName;
        this.configKey = builder.configKey;
        this.configValue = builder.configValue;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateConfigRequest, Builder> {
        private String workspaceId; 
        private String categoryName; 
        private String configKey; 
        private String configValue; 
        private java.util.List<Labels> labels; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConfigRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.categoryName = request.categoryName;
            this.configKey = request.configKey;
            this.configValue = request.configValue;
            this.labels = request.labels;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234******2</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * CategoryName.
         */
        public Builder categoryName(String categoryName) {
            this.putBodyParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        /**
         * ConfigKey.
         */
        public Builder configKey(String configKey) {
            this.putBodyParameter("ConfigKey", configKey);
            this.configKey = configKey;
            return this;
        }

        /**
         * ConfigValue.
         */
        public Builder configValue(String configValue) {
            this.putBodyParameter("ConfigValue", configValue);
            this.configValue = configValue;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        @Override
        public UpdateConfigRequest build() {
            return new UpdateConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateConfigRequest</p>
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
