// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
         * <p>The mobile phone numbers that receive latency-related alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>1361234****,1371234****</p>
         */
        public Builder delayAlertPhone(String delayAlertPhone) {
            this.delayAlertPhone = delayAlertPhone;
            return this;
        }

        /**
         * <p>Indicates whether task latency is monitored. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: yes</li>
         * <li><strong>disable</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder delayAlertStatus(String delayAlertStatus) {
            this.delayAlertStatus = delayAlertStatus;
            return this;
        }

        /**
         * <p>The threshold for triggering latency alerts. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder delayOverSeconds(String delayOverSeconds) {
            this.delayOverSeconds = delayOverSeconds;
            return this;
        }

        /**
         * <p>The error code returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The mobile phone numbers that receive status-related alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>1361234****,1371234****</p>
         */
        public Builder errorAlertPhone(String errorAlertPhone) {
            this.errorAlertPhone = errorAlertPhone;
            return this;
        }

        /**
         * <p>Indicates whether task status is monitored. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: yes</li>
         * <li><strong>disable</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder errorAlertStatus(String errorAlertStatus) {
            this.errorAlertStatus = errorAlertStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>210ec20e16055205968635339d****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><p><strong>Forward</strong></p>
         * </li>
         * <li><p><strong>Reverse</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only when the topology of data synchronization is two-way synchronization.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * <p>The ID of the data synchronization instance.</p>
         * 
         * <strong>example:</strong>
         * <p>kxz1170c10p****</p>
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        /**
         * <p>The name of the data synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>Polar MySQL_TO_RDS MySQL</p>
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
