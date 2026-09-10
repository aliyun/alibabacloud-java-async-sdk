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
 * {@link ListExplorerRegistryModuleVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListExplorerRegistryModuleVersionsResponseBody</p>
 */
public class ListExplorerRegistryModuleVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("explorerRegistryModuleVersions")
    private java.util.List<ExplorerRegistryModuleVersions> explorerRegistryModuleVersions;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListExplorerRegistryModuleVersionsResponseBody(Builder builder) {
        this.explorerRegistryModuleVersions = builder.explorerRegistryModuleVersions;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExplorerRegistryModuleVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return explorerRegistryModuleVersions
     */
    public java.util.List<ExplorerRegistryModuleVersions> getExplorerRegistryModuleVersions() {
        return this.explorerRegistryModuleVersions;
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
        private java.util.List<ExplorerRegistryModuleVersions> explorerRegistryModuleVersions; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListExplorerRegistryModuleVersionsResponseBody model) {
            this.explorerRegistryModuleVersions = model.explorerRegistryModuleVersions;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of Explorer community module versions.</p>
         */
        public Builder explorerRegistryModuleVersions(java.util.List<ExplorerRegistryModuleVersions> explorerRegistryModuleVersions) {
            this.explorerRegistryModuleVersions = explorerRegistryModuleVersions;
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
         * <p>oIM6ssGyh00noi5zoDR1hJ4dD+2BRJj42DLT6GrZysw=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F2D40488-3F74-568B-87EC-1C04D098DF8B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExplorerRegistryModuleVersionsResponseBody build() {
            return new ListExplorerRegistryModuleVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExplorerRegistryModuleVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListExplorerRegistryModuleVersionsResponseBody</p>
     */
    public static class ExplorerRegistryModuleVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("moduleDetail")
        private java.util.Map<String, ?> moduleDetail;

        @com.aliyun.core.annotation.NameInMap("moduleFile")
        private java.util.Map<String, ?> moduleFile;

        @com.aliyun.core.annotation.NameInMap("moduleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("namespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("properties")
        private java.util.Map<String, ?> properties;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private ExplorerRegistryModuleVersions(Builder builder) {
            this.moduleDetail = builder.moduleDetail;
            this.moduleFile = builder.moduleFile;
            this.moduleName = builder.moduleName;
            this.namespaceName = builder.namespaceName;
            this.properties = builder.properties;
            this.source = builder.source;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExplorerRegistryModuleVersions create() {
            return builder().build();
        }

        /**
         * @return moduleDetail
         */
        public java.util.Map<String, ?> getModuleDetail() {
            return this.moduleDetail;
        }

        /**
         * @return moduleFile
         */
        public java.util.Map<String, ?> getModuleFile() {
            return this.moduleFile;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return properties
         */
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.Map<String, ?> moduleDetail; 
            private java.util.Map<String, ?> moduleFile; 
            private String moduleName; 
            private String namespaceName; 
            private java.util.Map<String, ?> properties; 
            private String source; 
            private String version; 

            private Builder() {
            } 

            private Builder(ExplorerRegistryModuleVersions model) {
                this.moduleDetail = model.moduleDetail;
                this.moduleFile = model.moduleFile;
                this.moduleName = model.moduleName;
                this.namespaceName = model.namespaceName;
                this.properties = model.properties;
                this.source = model.source;
                this.version = model.version;
            } 

            /**
             * <p>The module details.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder moduleDetail(java.util.Map<String, ?> moduleDetail) {
                this.moduleDetail = moduleDetail;
                return this;
            }

            /**
             * <p>The module file.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder moduleFile(java.util.Map<String, ?> moduleFile) {
                this.moduleFile = moduleFile;
                return this;
            }

            /**
             * <p>The module name.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-slb-ecs-polardb</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The workspace name.</p>
             * 
             * <strong>example:</strong>
             * <p>namespace-test</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * <p>The resource properties.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The source.</p>
             * 
             * <strong>example:</strong>
             * <p>test_namespace/RegistryModule-test4</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.5.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ExplorerRegistryModuleVersions build() {
                return new ExplorerRegistryModuleVersions(this);
            } 

        } 

    }
}
