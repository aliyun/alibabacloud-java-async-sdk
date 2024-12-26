// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSqlLogTasksResponseBody build() {
            return new DescribeSqlLogTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSqlLogTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogTasksResponseBody</p>
     */
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
             * <p>The name of the filter parameter.</p>
             * <blockquote>
             * <p> For more information about the filter parameters, see the <strong>Valid values of Key</strong> section of this topic.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>delimiter</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>,</p>
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
    /**
     * 
     * {@link DescribeSqlLogTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogTasksResponseBody</p>
     */
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
        private java.util.List<Filters> filters;

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
        public java.util.List<Filters> getFilters() {
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
            private java.util.List<Filters> filters; 
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
             * <p>The time when the analysis task was complete. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1712751923000</p>
             */
            public Builder analysisTaskFinishTime(Long analysisTaskFinishTime) {
                this.analysisTaskFinishTime = analysisTaskFinishTime;
                return this;
            }

            /**
             * <p>The state of the analysis task.</p>
             * <blockquote>
             * <p> This parameter is a system parameter. You do not need to pay attention to the parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SCAN_ANALYZE_COMPLETED</p>
             */
            public Builder analysisTaskStatus(String analysisTaskStatus) {
                this.analysisTaskStatus = analysisTaskStatus;
                return this;
            }

            /**
             * <p>The time when the task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1681363254423</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the task ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1705975320000</p>
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * <p>Indicates whether the task expired. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expire(Boolean expire) {
                this.expire = expire;
                return this;
            }

            /**
             * <p>The filter parameters.</p>
             */
            public Builder filters(java.util.List<Filters> filters) {
                this.filters = filters;
                return this;
            }

            /**
             * <p>The ID of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2zew761kf7ho18752</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The number of log records.</p>
             * 
             * <strong>example:</strong>
             * <p>99999</p>
             */
            public Builder logCount(Long logCount) {
                this.logCount = logCount;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>test01</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The task progress.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The URL that is returned if the value of TaskType is <strong>Export</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://das-sqllog-download-cn-shanghai.oss-cn-shanghai.aliyuncs.com/la">https://das-sqllog-download-cn-shanghai.oss-cn-shanghai.aliyuncs.com/la</a></p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The number of files that are scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder scanFileSize(Long scanFileSize) {
                this.scanFileSize = scanFileSize;
                return this;
            }

            /**
             * <p>The time when the task started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1683859555482</p>
             */
            public Builder start(Long start) {
                this.start = start;
                return this;
            }

            /**
             * <p>The task state. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is to be scheduled.</li>
             * <li><strong>RUNNING</strong>: The task is running.</li>
             * <li><strong>FAILED</strong>: The task failed.</li>
             * <li><strong>CANCELED</strong>: The task is canceled.</li>
             * <li><strong>COMPLETED</strong>: The task is complete.</li>
             * </ul>
             * <blockquote>
             * <p> If a task is in the <strong>COMPLETED</strong> state, you can view the results of the task.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9a4f5c4494dbd6713185d87a97aa53e8</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li><strong>Export</strong></li>
             * <li><strong>Query</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Export</p>
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
    /**
     * 
     * {@link DescribeSqlLogTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSqlLogTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

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
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            /**
             * <p>The details of the data returned.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
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
