// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvsResponseBody</p>
 */
public class ListEnvsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Envs")
    private java.util.List < Envs> envs;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
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

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return envs
     */
    public java.util.List < Envs> getEnvs() {
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
        private java.util.List < Envs> envs; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Envs.
         */
        public Builder envs(java.util.List < Envs> envs) {
            this.envs = envs;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEnvsResponseBody build() {
            return new ListEnvsResponseBody(this);
        } 

    } 

    public static class Files extends TeaModel {
        @NameInMap("FileId")
        private Long fileId;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileOssAddress")
        private String fileOssAddress;

        @NameInMap("FileSize")
        private Long fileSize;

        @NameInMap("Md5")
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

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

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

            /**
             * FileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * Md5.
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
    public static class Properties extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
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
    public static class Envs extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("EnvName")
        private String envName;

        @NameInMap("EnvVersion")
        private String envVersion;

        @NameInMap("Files")
        private java.util.List < Files> files;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("Properties")
        private java.util.List < Properties> properties;

        @NameInMap("RelatedScenes")
        private java.util.List < String > relatedScenes;

        @NameInMap("RunningScenes")
        private java.util.List < String > runningScenes;

        @NameInMap("UsedCapacity")
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
        public java.util.List < Files> getFiles() {
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
        public java.util.List < Properties> getProperties() {
            return this.properties;
        }

        /**
         * @return relatedScenes
         */
        public java.util.List < String > getRelatedScenes() {
            return this.relatedScenes;
        }

        /**
         * @return runningScenes
         */
        public java.util.List < String > getRunningScenes() {
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
            private java.util.List < Files> files; 
            private Long modifiedTime; 
            private java.util.List < Properties> properties; 
            private java.util.List < String > relatedScenes; 
            private java.util.List < String > runningScenes; 
            private Long usedCapacity; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

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
             * EnvVersion.
             */
            public Builder envVersion(String envVersion) {
                this.envVersion = envVersion;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.List < Properties> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * RelatedScenes.
             */
            public Builder relatedScenes(java.util.List < String > relatedScenes) {
                this.relatedScenes = relatedScenes;
                return this;
            }

            /**
             * RunningScenes.
             */
            public Builder runningScenes(java.util.List < String > runningScenes) {
                this.runningScenes = runningScenes;
                return this;
            }

            /**
             * UsedCapacity.
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
