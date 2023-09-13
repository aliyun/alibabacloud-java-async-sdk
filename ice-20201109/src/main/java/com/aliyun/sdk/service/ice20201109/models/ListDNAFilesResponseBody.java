// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDNAFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDNAFilesResponseBody</p>
 */
public class ListDNAFilesResponseBody extends TeaModel {
    @NameInMap("FileList")
    private java.util.List < FileList> fileList;

    @NameInMap("NextPageToken")
    private String nextPageToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListDNAFilesResponseBody(Builder builder) {
        this.fileList = builder.fileList;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDNAFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileList
     */
    public java.util.List < FileList> getFileList() {
        return this.fileList;
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
        private java.util.List < FileList> fileList; 
        private String nextPageToken; 
        private String requestId; 

        /**
         * FileList.
         */
        public Builder fileList(java.util.List < FileList> fileList) {
            this.fileList = fileList;
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

        public ListDNAFilesResponseBody build() {
            return new ListDNAFilesResponseBody(this);
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
    public static class FileList extends TeaModel {
        @NameInMap("InputFile")
        private InputFile inputFile;

        @NameInMap("PrimaryKey")
        private String primaryKey;

        private FileList(Builder builder) {
            this.inputFile = builder.inputFile;
            this.primaryKey = builder.primaryKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileList create() {
            return builder().build();
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
            private InputFile inputFile; 
            private String primaryKey; 

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

            public FileList build() {
                return new FileList(this);
            } 

        } 

    }
}
