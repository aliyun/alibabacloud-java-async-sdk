// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeBackupFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupFilesResponseBody</p>
 */
public class DescribeBackupFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupFiles")
    private java.util.List<BackupFiles> backupFiles;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeBackupFilesResponseBody(Builder builder) {
        this.backupFiles = builder.backupFiles;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupFiles
     */
    public java.util.List<BackupFiles> getBackupFiles() {
        return this.backupFiles;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<BackupFiles> backupFiles; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeBackupFilesResponseBody model) {
            this.backupFiles = model.backupFiles;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of the backup files returned.</p>
         */
        public Builder backupFiles(java.util.List<BackupFiles> backupFiles) {
            this.backupFiles = backupFiles;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>00A60A6D-33E0-5D5A-9B7C-E5D4DCA88148</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupFilesResponseBody build() {
            return new DescribeBackupFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupFilesResponseBody</p>
     */
    public static class BackupFiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Subtree")
        private String subtree;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private BackupFiles(Builder builder) {
            this.name = builder.name;
            this.size = builder.size;
            this.subtree = builder.subtree;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupFiles create() {
            return builder().build();
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
         * @return subtree
         */
        public String getSubtree() {
            return this.subtree;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private Long size; 
            private String subtree; 
            private String type; 

            private Builder() {
            } 

            private Builder(BackupFiles model) {
                this.name = model.name;
                this.size = model.size;
                this.subtree = model.subtree;
                this.type = model.type;
            } 

            /**
             * <p>The name of the anti-ransomware policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Group 1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The size of the backup file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The path to the subdirectory of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>Python27\</p>
             */
            public Builder subtree(String subtree) {
                this.subtree = subtree;
                return this;
            }

            /**
             * <p>The type of the protected file. Valid values:</p>
             * <ul>
             * <li><strong>file</strong>: files</li>
             * <li><strong>dir</strong>: folders</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dir</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BackupFiles build() {
                return new BackupFiles(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBackupFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBackupFilesResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of backup files returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of backup files returned.</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
