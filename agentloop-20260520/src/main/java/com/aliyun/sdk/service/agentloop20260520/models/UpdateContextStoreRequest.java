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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

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
        this.status = builder.status;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
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
        private String status; 
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
            this.status = request.status;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The AgentSpace name. The name must be 2 to 64 characters in length.</p>
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
         * <p>The name of the context store to update. The name must be 2 to 64 characters in length.</p>
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
         * <p>The context store configuration. If specified, the entire configuration is overwritten. If not specified, the existing configuration is retained.</p>
         */
        public Builder config(Config config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The type of the context store. This value typically cannot be changed after creation. This field is provided only for exception correction.</p>
         * 
         * <strong>example:</strong>
         * <p>experience</p>
         */
        public Builder contextType(String contextType) {
            this.putBodyParameter("contextType", contextType);
            this.contextType = contextType;
            return this;
        }

        /**
         * <p>The description of the context store, which helps business users understand its purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>我的上下文库</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The idempotency token. A unique string generated by the client to ensure that the update operation is idempotent.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-1234-5678-90ab-cdef12345678</p>
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
             * <p>The AgentSpace where the trace data source resides. Cross-AgentSpace access is not supported. If specified, the value must be the same as the path AgentSpace. Otherwise, a 400 parameter error is returned. The AgentSpace cannot be changed after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>The start time for data backfill, in ISO 8601 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T00:00:00Z</p>
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
             * <p>The metadata field mapping. The key is the business field and the value is the storage field.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;userId&quot;:&quot;user_id&quot;,&quot;sessionId&quot;:&quot;session_id&quot;}</p>
             */
            public Builder metadataField(java.util.Map<String, String> metadataField) {
                this.metadataField = metadataField;
                return this;
            }

            /**
             * <p>The datasource config, which serves only as the root identifier of the data source.</p>
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
