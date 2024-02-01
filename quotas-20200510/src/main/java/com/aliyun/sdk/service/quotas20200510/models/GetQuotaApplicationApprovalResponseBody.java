// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaApplicationApprovalResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaApplicationApprovalResponseBody</p>
 */
public class GetQuotaApplicationApprovalResponseBody extends TeaModel {
    @NameInMap("AllowRetry")
    private Boolean allowRetry;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorArgs")
    private java.util.List < ? > errorArgs;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Module")
    private Module module;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * AllowRetry.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorArgs.
         */
        public Builder errorArgs(java.util.List < ? > errorArgs) {
            this.errorArgs = errorArgs;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
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

        public GetQuotaApplicationApprovalResponseBody build() {
            return new GetQuotaApplicationApprovalResponseBody(this);
        } 

    } 

    public static class Module extends TeaModel {
        @NameInMap("ApprovalHours")
        private Integer approvalHours;

        @NameInMap("ReminderIntervalHours")
        private Integer reminderIntervalHours;

        @NameInMap("SupportReminder")
        private Boolean supportReminder;

        @NameInMap("UnsupportReminderReason")
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
             * ApprovalHours.
             */
            public Builder approvalHours(Integer approvalHours) {
                this.approvalHours = approvalHours;
                return this;
            }

            /**
             * ReminderIntervalHours.
             */
            public Builder reminderIntervalHours(Integer reminderIntervalHours) {
                this.reminderIntervalHours = reminderIntervalHours;
                return this;
            }

            /**
             * SupportReminder.
             */
            public Builder supportReminder(Boolean supportReminder) {
                this.supportReminder = supportReminder;
                return this;
            }

            /**
             * UnsupportReminderReason.
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
