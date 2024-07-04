// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModuleVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetModuleVersionResponseBody</p>
 */
public class GetModuleVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("version")
    private Version version;

    private GetModuleVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModuleVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return version
     */
    public Version getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String requestId; 
        private Version version; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * version.
         */
        public Builder version(Version version) {
            this.version = version;
            return this;
        }

        public GetModuleVersionResponseBody build() {
            return new GetModuleVersionResponseBody(this);
        } 

    } 

    public static class Version extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourcePath")
        private String sourcePath;

        @com.aliyun.core.annotation.NameInMap("statePath")
        private String statePath;

        @com.aliyun.core.annotation.NameInMap("terraformContext")
        private java.util.Map < String, ? > terraformContext;

        @com.aliyun.core.annotation.NameInMap("versionStrategy")
        private String versionStrategy;

        private Version(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.moduleId = builder.moduleId;
            this.moduleVersion = builder.moduleVersion;
            this.name = builder.name;
            this.source = builder.source;
            this.sourcePath = builder.sourcePath;
            this.statePath = builder.statePath;
            this.terraformContext = builder.terraformContext;
            this.versionStrategy = builder.versionStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Version create() {
            return builder().build();
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
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleVersion
         */
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        /**
         * @return statePath
         */
        public String getStatePath() {
            return this.statePath;
        }

        /**
         * @return terraformContext
         */
        public java.util.Map < String, ? > getTerraformContext() {
            return this.terraformContext;
        }

        /**
         * @return versionStrategy
         */
        public String getVersionStrategy() {
            return this.versionStrategy;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String moduleId; 
            private String moduleVersion; 
            private String name; 
            private String source; 
            private String sourcePath; 
            private String statePath; 
            private java.util.Map < String, ? > terraformContext; 
            private String versionStrategy; 

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
             * moduleId.
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * moduleVersion.
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * sourcePath.
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * statePath.
             */
            public Builder statePath(String statePath) {
                this.statePath = statePath;
                return this;
            }

            /**
             * terraformContext.
             */
            public Builder terraformContext(java.util.Map < String, ? > terraformContext) {
                this.terraformContext = terraformContext;
                return this;
            }

            /**
             * versionStrategy.
             */
            public Builder versionStrategy(String versionStrategy) {
                this.versionStrategy = versionStrategy;
                return this;
            }

            public Version build() {
                return new Version(this);
            } 

        } 

    }
}
