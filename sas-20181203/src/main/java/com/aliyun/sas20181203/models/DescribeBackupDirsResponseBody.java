// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeBackupDirsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupDirsResponseBody</p>
 */
public class DescribeBackupDirsResponseBody extends TeaModel {
    @NameInMap("BackupDirs")
    private java.util.List < BackupDirs> backupDirs;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeBackupDirsResponseBody(Builder builder) {
        this.backupDirs = builder.backupDirs;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupDirsResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupDirs
     */
    public java.util.List < BackupDirs> getBackupDirs() {
        return this.backupDirs;
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
        private java.util.List < BackupDirs> backupDirs; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>BackupDirs.</p>
         */
        public Builder backupDirs(java.util.List < BackupDirs> backupDirs) {
            this.backupDirs = backupDirs;
            return this;
        }

        /**
         * <p>PageInfo.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupDirsResponseBody build() {
            return new DescribeBackupDirsResponseBody(this);
        } 

    } 

    public static class BackupDirs extends TeaModel {
        @NameInMap("BackupJobId")
        private Long backupJobId;

        @NameInMap("Source")
        private String source;


        private BackupDirs(Builder builder) {
            this.backupJobId = builder.backupJobId;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BackupDirs create() {
            return builder().build();
        }

        /**
         * @return backupJobId
         */
        public Long getBackupJobId() {
            return this.backupJobId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private Long backupJobId; 
            private String source; 

            /**
             * <p>BackupJobId.</p>
             */
            public Builder backupJobId(Long backupJobId) {
                this.backupJobId = backupJobId;
                return this;
            }

            /**
             * <p>Source.</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public BackupDirs build() {
                return new BackupDirs(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * <p>Count.</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>CurrentPage.</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>PageSize.</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>TotalCount.</p>
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
