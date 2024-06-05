// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectoryOrFilePropertiesResponseBody} extends {@link TeaModel}
 *
 * <p>GetDirectoryOrFilePropertiesResponseBody</p>
 */
public class GetDirectoryOrFilePropertiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entry")
    private Entry entry;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDirectoryOrFilePropertiesResponseBody(Builder builder) {
        this.entry = builder.entry;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDirectoryOrFilePropertiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return entry
     */
    public Entry getEntry() {
        return this.entry;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Entry entry; 
        private String requestId; 

        /**
         * The details about the file or directory.
         */
        public Builder entry(Entry entry) {
            this.entry = entry;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDirectoryOrFilePropertiesResponseBody build() {
            return new GetDirectoryOrFilePropertiesResponseBody(this);
        } 

    } 

    public static class Entry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ATime")
        private String aTime;

        @com.aliyun.core.annotation.NameInMap("CTime")
        private String cTime;

        @com.aliyun.core.annotation.NameInMap("HasArchiveFile")
        private Boolean hasArchiveFile;

        @com.aliyun.core.annotation.NameInMap("HasInfrequentAccessFile")
        private Boolean hasInfrequentAccessFile;

        @com.aliyun.core.annotation.NameInMap("Inode")
        private String inode;

        @com.aliyun.core.annotation.NameInMap("MTime")
        private String mTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RetrieveTime")
        private String retrieveTime;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Entry(Builder builder) {
            this.aTime = builder.aTime;
            this.cTime = builder.cTime;
            this.hasArchiveFile = builder.hasArchiveFile;
            this.hasInfrequentAccessFile = builder.hasInfrequentAccessFile;
            this.inode = builder.inode;
            this.mTime = builder.mTime;
            this.name = builder.name;
            this.retrieveTime = builder.retrieveTime;
            this.size = builder.size;
            this.storageType = builder.storageType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entry create() {
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
         * @return hasArchiveFile
         */
        public Boolean getHasArchiveFile() {
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
            private String aTime; 
            private String cTime; 
            private Boolean hasArchiveFile; 
            private Boolean hasInfrequentAccessFile; 
            private String inode; 
            private String mTime; 
            private String name; 
            private String retrieveTime; 
            private Long size; 
            private String storageType; 
            private String type; 

            /**
             * The time when the file was queried.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.
             * 
             * This parameter is returned only if the value of the Type parameter is File.
             */
            public Builder aTime(String aTime) {
                this.aTime = aTime;
                return this;
            }

            /**
             * The time when the raw data was modified.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.
             * 
             * This parameter is returned only if the value of the Type parameter is File.
             */
            public Builder cTime(String cTime) {
                this.cTime = cTime;
                return this;
            }

            /**
             * HasArchiveFile.
             */
            public Builder hasArchiveFile(Boolean hasArchiveFile) {
                this.hasArchiveFile = hasArchiveFile;
                return this;
            }

            /**
             * Indicates whether the directory contains files stored in the IA storage medium.
             * <p>
             * 
             * This parameter is returned only if the value of the Type parameter is Directory.
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
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.
             * 
             * This parameter is returned only if the value of the Type parameter is File.
             */
            public Builder mTime(String mTime) {
                this.mTime = mTime;
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
             * The time when the last data retrieval task was run.
             * <p>
             * 
             * The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.
             * 
             * This parameter is returned only if the value of the Type parameter is File.
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
             * This parameter is returned only if the value of the Type parameter is File.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The storage type of the file.
             * <p>
             * 
             * This parameter is returned only if the value of the Type parameter is File.
             * 
             * Valid values:
             * 
             * *   standard: General-purpose NAS file system
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

            public Entry build() {
                return new Entry(this);
            } 

        } 

    }
}
