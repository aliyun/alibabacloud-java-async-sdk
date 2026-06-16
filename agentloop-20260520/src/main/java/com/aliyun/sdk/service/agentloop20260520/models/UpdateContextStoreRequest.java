// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link UpdateContextStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateContextStoreRequest</p>
 */
public class UpdateContextStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String contextStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contextType")
    private String contextType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdateContextStoreRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.contextStoreName = builder.contextStoreName;
        this.config = builder.config;
        this.contextType = builder.contextType;
        this.description = builder.description;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateContextStoreRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return contextType
     */
    public String getContextType() {
        return this.contextType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdateContextStoreRequest, Builder> {
        private String agentSpace; 
        private String contextStoreName; 
        private Config config; 
        private String contextType; 
        private String description; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdateContextStoreRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.contextStoreName = request.contextStoreName;
            this.config = request.config;
            this.contextType = request.contextType;
            this.description = request.description;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putPathParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * config.
         */
        public Builder config(Config config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * contextType.
         */
        public Builder contextType(String contextType) {
            this.putBodyParameter("contextType", contextType);
            this.contextType = contextType;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdateContextStoreRequest build() {
            return new UpdateContextStoreRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
     */
    public static class Source extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private Source(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Source create() {
            return builder().build();
        }

        /**
         * @return agentSpace
         */
        public String getAgentSpace() {
            return this.agentSpace;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String agentSpace; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Source model) {
                this.agentSpace = model.agentSpace;
                this.startTime = model.startTime;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Source build() {
                return new Source(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateContextStoreRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metadataField")
        private java.util.Map<String, String> metadataField;

        @com.aliyun.core.annotation.NameInMap("source")
        private Source source;

        private Config(Builder builder) {
            this.metadataField = builder.metadataField;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return metadataField
         */
        public java.util.Map<String, String> getMetadataField() {
            return this.metadataField;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        public static final class Builder {
            private java.util.Map<String, String> metadataField; 
            private Source source; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.metadataField = model.metadataField;
                this.source = model.source;
            } 

            /**
             * metadataField.
             */
            public Builder metadataField(java.util.Map<String, String> metadataField) {
                this.metadataField = metadataField;
                return this;
            }

            /**
             * source.
             */
            public Builder source(Source source) {
                this.source = source;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
