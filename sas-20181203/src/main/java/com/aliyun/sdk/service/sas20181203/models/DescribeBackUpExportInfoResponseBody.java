// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackUpExportInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackUpExportInfoResponseBody</p>
 */
public class DescribeBackUpExportInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackUpExportInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackUpExportInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
        private java.util.List < Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

        public DescribeBackUpExportInfoResponseBody build() {
            return new DescribeBackUpExportInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CurrentCount")
        private Integer currentCount;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Link")
        private String link;

        @NameInMap("Message")
        private String message;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.currentCount = builder.currentCount;
            this.fileName = builder.fileName;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.link = builder.link;
            this.message = builder.message;
            this.progress = builder.progress;
            this.status = builder.status;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentCount
         */
        public Integer getCurrentCount() {
            return this.currentCount;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentCount; 
            private String fileName; 
            private Long gmtCreate; 
            private Long id; 
            private String link; 
            private String message; 
            private Integer progress; 
            private String status; 
            private Integer totalCount; 

            /**
             * The number of exported entries.
             */
            public Builder currentCount(Integer currentCount) {
                this.currentCount = currentCount;
                return this;
            }

            /**
             * The name of the file.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The time when the export task was created.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The ID of the export task.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The URL at which you can download the archived information.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * The error message that is returned when the export task fails.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The progress percentage of the export task.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The status of the export task. Valid values:
             * <p>
             * 
             * *   **init**: The task is being initialized.
             * *   **exporting**: The task is in progress.
             * *   **success**: The task is complete.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The total number of entries in the file.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
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
             * The number of entries returned on the current page.
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
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
