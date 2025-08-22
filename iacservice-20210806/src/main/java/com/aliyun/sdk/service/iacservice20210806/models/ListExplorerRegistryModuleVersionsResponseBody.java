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
         * explorerRegistryModuleVersions.
         */
        public Builder explorerRegistryModuleVersions(java.util.List<ExplorerRegistryModuleVersions> explorerRegistryModuleVersions) {
            this.explorerRegistryModuleVersions = explorerRegistryModuleVersions;
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
             * moduleDetail.
             */
            public Builder moduleDetail(java.util.Map<String, ?> moduleDetail) {
                this.moduleDetail = moduleDetail;
                return this;
            }

            /**
             * moduleFile.
             */
            public Builder moduleFile(java.util.Map<String, ?> moduleFile) {
                this.moduleFile = moduleFile;
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
             * namespaceName.
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * properties.
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * version.
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
