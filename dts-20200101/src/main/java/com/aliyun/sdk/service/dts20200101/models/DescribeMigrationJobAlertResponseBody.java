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
 * {@link DescribeMigrationJobAlertResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrationJobAlertResponseBody</p>
 */
public class DescribeMigrationJobAlertResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("MigrationJobId")
    private String migrationJobId;

    @com.aliyun.core.annotation.NameInMap("MigrationJobName")
    private String migrationJobName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeMigrationJobAlertResponseBody(Builder builder) {
        this.delayAlertPhone = builder.delayAlertPhone;
        this.delayAlertStatus = builder.delayAlertStatus;
        this.delayOverSeconds = builder.delayOverSeconds;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.errorAlertPhone = builder.errorAlertPhone;
        this.errorAlertStatus = builder.errorAlertStatus;
        this.migrationJobId = builder.migrationJobId;
        this.migrationJobName = builder.migrationJobName;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationJobAlertResponseBody create() {
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
     * @return migrationJobId
     */
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    /**
     * @return migrationJobName
     */
    public String getMigrationJobName() {
        return this.migrationJobName;
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
        private String delayAlertPhone; 
        private String delayAlertStatus; 
        private String delayOverSeconds; 
        private String errCode; 
        private String errMessage; 
        private String errorAlertPhone; 
        private String errorAlertStatus; 
        private String migrationJobId; 
        private String migrationJobName; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeMigrationJobAlertResponseBody model) {
            this.delayAlertPhone = model.delayAlertPhone;
            this.delayAlertStatus = model.delayAlertStatus;
            this.delayOverSeconds = model.delayOverSeconds;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.errorAlertPhone = model.errorAlertPhone;
            this.errorAlertStatus = model.errorAlertStatus;
            this.migrationJobId = model.migrationJobId;
            this.migrationJobName = model.migrationJobName;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Phone number of the contact for delay alarm.</p>
         * 
         * <strong>example:</strong>
         * <p>1361234****,1371234****</p>
         */
        public Builder delayAlertPhone(String delayAlertPhone) {
            this.delayAlertPhone = delayAlertPhone;
            return this;
        }

        /**
         * <p>Whether to monitor the delay status, return values:</p>
         * <ul>
         * <li><strong>enable</strong>: Yes. - <strong>disable</strong>: No.</li>
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
         * <p>The threshold for triggering a delayed alarm, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder delayOverSeconds(String delayOverSeconds) {
            this.delayOverSeconds = delayOverSeconds;
            return this;
        }

        /**
         * <p>Error code returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>Phone number of the contact for abnormal alarm notifications</p>
         * 
         * <strong>example:</strong>
         * <p>1361234****,1371234****</p>
         */
        public Builder errorAlertPhone(String errorAlertPhone) {
            this.errorAlertPhone = errorAlertPhone;
            return this;
        }

        /**
         * <p>Whether to monitor for abnormal status, return values:</p>
         * <ul>
         * <li><strong>enable</strong>: Yes. - <strong>disable</strong>: No.</li>
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
         * <p>Data migration instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dtslb9113qq11n****</p>
         */
        public Builder migrationJobId(String migrationJobId) {
            this.migrationJobId = migrationJobId;
            return this;
        }

        /**
         * <p>Name of the data migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>zwy-test5</p>
         */
        public Builder migrationJobName(String migrationJobName) {
            this.migrationJobName = migrationJobName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CFB89C51-6F03-519C-A921-AAE28D50AEFB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeMigrationJobAlertResponseBody build() {
            return new DescribeMigrationJobAlertResponseBody(this);
        } 

    } 

}
