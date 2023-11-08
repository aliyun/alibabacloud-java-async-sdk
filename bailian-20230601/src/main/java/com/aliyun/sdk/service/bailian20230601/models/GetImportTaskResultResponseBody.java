// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImportTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetImportTaskResultResponseBody</p>
 */
public class GetImportTaskResultResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetImportTaskResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImportTaskResultResponseBody create() {
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
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

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
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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

        public GetImportTaskResultResponseBody build() {
            return new GetImportTaskResultResponseBody(this);
        } 

    } 

    public static class Details extends TeaModel {
        @NameInMap("DataId")
        private String dataId;

        @NameInMap("DataName")
        private String dataName;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("Success")
        private Boolean success;

        private Details(Builder builder) {
            this.dataId = builder.dataId;
            this.dataName = builder.dataName;
            this.errorMsg = builder.errorMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return dataName
         */
        public String getDataName() {
            return this.dataName;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String dataId; 
            private String dataName; 
            private String errorMsg; 
            private Boolean success; 

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * DataName.
             */
            public Builder dataName(String dataName) {
                this.dataName = dataName;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Details")
        private java.util.List < Details> details;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskStatus")
        private Integer taskStatus;

        @NameInMap("TaskStatusText")
        private String taskStatusText;

        private Data(Builder builder) {
            this.details = builder.details;
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
            this.taskStatusText = builder.taskStatusText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List < Details> getDetails() {
            return this.details;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskStatusText
         */
        public String getTaskStatusText() {
            return this.taskStatusText;
        }

        public static final class Builder {
            private java.util.List < Details> details; 
            private String taskId; 
            private Integer taskStatus; 
            private String taskStatusText; 

            /**
             * Details.
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TaskStatusText.
             */
            public Builder taskStatusText(String taskStatusText) {
                this.taskStatusText = taskStatusText;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
