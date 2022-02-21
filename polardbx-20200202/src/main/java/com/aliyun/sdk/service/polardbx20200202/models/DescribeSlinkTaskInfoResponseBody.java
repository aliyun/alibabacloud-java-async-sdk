// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlinkTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlinkTaskInfoResponseBody</p>
 */
public class DescribeSlinkTaskInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("Success")
    private String success;

    private DescribeSlinkTaskInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlinkTaskInfoResponseBody create() {
        return builder().build();
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
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeSlinkTaskInfoResponseBody build() {
            return new DescribeSlinkTaskInfoResponseBody(this);
        } 

    } 

    public static class TaskDetailList extends TeaModel {
        @NameInMap("Delay")
        private Long delay;

        @NameInMap("LastError")
        private String lastError;

        @NameInMap("PhysicalDbName")
        private String physicalDbName;

        @NameInMap("Progress")
        private Long progress;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private Long taskId;

        @NameInMap("Type")
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

            /**
             * Delay.
             */
            public Builder delay(Long delay) {
                this.delay = delay;
                return this;
            }

            /**
             * LastError.
             */
            public Builder lastError(String lastError) {
                this.lastError = lastError;
                return this;
            }

            /**
             * PhysicalDbName.
             */
            public Builder physicalDbName(String physicalDbName) {
                this.physicalDbName = physicalDbName;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Statistics.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Type.
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
    public static class ServiceDetailList extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskDetailList")
        private java.util.List < TaskDetailList> taskDetailList;

        @NameInMap("Type")
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
        public java.util.List < TaskDetailList> getTaskDetailList() {
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
            private java.util.List < TaskDetailList> taskDetailList; 
            private String type; 

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskDetailList.
             */
            public Builder taskDetailList(java.util.List < TaskDetailList> taskDetailList) {
                this.taskDetailList = taskDetailList;
                return this;
            }

            /**
             * Type.
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
    public static class DataImportTaskDetailInfo extends TeaModel {
        @NameInMap("FsmId")
        private Long fsmId;

        @NameInMap("FsmState")
        private String fsmState;

        @NameInMap("FsmStatus")
        private String fsmStatus;

        @NameInMap("ServiceDetailList")
        private java.util.List < ServiceDetailList> serviceDetailList;

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
        public java.util.List < ServiceDetailList> getServiceDetailList() {
            return this.serviceDetailList;
        }

        public static final class Builder {
            private Long fsmId; 
            private String fsmState; 
            private String fsmStatus; 
            private java.util.List < ServiceDetailList> serviceDetailList; 

            /**
             * FsmId.
             */
            public Builder fsmId(Long fsmId) {
                this.fsmId = fsmId;
                return this;
            }

            /**
             * FsmState.
             */
            public Builder fsmState(String fsmState) {
                this.fsmState = fsmState;
                return this;
            }

            /**
             * FsmStatus.
             */
            public Builder fsmStatus(String fsmStatus) {
                this.fsmStatus = fsmStatus;
                return this;
            }

            /**
             * ServiceDetailList.
             */
            public Builder serviceDetailList(java.util.List < ServiceDetailList> serviceDetailList) {
                this.serviceDetailList = serviceDetailList;
                return this;
            }

            public DataImportTaskDetailInfo build() {
                return new DataImportTaskDetailInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DataImportTaskDetailInfo")
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

            /**
             * DataImportTaskDetailInfo.
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
