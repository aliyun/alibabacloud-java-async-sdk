// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link ListRecycledDirectoriesAndFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecycledDirectoriesAndFilesResponseBody</p>
 */
public class ListRecycledDirectoriesAndFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entries")
    private java.util.List<Entries> entries;

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
    public java.util.List<Entries> getEntries() {
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
        private java.util.List<Entries> entries; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The information about files or directories in the recycle bin.</p>
         */
        public Builder entries(java.util.List<Entries> entries) {
            this.entries = entries;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * <p>If all the files and directories are incompletely returned in a query, the return value of the NextToken parameter is not empty. In this case, you can specify a valid value for the NextToken parameter to continue the query.</p>
         * 
         * <strong>example:</strong>
         * <p>CKuO8QMSIjE2OTc3NzI0NjI5MTcyMTYyNDVfMzEzNTUyMF81MjEzODY=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRecycledDirectoriesAndFilesResponseBody build() {
            return new ListRecycledDirectoriesAndFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecycledDirectoriesAndFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecycledDirectoriesAndFilesResponseBody</p>
     */
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
             * <p>The time when the file or directory was last accessed.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-30T10:08:08Z</p>
             */
            public Builder aTime(String aTime) {
                this.aTime = aTime;
                return this;
            }

            /**
             * <p>The time when the metadata was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-30T10:08:08Z</p>
             */
            public Builder cTime(String cTime) {
                this.cTime = cTime;
                return this;
            }

            /**
             * <p>The time when the file or directory was deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-30T10:08:08Z</p>
             */
            public Builder deleteTime(String deleteTime) {
                this.deleteTime = deleteTime;
                return this;
            }

            /**
             * <p>The IDs of the files or directories.</p>
             * 
             * <strong>example:</strong>
             * <p>04***08</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The inode of the file or directory.</p>
             * 
             * <strong>example:</strong>
             * <p>04***08</p>
             */
            public Builder inode(String inode) {
                this.inode = inode;
                return this;
            }

            /**
             * <p>The time when the file or directory was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-30T10:08:08Z</p>
             */
            public Builder mTime(String mTime) {
                this.mTime = mTime;
                return this;
            }

            /**
             * <p>The name of the file or directory before it was deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>test001</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The size of the file. Unit: bytes.</p>
             * <p>The value 0 is returned for this parameter if Directory is returned for the Type parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1073741824</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The type of the returned object. Valid values:</p>
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

            public Entries build() {
                return new Entries(this);
            } 

        } 

    }
}
