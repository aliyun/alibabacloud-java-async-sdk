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
 * {@link ListRegistryModuleVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRegistryModuleVersionsResponseBody</p>
 */
public class ListRegistryModuleVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("moduleVersions")
    private java.util.List<ModuleVersions> moduleVersions;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListRegistryModuleVersionsResponseBody(Builder builder) {
        this.count = builder.count;
        this.maxResults = builder.maxResults;
        this.moduleVersions = builder.moduleVersions;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegistryModuleVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return moduleVersions
     */
    public java.util.List<ModuleVersions> getModuleVersions() {
        return this.moduleVersions;
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

    public static final class Builder {
        private Long count; 
        private Integer maxResults; 
        private java.util.List<ModuleVersions> moduleVersions; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListRegistryModuleVersionsResponseBody model) {
            this.count = model.count;
            this.maxResults = model.maxResults;
            this.moduleVersions = model.moduleVersions;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
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
         * moduleVersions.
         */
        public Builder moduleVersions(java.util.List<ModuleVersions> moduleVersions) {
            this.moduleVersions = moduleVersions;
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

        public ListRegistryModuleVersionsResponseBody build() {
            return new ListRegistryModuleVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRegistryModuleVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRegistryModuleVersionsResponseBody</p>
     */
    public static class ModuleVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("moduleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("namespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourceUrl")
        private String sourceUrl;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private ModuleVersions(Builder builder) {
            this.createTime = builder.createTime;
            this.moduleName = builder.moduleName;
            this.namespaceName = builder.namespaceName;
            this.provider = builder.provider;
            this.source = builder.source;
            this.sourceUrl = builder.sourceUrl;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleVersions create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceUrl
         */
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String createTime; 
            private String moduleName; 
            private String namespaceName; 
            private String provider; 
            private String source; 
            private String sourceUrl; 
            private String version; 

            private Builder() {
            } 

            private Builder(ModuleVersions model) {
                this.createTime = model.createTime;
                this.moduleName = model.moduleName;
                this.namespaceName = model.namespaceName;
                this.provider = model.provider;
                this.source = model.source;
                this.sourceUrl = model.sourceUrl;
                this.version = model.version;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
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
             * sourceUrl.
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ModuleVersions build() {
                return new ModuleVersions(this);
            } 

        } 

    }
}
