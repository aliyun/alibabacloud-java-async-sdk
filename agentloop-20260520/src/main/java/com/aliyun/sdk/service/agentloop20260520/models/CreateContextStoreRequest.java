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
 * {@link CreateContextStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateContextStoreRequest</p>
 */
public class CreateContextStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private Config config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contextStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contextType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contextType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private CreateContextStoreRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.config = builder.config;
        this.contextStoreName = builder.contextStoreName;
        this.contextType = builder.contextType;
        this.description = builder.description;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContextStoreRequest create() {
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
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
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

    public static final class Builder extends Request.Builder<CreateContextStoreRequest, Builder> {
        private String agentSpace; 
        private Config config; 
        private String contextStoreName; 
        private String contextType; 
        private String description; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(CreateContextStoreRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.config = request.config;
            this.contextStoreName = request.contextStoreName;
            this.contextType = request.contextType;
            this.description = request.description;
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
         * <p>The context store configuration, including the datasource config and metadata field mapping.</p>
         */
        public Builder config(Config config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The context store name, which must be globally unique within the AgentSpace. The name must be 2 to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putBodyParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * <p>The context store type. Valid values: experience and memory.</p>
         * <p>This parameter is required.</p>
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
         * <p>The description of the context store, which helps users understand its purpose.</p>
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
         * <p>The idempotency token, which is a unique string generated by the client to ensure the idempotence of the create operation.</p>
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
        public CreateContextStoreRequest build() {
            return new CreateContextStoreRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
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
             * <p>The AgentSpace where the trace data source resides. If not specified, the AgentSpace in the current path is used by default. Cross-AgentSpace access is not supported in the current version. If specified, the value must match the AgentSpace in the path. Otherwise, a 400 parameter error is returned. This value cannot be changed after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>my-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>The start time for data backfill, in ISO 8601 UTC format. If not specified, the current time is used.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
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
     * {@link CreateContextStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateContextStoreRequest</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metadataField")
        private java.util.Map<String, String> metadataField;

        @com.aliyun.core.annotation.NameInMap("miningInterval")
        private String miningInterval;

        @com.aliyun.core.annotation.NameInMap("serviceNames")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> serviceNames;

        @com.aliyun.core.annotation.NameInMap("source")
        private Source source;

        private Config(Builder builder) {
            this.metadataField = builder.metadataField;
            this.miningInterval = builder.miningInterval;
            this.serviceNames = builder.serviceNames;
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
         * @return miningInterval
         */
        public String getMiningInterval() {
            return this.miningInterval;
        }

        /**
         * @return serviceNames
         */
        public java.util.List<String> getServiceNames() {
            return this.serviceNames;
        }

        /**
         * @return source
         */
        public Source getSource() {
            return this.source;
        }

        public static final class Builder {
            private java.util.Map<String, String> metadataField; 
            private String miningInterval; 
            private java.util.List<String> serviceNames; 
            private Source source; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.metadataField = model.metadataField;
                this.miningInterval = model.miningInterval;
                this.serviceNames = model.serviceNames;
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
             * <p>The experience mining interval, which specifies how often experience mining is performed. Valid values: 1h, 6h, 12h, and 1d. Default value: 1d. This value cannot be changed after creation.</p>
             * 
             * <strong>example:</strong>
             * <p>1d</p>
             */
            public Builder miningInterval(String miningInterval) {
                this.miningInterval = miningInterval;
                return this;
            }

            /**
             * <p>The list of service names. This parameter is required and cannot be empty. It works with source.agentSpace to locate the trace data source. The trajectory extraction service uses the AgentSpace to look up the bound CMS workspace and project/logstore, and then filters by service name. This value cannot be changed after creation. No modification entry is available in the current version.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;order-service&quot;,&quot;payment-service&quot;]</p>
             */
            public Builder serviceNames(java.util.List<String> serviceNames) {
                this.serviceNames = serviceNames;
                return this;
            }

            /**
             * <p>The datasource config, which serves only as the root identifier for the data source. This is an optional block.</p>
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
