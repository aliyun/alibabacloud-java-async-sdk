// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFpShotFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFpShotFilesResponseBody</p>
 */
public class ListFpShotFilesResponseBody extends TeaModel {
    @NameInMap("FpShotFileList")
    private FpShotFileList fpShotFileList;

    @NameInMap("NextPageToken")
    private String nextPageToken;

    @NameInMap("RequestId")
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
         * FpShotFileList.
         */
        public Builder fpShotFileList(FpShotFileList fpShotFileList) {
            this.fpShotFileList = fpShotFileList;
            return this;
        }

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
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
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
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
        @NameInMap("FileId")
        private String fileId;

        @NameInMap("InputFile")
        private InputFile inputFile;

        @NameInMap("PrimaryKey")
        private String primaryKey;

        private FpShotFile(Builder builder) {
            this.fileId = builder.fileId;
            this.inputFile = builder.inputFile;
            this.primaryKey = builder.primaryKey;
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

        public static final class Builder {
            private String fileId; 
            private InputFile inputFile; 
            private String primaryKey; 

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * InputFile.
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * PrimaryKey.
             */
            public Builder primaryKey(String primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            public FpShotFile build() {
                return new FpShotFile(this);
            } 

        } 

    }
    public static class FpShotFileList extends TeaModel {
        @NameInMap("FpShotFile")
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
