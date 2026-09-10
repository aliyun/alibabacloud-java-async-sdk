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
         * <p>The list of Explorer community module examples.</p>
         */
        public Builder explorerRegistryModuleExamples(java.util.List<ExplorerRegistryModuleExamples> explorerRegistryModuleExamples) {
            this.explorerRegistryModuleExamples = explorerRegistryModuleExamples;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * <p>Valid values: 0 to 200.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page of results.</p>
         * <p>If the total number of entries exceeds the maxResults limit, the data is truncated. You can use nextToken to query the next page of data.</p>
         * 
         * <strong>example:</strong>
         * <p>VSjwD+sJ8OZJ8fNjV89AZs7o2AdSD25ZQLeWZ8REjXA=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BA8F6459-EED6-556B-8130-D150A3866E56</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
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
             * <p>The example name.</p>
             * 
             * <strong>example:</strong>
             * <p>201-use-case-create-actiontrail-trail</p>
             */
            public Builder exampleName(String exampleName) {
                this.exampleName = exampleName;
                return this;
            }

            /**
             * <p>The example path.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder examplePath(String examplePath) {
                this.examplePath = examplePath;
                return this;
            }

            /**
             * <p>The example schema.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder exampleSchema(java.util.Map<String, ?> exampleSchema) {
                this.exampleSchema = exampleSchema;
                return this;
            }

            /**
             * <p>The module name.</p>
             * 
             * <strong>example:</strong>
             * <p>iactestname1</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The module version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.11.0</p>
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * <p>The workspace name.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
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
