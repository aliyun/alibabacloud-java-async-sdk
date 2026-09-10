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
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>173</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next page. A value of null indicates that no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>iRdnbADPQp4dD+2BRJj42DLT6GrZysw=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of Registry modules.</p>
         */
        public Builder registryModules(java.util.List<RegistryModules> registryModules) {
            this.registryModules = registryModules;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D25216A9-C0F7-5A3A-A7E4-2B3D4F3A355D</p>
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
             * <p>The permission. private: private.</p>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * <p>The creation time in the format of YYYY-MM-DD HH:mm:ss. The returned value does not include a time zone identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-10 16:16:04</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the Registry module.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The number of downloads.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder downloads(Integer downloads) {
                this.downloads = downloads;
                return this;
            }

            /**
             * <p>The name of the Registry module.</p>
             * 
             * <strong>example:</strong>
             * <p>ModuleName</p>
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * <p>The workspace name.</p>
             * 
             * <strong>example:</strong>
             * <p>NamespaceName</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * <p>The provider type. alicloud: Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>alicloud</p>
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * <p>The list of accounts with which the Registry module is shared.</p>
             */
            public Builder sharedAccounts(java.util.List<Long> sharedAccounts) {
                this.sharedAccounts = sharedAccounts;
                return this;
            }

            /**
             * <p>The module source.</p>
             * 
             * <strong>example:</strong>
             * <p>namespaceName/ModuleName</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The module source URL.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            /**
             * <p>The templatetype.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The latest version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
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
