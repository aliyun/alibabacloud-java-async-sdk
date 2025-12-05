// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link SaveEnvRequest} extends {@link RequestModel}
 *
 * <p>SaveEnvRequest</p>
 */
public class SaveEnvRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    @com.aliyun.core.annotation.Validation(required = true)
    private Env env;

    private SaveEnvRequest(Builder builder) {
        super(builder);
        this.env = builder.env;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveEnvRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return env
     */
    public Env getEnv() {
        return this.env;
    }

    public static final class Builder extends Request.Builder<SaveEnvRequest, Builder> {
        private Env env; 

        private Builder() {
            super();
        } 

        private Builder(SaveEnvRequest request) {
            super(request);
            this.env = request.env;
        } 

        /**
         * <p>The JMeter environment.</p>
         * <p>This parameter is required.</p>
         */
        public Builder env(Env env) {
            String envShrink = shrink(env, "Env", "json");
            this.putQueryParameter("Env", envShrink);
            this.env = env;
            return this;
        }

        @Override
        public SaveEnvRequest build() {
            return new SaveEnvRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveEnvRequest} extends {@link TeaModel}
     *
     * <p>SaveEnvRequest</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileName")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 100, minLength = 1)
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileOssAddress")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 200, minLength = 1)
        private String fileOssAddress;

        private Files(Builder builder) {
            this.fileName = builder.fileName;
            this.fileOssAddress = builder.fileOssAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileOssAddress
         */
        public String getFileOssAddress() {
            return this.fileOssAddress;
        }

        public static final class Builder {
            private String fileName; 
            private String fileOssAddress; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.fileName = model.fileName;
                this.fileOssAddress = model.fileOssAddress;
            } 

            /**
             * <p>The name of the file. Make sure that the file name is the same as the file name in the value of <strong>FileOssAddress</strong>.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>json.jar</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) URL of the file. Make sure that the file is accessible from the Internet.</p>
             * <blockquote>
             * <p> Only OSS URLs in the China (Shanghai) region are supported.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/json.jar">https://test.oss-cn-shanghai.aliyuncs.com/json.jar</a></p>
             */
            public Builder fileOssAddress(String fileOssAddress) {
                this.fileOssAddress = fileOssAddress;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link SaveEnvRequest} extends {@link TeaModel}
     *
     * <p>SaveEnvRequest</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        @com.aliyun.core.annotation.Validation(maxLength = 1024)
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(maxLength = 1024, minLength = 1)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(maxLength = 1024, minLength = 1)
        private String value;

        private Properties(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Properties model) {
                this.description = model.description;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The description of the attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>远程主机</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>remote_hosts</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the attribute.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link SaveEnvRequest} extends {@link TeaModel}
     *
     * <p>SaveEnvRequest</p>
     */
    public static class Env extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnvId")
        @com.aliyun.core.annotation.Validation(maxLength = 20)
        private String envId;

        @com.aliyun.core.annotation.NameInMap("EnvName")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 50, minLength = 1)
        private String envName;

        @com.aliyun.core.annotation.NameInMap("Files")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Files> files;

        @com.aliyun.core.annotation.NameInMap("JmeterPluginLabel")
        @com.aliyun.core.annotation.Validation(maxLength = 32)
        private String jmeterPluginLabel;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.List<Properties> properties;

        private Env(Builder builder) {
            this.envId = builder.envId;
            this.envName = builder.envName;
            this.files = builder.files;
            this.jmeterPluginLabel = builder.jmeterPluginLabel;
            this.properties = builder.properties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Env create() {
            return builder().build();
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return envName
         */
        public String getEnvName() {
            return this.envName;
        }

        /**
         * @return files
         */
        public java.util.List<Files> getFiles() {
            return this.files;
        }

        /**
         * @return jmeterPluginLabel
         */
        public String getJmeterPluginLabel() {
            return this.jmeterPluginLabel;
        }

        /**
         * @return properties
         */
        public java.util.List<Properties> getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String envId; 
            private String envName; 
            private java.util.List<Files> files; 
            private String jmeterPluginLabel; 
            private java.util.List<Properties> properties; 

            private Builder() {
            } 

            private Builder(Env model) {
                this.envId = model.envId;
                this.envName = model.envName;
                this.files = model.files;
                this.jmeterPluginLabel = model.jmeterPluginLabel;
                this.properties = model.properties;
            } 

            /**
             * <p>The ID of the JMeter environment. To create a JMeter environment, leave this parameter empty. To update a JMeter environment, specify the ID of the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>10YPA8H</p>
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * <p>The name of the environment.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test-create</p>
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * <p>The files on which the environment depends.</p>
             * <p>This parameter is required.</p>
             */
            public Builder files(java.util.List<Files> files) {
                this.files = files;
                return this;
            }

            /**
             * <p>The extension label.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder jmeterPluginLabel(String jmeterPluginLabel) {
                this.jmeterPluginLabel = jmeterPluginLabel;
                return this;
            }

            /**
             * <p>The JMeter attributes.</p>
             */
            public Builder properties(java.util.List<Properties> properties) {
                this.properties = properties;
                return this;
            }

            public Env build() {
                return new Env(this);
            } 

        } 

    }
}
