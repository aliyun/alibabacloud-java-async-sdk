// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
    private java.util.List<?> errorArgs;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<?> getErrorArgs() {
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
        private java.util.List<?> errorArgs; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpStatusCode; 
        private Module module; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQuotaApplicationApprovalResponseBody model) {
            this.allowRetry = model.allowRetry;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpStatusCode = model.httpStatusCode;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Specifies whether retries are allowed. Valid values:</p>
         * <ul>
         * <li>false: Retries are not allowed.</li>
         * <li>true: Retries are allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>PARAMETER.ILLEGALL</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter[%s] is required.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error parameters.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM.PERMISSION.DENIED</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>You are not authorized to do this action or the API input parameter is invalid.</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response object.</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7ED584FB-ECBF-4A2A-969D-F54D25EFABF9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Specifies whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQuotaApplicationApprovalResponseBody build() {
            return new GetQuotaApplicationApprovalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQuotaApplicationApprovalResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaApplicationApprovalResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Module model) {
                this.approvalHours = model.approvalHours;
                this.reminderIntervalHours = model.reminderIntervalHours;
                this.supportReminder = model.supportReminder;
                this.unsupportReminderReason = model.unsupportReminderReason;
            } 

            /**
             * <p>The average approval time for the quota application. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder approvalHours(Integer approvalHours) {
                this.approvalHours = approvalHours;
                return this;
            }

            /**
             * <p>The approval reminder interval for the quota application. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder reminderIntervalHours(Integer reminderIntervalHours) {
                this.reminderIntervalHours = reminderIntervalHours;
                return this;
            }

            /**
             * <p>Specifies whether approval reminders are supported for the quota application. Valid values:</p>
             * <ul>
             * <li>false: Not supported.</li>
             * <li>true: Supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder supportReminder(Boolean supportReminder) {
                this.supportReminder = supportReminder;
                return this;
            }

            /**
             * <p>The reason why approval reminders are not supported for the quota application.</p>
             * 
             * <strong>example:</strong>
             * <p>can only be remind once within the interval</p>
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
