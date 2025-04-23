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
 * {@link GetModuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetModuleResponseBody</p>
 */
public class GetModuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetModuleResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Module module; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetModuleResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1E7BA3EB-B0EF-53F5-9999-07CAD6D9F8A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetModuleResponseBody build() {
            return new GetModuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetModuleResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("latestVersion")
        private String latestVersion;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("outputPath")
        private String outputPath;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourcePath")
        private String sourcePath;

        @com.aliyun.core.annotation.NameInMap("statePath")
        private String statePath;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("versionStrategy")
        private String versionStrategy;

        private Module(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.latestVersion = builder.latestVersion;
            this.moduleId = builder.moduleId;
            this.name = builder.name;
            this.outputPath = builder.outputPath;
            this.source = builder.source;
            this.sourcePath = builder.sourcePath;
            this.statePath = builder.statePath;
            this.status = builder.status;
            this.versionStrategy = builder.versionStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
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
         * @return latestVersion
         */
        public String getLatestVersion() {
            return this.latestVersion;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputPath
         */
        public String getOutputPath() {
            return this.outputPath;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private String latestVersion; 
            private String moduleId; 
            private String name; 
            private String outputPath; 
            private String source; 
            private String sourcePath; 
            private String statePath; 
            private String status; 
            private String versionStrategy; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.latestVersion = model.latestVersion;
                this.moduleId = model.moduleId;
                this.name = model.name;
                this.outputPath = model.outputPath;
                this.source = model.source;
                this.sourcePath = model.sourcePath;
                this.statePath = model.statePath;
                this.status = model.status;
                this.versionStrategy = model.versionStrategy;
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
             * latestVersion.
             */
            public Builder latestVersion(String latestVersion) {
                this.latestVersion = latestVersion;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * outputPath.
             */
            public Builder outputPath(String outputPath) {
                this.outputPath = outputPath;
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * versionStrategy.
             */
            public Builder versionStrategy(String versionStrategy) {
                this.versionStrategy = versionStrategy;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
