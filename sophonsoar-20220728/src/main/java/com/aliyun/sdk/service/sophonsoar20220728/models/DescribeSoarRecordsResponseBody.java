// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The pagination information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>601C2DAC-6A67-5237-BEE8-5BF1CEE96296</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The execution records.</p>
         */
        public Builder soarExecuteRecords(java.util.List < SoarExecuteRecords> soarExecuteRecords) {
            this.soarExecuteRecords = soarExecuteRecords;
            return this;
        }

        public DescribeSoarRecordsResponseBody build() {
            return new DescribeSoarRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSoarRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSoarRecordsResponseBody</p>
     */
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
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
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
    /**
     * 
     * {@link DescribeSoarRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSoarRecordsResponseBody</p>
     */
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
             * <p>The end of the time range to query. The value is a 13-digit timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1686294686000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The error message of the task. If the task is successful, this field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>stime not match</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The request parameters of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;input1&quot;: &quot;xx.xx.xx.xx&quot;,
             *     &quot;input2&quot;: &quot;7d&quot;
             * }</p>
             */
            public Builder rawEventReq(String rawEventReq) {
                this.rawEventReq = rawEventReq;
                return this;
            }

            /**
             * <p>The request ID of the task. The value is unique.</p>
             * 
             * <strong>example:</strong>
             * <p>ba1ec480-aa90-4bb6-a1a7-9e311ae79321</p>
             */
            public Builder requestUuid(String requestUuid) {
                this.requestUuid = requestUuid;
                return this;
            }

            /**
             * <p>The returned information about the playbook. You can define the value in the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>Playbook finish</p>
             */
            public Builder resultMessage(String resultMessage) {
                this.resultMessage = resultMessage;
                return this;
            }

            /**
             * <p>The beginning of the time range to query. The value is a 13-byte timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1675823338433</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>success</strong></li>
             * <li><strong>fail</strong></li>
             * <li><strong>running</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the task. The value is the same as the playbook UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>82848ebc-eaff-4791-acd4-xxxxx</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the task. Valid values:</p>
             * <ul>
             * <li><strong>general</strong>: a common task</li>
             * <li><strong>standard</strong>: a component task</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The MD5 value of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>dea65a3db87fb9bd84bbxxxxx</p>
             */
            public Builder taskflowMd5(String taskflowMd5) {
                this.taskflowMd5 = taskflowMd5;
                return this;
            }

            /**
             * <p>The type of the task. Valid values:</p>
             * <ul>
             * <li><strong>debug</strong>: a debugging task</li>
             * <li><strong>manual</strong>: a manual task</li>
             * <li><strong>siem</strong>: a task that is triggered by an event or alert</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>debug</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to execute the task.</p>
             * 
             * <strong>example:</strong>
             * <p>127xxxx4392</p>
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
