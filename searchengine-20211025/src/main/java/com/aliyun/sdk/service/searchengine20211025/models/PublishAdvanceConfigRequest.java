// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishAdvanceConfigRequest} extends {@link RequestModel}
 *
 * <p>PublishAdvanceConfigRequest</p>
 */
public class PublishAdvanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List < Files> files;

    private PublishAdvanceConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.configName = builder.configName;
        this.desc = builder.desc;
        this.files = builder.files;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishAdvanceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return files
     */
    public java.util.List < Files> getFiles() {
        return this.files;
    }

    public static final class Builder extends Request.Builder<PublishAdvanceConfigRequest, Builder> {
        private String instanceId; 
        private String configName; 
        private String desc; 
        private java.util.List < Files> files; 

        private Builder() {
            super();
        } 

        private Builder(PublishAdvanceConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.configName = request.configName;
            this.desc = request.desc;
            this.files = request.files;
        } 

        /**
         * The ID of the instance
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the configuration
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.putBodyParameter("desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * files.
         */
        public Builder files(java.util.List < Files> files) {
            this.putBodyParameter("files", files);
            this.files = files;
            return this;
        }

        @Override
        public PublishAdvanceConfigRequest build() {
            return new PublishAdvanceConfigRequest(this);
        } 

    } 

    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.Map < String, FilesConfigVariablesValue > variables;

        private Config(Builder builder) {
            this.content = builder.content;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return variables
         */
        public java.util.Map < String, FilesConfigVariablesValue > getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String content; 
            private java.util.Map < String, FilesConfigVariablesValue > variables; 

            /**
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * variables.
             */
            public Builder variables(java.util.Map < String, FilesConfigVariablesValue > variables) {
                this.variables = variables;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("dirName")
        private String dirName;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("operateType")
        private String operateType;

        @com.aliyun.core.annotation.NameInMap("ossPath")
        private String ossPath;

        @com.aliyun.core.annotation.NameInMap("parentFullPath")
        private String parentFullPath;

        private Files(Builder builder) {
            this.config = builder.config;
            this.dirName = builder.dirName;
            this.fileName = builder.fileName;
            this.operateType = builder.operateType;
            this.ossPath = builder.ossPath;
            this.parentFullPath = builder.parentFullPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return dirName
         */
        public String getDirName() {
            return this.dirName;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        /**
         * @return ossPath
         */
        public String getOssPath() {
            return this.ossPath;
        }

        /**
         * @return parentFullPath
         */
        public String getParentFullPath() {
            return this.parentFullPath;
        }

        public static final class Builder {
            private Config config; 
            private String dirName; 
            private String fileName; 
            private String operateType; 
            private String ossPath; 
            private String parentFullPath; 

            /**
             * config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * dirName.
             */
            public Builder dirName(String dirName) {
                this.dirName = dirName;
                return this;
            }

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * operateType.
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * ossPath.
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * parentFullPath.
             */
            public Builder parentFullPath(String parentFullPath) {
                this.parentFullPath = parentFullPath;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
