// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDirectoriesAndFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDirectoriesAndFilesResponseBody</p>
 */
public class ListDirectoriesAndFilesResponseBody extends TeaModel {
    @NameInMap("Entries")
    private java.util.List < Entries> entries;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private ListDirectoriesAndFilesResponseBody(Builder builder) {
        this.entries = builder.entries;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDirectoriesAndFilesResponseBody create() {
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
         * Entries.
         */
        public Builder entries(java.util.List < Entries> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDirectoriesAndFilesResponseBody build() {
            return new ListDirectoriesAndFilesResponseBody(this);
        } 

    } 

    public static class Entries extends TeaModel {
        @NameInMap("Atime")
        private String atime;

        @NameInMap("Ctime")
        private String ctime;

        @NameInMap("FileId")
        private String fileId;

        @NameInMap("HasInfrequentAccessFile")
        private Boolean hasInfrequentAccessFile;

        @NameInMap("Inode")
        private String inode;

        @NameInMap("Mtime")
        private String mtime;

        @NameInMap("Name")
        private String name;

        @NameInMap("RetrieveTime")
        private String retrieveTime;

        @NameInMap("Size")
        private Long size;

        @NameInMap("StorageType")
        private String storageType;

        @NameInMap("Type")
        private String type;

        private Entries(Builder builder) {
            this.atime = builder.atime;
            this.ctime = builder.ctime;
            this.fileId = builder.fileId;
            this.hasInfrequentAccessFile = builder.hasInfrequentAccessFile;
            this.inode = builder.inode;
            this.mtime = builder.mtime;
            this.name = builder.name;
            this.retrieveTime = builder.retrieveTime;
            this.size = builder.size;
            this.storageType = builder.storageType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entries create() {
            return builder().build();
        }

        /**
         * @return atime
         */
        public String getAtime() {
            return this.atime;
        }

        /**
         * @return ctime
         */
        public String getCtime() {
            return this.ctime;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return hasInfrequentAccessFile
         */
        public Boolean getHasInfrequentAccessFile() {
            return this.hasInfrequentAccessFile;
        }

        /**
         * @return inode
         */
        public String getInode() {
            return this.inode;
        }

        /**
         * @return mtime
         */
        public String getMtime() {
            return this.mtime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return retrieveTime
         */
        public String getRetrieveTime() {
            return this.retrieveTime;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String atime; 
            private String ctime; 
            private String fileId; 
            private Boolean hasInfrequentAccessFile; 
            private String inode; 
            private String mtime; 
            private String name; 
            private String retrieveTime; 
            private Long size; 
            private String storageType; 
            private String type; 

            /**
             * Atime.
             */
            public Builder atime(String atime) {
                this.atime = atime;
                return this;
            }

            /**
             * Ctime.
             */
            public Builder ctime(String ctime) {
                this.ctime = ctime;
                return this;
            }

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * HasInfrequentAccessFile.
             */
            public Builder hasInfrequentAccessFile(Boolean hasInfrequentAccessFile) {
                this.hasInfrequentAccessFile = hasInfrequentAccessFile;
                return this;
            }

            /**
             * Inode.
             */
            public Builder inode(String inode) {
                this.inode = inode;
                return this;
            }

            /**
             * Mtime.
             */
            public Builder mtime(String mtime) {
                this.mtime = mtime;
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
             * RetrieveTime.
             */
            public Builder retrieveTime(String retrieveTime) {
                this.retrieveTime = retrieveTime;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * Type.
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
