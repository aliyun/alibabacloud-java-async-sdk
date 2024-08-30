// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyntheticTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSyntheticTaskListResponseBody</p>
 */
public class GetSyntheticTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSyntheticTaskListResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSyntheticTaskListResponseBody create() {
        return builder().build();
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
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The query results.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSyntheticTaskListResponseBody build() {
            return new GetSyntheticTaskListResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("MonitorNumber")
        private Long monitorNumber;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private Long taskType;

        @com.aliyun.core.annotation.NameInMap("TaskTypeName")
        private String taskTypeName;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("Usable")
        private Float usable;

        private List(Builder builder) {
            this.createTime = builder.createTime;
            this.monitorNumber = builder.monitorNumber;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
            this.taskTypeName = builder.taskTypeName;
            this.url = builder.url;
            this.usable = builder.usable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return monitorNumber
         */
        public Long getMonitorNumber() {
            return this.monitorNumber;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskType
         */
        public Long getTaskType() {
            return this.taskType;
        }

        /**
         * @return taskTypeName
         */
        public String getTaskTypeName() {
            return this.taskTypeName;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return usable
         */
        public Float getUsable() {
            return this.usable;
        }

        public static final class Builder {
            private String createTime; 
            private Long monitorNumber; 
            private String taskId; 
            private String taskName; 
            private String taskStatus; 
            private Long taskType; 
            private String taskTypeName; 
            private String url; 
            private Float usable; 

            /**
             * The time when the task was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The number of detection points.
             */
            public Builder monitorNumber(Long monitorNumber) {
                this.monitorNumber = monitorNumber;
                return this;
            }

            /**
             * The ID of the synthetic monitoring task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The task name.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **0**: The task is stopped.
             * *   **1**: The task is started.
             * *   **9**: The task is ended.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * The type of the task. Valid values:
             * <p>
             * 
             * 1.  3: web page performance - IE
             * 2.  34: web page performance - Chrome
             * 3.  0: network quality
             * 4.  40: file download
             * 5.  7: API performance
             */
            public Builder taskType(Long taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * The name of the task type.
             */
            public Builder taskTypeName(String taskTypeName) {
                this.taskTypeName = taskTypeName;
                return this;
            }

            /**
             * The URL for synthetic monitoring.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * The availability. Only the data of the last day is counted. If no data is available for the last day, an empty value is returned.
             */
            public Builder usable(Float usable) {
                this.usable = usable;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasNextPage")
        private String hasNextPage;

        @com.aliyun.core.annotation.NameInMap("HasPreviousPage")
        private Boolean hasPreviousPage;

        @com.aliyun.core.annotation.NameInMap("IsFirstPage")
        private Boolean isFirstPage;

        @com.aliyun.core.annotation.NameInMap("IsLastPage")
        private Boolean isLastPage;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("NavigateFirstPage")
        private String navigateFirstPage;

        @com.aliyun.core.annotation.NameInMap("NavigateLastPage")
        private String navigateLastPage;

        @com.aliyun.core.annotation.NameInMap("NavigatePageNums")
        private String navigatePageNums;

        @com.aliyun.core.annotation.NameInMap("NextPage")
        private String nextPage;

        @com.aliyun.core.annotation.NameInMap("Pages")
        private String pages;

        @com.aliyun.core.annotation.NameInMap("Prepage")
        private String prepage;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private PageInfo(Builder builder) {
            this.hasNextPage = builder.hasNextPage;
            this.hasPreviousPage = builder.hasPreviousPage;
            this.isFirstPage = builder.isFirstPage;
            this.isLastPage = builder.isLastPage;
            this.list = builder.list;
            this.navigateFirstPage = builder.navigateFirstPage;
            this.navigateLastPage = builder.navigateLastPage;
            this.navigatePageNums = builder.navigatePageNums;
            this.nextPage = builder.nextPage;
            this.pages = builder.pages;
            this.prepage = builder.prepage;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return hasNextPage
         */
        public String getHasNextPage() {
            return this.hasNextPage;
        }

        /**
         * @return hasPreviousPage
         */
        public Boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        /**
         * @return isFirstPage
         */
        public Boolean getIsFirstPage() {
            return this.isFirstPage;
        }

        /**
         * @return isLastPage
         */
        public Boolean getIsLastPage() {
            return this.isLastPage;
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return navigateFirstPage
         */
        public String getNavigateFirstPage() {
            return this.navigateFirstPage;
        }

        /**
         * @return navigateLastPage
         */
        public String getNavigateLastPage() {
            return this.navigateLastPage;
        }

        /**
         * @return navigatePageNums
         */
        public String getNavigatePageNums() {
            return this.navigatePageNums;
        }

        /**
         * @return nextPage
         */
        public String getNextPage() {
            return this.nextPage;
        }

        /**
         * @return pages
         */
        public String getPages() {
            return this.pages;
        }

        /**
         * @return prepage
         */
        public String getPrepage() {
            return this.prepage;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String hasNextPage; 
            private Boolean hasPreviousPage; 
            private Boolean isFirstPage; 
            private Boolean isLastPage; 
            private java.util.List < List> list; 
            private String navigateFirstPage; 
            private String navigateLastPage; 
            private String navigatePageNums; 
            private String nextPage; 
            private String pages; 
            private String prepage; 
            private Long size; 
            private Long total; 

            /**
             * Indicates whether the current page is followed by a page.
             */
            public Builder hasNextPage(String hasNextPage) {
                this.hasNextPage = hasNextPage;
                return this;
            }

            /**
             * Indicates whether a previous page exists.
             */
            public Builder hasPreviousPage(Boolean hasPreviousPage) {
                this.hasPreviousPage = hasPreviousPage;
                return this;
            }

            /**
             * Indicates whether the page is the first page.
             */
            public Builder isFirstPage(Boolean isFirstPage) {
                this.isFirstPage = isFirstPage;
                return this;
            }

            /**
             * Indicates whether the page is the last page.
             */
            public Builder isLastPage(Boolean isLastPage) {
                this.isLastPage = isLastPage;
                return this;
            }

            /**
             * The task information.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * The first page on the navigation bar.
             */
            public Builder navigateFirstPage(String navigateFirstPage) {
                this.navigateFirstPage = navigateFirstPage;
                return this;
            }

            /**
             * The last page on the navigation bar.
             */
            public Builder navigateLastPage(String navigateLastPage) {
                this.navigateLastPage = navigateLastPage;
                return this;
            }

            /**
             * All navigation page numbers.
             */
            public Builder navigatePageNums(String navigatePageNums) {
                this.navigatePageNums = navigatePageNums;
                return this;
            }

            /**
             * The next page.
             */
            public Builder nextPage(String nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * The total number of pages returned.
             */
            public Builder pages(String pages) {
                this.pages = pages;
                return this;
            }

            /**
             * The previous page.
             */
            public Builder prepage(String prepage) {
                this.prepage = prepage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
