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
 * {@link ListEnvsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvsResponseBody</p>
 */
public class ListEnvsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.List<Envs> envs;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListEnvsResponseBody(Builder builder) {
        this.code = builder.code;
        this.envs = builder.envs;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return envs
     */
    public java.util.List<Envs> getEnvs() {
        return this.envs;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Envs> envs; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListEnvsResponseBody model) {
            this.code = model.code;
            this.envs = model.envs;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The system status code. If the operation is successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The environments.</p>
         */
        public Builder envs(java.util.List<Envs> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * <p>The HTTP status code. If the operation is successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message. If the operation is successful, this parameter is not returned.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of environments per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of environments.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEnvsResponseBody build() {
            return new ListEnvsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnvsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvsResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileOssAddress")
        private String fileOssAddress;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        private Files(Builder builder) {
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.fileOssAddress = builder.fileOssAddress;
            this.fileSize = builder.fileSize;
            this.md5 = builder.md5;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
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

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        public static final class Builder {
            private Long fileId; 
            private String fileName; 
            private String fileOssAddress; 
            private Long fileSize; 
            private String md5; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.fileOssAddress = model.fileOssAddress;
                this.fileSize = model.fileSize;
                this.md5 = model.md5;
            } 

            /**
             * <p>The ID of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>61660</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>json.jar</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The OSS address of the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://test.oss-cn-shanghai.aliyuncs.com/json.jar">https://test.oss-cn-shanghai.aliyuncs.com/json.jar</a></p>
             */
            public Builder fileOssAddress(String fileOssAddress) {
                this.fileOssAddress = fileOssAddress;
                return this;
            }

            /**
             * <p>The size of the file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>788</p>
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The MD5 checksum of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>43B584026CE5E570F3DE638FA7EEF9E0</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEnvsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvsResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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
     * {@link ListEnvsResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnvsResponseBody</p>
     */
    public static class Envs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EnvId")
        private String envId;

        @com.aliyun.core.annotation.NameInMap("EnvName")
        private String envName;

        @com.aliyun.core.annotation.NameInMap("EnvVersion")
        private String envVersion;

        @com.aliyun.core.annotation.NameInMap("Files")
        private java.util.List<Files> files;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.List<Properties> properties;

        @com.aliyun.core.annotation.NameInMap("RelatedScenes")
        private java.util.List<String> relatedScenes;

        @com.aliyun.core.annotation.NameInMap("RunningScenes")
        private java.util.List<String> runningScenes;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Long usedCapacity;

        private Envs(Builder builder) {
            this.createTime = builder.createTime;
            this.envId = builder.envId;
            this.envName = builder.envName;
            this.envVersion = builder.envVersion;
            this.files = builder.files;
            this.modifiedTime = builder.modifiedTime;
            this.properties = builder.properties;
            this.relatedScenes = builder.relatedScenes;
            this.runningScenes = builder.runningScenes;
            this.usedCapacity = builder.usedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Envs create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return envVersion
         */
        public String getEnvVersion() {
            return this.envVersion;
        }

        /**
         * @return files
         */
        public java.util.List<Files> getFiles() {
            return this.files;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return properties
         */
        public java.util.List<Properties> getProperties() {
            return this.properties;
        }

        /**
         * @return relatedScenes
         */
        public java.util.List<String> getRelatedScenes() {
            return this.relatedScenes;
        }

        /**
         * @return runningScenes
         */
        public java.util.List<String> getRunningScenes() {
            return this.runningScenes;
        }

        /**
         * @return usedCapacity
         */
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        public static final class Builder {
            private Long createTime; 
            private String envId; 
            private String envName; 
            private String envVersion; 
            private java.util.List<Files> files; 
            private Long modifiedTime; 
            private java.util.List<Properties> properties; 
            private java.util.List<String> relatedScenes; 
            private java.util.List<String> runningScenes; 
            private Long usedCapacity; 

            private Builder() {
            } 

            private Builder(Envs model) {
                this.createTime = model.createTime;
                this.envId = model.envId;
                this.envName = model.envName;
                this.envVersion = model.envVersion;
                this.files = model.files;
                this.modifiedTime = model.modifiedTime;
                this.properties = model.properties;
                this.relatedScenes = model.relatedScenes;
                this.runningScenes = model.runningScenes;
                this.usedCapacity = model.usedCapacity;
            } 

            /**
             * <p>The time when the environment was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1637053715165</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>86S1LH</p>
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * <p>The name of the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>test-create</p>
             */
            public Builder envName(String envName) {
                this.envName = envName;
                return this;
            }

            /**
             * <p>The JMeter version of the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>5.0</p>
             */
            public Builder envVersion(String envVersion) {
                this.envVersion = envVersion;
                return this;
            }

            /**
             * <p>The JAR files.</p>
             */
            public Builder files(java.util.List<Files> files) {
                this.files = files;
                return this;
            }

            /**
             * <p>The time when the environment was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1637053719165</p>
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The JMeter attributes.</p>
             */
            public Builder properties(java.util.List<Properties> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The scenarios related to the environment.</p>
             */
            public Builder relatedScenes(java.util.List<String> relatedScenes) {
                this.relatedScenes = relatedScenes;
                return this;
            }

            /**
             * <p>The IDs of the scenarios that run in the environment.</p>
             */
            public Builder runningScenes(java.util.List<String> runningScenes) {
                this.runningScenes = runningScenes;
                return this;
            }

            /**
             * <p>The total size of the environment file.</p>
             * 
             * <strong>example:</strong>
             * <p>26668</p>
             */
            public Builder usedCapacity(Long usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            public Envs build() {
                return new Envs(this);
            } 

        } 

    }
}
