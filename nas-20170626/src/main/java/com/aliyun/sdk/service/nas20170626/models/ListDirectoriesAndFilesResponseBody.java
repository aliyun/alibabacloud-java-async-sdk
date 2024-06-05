// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDirectoriesAndFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDirectoriesAndFilesResponseBody</p>
 */
public class ListDirectoriesAndFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entries")
    private java.util.List < Entries> entries;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The details about the files or directories.
         */
        public Builder entries(java.util.List < Entries> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
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

        public ListDirectoriesAndFilesResponseBody build() {
            return new ListDirectoriesAndFilesResponseBody(this);
        } 

    } 

    public static class Entries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Atime")
        private String atime;

        @com.aliyun.core.annotation.NameInMap("Ctime")
        private String ctime;

        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("HasArchiveFile")
        private String hasArchiveFile;

        @com.aliyun.core.annotation.NameInMap("HasInfrequentAccessFile")
        private Boolean hasInfrequentAccessFile;

        @com.aliyun.core.annotation.NameInMap("Inode")
        private String inode;

        @com.aliyun.core.annotation.NameInMap("Mtime")
        private String mtime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RetrieveTime")
        private String retrieveTime;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Entries(Builder builder) {
            this.atime = builder.atime;
            this.ctime = builder.ctime;
            this.fileId = builder.fileId;
            this.hasArchiveFile = builder.hasArchiveFile;
            this.hasInfrequentAccessFile = builder.hasInfrequentAccessFile;
            this.inode = builder.inode;
            this.mtime = builder.mtime;
            this.name = builder.name;
            this.owner = builder.owner;
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
         * @return hasArchiveFile
         */
        public String getHasArchiveFile() {
            return this.hasArchiveFile;
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
         * @return owner
         */
        public String getOwner() {
            return this.owner;
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
            private String hasArchiveFile; 
            private Boolean hasInfrequentAccessFile; 
            private String inode; 
            private String mtime; 
            private String name; 
            private String owner; 
            private String retrieveTime; 
            private Long size; 
            private String storageType; 
            private String type; 

            /**
             * The time when the file was queried.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.
             * 
             * This parameter is returned and valid only if the value of the Type parameter is File.
             */
            public Builder atime(String atime) {
                this.atime = atime;
                return this;
            }

            /**
             * The time when the raw data was modified.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.
             * 
             * This parameter is returned and valid only if the value of the Type parameter is File.
             */
            public Builder ctime(String ctime) {
                this.ctime = ctime;
                return this;
            }

            /**
             * The ID of the directory or file.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * HasArchiveFile.
             */
            public Builder hasArchiveFile(String hasArchiveFile) {
                this.hasArchiveFile = hasArchiveFile;
                return this;
            }

            /**
             * Indicates whether the directory contains files stored in the IA storage medium.
             * <p>
             * 
             * This parameter is returned and valid only if the value of the Type parameter is Directory.
             * 
             * Valid values:
             * 
             * *   true: The directory contains files stored in the IA storage medium.
             * *   false: The directory does not contain files stored in the IA storage medium.
             */
            public Builder hasInfrequentAccessFile(Boolean hasInfrequentAccessFile) {
                this.hasInfrequentAccessFile = hasInfrequentAccessFile;
                return this;
            }

            /**
             * The file or directory inode.
             */
            public Builder inode(String inode) {
                this.inode = inode;
                return this;
            }

            /**
             * The time when the file was modified.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.
             * 
             * This parameter is returned and valid only if the value of the Type parameter is File.
             */
            public Builder mtime(String mtime) {
                this.mtime = mtime;
                return this;
            }

            /**
             * The name of the file or directory.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the portable account. This parameter is returned and valid only if the value of the ProtocolType parameter is SMB and RAM-based access control is enabled.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The time when the last data retrieval task was run.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format.
             * 
             * This parameter is returned and valid only if the value of the Type parameter is File.
             */
            public Builder retrieveTime(String retrieveTime) {
                this.retrieveTime = retrieveTime;
                return this;
            }

            /**
             * The size of the file.
             * <p>
             * 
             * Unit: bytes.
             * 
             * This parameter is returned and valid only if the value of the Type parameter is File.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The storage type of the file.
             * <p>
             * 
             * This parameter is returned and valid only if the value of the Type parameter is File.
             * 
             * Valid values:
             * 
             * *   InfrequentAccess: IA storage medium
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * The type of the query result.
             * <p>
             * 
             * Valid values:
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
