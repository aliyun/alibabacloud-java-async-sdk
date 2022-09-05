// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSyntheticTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSyntheticTaskListResponseBody</p>
 */
public class GetSyntheticTaskListResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
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
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("MonitorNumber")
        private Long monitorNumber;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("TaskType")
        private Long taskType;

        @NameInMap("TaskTypeName")
        private String taskTypeName;

        @NameInMap("Url")
        private String url;

        @NameInMap("Usable")
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * MonitorNumber.
             */
            public Builder monitorNumber(Long monitorNumber) {
                this.monitorNumber = monitorNumber;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(Long taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * TaskTypeName.
             */
            public Builder taskTypeName(String taskTypeName) {
                this.taskTypeName = taskTypeName;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Usable.
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
        @NameInMap("HasNextPage")
        private String hasNextPage;

        @NameInMap("HasPreviousPage")
        private Boolean hasPreviousPage;

        @NameInMap("IsFirstPage")
        private Boolean isFirstPage;

        @NameInMap("IsLastPage")
        private Boolean isLastPage;

        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("NavigateFirstPage")
        private String navigateFirstPage;

        @NameInMap("NavigateLastPage")
        private String navigateLastPage;

        @NameInMap("NavigatePageNums")
        private String navigatePageNums;

        @NameInMap("NextPage")
        private String nextPage;

        @NameInMap("Pages")
        private String pages;

        @NameInMap("Prepage")
        private String prepage;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Total")
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
             * HasNextPage.
             */
            public Builder hasNextPage(String hasNextPage) {
                this.hasNextPage = hasNextPage;
                return this;
            }

            /**
             * HasPreviousPage.
             */
            public Builder hasPreviousPage(Boolean hasPreviousPage) {
                this.hasPreviousPage = hasPreviousPage;
                return this;
            }

            /**
             * IsFirstPage.
             */
            public Builder isFirstPage(Boolean isFirstPage) {
                this.isFirstPage = isFirstPage;
                return this;
            }

            /**
             * IsLastPage.
             */
            public Builder isLastPage(Boolean isLastPage) {
                this.isLastPage = isLastPage;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * NavigateFirstPage.
             */
            public Builder navigateFirstPage(String navigateFirstPage) {
                this.navigateFirstPage = navigateFirstPage;
                return this;
            }

            /**
             * NavigateLastPage.
             */
            public Builder navigateLastPage(String navigateLastPage) {
                this.navigateLastPage = navigateLastPage;
                return this;
            }

            /**
             * NavigatePageNums.
             */
            public Builder navigatePageNums(String navigatePageNums) {
                this.navigatePageNums = navigatePageNums;
                return this;
            }

            /**
             * NextPage.
             */
            public Builder nextPage(String nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * Pages.
             */
            public Builder pages(String pages) {
                this.pages = pages;
                return this;
            }

            /**
             * Prepage.
             */
            public Builder prepage(String prepage) {
                this.prepage = prepage;
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
             * Total.
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
