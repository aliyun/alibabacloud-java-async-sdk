// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryAiCallTaskPageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAiCallTaskPageResponseBody</p>
 */
public class QueryAiCallTaskPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAiCallTaskPageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiCallTaskPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAiCallTaskPageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The detailed reason for access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The task details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message. This parameter is not returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid parameter.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B99C5955-5664-573D-97BE-A7CC1AFD8401</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: successful.</li>
         * <li><strong>false</strong>: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAiCallTaskPageResponseBody build() {
            return new QueryAiCallTaskPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAiCallTaskPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiCallTaskPageResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("ApplicationCode")
        private String applicationCode;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("CallExpireDate")
        private String callExpireDate;

        @com.aliyun.core.annotation.NameInMap("CallExpireMinutes")
        private Long callExpireMinutes;

        @com.aliyun.core.annotation.NameInMap("CallExpireType")
        private Long callExpireType;

        @com.aliyun.core.annotation.NameInMap("CallingCount")
        private Long callingCount;

        @com.aliyun.core.annotation.NameInMap("CompleteRate")
        private String completeRate;

        @com.aliyun.core.annotation.NameInMap("ConcurrentCount")
        private Long concurrentCount;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DayCallCount")
        private Long dayCallCount;

        @com.aliyun.core.annotation.NameInMap("DayConnectRate")
        private String dayConnectRate;

        @com.aliyun.core.annotation.NameInMap("DayImportCount")
        private Long dayImportCount;

        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Long failedCount;

        @com.aliyun.core.annotation.NameInMap("HistoryConnectRate")
        private String historyConnectRate;

        @com.aliyun.core.annotation.NameInMap("RealStartTime")
        private Long realStartTime;

        @com.aliyun.core.annotation.NameInMap("StartFailedReason")
        private String startFailedReason;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("SucceedCount")
        private Long succeedCount;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TotalCallCount")
        private Long totalCallCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private List(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.applicationCode = builder.applicationCode;
            this.applicationName = builder.applicationName;
            this.callExpireDate = builder.callExpireDate;
            this.callExpireMinutes = builder.callExpireMinutes;
            this.callExpireType = builder.callExpireType;
            this.callingCount = builder.callingCount;
            this.completeRate = builder.completeRate;
            this.concurrentCount = builder.concurrentCount;
            this.createTime = builder.createTime;
            this.dayCallCount = builder.dayCallCount;
            this.dayConnectRate = builder.dayConnectRate;
            this.dayImportCount = builder.dayImportCount;
            this.failedCount = builder.failedCount;
            this.historyConnectRate = builder.historyConnectRate;
            this.realStartTime = builder.realStartTime;
            this.startFailedReason = builder.startFailedReason;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.succeedCount = builder.succeedCount;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.totalCallCount = builder.totalCallCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return applicationCode
         */
        public String getApplicationCode() {
            return this.applicationCode;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return callExpireDate
         */
        public String getCallExpireDate() {
            return this.callExpireDate;
        }

        /**
         * @return callExpireMinutes
         */
        public Long getCallExpireMinutes() {
            return this.callExpireMinutes;
        }

        /**
         * @return callExpireType
         */
        public Long getCallExpireType() {
            return this.callExpireType;
        }

        /**
         * @return callingCount
         */
        public Long getCallingCount() {
            return this.callingCount;
        }

        /**
         * @return completeRate
         */
        public String getCompleteRate() {
            return this.completeRate;
        }

        /**
         * @return concurrentCount
         */
        public Long getConcurrentCount() {
            return this.concurrentCount;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dayCallCount
         */
        public Long getDayCallCount() {
            return this.dayCallCount;
        }

        /**
         * @return dayConnectRate
         */
        public String getDayConnectRate() {
            return this.dayConnectRate;
        }

        /**
         * @return dayImportCount
         */
        public Long getDayImportCount() {
            return this.dayImportCount;
        }

        /**
         * @return failedCount
         */
        public Long getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return historyConnectRate
         */
        public String getHistoryConnectRate() {
            return this.historyConnectRate;
        }

        /**
         * @return realStartTime
         */
        public Long getRealStartTime() {
            return this.realStartTime;
        }

        /**
         * @return startFailedReason
         */
        public String getStartFailedReason() {
            return this.startFailedReason;
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
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return succeedCount
         */
        public Long getSucceedCount() {
            return this.succeedCount;
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
         * @return totalCallCount
         */
        public Long getTotalCallCount() {
            return this.totalCallCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String applicationCode; 
            private String applicationName; 
            private String callExpireDate; 
            private Long callExpireMinutes; 
            private Long callExpireType; 
            private Long callingCount; 
            private String completeRate; 
            private Long concurrentCount; 
            private Long createTime; 
            private Long dayCallCount; 
            private String dayConnectRate; 
            private Long dayImportCount; 
            private Long failedCount; 
            private String historyConnectRate; 
            private Long realStartTime; 
            private String startFailedReason; 
            private Long startTime; 
            private Long status; 
            private Long succeedCount; 
            private String taskId; 
            private String taskName; 
            private Long totalCallCount; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(List model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.applicationCode = model.applicationCode;
                this.applicationName = model.applicationName;
                this.callExpireDate = model.callExpireDate;
                this.callExpireMinutes = model.callExpireMinutes;
                this.callExpireType = model.callExpireType;
                this.callingCount = model.callingCount;
                this.completeRate = model.completeRate;
                this.concurrentCount = model.concurrentCount;
                this.createTime = model.createTime;
                this.dayCallCount = model.dayCallCount;
                this.dayConnectRate = model.dayConnectRate;
                this.dayImportCount = model.dayImportCount;
                this.failedCount = model.failedCount;
                this.historyConnectRate = model.historyConnectRate;
                this.realStartTime = model.realStartTime;
                this.startFailedReason = model.startFailedReason;
                this.startTime = model.startTime;
                this.status = model.status;
                this.succeedCount = model.succeedCount;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.totalCallCount = model.totalCallCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1180**************</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestAgent.</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * ApplicationCode.
             */
            public Builder applicationCode(String applicationCode) {
                this.applicationCode = applicationCode;
                return this;
            }

            /**
             * ApplicationName.
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * CallExpireDate.
             */
            public Builder callExpireDate(String callExpireDate) {
                this.callExpireDate = callExpireDate;
                return this;
            }

            /**
             * CallExpireMinutes.
             */
            public Builder callExpireMinutes(Long callExpireMinutes) {
                this.callExpireMinutes = callExpireMinutes;
                return this;
            }

            /**
             * CallExpireType.
             */
            public Builder callExpireType(Long callExpireType) {
                this.callExpireType = callExpireType;
                return this;
            }

            /**
             * <p>The number of ongoing calls.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
             */
            public Builder callingCount(Long callingCount) {
                this.callingCount = callingCount;
                return this;
            }

            /**
             * <p>The task completion rate.</p>
             * 
             * <strong>example:</strong>
             * <p>70%</p>
             */
            public Builder completeRate(String completeRate) {
                this.completeRate = completeRate;
                return this;
            }

            /**
             * <p>The task concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder concurrentCount(Long concurrentCount) {
                this.concurrentCount = concurrentCount;
                return this;
            }

            /**
             * <p>The creation time. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1748932499000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of calls made on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder dayCallCount(Long dayCallCount) {
                this.dayCallCount = dayCallCount;
                return this;
            }

            /**
             * <p>The daily connection rate. Daily connection rate = number of connections on the current day ÷ number of calls on the current day (DayCallCount).</p>
             * 
             * <strong>example:</strong>
             * <p>74.14%</p>
             */
            public Builder dayConnectRate(String dayConnectRate) {
                this.dayConnectRate = dayConnectRate;
                return this;
            }

            /**
             * <p>The amount of data imported on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder dayImportCount(Long dayImportCount) {
                this.dayImportCount = dayImportCount;
                return this;
            }

            /**
             * <p>The total number of failed task executions.</p>
             * 
             * <strong>example:</strong>
             * <p>61</p>
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>The historical connection rate. Historical connection rate = historical number of connections ÷ total number of calls (TotalCallCount).</p>
             * 
             * <strong>example:</strong>
             * <p>95.89%</p>
             */
            public Builder historyConnectRate(String historyConnectRate) {
                this.historyConnectRate = historyConnectRate;
                return this;
            }

            /**
             * <p>The actual start time of the task. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1748932499000</p>
             */
            public Builder realStartTime(Long realStartTime) {
                this.realStartTime = realStartTime;
                return this;
            }

            /**
             * <p>The reason for startup failure.</p>
             * 
             * <strong>example:</strong>
             * <p>Agent is offline.</p>
             */
            public Builder startFailedReason(String startFailedReason) {
                this.startFailedReason = startFailedReason;
                return this;
            }

            /**
             * <p>The scheduled start time of the task. This value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1748932499000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total number of successful task executions.</p>
             * 
             * <strong>example:</strong>
             * <p>36</p>
             */
            public Builder succeedCount(Long succeedCount) {
                this.succeedCount = succeedCount;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1187**************</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestTask.</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The total number of calls made by the task.</p>
             * 
             * <strong>example:</strong>
             * <p>58</p>
             */
            public Builder totalCallCount(Long totalCallCount) {
                this.totalCallCount = totalCallCount;
                return this;
            }

            /**
             * <p>The total number of task items.</p>
             * 
             * <strong>example:</strong>
             * <p>71</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiCallTaskPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiCallTaskPageResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The task data.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>37</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>74</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>72</p>
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
