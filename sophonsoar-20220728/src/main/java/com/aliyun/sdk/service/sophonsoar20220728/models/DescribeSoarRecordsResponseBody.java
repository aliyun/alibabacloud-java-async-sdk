// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSoarRecordsResponseBody</p>
 */
public class DescribeSoarRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Page page;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SoarExecuteRecords")
    private java.util.List < SoarExecuteRecords> soarExecuteRecords;

    private DescribeSoarRecordsResponseBody(Builder builder) {
        this.page = builder.page;
        this.requestId = builder.requestId;
        this.soarExecuteRecords = builder.soarExecuteRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return soarExecuteRecords
     */
    public java.util.List < SoarExecuteRecords> getSoarExecuteRecords() {
        return this.soarExecuteRecords;
    }

    public static final class Builder {
        private Page page; 
        private String requestId; 
        private java.util.List < SoarExecuteRecords> soarExecuteRecords; 

        /**
         * The pagination information.
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The execution records.
         */
        public Builder soarExecuteRecords(java.util.List < SoarExecuteRecords> soarExecuteRecords) {
            this.soarExecuteRecords = soarExecuteRecords;
            return this;
        }

        public DescribeSoarRecordsResponseBody build() {
            return new DescribeSoarRecordsResponseBody(this);
        } 

    } 

    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
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
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
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

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    public static class SoarExecuteRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("RawEventReq")
        private String rawEventReq;

        @com.aliyun.core.annotation.NameInMap("RequestUuid")
        private String requestUuid;

        @com.aliyun.core.annotation.NameInMap("ResultMessage")
        private String resultMessage;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("TaskflowMd5")
        private String taskflowMd5;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("TriggerUser")
        private String triggerUser;

        private SoarExecuteRecords(Builder builder) {
            this.endTime = builder.endTime;
            this.errorMsg = builder.errorMsg;
            this.rawEventReq = builder.rawEventReq;
            this.requestUuid = builder.requestUuid;
            this.resultMessage = builder.resultMessage;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
            this.taskflowMd5 = builder.taskflowMd5;
            this.triggerType = builder.triggerType;
            this.triggerUser = builder.triggerUser;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoarExecuteRecords create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return rawEventReq
         */
        public String getRawEventReq() {
            return this.rawEventReq;
        }

        /**
         * @return requestUuid
         */
        public String getRequestUuid() {
            return this.requestUuid;
        }

        /**
         * @return resultMessage
         */
        public String getResultMessage() {
            return this.resultMessage;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return taskflowMd5
         */
        public String getTaskflowMd5() {
            return this.taskflowMd5;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return triggerUser
         */
        public String getTriggerUser() {
            return this.triggerUser;
        }

        public static final class Builder {
            private Long endTime; 
            private String errorMsg; 
            private String rawEventReq; 
            private String requestUuid; 
            private String resultMessage; 
            private Long startTime; 
            private String status; 
            private String taskName; 
            private String taskType; 
            private String taskflowMd5; 
            private String triggerType; 
            private String triggerUser; 

            /**
             * The end of the time range to query. The value is a 13-digit timestamp.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The error message of the task. If the task is successful, this field is empty.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The request parameters of the task.
             */
            public Builder rawEventReq(String rawEventReq) {
                this.rawEventReq = rawEventReq;
                return this;
            }

            /**
             * The request ID of the task. The value is unique.
             */
            public Builder requestUuid(String requestUuid) {
                this.requestUuid = requestUuid;
                return this;
            }

            /**
             * The returned information about the playbook. You can define the value in the playbook.
             */
            public Builder resultMessage(String resultMessage) {
                this.resultMessage = resultMessage;
                return this;
            }

            /**
             * The beginning of the time range to query. The value is a 13-byte timestamp.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **success**
             * *   **fail**
             * *   **running**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the task. The value is the same as the playbook UUID.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The type of the task. Valid values:
             * <p>
             * 
             * *   **general**: a common task
             * *   **standard**: a component task
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * The MD5 value of the playbook.
             */
            public Builder taskflowMd5(String taskflowMd5) {
                this.taskflowMd5 = taskflowMd5;
                return this;
            }

            /**
             * The type of the task. Valid values:
             * <p>
             * 
             * *   **debug**: a debugging task
             * *   **manual**: a manual task
             * *   **siem**: a task that is triggered by an event or alert
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to execute the task.
             */
            public Builder triggerUser(String triggerUser) {
                this.triggerUser = triggerUser;
                return this;
            }

            public SoarExecuteRecords build() {
                return new SoarExecuteRecords(this);
            } 

        } 

    }
}
