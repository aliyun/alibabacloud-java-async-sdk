// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
         * <p>The query results.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSyntheticTaskListResponseBody build() {
            return new GetSyntheticTaskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSyntheticTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskListResponseBody</p>
     */
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
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1634005438000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of detection points.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder monitorNumber(Long monitorNumber) {
                this.monitorNumber = monitorNumber;
                return this;
            }

            /**
             * <p>The ID of the synthetic monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>2118709</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>net-test</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The task is stopped.</li>
             * <li><strong>1</strong>: The task is started.</li>
             * <li><strong>9</strong>: The task is ended.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The type of the task. Valid values:</p>
             * <ol>
             * <li>3: web page performance - IE</li>
             * <li>34: web page performance - Chrome</li>
             * <li>0: network quality</li>
             * <li>40: file download</li>
             * <li>7: API performance</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder taskType(Long taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The name of the task type.</p>
             */
            public Builder taskTypeName(String taskTypeName) {
                this.taskTypeName = taskTypeName;
                return this;
            }

            /**
             * <p>The URL for synthetic monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The availability. Only the data of the last day is counted. If no data is available for the last day, an empty value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0.80</p>
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
    /**
     * 
     * {@link GetSyntheticTaskListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSyntheticTaskListResponseBody</p>
     */
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
        private java.util.List<List> list;

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
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private String navigateFirstPage; 
            private String navigateLastPage; 
            private String navigatePageNums; 
            private String nextPage; 
            private String pages; 
            private String prepage; 
            private Long size; 
            private Long total; 

            /**
             * <p>Indicates whether the current page is followed by a page.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasNextPage(String hasNextPage) {
                this.hasNextPage = hasNextPage;
                return this;
            }

            /**
             * <p>Indicates whether a previous page exists.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasPreviousPage(Boolean hasPreviousPage) {
                this.hasPreviousPage = hasPreviousPage;
                return this;
            }

            /**
             * <p>Indicates whether the page is the first page.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isFirstPage(Boolean isFirstPage) {
                this.isFirstPage = isFirstPage;
                return this;
            }

            /**
             * <p>Indicates whether the page is the last page.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isLastPage(Boolean isLastPage) {
                this.isLastPage = isLastPage;
                return this;
            }

            /**
             * <p>The task information.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The first page on the navigation bar.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder navigateFirstPage(String navigateFirstPage) {
                this.navigateFirstPage = navigateFirstPage;
                return this;
            }

            /**
             * <p>The last page on the navigation bar.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder navigateLastPage(String navigateLastPage) {
                this.navigateLastPage = navigateLastPage;
                return this;
            }

            /**
             * <p>All navigation page numbers.</p>
             * 
             * <strong>example:</strong>
             * <p>1,2,3</p>
             */
            public Builder navigatePageNums(String navigatePageNums) {
                this.navigatePageNums = navigatePageNums;
                return this;
            }

            /**
             * <p>The next page.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder nextPage(String nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * <p>The total number of pages returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pages(String pages) {
                this.pages = pages;
                return this;
            }

            /**
             * <p>The previous page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder prepage(String prepage) {
                this.prepage = prepage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
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
