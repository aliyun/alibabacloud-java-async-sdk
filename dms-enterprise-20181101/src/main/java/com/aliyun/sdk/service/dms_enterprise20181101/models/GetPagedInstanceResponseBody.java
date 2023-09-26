// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPagedInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetPagedInstanceResponseBody</p>
 */
public class GetPagedInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("PageIndex")
    private Long pageIndex;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Long total;

    @NameInMap("TraceId")
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

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public GetPagedInstanceResponseBody build() {
            return new GetPagedInstanceResponseBody(this);
        } 

    } 

    public static class Instance extends TeaModel {
        @NameInMap("BusinessTime")
        private String businessTime;

        @NameInMap("CheckStatus")
        private Long checkStatus;

        @NameInMap("DagId")
        private Long dagId;

        @NameInMap("Delete")
        private String delete;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("HistoryDagId")
        private Long historyDagId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LastRunningContext")
        private String lastRunningContext;

        @NameInMap("Msg")
        private String msg;

        @NameInMap("Status")
        private Long status;

        @NameInMap("TaskType")
        private Long taskType;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("TriggerType")
        private Long triggerType;

        @NameInMap("Version")
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

            /**
             * BusinessTime.
             */
            public Builder businessTime(String businessTime) {
                this.businessTime = businessTime;
                return this;
            }

            /**
             * CheckStatus.
             */
            public Builder checkStatus(Long checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * DagId.
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * Delete.
             */
            public Builder delete(String delete) {
                this.delete = delete;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HistoryDagId.
             */
            public Builder historyDagId(Long historyDagId) {
                this.historyDagId = historyDagId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * LastRunningContext.
             */
            public Builder lastRunningContext(String lastRunningContext) {
                this.lastRunningContext = lastRunningContext;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
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
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * TriggerType.
             */
            public Builder triggerType(Long triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * Version.
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
    public static class Data extends TeaModel {
        @NameInMap("Instance")
        private java.util.List < Instance> instance;

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
        public java.util.List < Instance> getInstance() {
            return this.instance;
        }

        public static final class Builder {
            private java.util.List < Instance> instance; 

            /**
             * Instance.
             */
            public Builder instance(java.util.List < Instance> instance) {
                this.instance = instance;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
