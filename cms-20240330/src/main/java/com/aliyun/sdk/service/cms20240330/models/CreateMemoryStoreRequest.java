// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateMemoryStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateMemoryStoreRequest</p>
 */
public class CreateMemoryStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customExtractionStrategies")
    private java.util.List<CustomExtractionStrategy> customExtractionStrategies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extractionStrategies")
    private java.util.List<String> extractionStrategies;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryStoreName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shortTermTtl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shortTermTtl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("traceSourceConfig")
    private TraceSourceConfig traceSourceConfig;

    private CreateMemoryStoreRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.customExtractionStrategies = builder.customExtractionStrategies;
        this.description = builder.description;
        this.extractionStrategies = builder.extractionStrategies;
        this.memoryStoreName = builder.memoryStoreName;
        this.shortTermTtl = builder.shortTermTtl;
        this.sourceType = builder.sourceType;
        this.traceSourceConfig = builder.traceSourceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryStoreRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return customExtractionStrategies
     */
    public java.util.List<CustomExtractionStrategy> getCustomExtractionStrategies() {
        return this.customExtractionStrategies;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extractionStrategies
     */
    public java.util.List<String> getExtractionStrategies() {
        return this.extractionStrategies;
    }

    /**
     * @return memoryStoreName
     */
    public String getMemoryStoreName() {
        return this.memoryStoreName;
    }

    /**
     * @return shortTermTtl
     */
    public Integer getShortTermTtl() {
        return this.shortTermTtl;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return traceSourceConfig
     */
    public TraceSourceConfig getTraceSourceConfig() {
        return this.traceSourceConfig;
    }

    public static final class Builder extends Request.Builder<CreateMemoryStoreRequest, Builder> {
        private String workspace; 
        private java.util.List<CustomExtractionStrategy> customExtractionStrategies; 
        private String description; 
        private java.util.List<String> extractionStrategies; 
        private String memoryStoreName; 
        private Integer shortTermTtl; 
        private String sourceType; 
        private TraceSourceConfig traceSourceConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemoryStoreRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.customExtractionStrategies = request.customExtractionStrategies;
            this.description = request.description;
            this.extractionStrategies = request.extractionStrategies;
            this.memoryStoreName = request.memoryStoreName;
            this.shortTermTtl = request.shortTermTtl;
            this.sourceType = request.sourceType;
            this.traceSourceConfig = request.traceSourceConfig;
        } 

        /**
         * <p>The name of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>A list of custom extraction strategies.</p>
         */
        public Builder customExtractionStrategies(java.util.List<CustomExtractionStrategy> customExtractionStrategies) {
            this.putBodyParameter("customExtractionStrategies", customExtractionStrategies);
            this.customExtractionStrategies = customExtractionStrategies;
            return this;
        }

        /**
         * <p>The description of the MemoryStore.</p>
         * 
         * <strong>example:</strong>
         * <p>Test memory store for demonstration.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The extraction strategies to use. Valid values include <code>Episodic</code>, <code>Summary</code>, and <code>Fact</code>.</p>
         */
        public Builder extractionStrategies(java.util.List<String> extractionStrategies) {
            this.putBodyParameter("extractionStrategies", extractionStrategies);
            this.extractionStrategies = extractionStrategies;
            return this;
        }

        /**
         * <p>The name of the MemoryStore. The name must be unique within the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-memory-store</p>
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.putBodyParameter("memoryStoreName", memoryStoreName);
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * <p>The short-term TTL, which is the number of conversation rounds to retain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder shortTermTtl(Integer shortTermTtl) {
            this.putBodyParameter("shortTermTtl", shortTermTtl);
            this.shortTermTtl = shortTermTtl;
            return this;
        }

        /**
         * <p>The source type of the memory. Valid values are <code>None</code> and <code>Trace</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>None/Trace</p>
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>Configuration for the trace source. Required if <code>sourceType</code> is <code>Trace</code>.</p>
         */
        public Builder traceSourceConfig(TraceSourceConfig traceSourceConfig) {
            this.putBodyParameter("traceSourceConfig", traceSourceConfig);
            this.traceSourceConfig = traceSourceConfig;
            return this;
        }

        @Override
        public CreateMemoryStoreRequest build() {
            return new CreateMemoryStoreRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMemoryStoreRequest} extends {@link TeaModel}
     *
     * <p>CreateMemoryStoreRequest</p>
     */
    public static class TraceSourceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("includeOutput")
        private Boolean includeOutput;

        @com.aliyun.core.annotation.NameInMap("query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private TraceSourceConfig(Builder builder) {
            this.includeOutput = builder.includeOutput;
            this.query = builder.query;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceSourceConfig create() {
            return builder().build();
        }

        /**
         * @return includeOutput
         */
        public Boolean getIncludeOutput() {
            return this.includeOutput;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private Boolean includeOutput; 
            private String query; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(TraceSourceConfig model) {
                this.includeOutput = model.includeOutput;
                this.query = model.query;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Specifies whether to include the output in the trace.</p>
             */
            public Builder includeOutput(Boolean includeOutput) {
                this.includeOutput = includeOutput;
                return this;
            }

            /**
             * <p>The query to filter traces.</p>
             * 
             * <strong>example:</strong>
             * <p>(serviceName : &quot;langchain-rag&quot; or serviceName : &quot;agentscope-code-correction&quot;) and hostname = frontend-proxy-999c48c8d-hvk6c</p>
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * <p>The name of the workspace that contains the trace source.</p>
             * 
             * <strong>example:</strong>
             * <p>test-workspace</p>
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public TraceSourceConfig build() {
                return new TraceSourceConfig(this);
            } 

        } 

    }
}
