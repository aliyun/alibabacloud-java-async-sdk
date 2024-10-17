// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details about the files or directories.</p>
         */
        public Builder entries(java.util.List < Entries> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDirectoriesAndFilesResponseBody build() {
            return new ListDirectoriesAndFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDirectoriesAndFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDirectoriesAndFilesResponseBody</p>
     */
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
             * <p>The time when the file was queried.</p>
             * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
             * <p>This parameter is returned and valid only if the value of the Type parameter is File.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-01T10:08:08Z</p>
             */
            public Builder atime(String atime) {
                this.atime = atime;
                return this;
            }

            /**
             * <p>The time when the raw data was modified.</p>
             * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
             * <p>This parameter is returned and valid only if the value of the Type parameter is File.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-11T10:08:10Z</p>
             */
            public Builder ctime(String ctime) {
                this.ctime = ctime;
                return this;
            }

            /**
             * <p>The ID of the directory or file.</p>
             * 
             * <strong>example:</strong>
             * <p>66</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>Indicates whether the directory contains files stored in the Archive storage class.</p>
             * <p>This parameter is returned and valid only if the value of the Type parameter is Directory.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: The directory contains files stored in the Archive storage class.</li>
             * <li>false: The directory does not contain files stored in the Archive storage class.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasArchiveFile(String hasArchiveFile) {
                this.hasArchiveFile = hasArchiveFile;
                return this;
            }

            /**
             * <p>Indicates whether the directory contains files stored in the IA storage class.</p>
             * <p>This parameter is returned and valid only if the value of the Type parameter is Directory.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: The directory contains files stored in the IA storage class.</li>
             * <li>false: The directory does not contain files stored in the IA storage class.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasInfrequentAccessFile(Boolean hasInfrequentAccessFile) {
                this.hasInfrequentAccessFile = hasInfrequentAccessFile;
                return this;
            }

            /**
             * <p>The file or directory inode.</p>
             * 
             * <strong>example:</strong>
             * <p>66</p>
             */
            public Builder inode(String inode) {
                this.inode = inode;
                return this;
            }

            /**
             * <p>The time when the file was modified.</p>
             * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
             * <p>This parameter is returned and valid only if the value of the Type parameter is File.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-11T10:08:08Z</p>
             */
            public Builder mtime(String mtime) {
                this.mtime = mtime;
                return this;
            }

            /**
             * <p>The name of the file or directory.</p>
             * 
             * <strong>example:</strong>
             * <p>file.txt</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the portable account. This parameter is returned and valid only if the value of the ProtocolType parameter is SMB and RAM-based access control is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>37862c****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The time when the last data retrieval task was run.</p>
             * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
             * <p>This parameter is returned and valid only if the value of the Type parameter is File.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-11T10:08:08Z</p>
             */
            public Builder retrieveTime(String retrieveTime) {
                this.retrieveTime = retrieveTime;
                return this;
            }

            /**
             * <p>The size of the file.</p>
             * <p>Unit: bytes.</p>
             * <p>This parameter is returned and valid only if the value of the Type parameter is File.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The storage class.</p>
             * <p>This parameter is returned and valid only if the value of the Type parameter is File.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>InfrequentAccess: the IA storage class.</li>
             * <li>Archive: the Archive storage class.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InfrequentAccess</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The type of the query result.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>File</li>
             * <li>Directory</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Directory</p>
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
