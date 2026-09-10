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
 * {@link ListExplorerRegistryModulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListExplorerRegistryModulesResponseBody</p>
 */
public class ListExplorerRegistryModulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("explorerRegistryModules")
    private java.util.List<ExplorerRegistryModules> explorerRegistryModules;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListExplorerRegistryModulesResponseBody(Builder builder) {
        this.explorerRegistryModules = builder.explorerRegistryModules;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExplorerRegistryModulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return explorerRegistryModules
     */
    public java.util.List<ExplorerRegistryModules> getExplorerRegistryModules() {
        return this.explorerRegistryModules;
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
        private java.util.List<ExplorerRegistryModules> explorerRegistryModules; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListExplorerRegistryModulesResponseBody model) {
            this.explorerRegistryModules = model.explorerRegistryModules;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of Explorer community modules.</p>
         */
        public Builder explorerRegistryModules(java.util.List<ExplorerRegistryModules> explorerRegistryModules) {
            this.explorerRegistryModules = explorerRegistryModules;
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
         * <p>DxEkv+3w0EDAQgcRFBp8Ep4dD+2BRJj42DLT6GrZysw=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A662F56-CA76-55F6-869D-7F26293B8E67</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>170</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExplorerRegistryModulesResponseBody build() {
            return new ListExplorerRegistryModulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExplorerRegistryModulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListExplorerRegistryModulesResponseBody</p>
     */
    public static class ExplorerRegistryModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("downloads")
        private Long downloads;

        @com.aliyun.core.annotation.NameInMap("latestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("moduleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("namespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private ExplorerRegistryModules(Builder builder) {
            this.description = builder.description;
            this.downloads = builder.downloads;
            this.latestVersion = builder.latestVersion;
            this.moduleName = builder.moduleName;
            this.namespaceName = builder.namespaceName;
            this.source = builder.source;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExplorerRegistryModules create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return downloads
         */
        public Long getDownloads() {
            return this.downloads;
        }

        /**
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
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
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private Long downloads; 
            private String latestVersion; 
            private String moduleName; 
            private String namespaceName; 
            private String source; 
            private String status; 

            private Builder() {
            } 

            private Builder(ExplorerRegistryModules model) {
                this.description = model.description;
                this.downloads = model.downloads;
                this.latestVersion = model.latestVersion;
                this.moduleName = model.moduleName;
                this.namespaceName = model.namespaceName;
                this.source = model.source;
                this.status = model.status;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The number of downloads.</p>
             * 
             * <strong>example:</strong>
             * <p>34</p>
             */
            public Builder downloads(Long downloads) {
                this.downloads = downloads;
                return this;
            }

            /**
             * <p>The latest version number.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
                return this;
            }

            /**
             * <p>The module name.</p>
             * 
             * <strong>example:</strong>
             * <p>terraform-alicloud-modules/mongodb</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The workspace name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_namespace</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * <p>The source.</p>
             * 
             * <strong>example:</strong>
             * <p>terraform-alicloud-modules/mongodb/alicloud</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ExplorerRegistryModules build() {
                return new ExplorerRegistryModules(this);
            } 

        } 

    }
}
