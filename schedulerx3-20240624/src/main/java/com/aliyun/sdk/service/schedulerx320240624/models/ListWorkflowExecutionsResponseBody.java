// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ListWorkflowExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkflowExecutionsResponseBody</p>
 */
public class ListWorkflowExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListWorkflowExecutionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowExecutionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListWorkflowExecutionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The total number of entries that meet the request conditions. This parameter is optional and is not returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The paginated results of workflow execution records.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for this request. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The position from which the current call returns data. An empty value indicates that all data has been read.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter error: content is null.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The token that specifies the position from which the query starts. An empty value indicates that all data has been read. You do not need to specify this parameter for the first query.</p>
         * 
         * <strong>example:</strong>
         * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BAC1ADB5-EEB5-5834-93D8-522E067AF8D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListWorkflowExecutionsResponseBody build() {
            return new ListWorkflowExecutionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWorkflowExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowExecutionsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DataTime")
        private String dataTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Executor")
        private String executor;

        @com.aliyun.core.annotation.NameInMap("ScheduleTime")
        private String scheduleTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("WorkflowExecutionId")
        private String workflowExecutionId;

        @com.aliyun.core.annotation.NameInMap("WorkflowId")
        private String workflowId;

        @com.aliyun.core.annotation.NameInMap("WorkflowName")
        private String workflowName;

        private Records(Builder builder) {
            this.appName = builder.appName;
            this.dataTime = builder.dataTime;
            this.endTime = builder.endTime;
            this.executor = builder.executor;
            this.scheduleTime = builder.scheduleTime;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.workflowExecutionId = builder.workflowExecutionId;
            this.workflowId = builder.workflowId;
            this.workflowName = builder.workflowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return dataTime
         */
        public String getDataTime() {
            return this.dataTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return executor
         */
        public String getExecutor() {
            return this.executor;
        }

        /**
         * @return scheduleTime
         */
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return workflowExecutionId
         */
        public String getWorkflowExecutionId() {
            return this.workflowExecutionId;
        }

        /**
         * @return workflowId
         */
        public String getWorkflowId() {
            return this.workflowId;
        }

        /**
         * @return workflowName
         */
        public String getWorkflowName() {
            return this.workflowName;
        }

        public static final class Builder {
            private String appName; 
            private String dataTime; 
            private String endTime; 
            private String executor; 
            private String scheduleTime; 
            private String startTime; 
            private Integer status; 
            private String workflowExecutionId; 
            private String workflowId; 
            private String workflowName; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.appName = model.appName;
                this.dataTime = model.dataTime;
                this.endTime = model.endTime;
                this.executor = model.executor;
                this.scheduleTime = model.scheduleTime;
                this.startTime = model.startTime;
                this.status = model.status;
                this.workflowExecutionId = model.workflowExecutionId;
                this.workflowId = model.workflowId;
                this.workflowName = model.workflowName;
            } 

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The node data timestamp. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-12 14:52:42</p>
             */
            public Builder dataTime(String dataTime) {
                this.dataTime = dataTime;
                return this;
            }

            /**
             * <p>The task end time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-12 14:52:42</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The executor ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1827811800526000</p>
             */
            public Builder executor(String executor) {
                this.executor = executor;
                return this;
            }

            /**
             * <p>The task scheduling time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-12 14:52:42</p>
             */
            public Builder scheduleTime(String scheduleTime) {
                this.scheduleTime = scheduleTime;
                return this;
            }

            /**
             * <p>The start time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-04 01:09:27</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task execution status. Valid values:</p>
             * <ul>
             * <li>0: UNKNOWN (Unknown).</li>
             * <li>1: WAITING (Waiting).</li>
             * <li>2: READY (Ready).</li>
             * <li>3: RUNNING (Running).</li>
             * <li>4: SUCCESS (Successful).</li>
             * <li>5: FAILED (Failed).</li>
             * <li>6: PAUSED (Paused).</li>
             * <li>7: SUBMITTED (Submitted).</li>
             * <li>8: REJECTED (Rejected).</li>
             * <li>9: ACCEPTED (Accepted).</li>
             * <li>10: PARTIAL_FAILED (Partially failed).</li>
             * <li>11: SKIPPED (Skipped).</li>
             * <li>12: REMOVED (Removed).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The workflow instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder workflowExecutionId(String workflowExecutionId) {
                this.workflowExecutionId = workflowExecutionId;
                return this;
            }

            /**
             * <p>The workflow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder workflowId(String workflowId) {
                this.workflowId = workflowId;
                return this;
            }

            /**
             * <p>The workflow name.</p>
             * 
             * <strong>example:</strong>
             * <p>myWorkflow</p>
             */
            public Builder workflowName(String workflowName) {
                this.workflowName = workflowName;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListWorkflowExecutionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListWorkflowExecutionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Records> records; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.total = model.total;
            } 

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
             * <p>The workflow execution records on the current page.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>65</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
