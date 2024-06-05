// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecycledDirectoriesAndFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecycledDirectoriesAndFilesResponseBody</p>
 */
public class ListRecycledDirectoriesAndFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entries")
    private java.util.List < Entries> entries;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRecycledDirectoriesAndFilesResponseBody(Builder builder) {
        this.entries = builder.entries;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecycledDirectoriesAndFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return entries
     */
    public java.util.List < Entries> getEntries() {
        return this.entries;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Entries> entries; 
        private String nextToken; 
        private String requestId; 

        /**
         * The information about files or directories in the recycle bin.
         */
        public Builder entries(java.util.List < Entries> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * A pagination token.
         * <p>
         * 
         * If all the files and directories are incompletely returned in a query, the return value of the NextToken parameter is not empty. In this case, you can specify a valid value for the NextToken parameter to continue the query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRecycledDirectoriesAndFilesResponseBody build() {
            return new ListRecycledDirectoriesAndFilesResponseBody(this);
        } 

    } 

    public static class Entries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ATime")
        private String aTime;

        @com.aliyun.core.annotation.NameInMap("CTime")
        private String cTime;

        @com.aliyun.core.annotation.NameInMap("DeleteTime")
        private String deleteTime;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("Inode")
        private String inode;

        @com.aliyun.core.annotation.NameInMap("MTime")
        private String mTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Entries(Builder builder) {
            this.aTime = builder.aTime;
            this.cTime = builder.cTime;
            this.deleteTime = builder.deleteTime;
            this.fileId = builder.fileId;
            this.inode = builder.inode;
            this.mTime = builder.mTime;
            this.name = builder.name;
            this.size = builder.size;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entries create() {
            return builder().build();
        }

        /**
         * @return aTime
         */
        public String getATime() {
            return this.aTime;
        }

        /**
         * @return cTime
         */
        public String getCTime() {
            return this.cTime;
        }

        /**
         * @return deleteTime
         */
        public String getDeleteTime() {
            return this.deleteTime;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return inode
         */
        public String getInode() {
            return this.inode;
        }

        /**
         * @return mTime
         */
        public String getMTime() {
            return this.mTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aTime; 
            private String cTime; 
            private String deleteTime; 
            private String fileId; 
            private String inode; 
            private String mTime; 
            private String name; 
            private Long size; 
            private String type; 

            /**
             * The time when the file or directory was last accessed.
             */
            public Builder aTime(String aTime) {
                this.aTime = aTime;
                return this;
            }

            /**
             * The time when the metadata was last modified.
             */
            public Builder cTime(String cTime) {
                this.cTime = cTime;
                return this;
            }

            /**
             * The time when the file or directory was deleted.
             */
            public Builder deleteTime(String deleteTime) {
                this.deleteTime = deleteTime;
                return this;
            }

            /**
             * The IDs of the files or directories.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * The inode of the file or directory.
             */
            public Builder inode(String inode) {
                this.inode = inode;
                return this;
            }

            /**
             * The time when the file or directory was last modified.
             */
            public Builder mTime(String mTime) {
                this.mTime = mTime;
                return this;
            }

            /**
             * The name of the file or directory before it was deleted.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The size of the file. Unit: bytes.
             * <p>
             * 
             * The value 0 is returned for this parameter if Directory is returned for the Type parameter.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The type of the returned object. Valid values:
             * <p>
             * 
             * *   File
             * *   Directory
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Entries build() {
                return new Entries(this);
            } 

        } 

    }
}
