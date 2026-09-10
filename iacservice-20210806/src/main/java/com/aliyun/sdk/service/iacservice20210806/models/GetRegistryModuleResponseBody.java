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
 * {@link GetRegistryModuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegistryModuleResponseBody</p>
 */
public class GetRegistryModuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("registryModule")
    private RegistryModule registryModule;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetRegistryModuleResponseBody(Builder builder) {
        this.registryModule = builder.registryModule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegistryModuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registryModule
     */
    public RegistryModule getRegistryModule() {
        return this.registryModule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RegistryModule registryModule; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRegistryModuleResponseBody model) {
            this.registryModule = model.registryModule;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Registry module.</p>
         */
        public Builder registryModule(RegistryModule registryModule) {
            this.registryModule = registryModule;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5B5AD471-5036-581B-AC9B-7D5EECED877A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRegistryModuleResponseBody build() {
            return new GetRegistryModuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRegistryModuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegistryModuleResponseBody</p>
     */
    public static class RegistryModule extends TeaModel {
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

        private RegistryModule(Builder builder) {
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

        public static RegistryModule create() {
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

            private Builder(RegistryModule model) {
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
             * <p>The permission. Valid values:</p>
             * <ul>
             * <li>private: private.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-28 13:39:05</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The module description.</p>
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
             * <p>23</p>
             */
            public Builder downloads(Integer downloads) {
                this.downloads = downloads;
                return this;
            }

            /**
             * <p>The module name.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-cluster</p>
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
             * <p>The provider type. Valid values:</p>
             * <ul>
             * <li>alicloud: Alibaba Cloud.</li>
             * </ul>
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
             * <p>The module source, which is a concatenation of <NamespaceName>/<ModuleName>.</p>
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
             * <p>The workspace type. Valid values:</p>
             * <ul>
             * <li>system: public module</li>
             * <li>self: custom module</li>
             * <li>shared: shared module</li>
             * <li>community: community module.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The latest version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public RegistryModule build() {
                return new RegistryModule(this);
            } 

        } 

    }
}
