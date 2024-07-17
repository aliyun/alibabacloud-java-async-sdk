// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigValue} extends {@link TeaModel}
 *
 * <p>ConfigValue</p>
 */
public class ConfigValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List < Files> files;

    private ConfigValue(Builder builder) {
        this.desc = builder.desc;
        this.files = builder.files;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigValue create() {
        return builder().build();
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

    public static final class Builder {
        private String desc; 
        private java.util.List < Files> files; 

        /**
         * The description of the offline configuration.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * The files to be modified.
         */
        public Builder files(java.util.List < Files> files) {
            this.files = files;
            return this;
        }

        public ConfigValue build() {
            return new ConfigValue(this);
        } 

    } 

    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.Map < String, ConfigValueFilesConfigVariablesValue > variables;

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
        public java.util.Map < String, ConfigValueFilesConfigVariablesValue > getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String content; 
            private java.util.Map < String, ConfigValueFilesConfigVariablesValue > variables; 

            /**
             * The file content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The variables.
             */
            public Builder variables(java.util.Map < String, ConfigValueFilesConfigVariablesValue > variables) {
                this.variables = variables;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operateType")
        private String operateType;

        @com.aliyun.core.annotation.NameInMap("parentFullPath")
        private String parentFullPath;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("dirName")
        private String dirName;

        private Files(Builder builder) {
            this.operateType = builder.operateType;
            this.parentFullPath = builder.parentFullPath;
            this.fileName = builder.fileName;
            this.config = builder.config;
            this.dirName = builder.dirName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        /**
         * @return parentFullPath
         */
        public String getParentFullPath() {
            return this.parentFullPath;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
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

        public static final class Builder {
            private String operateType; 
            private String parentFullPath; 
            private String fileName; 
            private Config config; 
            private String dirName; 

            /**
             * The operation type. Valid values: UPDATE and DELETE. Default value: UPDATE.
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * The path of the parent directory.
             */
            public Builder parentFullPath(String parentFullPath) {
                this.parentFullPath = parentFullPath;
                return this;
            }

            /**
             * The file name.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The configuration to be modified.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * The directory name.
             */
            public Builder dirName(String dirName) {
                this.dirName = dirName;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
