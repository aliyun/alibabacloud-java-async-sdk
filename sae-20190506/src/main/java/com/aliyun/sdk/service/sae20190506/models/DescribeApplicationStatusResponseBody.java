// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationStatusResponseBody</p>
 */
public class DescribeApplicationStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private DescribeApplicationStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationStatusResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the request was successful.
         * *   **3xx**: indicates that the request was redirected.
         * *   **4xx**: indicates that the request was invalid.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         * <p>
         * 
         * *   If the request is successful, this parameter is not returned.****
         * *   This parameter is returned only if the request failed.**** For more information, see **Error codes** in this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned message. Valid values:
         * <p>
         * 
         * *   **success** is returned when the request succeeds.
         * *   An error code is returned when the request fails.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether information of the application is successfully obtained. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the trace. It is used to query the details of a request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationStatusResponseBody build() {
            return new DescribeApplicationStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("ArmsAdvancedEnabled")
        private String armsAdvancedEnabled;

        @NameInMap("ArmsApmInfo")
        private String armsApmInfo;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CurrentStatus")
        private String currentStatus;

        @NameInMap("EnableAgent")
        private Boolean enableAgent;

        @NameInMap("FileSizeLimit")
        private Long fileSizeLimit;

        @NameInMap("LastChangeOrderId")
        private String lastChangeOrderId;

        @NameInMap("LastChangeOrderRunning")
        private Boolean lastChangeOrderRunning;

        @NameInMap("LastChangeOrderStatus")
        private String lastChangeOrderStatus;

        @NameInMap("RunningInstances")
        private Integer runningInstances;

        @NameInMap("SubStatus")
        private String subStatus;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.armsAdvancedEnabled = builder.armsAdvancedEnabled;
            this.armsApmInfo = builder.armsApmInfo;
            this.createTime = builder.createTime;
            this.currentStatus = builder.currentStatus;
            this.enableAgent = builder.enableAgent;
            this.fileSizeLimit = builder.fileSizeLimit;
            this.lastChangeOrderId = builder.lastChangeOrderId;
            this.lastChangeOrderRunning = builder.lastChangeOrderRunning;
            this.lastChangeOrderStatus = builder.lastChangeOrderStatus;
            this.runningInstances = builder.runningInstances;
            this.subStatus = builder.subStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return armsAdvancedEnabled
         */
        public String getArmsAdvancedEnabled() {
            return this.armsAdvancedEnabled;
        }

        /**
         * @return armsApmInfo
         */
        public String getArmsApmInfo() {
            return this.armsApmInfo;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentStatus
         */
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        /**
         * @return enableAgent
         */
        public Boolean getEnableAgent() {
            return this.enableAgent;
        }

        /**
         * @return fileSizeLimit
         */
        public Long getFileSizeLimit() {
            return this.fileSizeLimit;
        }

        /**
         * @return lastChangeOrderId
         */
        public String getLastChangeOrderId() {
            return this.lastChangeOrderId;
        }

        /**
         * @return lastChangeOrderRunning
         */
        public Boolean getLastChangeOrderRunning() {
            return this.lastChangeOrderRunning;
        }

        /**
         * @return lastChangeOrderStatus
         */
        public String getLastChangeOrderStatus() {
            return this.lastChangeOrderStatus;
        }

        /**
         * @return runningInstances
         */
        public Integer getRunningInstances() {
            return this.runningInstances;
        }

        /**
         * @return subStatus
         */
        public String getSubStatus() {
            return this.subStatus;
        }

        public static final class Builder {
            private String appId; 
            private String armsAdvancedEnabled; 
            private String armsApmInfo; 
            private String createTime; 
            private String currentStatus; 
            private Boolean enableAgent; 
            private Long fileSizeLimit; 
            private String lastChangeOrderId; 
            private Boolean lastChangeOrderRunning; 
            private String lastChangeOrderStatus; 
            private Integer runningInstances; 
            private String subStatus; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Indicates whether Application Real-Time Monitoring Service (ARMS) advanced monitoring is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder armsAdvancedEnabled(String armsAdvancedEnabled) {
                this.armsAdvancedEnabled = armsAdvancedEnabled;
                return this;
            }

            /**
             * The metadata of the application in ARMS.
             */
            public Builder armsApmInfo(String armsApmInfo) {
                this.armsApmInfo = armsApmInfo;
                return this;
            }

            /**
             * The time when the application was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The current state of the application. Valid values:
             * <p>
             * 
             * *   **RUNNING**
             * *   **STOPPED**
             * *   **UNKNOWN**
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * Indicates whether SAE agent is enabled.
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enableAgent(Boolean enableAgent) {
                this.enableAgent = enableAgent;
                return this;
            }

            /**
             * The file size limit. Unit: KB. Valid values: 0 to 10240.
             */
            public Builder fileSizeLimit(Long fileSizeLimit) {
                this.fileSizeLimit = fileSizeLimit;
                return this;
            }

            /**
             * The ID of the latest change order that is executed. If no change orders have been executed or if change orders have expired, an empty parameter is returned.
             */
            public Builder lastChangeOrderId(String lastChangeOrderId) {
                this.lastChangeOrderId = lastChangeOrderId;
                return this;
            }

            /**
             * Indicates whether the latest change order is being executed. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder lastChangeOrderRunning(Boolean lastChangeOrderRunning) {
                this.lastChangeOrderRunning = lastChangeOrderRunning;
                return this;
            }

            /**
             * The state of the latest change order. Valid values:
             * <p>
             * 
             * *   **READY**: The change order is ready.
             * *   **RUNNING**: The change order is being executed.
             * *   **SUCCESS**: The change order was executed successfully.
             * *   **FAIL**: The change order failed to be executed.
             * *   **ABORT**: The change order is stopped.
             * *   **WAIT_BATCH_CONFIRM**: The change order is pending execution. You must manually confirm the release batch.
             * *   **AUTO_BATCH_WAIT**: The change order is pending execution. SAE will automatically confirm the release batch.
             * *   **SYSTEM_FAIL**: A system exception occurred.
             * *   **WAIT_APPROVAL**: The change order is pending approval.
             * *   **APPROVED**: The change order is approved and is pending execution.
             */
            public Builder lastChangeOrderStatus(String lastChangeOrderStatus) {
                this.lastChangeOrderStatus = lastChangeOrderStatus;
                return this;
            }

            /**
             * The number of running instances of the application.
             */
            public Builder runningInstances(Integer runningInstances) {
                this.runningInstances = runningInstances;
                return this;
            }

            /**
             * Indicates whether an error occurred while the change order was being executed. Valid values:
             * <p>
             * 
             * *   **NORMAL**
             * *   **RUNNING_BUT_HAS_ERROR** If an error occurs during a batch release, you must manually perform a rollback. In this case, the change order is still running because the task is not completed, but the state of the change order is RUNNING_BUT_HAS_ERROR.
             */
            public Builder subStatus(String subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
