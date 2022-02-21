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
         * Code.
         */
        public Builder code(String code) {
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * TraceId.
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
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ArmsAdvancedEnabled.
             */
            public Builder armsAdvancedEnabled(String armsAdvancedEnabled) {
                this.armsAdvancedEnabled = armsAdvancedEnabled;
                return this;
            }

            /**
             * ArmsApmInfo.
             */
            public Builder armsApmInfo(String armsApmInfo) {
                this.armsApmInfo = armsApmInfo;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CurrentStatus.
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * EnableAgent.
             */
            public Builder enableAgent(Boolean enableAgent) {
                this.enableAgent = enableAgent;
                return this;
            }

            /**
             * FileSizeLimit.
             */
            public Builder fileSizeLimit(Long fileSizeLimit) {
                this.fileSizeLimit = fileSizeLimit;
                return this;
            }

            /**
             * LastChangeOrderId.
             */
            public Builder lastChangeOrderId(String lastChangeOrderId) {
                this.lastChangeOrderId = lastChangeOrderId;
                return this;
            }

            /**
             * LastChangeOrderRunning.
             */
            public Builder lastChangeOrderRunning(Boolean lastChangeOrderRunning) {
                this.lastChangeOrderRunning = lastChangeOrderRunning;
                return this;
            }

            /**
             * LastChangeOrderStatus.
             */
            public Builder lastChangeOrderStatus(String lastChangeOrderStatus) {
                this.lastChangeOrderStatus = lastChangeOrderStatus;
                return this;
            }

            /**
             * RunningInstances.
             */
            public Builder runningInstances(Integer runningInstances) {
                this.runningInstances = runningInstances;
                return this;
            }

            /**
             * SubStatus.
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
