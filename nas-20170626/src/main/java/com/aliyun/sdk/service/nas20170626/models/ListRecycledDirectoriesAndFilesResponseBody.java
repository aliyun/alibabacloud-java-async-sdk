// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecycledDirectoriesAndFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecycledDirectoriesAndFilesResponseBody</p>
 */
public class ListRecycledDirectoriesAndFilesResponseBody extends TeaModel {
    @NameInMap("Entries")
    private java.util.List < Entries> entries;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
         * Entries.
         */
        public Builder entries(java.util.List < Entries> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("ATime")
        private String ATime;

        @NameInMap("CTime")
        private String CTime;

        @NameInMap("DeleteTime")
        private String deleteTime;

        @NameInMap("FileId")
        private String fileId;

        @NameInMap("Inode")
        private String inode;

        @NameInMap("MTime")
        private String MTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Type")
        private String type;

        private Entries(Builder builder) {
            this.ATime = builder.ATime;
            this.CTime = builder.CTime;
            this.deleteTime = builder.deleteTime;
            this.fileId = builder.fileId;
            this.inode = builder.inode;
            this.MTime = builder.MTime;
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
            private String ATime; 
            private String CTime; 
            private String deleteTime; 
            private String fileId; 
            private String inode; 
            private String MTime; 
            private String name; 
            private Long size; 
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
             * DeleteTime.
             */
            public Builder deleteTime(String deleteTime) {
                this.deleteTime = deleteTime;
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
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
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
