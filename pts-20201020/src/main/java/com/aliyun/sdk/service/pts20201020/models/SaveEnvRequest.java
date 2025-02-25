// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveEnvRequest} extends {@link RequestModel}
 *
 * <p>SaveEnvRequest</p>
 */
public class SaveEnvRequest extends Request {
    @Query
    @NameInMap("Env")
    @Validation(required = true)
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
         * Env.
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

    public static class Files extends TeaModel {
        @NameInMap("FileName")
        @Validation(required = true, maxLength = 100, minLength = 1)
        private String fileName;

        @NameInMap("FileOssAddress")
        @Validation(required = true, maxLength = 200, minLength = 1)
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

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileOssAddress.
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
    public static class Properties extends TeaModel {
        @NameInMap("Description")
        @Validation(maxLength = 1024)
        private String description;

        @NameInMap("Name")
        @Validation(maxLength = 1024, minLength = 1)
        private String name;

        @NameInMap("Value")
        @Validation(maxLength = 1024, minLength = 1)
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

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
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
    public static class Env extends TeaModel {
        @NameInMap("EnvId")
        @Validation(maxLength = 20)
        private String envId;

        @NameInMap("EnvName")
        @Validation(required = true, maxLength = 50, minLength = 1)
        private String envName;

        @NameInMap("Files")
        @Validation(required = true)
        private java.util.List < Files> files;

        @NameInMap("JmeterPluginLabel")
        @Validation(maxLength = 32)
        private String jmeterPluginLabel;

        @NameInMap("Properties")
        private java.util.List < Properties> properties;

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
        public java.util.List < Files> getFiles() {
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
        public java.util.List < Properties> getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String envId; 
            private String envName; 
            private java.util.List < Files> files; 
            private String jmeterPluginLabel; 
            private java.util.List < Properties> properties; 

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * EnvName.
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * Files.
             */
            public Builder files(java.util.List < Files> files) {
                this.files = files;
                return this;
            }

            /**
             * JmeterPluginLabel.
             */
            public Builder jmeterPluginLabel(String jmeterPluginLabel) {
                this.jmeterPluginLabel = jmeterPluginLabel;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.List < Properties> properties) {
                this.properties = properties;
                return this;
            }

            public Env build() {
                return new Env(this);
            } 

        } 

    }
}
