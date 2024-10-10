// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApplicationStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationStatusResponseBody</p>
 */
public class DescribeApplicationStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
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
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: indicates that the request was successful.</li>
         * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
         * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
         * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * <ul>
         * <li>If the request is successful, this parameter is not returned.****</li>
         * <li>This parameter is returned only if the request failed.**** For more information, see <strong>Error codes</strong> in this topic.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message. Valid values:</p>
         * <ul>
         * <li><strong>success</strong> is returned when the request succeeds.</li>
         * <li>An error code is returned when the request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether information of the application is successfully obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The ID of the trace. It is used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationStatusResponseBody build() {
            return new DescribeApplicationStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ArmsAdvancedEnabled")
        private String armsAdvancedEnabled;

        @com.aliyun.core.annotation.NameInMap("ArmsApmInfo")
        private String armsApmInfo;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CurrentStatus")
        private String currentStatus;

        @com.aliyun.core.annotation.NameInMap("EnableAgent")
        private Boolean enableAgent;

        @com.aliyun.core.annotation.NameInMap("FileSizeLimit")
        private Long fileSizeLimit;

        @com.aliyun.core.annotation.NameInMap("LastChangeOrderId")
        private String lastChangeOrderId;

        @com.aliyun.core.annotation.NameInMap("LastChangeOrderRunning")
        private Boolean lastChangeOrderRunning;

        @com.aliyun.core.annotation.NameInMap("LastChangeOrderStatus")
        private String lastChangeOrderStatus;

        @com.aliyun.core.annotation.NameInMap("RunningInstances")
        private Integer runningInstances;

        @com.aliyun.core.annotation.NameInMap("SubStatus")
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>Indicates whether Application Real-Time Monitoring Service (ARMS) advanced monitoring is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder armsAdvancedEnabled(String armsAdvancedEnabled) {
                this.armsAdvancedEnabled = armsAdvancedEnabled;
                return this;
            }

            /**
             * <p>The metadata of the application in ARMS.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;appId&quot;:&quot;0099b7be-5f5b-4512-a7fc-56049ef1****&quot;,&quot;licenseKey&quot;:&quot;d5cgdt5pu0@7303f55292a****&quot;}</p>
             */
            public Builder armsApmInfo(String armsApmInfo) {
                this.armsApmInfo = armsApmInfo;
                return this;
            }

            /**
             * <p>The time when the application was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1563373372746</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The current state of the application. Valid values:</p>
             * <ul>
             * <li><strong>RUNNING</strong></li>
             * <li><strong>STOPPED</strong></li>
             * <li><strong>UNKNOWN</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * <p>Indicates whether SAE agent is enabled.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableAgent(Boolean enableAgent) {
                this.enableAgent = enableAgent;
                return this;
            }

            /**
             * <p>The file size limit. Unit: KB. Valid values: 0 to 10240.</p>
             * 
             * <strong>example:</strong>
             * <p>10240</p>
             */
            public Builder fileSizeLimit(Long fileSizeLimit) {
                this.fileSizeLimit = fileSizeLimit;
                return this;
            }

            /**
             * <p>The ID of the latest change order that is executed. If no change orders have been executed or if change orders have expired, an empty parameter is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1ccc2339-fc19-49aa-bda0-1e7b8497****</p>
             */
            public Builder lastChangeOrderId(String lastChangeOrderId) {
                this.lastChangeOrderId = lastChangeOrderId;
                return this;
            }

            /**
             * <p>Indicates whether the latest change order is being executed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder lastChangeOrderRunning(Boolean lastChangeOrderRunning) {
                this.lastChangeOrderRunning = lastChangeOrderRunning;
                return this;
            }

            /**
             * <p>The state of the latest change order. Valid values:</p>
             * <ul>
             * <li><strong>READY</strong>: The change order is ready.</li>
             * <li><strong>RUNNING</strong>: The change order is being executed.</li>
             * <li><strong>SUCCESS</strong>: The change order was executed successfully.</li>
             * <li><strong>FAIL</strong>: The change order failed to be executed.</li>
             * <li><strong>ABORT</strong>: The change order is stopped.</li>
             * <li><strong>WAIT_BATCH_CONFIRM</strong>: The change order is pending execution. You must manually confirm the release batch.</li>
             * <li><strong>AUTO_BATCH_WAIT</strong>: The change order is pending execution. SAE will automatically confirm the release batch.</li>
             * <li><strong>SYSTEM_FAIL</strong>: A system exception occurred.</li>
             * <li><strong>WAIT_APPROVAL</strong>: The change order is pending approval.</li>
             * <li><strong>APPROVED</strong>: The change order is approved and is pending execution.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder lastChangeOrderStatus(String lastChangeOrderStatus) {
                this.lastChangeOrderStatus = lastChangeOrderStatus;
                return this;
            }

            /**
             * <p>The number of running instances of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder runningInstances(Integer runningInstances) {
                this.runningInstances = runningInstances;
                return this;
            }

            /**
             * <p>Indicates whether an error occurred while the change order was being executed. Valid values:</p>
             * <ul>
             * <li><strong>NORMAL</strong></li>
             * <li><strong>RUNNING_BUT_HAS_ERROR</strong> If an error occurs during a batch release, you must manually perform a rollback. In this case, the change order is still running because the task is not completed, but the state of the change order is RUNNING_BUT_HAS_ERROR.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
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
