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
 * {@link ListRegistryModulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRegistryModulesResponseBody</p>
 */
public class ListRegistryModulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("registryModules")
    private java.util.List<RegistryModules> registryModules;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListRegistryModulesResponseBody(Builder builder) {
        this.count = builder.count;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.registryModules = builder.registryModules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegistryModulesResponseBody create() {
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return registryModules
     */
    public java.util.List<RegistryModules> getRegistryModules() {
        return this.registryModules;
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
        private String nextToken; 
        private java.util.List<RegistryModules> registryModules; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListRegistryModulesResponseBody model) {
            this.count = model.count;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.registryModules = model.registryModules;
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
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * registryModules.
         */
        public Builder registryModules(java.util.List<RegistryModules> registryModules) {
            this.registryModules = registryModules;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRegistryModulesResponseBody build() {
            return new ListRegistryModulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRegistryModulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRegistryModulesResponseBody</p>
     */
    public static class RegistryModules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acl")
        private String acl;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("downloads")
        private Integer downloads;

        @com.aliyun.core.annotation.NameInMap("moduleName")
        private String moduleName;

        @com.aliyun.core.annotation.NameInMap("namespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("sharedAccounts")
        private java.util.List<Long> sharedAccounts;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourceUrl")
        private String sourceUrl;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private RegistryModules(Builder builder) {
            this.acl = builder.acl;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.downloads = builder.downloads;
            this.moduleName = builder.moduleName;
            this.namespaceName = builder.namespaceName;
            this.provider = builder.provider;
            this.sharedAccounts = builder.sharedAccounts;
            this.source = builder.source;
            this.sourceUrl = builder.sourceUrl;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegistryModules create() {
            return builder().build();
        }

        /**
         * @return acl
         */
        public String getAcl() {
            return this.acl;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
        public Integer getDownloads() {
            return this.downloads;
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
         * @return sharedAccounts
         */
        public java.util.List<Long> getSharedAccounts() {
            return this.sharedAccounts;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String acl; 
            private String createTime; 
            private String description; 
            private Integer downloads; 
            private String moduleName; 
            private String namespaceName; 
            private String provider; 
            private java.util.List<Long> sharedAccounts; 
            private String source; 
            private String sourceUrl; 
            private String type; 
            private String version; 

            private Builder() {
            } 

            private Builder(RegistryModules model) {
                this.acl = model.acl;
                this.createTime = model.createTime;
                this.description = model.description;
                this.downloads = model.downloads;
                this.moduleName = model.moduleName;
                this.namespaceName = model.namespaceName;
                this.provider = model.provider;
                this.sharedAccounts = model.sharedAccounts;
                this.source = model.source;
                this.sourceUrl = model.sourceUrl;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * acl.
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * downloads.
             */
            public Builder downloads(Integer downloads) {
                this.downloads = downloads;
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
             * sharedAccounts.
             */
            public Builder sharedAccounts(java.util.List<Long> sharedAccounts) {
                this.sharedAccounts = sharedAccounts;
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
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public RegistryModules build() {
                return new RegistryModules(this);
            } 

        } 

    }
}
