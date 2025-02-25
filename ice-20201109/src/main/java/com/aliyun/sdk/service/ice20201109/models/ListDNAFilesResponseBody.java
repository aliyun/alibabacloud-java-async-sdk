// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListDNAFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDNAFilesResponseBody</p>
 */
public class ListDNAFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileList")
    private java.util.List<FileList> fileList;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<FileList> getFileList() {
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
        private java.util.List<FileList> fileList; 
        private String nextPageToken; 
        private String requestId; 

        /**
         * <p>The queried files.</p>
         */
        public Builder fileList(java.util.List<FileList> fileList) {
            this.fileList = fileList;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>ae0fd49c0840e14daf0d66a75b83****</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2AE89FA5-E620-56C7-9B80-75D09757385A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDNAFilesResponseBody build() {
            return new ListDNAFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDNAFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDNAFilesResponseBody</p>
     */
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
             * <p>The name of the OSS bucket in which the input file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The OSS region in which the input file resides.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-beijing</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the input file.</p>
             * 
             * <strong>example:</strong>
             * <p>example-****.mp4</p>
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
    /**
     * 
     * {@link ListDNAFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDNAFilesResponseBody</p>
     */
    public static class FileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputFile")
        private InputFile inputFile;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
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
             * <p>The Object Storage Service (OSS) information about the input file.</p>
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * <p>The primary key of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>ae0fd49c0840e14daf0d66a75b83****</p>
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
