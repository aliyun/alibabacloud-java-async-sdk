// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListExplorerRegistryModuleExamplesResponseBody} extends {@link TeaModel}
 *
 * <p>ListExplorerRegistryModuleExamplesResponseBody</p>
 */
public class ListExplorerRegistryModuleExamplesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("explorerRegistryModuleExamples")
    private java.util.List<ExplorerRegistryModuleExamples> explorerRegistryModuleExamples;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListExplorerRegistryModuleExamplesResponseBody(Builder builder) {
        this.explorerRegistryModuleExamples = builder.explorerRegistryModuleExamples;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExplorerRegistryModuleExamplesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return explorerRegistryModuleExamples
     */
    public java.util.List<ExplorerRegistryModuleExamples> getExplorerRegistryModuleExamples() {
        return this.explorerRegistryModuleExamples;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<ExplorerRegistryModuleExamples> explorerRegistryModuleExamples; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListExplorerRegistryModuleExamplesResponseBody model) {
            this.explorerRegistryModuleExamples = model.explorerRegistryModuleExamples;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * explorerRegistryModuleExamples.
         */
        public Builder explorerRegistryModuleExamples(java.util.List<ExplorerRegistryModuleExamples> explorerRegistryModuleExamples) {
            this.explorerRegistryModuleExamples = explorerRegistryModuleExamples;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExplorerRegistryModuleExamplesResponseBody build() {
            return new ListExplorerRegistryModuleExamplesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExplorerRegistryModuleExamplesResponseBody} extends {@link TeaModel}
     *
     * <p>ListExplorerRegistryModuleExamplesResponseBody</p>
     */
    public static class ExplorerRegistryModuleExamples extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("exampleName")
        private String exampleName;

        @com.aliyun.core.annotation.NameInMap("examplePath")
        private String examplePath;

        @com.aliyun.core.annotation.NameInMap("exampleSchema")
        private java.util.Map<String, ?> exampleSchema;

        @com.aliyun.core.annotation.NameInMap("moduleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("namespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private ExplorerRegistryModuleExamples(Builder builder) {
            this.exampleName = builder.exampleName;
            this.examplePath = builder.examplePath;
            this.exampleSchema = builder.exampleSchema;
            this.moduleName = builder.moduleName;
            this.moduleVersion = builder.moduleVersion;
            this.namespaceName = builder.namespaceName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExplorerRegistryModuleExamples create() {
            return builder().build();
        }

        /**
         * @return exampleName
         */
        public String getExampleName() {
            return this.exampleName;
        }

        /**
         * @return examplePath
         */
        public String getExamplePath() {
            return this.examplePath;
        }

        /**
         * @return exampleSchema
         */
        public java.util.Map<String, ?> getExampleSchema() {
            return this.exampleSchema;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return moduleVersion
         */
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String exampleName; 
            private String examplePath; 
            private java.util.Map<String, ?> exampleSchema; 
            private String moduleName; 
            private String moduleVersion; 
            private String namespaceName; 
            private String status; 

            private Builder() {
            } 

            private Builder(ExplorerRegistryModuleExamples model) {
                this.exampleName = model.exampleName;
                this.examplePath = model.examplePath;
                this.exampleSchema = model.exampleSchema;
                this.moduleName = model.moduleName;
                this.moduleVersion = model.moduleVersion;
                this.namespaceName = model.namespaceName;
                this.status = model.status;
            } 

            /**
             * exampleName.
             */
            public Builder exampleName(String exampleName) {
                this.exampleName = exampleName;
                return this;
            }

            /**
             * examplePath.
             */
            public Builder examplePath(String examplePath) {
                this.examplePath = examplePath;
                return this;
            }

            /**
             * exampleSchema.
             */
            public Builder exampleSchema(java.util.Map<String, ?> exampleSchema) {
                this.exampleSchema = exampleSchema;
                return this;
            }

            /**
             * moduleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * moduleVersion.
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * namespaceName.
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ExplorerRegistryModuleExamples build() {
                return new ExplorerRegistryModuleExamples(this);
            } 

        } 

    }
}
