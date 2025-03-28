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
 * {@link DescribeSubscriptionInstanceAlertResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSubscriptionInstanceAlertResponseBody</p>
 */
public class DescribeSubscriptionInstanceAlertResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceID")
    private String subscriptionInstanceID;

    @com.aliyun.core.annotation.NameInMap("SubscriptionInstanceName")
    private String subscriptionInstanceName;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeSubscriptionInstanceAlertResponseBody(Builder builder) {
        this.delayAlertPhone = builder.delayAlertPhone;
        this.delayAlertStatus = builder.delayAlertStatus;
        this.delayOverSeconds = builder.delayOverSeconds;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.errorAlertPhone = builder.errorAlertPhone;
        this.errorAlertStatus = builder.errorAlertStatus;
        this.requestId = builder.requestId;
        this.subscriptionInstanceID = builder.subscriptionInstanceID;
        this.subscriptionInstanceName = builder.subscriptionInstanceName;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubscriptionInstanceAlertResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return subscriptionInstanceID
     */
    public String getSubscriptionInstanceID() {
        return this.subscriptionInstanceID;
    }

    /**
     * @return subscriptionInstanceName
     */
    public String getSubscriptionInstanceName() {
        return this.subscriptionInstanceName;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
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
        private String subscriptionInstanceID; 
        private String subscriptionInstanceName; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeSubscriptionInstanceAlertResponseBody model) {
            this.delayAlertPhone = model.delayAlertPhone;
            this.delayAlertStatus = model.delayAlertStatus;
            this.delayOverSeconds = model.delayOverSeconds;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.errorAlertPhone = model.errorAlertPhone;
            this.errorAlertStatus = model.errorAlertStatus;
            this.requestId = model.requestId;
            this.subscriptionInstanceID = model.subscriptionInstanceID;
            this.subscriptionInstanceName = model.subscriptionInstanceName;
            this.success = model.success;
        } 

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
         * <p>The threshold for triggering latency alerts. The unit is seconds and the value is an integer. The recommended value is 10 seconds.</p>
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
         * <p>210ec2e116055198849072222d****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the change tracking instance.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsl8zl9ek6292****</p>
         */
        public Builder subscriptionInstanceID(String subscriptionInstanceID) {
            this.subscriptionInstanceID = subscriptionInstanceID;
            return this;
        }

        /**
         * <p>The name of the change tracking instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder subscriptionInstanceName(String subscriptionInstanceName) {
            this.subscriptionInstanceName = subscriptionInstanceName;
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

        public DescribeSubscriptionInstanceAlertResponseBody build() {
            return new DescribeSubscriptionInstanceAlertResponseBody(this);
        } 

    } 

}
