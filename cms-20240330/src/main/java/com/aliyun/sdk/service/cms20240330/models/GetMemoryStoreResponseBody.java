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
 * {@link GetMemoryStoreResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryStoreResponseBody</p>
 */
public class GetMemoryStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("customExtractionStrategies")
    private java.util.List<CustomExtractionStrategy> customExtractionStrategies;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("extractionStrategies")
    private java.util.List<String> extractionStrategies;

    @com.aliyun.core.annotation.NameInMap("memoryStoreName")
    private String memoryStoreName;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("shortTermStorage")
    private ShortTermStorage shortTermStorage;

    @com.aliyun.core.annotation.NameInMap("shortTermTtl")
    private Integer shortTermTtl;

    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("traceSourceConfig")
    private TraceSourceConfig traceSourceConfig;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private GetMemoryStoreResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.customExtractionStrategies = builder.customExtractionStrategies;
        this.description = builder.description;
        this.extractionStrategies = builder.extractionStrategies;
        this.memoryStoreName = builder.memoryStoreName;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.shortTermStorage = builder.shortTermStorage;
        this.shortTermTtl = builder.shortTermTtl;
        this.sourceType = builder.sourceType;
        this.traceSourceConfig = builder.traceSourceConfig;
        this.updateTime = builder.updateTime;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryStoreResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shortTermStorage
     */
    public ShortTermStorage getShortTermStorage() {
        return this.shortTermStorage;
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

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private String createTime; 
        private java.util.List<CustomExtractionStrategy> customExtractionStrategies; 
        private String description; 
        private java.util.List<String> extractionStrategies; 
        private String memoryStoreName; 
        private String regionId; 
        private String requestId; 
        private ShortTermStorage shortTermStorage; 
        private Integer shortTermTtl; 
        private String sourceType; 
        private TraceSourceConfig traceSourceConfig; 
        private String updateTime; 
        private String workspace; 

        private Builder() {
        } 

        private Builder(GetMemoryStoreResponseBody model) {
            this.createTime = model.createTime;
            this.customExtractionStrategies = model.customExtractionStrategies;
            this.description = model.description;
            this.extractionStrategies = model.extractionStrategies;
            this.memoryStoreName = model.memoryStoreName;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.shortTermStorage = model.shortTermStorage;
            this.shortTermTtl = model.shortTermTtl;
            this.sourceType = model.sourceType;
            this.traceSourceConfig = model.traceSourceConfig;
            this.updateTime = model.updateTime;
            this.workspace = model.workspace;
        } 

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>1764556182850</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * customExtractionStrategies.
         */
        public Builder customExtractionStrategies(java.util.List<CustomExtractionStrategy> customExtractionStrategies) {
            this.customExtractionStrategies = customExtractionStrategies;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * extractionStrategies.
         */
        public Builder extractionStrategies(java.util.List<String> extractionStrategies) {
            this.extractionStrategies = extractionStrategies;
            return this;
        }

        /**
         * memoryStoreName.
         */
        public Builder memoryStoreName(String memoryStoreName) {
            this.memoryStoreName = memoryStoreName;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * shortTermStorage.
         */
        public Builder shortTermStorage(ShortTermStorage shortTermStorage) {
            this.shortTermStorage = shortTermStorage;
            return this;
        }

        /**
         * shortTermTtl.
         */
        public Builder shortTermTtl(Integer shortTermTtl) {
            this.shortTermTtl = shortTermTtl;
            return this;
        }

        /**
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * traceSourceConfig.
         */
        public Builder traceSourceConfig(TraceSourceConfig traceSourceConfig) {
            this.traceSourceConfig = traceSourceConfig;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>1764556182850</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetMemoryStoreResponseBody build() {
            return new GetMemoryStoreResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMemoryStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryStoreResponseBody</p>
     */
    public static class ShortTermStorage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        private ShortTermStorage(Builder builder) {
            this.logstore = builder.logstore;
            this.project = builder.project;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShortTermStorage create() {
            return builder().build();
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        public static final class Builder {
            private String logstore; 
            private String project; 

            private Builder() {
            } 

            private Builder(ShortTermStorage model) {
                this.logstore = model.logstore;
                this.project = model.project;
            } 

            /**
             * logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            public ShortTermStorage build() {
                return new ShortTermStorage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMemoryStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetMemoryStoreResponseBody</p>
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
             * includeOutput.
             */
            public Builder includeOutput(Boolean includeOutput) {
                this.includeOutput = includeOutput;
                return this;
            }

            /**
             * query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * workspace.
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
