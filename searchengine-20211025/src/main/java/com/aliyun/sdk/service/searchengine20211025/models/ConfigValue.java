// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ConfigValue} extends {@link TeaModel}
 *
 * <p>ConfigValue</p>
 */
public class ConfigValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List<Files> files;

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
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    public static final class Builder {
        private String desc; 
        private java.util.List<Files> files; 

        /**
         * <p>The description of the offline configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * <p>The files to be modified.</p>
         */
        public Builder files(java.util.List<Files> files) {
            this.files = files;
            return this;
        }

        public ConfigValue build() {
            return new ConfigValue(this);
        } 

    } 

    /**
     * 
     * {@link ConfigValue} extends {@link TeaModel}
     *
     * <p>ConfigValue</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.Map<String, ConfigValueFilesConfigVariablesValue> variables;

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
        public java.util.Map<String, ConfigValueFilesConfigVariablesValue> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String content; 
            private java.util.Map<String, ConfigValueFilesConfigVariablesValue> variables; 

            /**
             * <p>The file content.</p>
             * 
             * <strong>example:</strong>
             * <p>$dictContent</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The variables.</p>
             */
            public Builder variables(java.util.Map<String, ConfigValueFilesConfigVariablesValue> variables) {
                this.variables = variables;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConfigValue} extends {@link TeaModel}
     *
     * <p>ConfigValue</p>
     */
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
             * <p>The operation type. Valid values: UPDATE and DELETE. Default value: UPDATE.</p>
             * 
             * <strong>example:</strong>
             * <p>UPDATE</p>
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * <p>The path of the parent directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/</p>
             */
            public Builder parentFullPath(String parentFullPath) {
                this.parentFullPath = parentFullPath;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>/intervene_dict/中文-通用分析器.dict</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The configuration to be modified.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The directory name.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
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
