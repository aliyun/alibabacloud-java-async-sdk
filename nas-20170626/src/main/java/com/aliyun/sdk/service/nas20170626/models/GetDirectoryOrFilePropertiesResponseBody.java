// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details about the files or directories.</p>
         */
        public Builder entry(Entry entry) {
            this.entry = entry;
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

        public GetDirectoryOrFilePropertiesResponseBody build() {
            return new GetDirectoryOrFilePropertiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDirectoryOrFilePropertiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetDirectoryOrFilePropertiesResponseBody</p>
     */
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
             * <p>The time when the file was queried.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * <p>This parameter is returned only if the value of the Type parameter is File.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-01T10:08:08Z</p>
             */
            public Builder aTime(String aTime) {
                this.aTime = aTime;
                return this;
            }

            /**
             * <p>The time when the raw data was modified.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * <p>This parameter is returned only if the value of the Type parameter is File.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-11T10:08:10Z</p>
             */
            public Builder cTime(String cTime) {
                this.cTime = cTime;
                return this;
            }

            /**
             * <p>Indicates whether the directory contains files stored in the Archive storage class.</p>
             * <p>This parameter is returned only if the Type parameter is set to Directory.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: The directory contains files stored in the Archive storage class.</li>
             * <li>false: The directory does not contain files stored in the Archive storage class.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasArchiveFile(Boolean hasArchiveFile) {
                this.hasArchiveFile = hasArchiveFile;
                return this;
            }

            /**
             * <p>Indicates whether the directory contains files stored in the IA storage medium.</p>
             * <p>This parameter is returned only if the value of the Type parameter is Directory.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: The directory contains files stored in the IA storage medium.</li>
             * <li>false: The directory does not contain files stored in the IA storage medium.</li>
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
             * <p>40</p>
             */
            public Builder inode(String inode) {
                this.inode = inode;
                return this;
            }

            /**
             * <p>The time when the file was modified.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * <p>This parameter is returned only if the value of the Type parameter is File.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-11T10:08:08Z</p>
             */
            public Builder mTime(String mTime) {
                this.mTime = mTime;
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
             * <p>The time when the last data retrieval task was run.</p>
             * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
             * <p>This parameter is returned only if the value of the Type parameter is File.</p>
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
             * <p>This parameter is returned only if the value of the Type parameter is File.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The storage type of the file.</p>
             * <p>This parameter is returned only if the value of the Type parameter is File.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>standard: General-purpose NAS file system</li>
             * <li>InfrequentAccess: IA storage medium</li>
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
             * <p>File</p>
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
