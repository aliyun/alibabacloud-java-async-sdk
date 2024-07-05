// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFpShotFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFpShotFilesResponseBody</p>
 */
public class ListFpShotFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FpShotFileList")
    private FpShotFileList fpShotFileList;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFpShotFilesResponseBody(Builder builder) {
        this.fpShotFileList = builder.fpShotFileList;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFpShotFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return fpShotFileList
     */
    public FpShotFileList getFpShotFileList() {
        return this.fpShotFileList;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FpShotFileList fpShotFileList; 
        private String nextPageToken; 
        private String requestId; 

        /**
         * The media fingerprint files. For more information, see the "FpShotFile" section of the [Data types](~~29251~~) topic.
         */
        public Builder fpShotFileList(FpShotFileList fpShotFileList) {
            this.fpShotFileList = fpShotFileList;
            return this;
        }

        /**
         * The returned value of NextPageToken is a pagination token, which can be used in the next request to retrieve a new page of results.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFpShotFilesResponseBody build() {
            return new ListFpShotFilesResponseBody(this);
        } 

    } 

    public static class InputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private InputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * The name of the OSS bucket in which the input file is stored.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The ID of the OSS region in which the input file resides.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the OSS object that is used as the input file.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public InputFile build() {
                return new InputFile(this);
            } 

        } 

    }
    public static class FpShotFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("InputFile")
        private InputFile inputFile;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private String primaryKey;

        @com.aliyun.core.annotation.NameInMap("StoreTime")
        private String storeTime;

        private FpShotFile(Builder builder) {
            this.fileId = builder.fileId;
            this.inputFile = builder.inputFile;
            this.primaryKey = builder.primaryKey;
            this.storeTime = builder.storeTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotFile create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return inputFile
         */
        public InputFile getInputFile() {
            return this.inputFile;
        }

        /**
         * @return primaryKey
         */
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        /**
         * @return storeTime
         */
        public String getStoreTime() {
            return this.storeTime;
        }

        public static final class Builder {
            private String fileId; 
            private InputFile inputFile; 
            private String primaryKey; 
            private String storeTime; 

            /**
             * The ID of the video file.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * The information about the input file.
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * The unique primary key of the input video.
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            /**
             * The time when the media fingerprint file was stored. The time follows the ISO 8601 standard in the `YYYY-MM-DDThh:mm:ssZ` format. The time is displayed in UTC.
             * <p>
             * 
             * > This parameter is available only in the China (Beijing), China (Hangzhou), and China (Shanghai) regions.
             */
            public Builder storeTime(String storeTime) {
                this.storeTime = storeTime;
                return this;
            }

            public FpShotFile build() {
                return new FpShotFile(this);
            } 

        } 

    }
    public static class FpShotFileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpShotFile")
        private java.util.List < FpShotFile> fpShotFile;

        private FpShotFileList(Builder builder) {
            this.fpShotFile = builder.fpShotFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotFileList create() {
            return builder().build();
        }

        /**
         * @return fpShotFile
         */
        public java.util.List < FpShotFile> getFpShotFile() {
            return this.fpShotFile;
        }

        public static final class Builder {
            private java.util.List < FpShotFile> fpShotFile; 

            /**
             * FpShotFile.
             */
            public Builder fpShotFile(java.util.List < FpShotFile> fpShotFile) {
                this.fpShotFile = fpShotFile;
                return this;
            }

            public FpShotFileList build() {
                return new FpShotFileList(this);
            } 

        } 

    }
}
