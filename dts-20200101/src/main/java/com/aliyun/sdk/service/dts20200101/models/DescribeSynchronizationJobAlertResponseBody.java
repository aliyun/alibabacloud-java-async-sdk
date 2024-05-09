// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynchronizationJobAlertResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSynchronizationJobAlertResponseBody</p>
 */
public class DescribeSynchronizationJobAlertResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DelayAlertPhone")
    private String delayAlertPhone;

    @com.aliyun.core.annotation.NameInMap("DelayAlertStatus")
    private String delayAlertStatus;

    @com.aliyun.core.annotation.NameInMap("DelayOverSeconds")
    private String delayOverSeconds;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorAlertPhone")
    private String errorAlertPhone;

    @com.aliyun.core.annotation.NameInMap("ErrorAlertStatus")
    private String errorAlertStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @com.aliyun.core.annotation.NameInMap("SynchronizationJobId")
    private String synchronizationJobId;

    @com.aliyun.core.annotation.NameInMap("SynchronizationJobName")
    private String synchronizationJobName;

    private DescribeSynchronizationJobAlertResponseBody(Builder builder) {
        this.delayAlertPhone = builder.delayAlertPhone;
        this.delayAlertStatus = builder.delayAlertStatus;
        this.delayOverSeconds = builder.delayOverSeconds;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.errorAlertPhone = builder.errorAlertPhone;
        this.errorAlertStatus = builder.errorAlertStatus;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.synchronizationJobId = builder.synchronizationJobId;
        this.synchronizationJobName = builder.synchronizationJobName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSynchronizationJobAlertResponseBody create() {
        return builder().build();
    }

    /**
     * @return delayAlertPhone
     */
    public String getDelayAlertPhone() {
        return this.delayAlertPhone;
    }

    /**
     * @return delayAlertStatus
     */
    public String getDelayAlertStatus() {
        return this.delayAlertStatus;
    }

    /**
     * @return delayOverSeconds
     */
    public String getDelayOverSeconds() {
        return this.delayOverSeconds;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return errorAlertPhone
     */
    public String getErrorAlertPhone() {
        return this.errorAlertPhone;
    }

    /**
     * @return errorAlertStatus
     */
    public String getErrorAlertStatus() {
        return this.errorAlertStatus;
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

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    /**
     * @return synchronizationJobName
     */
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    public static final class Builder {
        private String delayAlertPhone; 
        private String delayAlertStatus; 
        private String delayOverSeconds; 
        private String errCode; 
        private String errMessage; 
        private String errorAlertPhone; 
        private String errorAlertStatus; 
        private String requestId; 
        private String success; 
        private String synchronizationDirection; 
        private String synchronizationJobId; 
        private String synchronizationJobName; 

        /**
         * The mobile phone numbers that receive latency-related alerts.
         */
        public Builder delayAlertPhone(String delayAlertPhone) {
            this.delayAlertPhone = delayAlertPhone;
            return this;
        }

        /**
         * Indicates whether task latency is monitored. Valid values:
         * <p>
         * 
         * *   **enable**: yes
         * *   **disable**: no
         */
        public Builder delayAlertStatus(String delayAlertStatus) {
            this.delayAlertStatus = delayAlertStatus;
            return this;
        }

        /**
         * The threshold for triggering latency alerts. Unit: seconds.
         */
        public Builder delayOverSeconds(String delayOverSeconds) {
            this.delayOverSeconds = delayOverSeconds;
            return this;
        }

        /**
         * The error code returned if the call failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the call failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The mobile phone numbers that receive status-related alerts.
         */
        public Builder errorAlertPhone(String errorAlertPhone) {
            this.errorAlertPhone = errorAlertPhone;
            return this;
        }

        /**
         * Indicates whether task status is monitored. Valid values:
         * <p>
         * 
         * *   **enable**: yes
         * *   **disable**: no
         */
        public Builder errorAlertStatus(String errorAlertStatus) {
            this.errorAlertStatus = errorAlertStatus;
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
         * Indicates whether the call was successful.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The synchronization direction. Valid values:
         * <p>
         * 
         * *   **Forward**
         * 
         * *   **Reverse**
         * 
         * > This parameter is returned only when the topology of data synchronization is two-way synchronization.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * The ID of the data synchronization instance.
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        /**
         * The name of the data synchronization task.
         */
        public Builder synchronizationJobName(String synchronizationJobName) {
            this.synchronizationJobName = synchronizationJobName;
            return this;
        }

        public DescribeSynchronizationJobAlertResponseBody build() {
            return new DescribeSynchronizationJobAlertResponseBody(this);
        } 

    } 

}
