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
 * {@link UpdateConnectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateConnectionRequest</p>
 */
public class UpdateConnectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Configs")
    private java.util.Map<String, String> configs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Models")
    private java.util.List<Models> models;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Secrets")
    private java.util.Map<String, String> secrets;

    private UpdateConnectionRequest(Builder builder) {
        super(builder);
        this.connectionId = builder.connectionId;
        this.configs = builder.configs;
        this.description = builder.description;
        this.models = builder.models;
        this.secrets = builder.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return configs
     */
    public java.util.Map<String, String> getConfigs() {
        return this.configs;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return models
     */
    public java.util.List<Models> getModels() {
        return this.models;
    }

    /**
     * @return secrets
     */
    public java.util.Map<String, String> getSecrets() {
        return this.secrets;
    }

    public static final class Builder extends Request.Builder<UpdateConnectionRequest, Builder> {
        private String connectionId; 
        private java.util.Map<String, String> configs; 
        private String description; 
        private java.util.List<Models> models; 
        private java.util.Map<String, String> secrets; 

        private Builder() {
            super();
        } 

        private Builder(UpdateConnectionRequest request) {
            super(request);
            this.connectionId = request.connectionId;
            this.configs = request.configs;
            this.description = request.description;
            this.models = request.models;
            this.secrets = request.secrets;
        } 

        /**
         * <p>The connection ID. You can call <a href="url">ListConnections</a> to obtain the connection ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>conn-pai9m***mi47</p>
         */
        public Builder connectionId(String connectionId) {
            this.putPathParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * <p>The connection configuration. The connection configuration is in the key-value format. The keys configured for different connection types are different. For more information, see the supplementary description of the request parameters in CreateConnection.</p>
         */
        public Builder configs(java.util.Map<String, String> configs) {
            this.putBodyParameter("Configs", configs);
            this.configs = configs;
            return this;
        }

        /**
         * <p>The connection description.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The models.</p>
         */
        public Builder models(java.util.List<Models> models) {
            this.putBodyParameter("Models", models);
            this.models = models;
            return this;
        }

        /**
         * <p>The key-value configuration to be encrypted, such as the database logon password and the key for model connection.</p>
         */
        public Builder secrets(java.util.Map<String, String> secrets) {
            this.putBodyParameter("Secrets", secrets);
            this.secrets = secrets;
            return this;
        }

        @Override
        public UpdateConnectionRequest build() {
            return new UpdateConnectionRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateConnectionRequest} extends {@link TeaModel}
     *
     * <p>UpdateConnectionRequest</p>
     */
    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("ModelType")
        private String modelType;

        @com.aliyun.core.annotation.NameInMap("ToolCall")
        private Boolean toolCall;

        private Models(Builder builder) {
            this.displayName = builder.displayName;
            this.model = builder.model;
            this.modelType = builder.modelType;
            this.toolCall = builder.toolCall;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return toolCall
         */
        public Boolean getToolCall() {
            return this.toolCall;
        }

        public static final class Builder {
            private String displayName; 
            private String model; 
            private String modelType; 
            private Boolean toolCall; 

            private Builder() {
            } 

            private Builder(Models model) {
                this.displayName = model.displayName;
                this.model = model.model;
                this.modelType = model.modelType;
                this.toolCall = model.toolCall;
            } 

            /**
             * <p>The display name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>car_tag</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The model identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>model_001</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The model type. Valid values:</p>
             * <ul>
             * <li>LLM</li>
             * <li>Embedding</li>
             * <li>ReRank</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LLM</p>
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
                return this;
            }

            /**
             * <p>Indicates whether tool calling is supported. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder toolCall(Boolean toolCall) {
                this.toolCall = toolCall;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
}
