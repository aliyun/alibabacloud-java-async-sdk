// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSqlLogTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSqlLogTasksResponseBody</p>
 */
public class DescribeSqlLogTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSqlLogTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlLogTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The response code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSqlLogTasksResponseBody build() {
            return new DescribeSqlLogTasksResponseBody(this);
        } 

    } 

    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The name of the filter parameter.
             * <p>
             * 
             * >  For more information about the filter parameters, see the **Valid values of Key** section of this topic.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the filter parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnalysisTaskFinishTime")
        private Long analysisTaskFinishTime;

        @com.aliyun.core.annotation.NameInMap("AnalysisTaskStatus")
        private String analysisTaskStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Expire")
        private Boolean expire;

        @com.aliyun.core.annotation.NameInMap("Filters")
        private java.util.List < Filters> filters;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LogCount")
        private Long logCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("ScanFileSize")
        private Long scanFileSize;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Long start;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private List(Builder builder) {
            this.analysisTaskFinishTime = builder.analysisTaskFinishTime;
            this.analysisTaskStatus = builder.analysisTaskStatus;
            this.createTime = builder.createTime;
            this.end = builder.end;
            this.expire = builder.expire;
            this.filters = builder.filters;
            this.instanceId = builder.instanceId;
            this.logCount = builder.logCount;
            this.name = builder.name;
            this.progress = builder.progress;
            this.result = builder.result;
            this.scanFileSize = builder.scanFileSize;
            this.start = builder.start;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return analysisTaskFinishTime
         */
        public Long getAnalysisTaskFinishTime() {
            return this.analysisTaskFinishTime;
        }

        /**
         * @return analysisTaskStatus
         */
        public String getAnalysisTaskStatus() {
            return this.analysisTaskStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return expire
         */
        public Boolean getExpire() {
            return this.expire;
        }

        /**
         * @return filters
         */
        public java.util.List < Filters> getFilters() {
            return this.filters;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return logCount
         */
        public Long getLogCount() {
            return this.logCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return scanFileSize
         */
        public Long getScanFileSize() {
            return this.scanFileSize;
        }

        /**
         * @return start
         */
        public Long getStart() {
            return this.start;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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

        public static final class Builder {
            private Long analysisTaskFinishTime; 
            private String analysisTaskStatus; 
            private Long createTime; 
            private Long end; 
            private Boolean expire; 
            private java.util.List < Filters> filters; 
            private String instanceId; 
            private Long logCount; 
            private String name; 
            private Integer progress; 
            private String result; 
            private Long scanFileSize; 
            private Long start; 
            private String status; 
            private String taskId; 
            private String taskType; 

            /**
             * The time when the analysis task was complete. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder analysisTaskFinishTime(Long analysisTaskFinishTime) {
                this.analysisTaskFinishTime = analysisTaskFinishTime;
                return this;
            }

            /**
             * The state of the analysis task.
             * <p>
             * 
             * >  This parameter is a system parameter. You do not need to pay attention to the parameter.
             */
            public Builder analysisTaskStatus(String analysisTaskStatus) {
                this.analysisTaskStatus = analysisTaskStatus;
                return this;
            }

            /**
             * The time when the task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the task ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * Indicates whether the task expired. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder expire(Boolean expire) {
                this.expire = expire;
                return this;
            }

            /**
             * The filter parameters.
             */
            public Builder filters(java.util.List < Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * The ID of the database instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The number of log records.
             */
            public Builder logCount(Long logCount) {
                this.logCount = logCount;
                return this;
            }

            /**
             * The task name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The task progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The URL that is returned if the value of TaskType is **Export**.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * The number of files that are scanned.
             */
            public Builder scanFileSize(Long scanFileSize) {
                this.scanFileSize = scanFileSize;
                return this;
            }

            /**
             * The time when the task started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * The task state. Valid values:
             * <p>
             * 
             * *   **INIT**: The task is to be scheduled.
             * *   **RUNNING**: The task is running.
             * *   **FAILED**: The task failed.
             * *   **CANCELED**: The task is canceled.
             * *   **COMPLETED**: The task is complete.
             * 
             * >  If a task is in the **COMPLETED** state, you can view the results of the task.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The task type. Valid values:
             * <p>
             * 
             * *   **Export**
             * *   **Query**
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List < List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            /**
             * The details of the data returned.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The number of tasks.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
