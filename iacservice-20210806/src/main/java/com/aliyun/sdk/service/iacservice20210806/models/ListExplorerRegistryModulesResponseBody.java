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
         * explorerRegistryModules.
         */
        public Builder explorerRegistryModules(java.util.List<ExplorerRegistryModules> explorerRegistryModules) {
            this.explorerRegistryModules = explorerRegistryModules;
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
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * downloads.
             */
            public Builder downloads(Long downloads) {
                this.downloads = downloads;
                return this;
            }

            /**
             * latestVersion.
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
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
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * status.
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
