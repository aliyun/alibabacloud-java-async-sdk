// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeDataImportTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataImportTaskInfoResponseBody</p>
 */
public class DescribeDataImportTaskInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeDataImportTaskInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataImportTaskInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
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
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeDataImportTaskInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. This parameter is empty when the request succeeds. If the request fails, an error message is returned, such as an error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result set.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message. This parameter has a value only when the task status is success. Otherwise, an empty value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B2F3840-5C98-****-B269-2D5C3A31797C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeDataImportTaskInfoResponseBody build() {
            return new DescribeDataImportTaskInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataImportTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataImportTaskInfoResponseBody</p>
     */
    public static class TaskDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delay")
        private Long delay;

        @com.aliyun.core.annotation.NameInMap("LastError")
        private String lastError;

        @com.aliyun.core.annotation.NameInMap("PhysicalDbName")
        private String physicalDbName;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Long progress;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TaskDetailList(Builder builder) {
            this.delay = builder.delay;
            this.lastError = builder.lastError;
            this.physicalDbName = builder.physicalDbName;
            this.progress = builder.progress;
            this.statistics = builder.statistics;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskDetailList create() {
            return builder().build();
        }

        /**
         * @return delay
         */
        public Long getDelay() {
            return this.delay;
        }

        /**
         * @return lastError
         */
        public String getLastError() {
            return this.lastError;
        }

        /**
         * @return physicalDbName
         */
        public String getPhysicalDbName() {
            return this.physicalDbName;
        }

        /**
         * @return progress
         */
        public Long getProgress() {
            return this.progress;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
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
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long delay; 
            private String lastError; 
            private String physicalDbName; 
            private Long progress; 
            private String statistics; 
            private String status; 
            private Long taskId; 
            private String type; 

            private Builder() {
            } 

            private Builder(TaskDetailList model) {
                this.delay = model.delay;
                this.lastError = model.lastError;
                this.physicalDbName = model.physicalDbName;
                this.progress = model.progress;
                this.statistics = model.statistics;
                this.status = model.status;
                this.taskId = model.taskId;
                this.type = model.type;
            } 

            /**
             * <p>The delay time.</p>
             * 
             * <strong>example:</strong>
             * <p>58329</p>
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * <p>The most recent error message.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder lastError(String lastError) {
                this.lastError = lastError;
                return this;
            }

            /**
             * <p>The physical database name.</p>
             * 
             * <strong>example:</strong>
             * <p>drds_test</p>
             */
            public Builder physicalDbName(String physicalDbName) {
                this.physicalDbName = physicalDbName;
                return this;
            }

            /**
             * <p>The data import progress.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The performance and runtime metrics recorded during the execution of the data migration or import task.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;applyCount&quot;: 0,
             *   &quot;cpuUseRatio&quot;: 41,
             *   &quot;fsmId&quot;: 1,
             *   &quot;fullGcCount&quot;: 
             * }</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>fc3b1568-ad96-****-adca-dfe018b38077</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task type.</p>
             * 
             * <strong>example:</strong>
             * <p>FULL_COPY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TaskDetailList build() {
                return new TaskDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataImportTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataImportTaskInfoResponseBody</p>
     */
    public static class ServiceDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskDetailList")
        private java.util.List<TaskDetailList> taskDetailList;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ServiceDetailList(Builder builder) {
            this.id = builder.id;
            this.status = builder.status;
            this.taskDetailList = builder.taskDetailList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceDetailList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskDetailList
         */
        public java.util.List<TaskDetailList> getTaskDetailList() {
            return this.taskDetailList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long id; 
            private String status; 
            private java.util.List<TaskDetailList> taskDetailList; 
            private String type; 

            private Builder() {
            } 

            private Builder(ServiceDetailList model) {
                this.id = model.id;
                this.status = model.status;
                this.taskDetailList = model.taskDetailList;
                this.type = model.type;
            } 

            /**
             * <p>The service detail ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1991609</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The task execution status.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task details.</p>
             */
            public Builder taskDetailList(java.util.List<TaskDetailList> taskDetailList) {
                this.taskDetailList = taskDetailList;
                return this;
            }

            /**
             * <p>The replication type. Valid values:</p>
             * <ul>
             * <li>FULL_COPY: full replication.</li>
             * <li>INC_COPY: incremental replication.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FULL_COPY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ServiceDetailList build() {
                return new ServiceDetailList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataImportTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataImportTaskInfoResponseBody</p>
     */
    public static class DataImportTaskDetailInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FsmId")
        private Long fsmId;

        @com.aliyun.core.annotation.NameInMap("FsmState")
        private String fsmState;

        @com.aliyun.core.annotation.NameInMap("FsmStatus")
        private String fsmStatus;

        @com.aliyun.core.annotation.NameInMap("ServiceDetailList")
        private java.util.List<ServiceDetailList> serviceDetailList;

        private DataImportTaskDetailInfo(Builder builder) {
            this.fsmId = builder.fsmId;
            this.fsmState = builder.fsmState;
            this.fsmStatus = builder.fsmStatus;
            this.serviceDetailList = builder.serviceDetailList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataImportTaskDetailInfo create() {
            return builder().build();
        }

        /**
         * @return fsmId
         */
        public Long getFsmId() {
            return this.fsmId;
        }

        /**
         * @return fsmState
         */
        public String getFsmState() {
            return this.fsmState;
        }

        /**
         * @return fsmStatus
         */
        public String getFsmStatus() {
            return this.fsmStatus;
        }

        /**
         * @return serviceDetailList
         */
        public java.util.List<ServiceDetailList> getServiceDetailList() {
            return this.serviceDetailList;
        }

        public static final class Builder {
            private Long fsmId; 
            private String fsmState; 
            private String fsmStatus; 
            private java.util.List<ServiceDetailList> serviceDetailList; 

            private Builder() {
            } 

            private Builder(DataImportTaskDetailInfo model) {
                this.fsmId = model.fsmId;
                this.fsmState = model.fsmState;
                this.fsmStatus = model.fsmStatus;
                this.serviceDetailList = model.serviceDetailList;
            } 

            /**
             * <p>The progress ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fsmId(Long fsmId) {
                this.fsmId = fsmId;
                return this;
            }

            /**
             * <p>The state identifier in the data migration or synchronization task.</p>
             * 
             * <strong>example:</strong>
             * <p>RECON_FINISHED_CATCH_UP</p>
             */
            public Builder fsmState(String fsmState) {
                this.fsmState = fsmState;
                return this;
            }

            /**
             * <p>The status in the data migration, import, or synchronization system.</p>
             * 
             * <strong>example:</strong>
             * <p>IMPORT_NOT_BEGIN</p>
             */
            public Builder fsmStatus(String fsmStatus) {
                this.fsmStatus = fsmStatus;
                return this;
            }

            /**
             * <p>The data import task details.</p>
             */
            public Builder serviceDetailList(java.util.List<ServiceDetailList> serviceDetailList) {
                this.serviceDetailList = serviceDetailList;
                return this;
            }

            public DataImportTaskDetailInfo build() {
                return new DataImportTaskDetailInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDataImportTaskInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataImportTaskInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataImportTaskDetailInfo")
        private DataImportTaskDetailInfo dataImportTaskDetailInfo;

        private Data(Builder builder) {
            this.dataImportTaskDetailInfo = builder.dataImportTaskDetailInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataImportTaskDetailInfo
         */
        public DataImportTaskDetailInfo getDataImportTaskDetailInfo() {
            return this.dataImportTaskDetailInfo;
        }

        public static final class Builder {
            private DataImportTaskDetailInfo dataImportTaskDetailInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataImportTaskDetailInfo = model.dataImportTaskDetailInfo;
            } 

            /**
             * <p>The task details.</p>
             */
            public Builder dataImportTaskDetailInfo(DataImportTaskDetailInfo dataImportTaskDetailInfo) {
                this.dataImportTaskDetailInfo = dataImportTaskDetailInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
