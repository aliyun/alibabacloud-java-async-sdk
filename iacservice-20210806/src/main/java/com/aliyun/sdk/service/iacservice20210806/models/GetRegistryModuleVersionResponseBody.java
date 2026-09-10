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
 * {@link GetRegistryModuleVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegistryModuleVersionResponseBody</p>
 */
public class GetRegistryModuleVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("moduleVersion")
    private ModuleVersion moduleVersion;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetRegistryModuleVersionResponseBody(Builder builder) {
        this.moduleVersion = builder.moduleVersion;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegistryModuleVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moduleVersion
     */
    public ModuleVersion getModuleVersion() {
        return this.moduleVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ModuleVersion moduleVersion; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRegistryModuleVersionResponseBody model) {
            this.moduleVersion = model.moduleVersion;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The version information.</p>
         */
        public Builder moduleVersion(ModuleVersion moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>62DF26B0-53F0-5747-9D7F-FEF444FB4E24</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRegistryModuleVersionResponseBody build() {
            return new GetRegistryModuleVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRegistryModuleVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegistryModuleVersionResponseBody</p>
     */
    public static class ModuleVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("detailUrl")
        private String detailUrl;

        @com.aliyun.core.annotation.NameInMap("downloads")
        private String downloads;

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

        private ModuleVersion(Builder builder) {
            this.createTime = builder.createTime;
            this.detailUrl = builder.detailUrl;
            this.downloads = builder.downloads;
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

        public static ModuleVersion create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return detailUrl
         */
        public String getDetailUrl() {
            return this.detailUrl;
        }

        /**
         * @return downloads
         */
        public String getDownloads() {
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
            private String detailUrl; 
            private String downloads; 
            private String moduleName; 
            private String namespaceName; 
            private String provider; 
            private String source; 
            private String sourceUrl; 
            private String version; 

            private Builder() {
            } 

            private Builder(ModuleVersion model) {
                this.createTime = model.createTime;
                this.detailUrl = model.detailUrl;
                this.downloads = model.downloads;
                this.moduleName = model.moduleName;
                this.namespaceName = model.namespaceName;
                this.provider = model.provider;
                this.source = model.source;
                this.sourceUrl = model.sourceUrl;
                this.version = model.version;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-08T02:22:16Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The product page URL.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder detailUrl(String detailUrl) {
                this.detailUrl = detailUrl;
                return this;
            }

            /**
             * <p>The number of downloads.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder downloads(String downloads) {
                this.downloads = downloads;
                return this;
            }

            /**
             * <p>The template name.</p>
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
             * <p>alibabacloud</p>
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
             * <p>The template source.</p>
             * 
             * <strong>example:</strong>
             * <p>namespaceName/ModuleName</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The template source URL.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ModuleVersion build() {
                return new ModuleVersion(this);
            } 

        } 

    }
}
