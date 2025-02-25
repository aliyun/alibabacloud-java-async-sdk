// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GeneratePictureUploadSignResponseBody} extends {@link TeaModel}
 *
 * <p>GeneratePictureUploadSignResponseBody</p>
 */
public class GeneratePictureUploadSignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GeneratePictureUploadSignResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeneratePictureUploadSignResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GeneratePictureUploadSignResponseBody build() {
            return new GeneratePictureUploadSignResponseBody(this);
        } 

    } 

    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("fileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("fileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        private Files(Builder builder) {
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.fileType = builder.fileType;
            this.key = builder.key;
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
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String fileName; 
            private Long fileSize; 
            private String fileType; 
            private String key; 

            /**
             * fileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * fileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * fileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * oss key
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("bucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("files")
        private java.util.List < Files> files;

        @com.aliyun.core.annotation.NameInMap("policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Data(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.bucketName = builder.bucketName;
            this.files = builder.files;
            this.policy = builder.policy;
            this.signature = builder.signature;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return files
         */
        public java.util.List < Files> getFiles() {
            return this.files;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String bucketName; 
            private java.util.List < Files> files; 
            private String policy; 
            private String signature; 
            private String url; 

            /**
             * accessKeyId
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * oss bucket name
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * files
             */
            public Builder files(java.util.List < Files> files) {
                this.files = files;
                return this;
            }

            /**
             * policy
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * signature
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * url
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
