// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaApplicationApprovalResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaApplicationApprovalResponseBody</p>
 */
public class GetQuotaApplicationApprovalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List < ? > errorArgs;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQuotaApplicationApprovalResponseBody(Builder builder) {
        this.allowRetry = builder.allowRetry;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpStatusCode = builder.httpStatusCode;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaApplicationApprovalResponseBody create() {
        return builder().build();
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List < ? > getErrorArgs() {
        return this.errorArgs;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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
        private Boolean allowRetry; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List < ? > errorArgs; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpStatusCode; 
        private Module module; 
        private String requestId; 
        private Boolean success; 

        /**
         * Indicates whether retries are allowed. Valid values:
         * <p>
         * 
         * *   false
         * *   true
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * The dynamic error code.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The dynamic error message.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The parameters whose values are invalid.
         */
        public Builder errorArgs(java.util.List < ? > errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The information about quota application approval.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQuotaApplicationApprovalResponseBody build() {
            return new GetQuotaApplicationApprovalResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalHours")
        private Integer approvalHours;

        @com.aliyun.core.annotation.NameInMap("ReminderIntervalHours")
        private Integer reminderIntervalHours;

        @com.aliyun.core.annotation.NameInMap("SupportReminder")
        private Boolean supportReminder;

        @com.aliyun.core.annotation.NameInMap("UnsupportReminderReason")
        private String unsupportReminderReason;

        private Module(Builder builder) {
            this.approvalHours = builder.approvalHours;
            this.reminderIntervalHours = builder.reminderIntervalHours;
            this.supportReminder = builder.supportReminder;
            this.unsupportReminderReason = builder.unsupportReminderReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return approvalHours
         */
        public Integer getApprovalHours() {
            return this.approvalHours;
        }

        /**
         * @return reminderIntervalHours
         */
        public Integer getReminderIntervalHours() {
            return this.reminderIntervalHours;
        }

        /**
         * @return supportReminder
         */
        public Boolean getSupportReminder() {
            return this.supportReminder;
        }

        /**
         * @return unsupportReminderReason
         */
        public String getUnsupportReminderReason() {
            return this.unsupportReminderReason;
        }

        public static final class Builder {
            private Integer approvalHours; 
            private Integer reminderIntervalHours; 
            private Boolean supportReminder; 
            private String unsupportReminderReason; 

            /**
             * The average amount of time required to approve quota applications. Unit: hour.
             */
            public Builder approvalHours(Integer approvalHours) {
                this.approvalHours = approvalHours;
                return this;
            }

            /**
             * The interval between two consecutive approval reminders. Unit: hour.
             */
            public Builder reminderIntervalHours(Integer reminderIntervalHours) {
                this.reminderIntervalHours = reminderIntervalHours;
                return this;
            }

            /**
             * Indicates whether approval reminders are supported for quota applications. Valid values:
             * <p>
             * 
             * *   false
             * *   true
             */
            public Builder supportReminder(Boolean supportReminder) {
                this.supportReminder = supportReminder;
                return this;
            }

            /**
             * The reason why approval reminders are not supported for quota applications.
             */
            public Builder unsupportReminderReason(String unsupportReminderReason) {
                this.unsupportReminderReason = unsupportReminderReason;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
