// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectoryOrFilePropertiesResponseBody} extends {@link TeaModel}
 *
 * <p>GetDirectoryOrFilePropertiesResponseBody</p>
 */
public class GetDirectoryOrFilePropertiesResponseBody extends TeaModel {
    @NameInMap("Entry")
    private Entry entry;

    @NameInMap("RequestId")
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
         * Entry.
         */
        public Builder entry(Entry entry) {
            this.entry = entry;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("ATime")
        private String ATime;

        @NameInMap("CTime")
        private String CTime;

        @NameInMap("HasInfrequentAccessFile")
        private Boolean hasInfrequentAccessFile;

        @NameInMap("Inode")
        private String inode;

        @NameInMap("MTime")
        private String MTime;

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

        private Entry(Builder builder) {
            this.ATime = builder.ATime;
            this.CTime = builder.CTime;
            this.hasInfrequentAccessFile = builder.hasInfrequentAccessFile;
            this.inode = builder.inode;
            this.MTime = builder.MTime;
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
         * @return ATime
         */
        public String getATime() {
            return this.ATime;
        }

        /**
         * @return CTime
         */
        public String getCTime() {
            return this.CTime;
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
         * @return MTime
         */
        public String getMTime() {
            return this.MTime;
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
            private String ATime; 
            private String CTime; 
            private Boolean hasInfrequentAccessFile; 
            private String inode; 
            private String MTime; 
            private String name; 
            private String retrieveTime; 
            private Long size; 
            private String storageType; 
            private String type; 

            /**
             * ATime.
             */
            public Builder ATime(String ATime) {
                this.ATime = ATime;
                return this;
            }

            /**
             * CTime.
             */
            public Builder CTime(String CTime) {
                this.CTime = CTime;
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
             * MTime.
             */
            public Builder MTime(String MTime) {
                this.MTime = MTime;
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

            public Entry build() {
                return new Entry(this);
            } 

        } 

    }
}
