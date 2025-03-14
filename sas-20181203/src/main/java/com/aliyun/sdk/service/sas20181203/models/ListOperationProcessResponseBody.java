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
 * {@link ListOperationProcessResponseBody} extends {@link TeaModel}
 *
 * <p>ListOperationProcessResponseBody</p>
 */
public class ListOperationProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("Processes")
    private java.util.List<Processes> processes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListOperationProcessResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.processes = builder.processes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationProcessResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return processes
     */
    public java.util.List<Processes> getProcesses() {
        return this.processes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List<Processes> processes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListOperationProcessResponseBody model) {
            this.pageInfo = model.pageInfo;
            this.processes = model.processes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The information about the operation tasks.</p>
         */
        public Builder processes(java.util.List<Processes> processes) {
            this.processes = processes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOperationProcessResponseBody build() {
            return new ListOperationProcessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationProcessResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationProcessResponseBody</p>
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>263</p>
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
    /**
     * 
     * {@link ListOperationProcessResponseBody} extends {@link TeaModel}
     *
     * <p>ListOperationProcessResponseBody</p>
     */
    public static class Processes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FinishCount")
        private Integer finishCount;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private Integer statusCode;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Processes(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.finishCount = builder.finishCount;
            this.startTime = builder.startTime;
            this.statusCode = builder.statusCode;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Processes create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return finishCount
         */
        public Integer getFinishCount() {
            return this.finishCount;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return statusCode
         */
        public Integer getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long createTime; 
            private Long endTime; 
            private Integer finishCount; 
            private Long startTime; 
            private Integer statusCode; 
            private String taskId; 
            private String taskType; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Processes model) {
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.finishCount = model.finishCount;
                this.startTime = model.startTime;
                this.statusCode = model.statusCode;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The time when the task was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1674388824000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The end time of the task. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1705467559000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The number of tasks that are complete.</p>
             * 
             * <strong>example:</strong>
             * <p>197</p>
             */
            public Builder finishCount(Integer finishCount) {
                this.finishCount = finishCount;
                return this;
            }

            /**
             * <p>The start time of the task. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1705457102000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task status code. Valid values:</p>
             * <ul>
             * <li>0: not started.</li>
             * <li>1: running.</li>
             * <li>2: complete.</li>
             * <li>3: times out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder statusCode(Integer statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>The ID of the operation task.</p>
             * 
             * <strong>example:</strong>
             * <p>3d7a1b68-599f-4e16-9b45-e920a183b***</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li>CHECK_ALL: full check.</li>
             * <li>CHECK_POLICY: policy-based check for which check items are configured.</li>
             * <li>CHECK_SCHEDULE: scheduled check.</li>
             * <li>CHECK_ITEM: specific check item-based check.</li>
             * <li>CHECK_INSTANCE: specific check item-based check on specific instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHECK_POLICY</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>337</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Processes build() {
                return new Processes(this);
            } 

        } 

    }
}
