// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupFilesResponseBody</p>
 */
public class DescribeBackupFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupFiles")
    private java.util.List < BackupFiles> backupFiles;

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

    /**
     * @return backupFiles
     */
    public java.util.List < BackupFiles> getBackupFiles() {
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
        private java.util.List < BackupFiles> backupFiles; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * An array that consists of the backup files returned.
         */
        public Builder backupFiles(java.util.List < BackupFiles> backupFiles) {
            this.backupFiles = backupFiles;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupFilesResponseBody build() {
            return new DescribeBackupFilesResponseBody(this);
        } 

    } 

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

            /**
             * The name of the anti-ransomware policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The size of the backup file. Unit: bytes.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The path to the subdirectory of the backup file.
             */
            public Builder subtree(String subtree) {
                this.subtree = subtree;
                return this;
            }

            /**
             * The type of the protected file. Valid values:
             * <p>
             * 
             * *   **file**: files
             * *   **dir**: folders
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

            /**
             * The number of backup files returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **10**.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of backup files returned.
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
