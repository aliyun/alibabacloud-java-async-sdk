// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetPagedInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetPagedInstanceResponseBody</p>
 */
public class GetPagedInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Long pageIndex;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private GetPagedInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPagedInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return pageIndex
     */
    public Long getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Long pageIndex; 
        private Long pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long total; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(GetPagedInstanceResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message that is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID. You can use the request ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7FAD400F-7A5C-4193-8F9A-39D86C4F0231</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * <p>The trace ID, which is used to track the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a06e1e316757357507896067d3780</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public GetPagedInstanceResponseBody build() {
            return new GetPagedInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPagedInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPagedInstanceResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessTime")
        private String businessTime;

        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private Long checkStatus;

        @com.aliyun.core.annotation.NameInMap("DagId")
        private Long dagId;

        @com.aliyun.core.annotation.NameInMap("Delete")
        private String delete;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("HistoryDagId")
        private Long historyDagId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LastRunningContext")
        private String lastRunningContext;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private Long taskType;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private Long triggerType;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Instance(Builder builder) {
            this.businessTime = builder.businessTime;
            this.checkStatus = builder.checkStatus;
            this.dagId = builder.dagId;
            this.delete = builder.delete;
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.historyDagId = builder.historyDagId;
            this.id = builder.id;
            this.lastRunningContext = builder.lastRunningContext;
            this.msg = builder.msg;
            this.status = builder.status;
            this.taskType = builder.taskType;
            this.tenantId = builder.tenantId;
            this.triggerType = builder.triggerType;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return businessTime
         */
        public String getBusinessTime() {
            return this.businessTime;
        }

        /**
         * @return checkStatus
         */
        public Long getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return dagId
         */
        public Long getDagId() {
            return this.dagId;
        }

        /**
         * @return delete
         */
        public String getDelete() {
            return this.delete;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return historyDagId
         */
        public Long getHistoryDagId() {
            return this.historyDagId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastRunningContext
         */
        public String getLastRunningContext() {
            return this.lastRunningContext;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return taskType
         */
        public Long getTaskType() {
            return this.taskType;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return triggerType
         */
        public Long getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String businessTime; 
            private Long checkStatus; 
            private Long dagId; 
            private String delete; 
            private String endTime; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long historyDagId; 
            private Long id; 
            private String lastRunningContext; 
            private String msg; 
            private Long status; 
            private Long taskType; 
            private String tenantId; 
            private Long triggerType; 
            private String version; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.businessTime = model.businessTime;
                this.checkStatus = model.checkStatus;
                this.dagId = model.dagId;
                this.delete = model.delete;
                this.endTime = model.endTime;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.historyDagId = model.historyDagId;
                this.id = model.id;
                this.lastRunningContext = model.lastRunningContext;
                this.msg = model.msg;
                this.status = model.status;
                this.taskType = model.taskType;
                this.tenantId = model.tenantId;
                this.triggerType = model.triggerType;
                this.version = model.version;
            } 

            /**
             * <p>The data timestamp of the task node.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-14 16:00:57</p>
             */
            public Builder businessTime(String businessTime) {
                this.businessTime = businessTime;
                return this;
            }

            /**
             * <p>The state of archived data verification. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The verification was successful.</li>
             * <li><strong>1</strong>: Inconsistent data was detected.</li>
             * <li><strong>2</strong>: The verification was not performed.</li>
             * <li><strong>3</strong>: The verification is in progress.</li>
             * <li><strong>4</strong>: The verification was interrupted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder checkStatus(Long checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * <p>The unique ID of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>33753</p>
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * <p>Indicates whether the source data is deleted. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: deletes the jobs in the application group.</li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder delete(String delete) {
                this.delete = delete;
                return this;
            }

            /**
             * <p>The time when the task ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-23 10:23:20</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the task flow was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-28 10:50:45</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the task flow was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-18 15:28:16</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the historical task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>6851</p>
             */
            public Builder historyDagId(Long historyDagId) {
                this.historyDagId = historyDagId;
                return this;
            }

            /**
             * <p>The task flow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>24271</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The context of the last execution of the task flow.</p>
             * 
             * <strong>example:</strong>
             * <p>{”nodes&quot;:[11694,11695]&quot;}</p>
             */
            public Builder lastRunningContext(String lastRunningContext) {
                this.lastRunningContext = lastRunningContext;
                return this;
            }

            /**
             * <p>The details of the current task execution.</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The state of the archiving task.</p>
             * <ul>
             * <li><strong>0</strong>: Pending.</li>
             * <li><strong>1</strong>: Running.</li>
             * <li><strong>2</strong>: Paused.</li>
             * <li><strong>3</strong>: Failed.</li>
             * <li><strong>4</strong>: Succeeded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: data archiving</li>
             * <li><strong>2</strong>: archived data restoration</li>
             * <li><strong>3</strong>: archived data verification</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskType(Long taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The ID of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>3406</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The mode in which the task flow is triggered. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The task flow was triggered based on a schedule.</li>
             * <li><strong>1</strong>: The task flow was manually triggered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder triggerType(Long triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPagedInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetPagedInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Instance")
        private java.util.List<Instance> instance;

        private Data(Builder builder) {
            this.instance = builder.instance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instance
         */
        public java.util.List<Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List<Instance> instance; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.instance = model.instance;
            } 

            /**
             * <p>The information about the task.</p>
             */
            public Builder instance(java.util.List<Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
