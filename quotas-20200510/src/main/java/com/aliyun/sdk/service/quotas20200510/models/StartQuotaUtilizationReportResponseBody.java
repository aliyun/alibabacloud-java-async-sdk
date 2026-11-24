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
 * {@link StartQuotaUtilizationReportResponseBody} extends {@link TeaModel}
 *
 * <p>StartQuotaUtilizationReportResponseBody</p>
 */
public class StartQuotaUtilizationReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextRefreshTime")
    private String nextRefreshTime;

    @com.aliyun.core.annotation.NameInMap("RefreshSuccess")
    private Boolean refreshSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private StartQuotaUtilizationReportResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.message = builder.message;
        this.nextRefreshTime = builder.nextRefreshTime;
        this.refreshSuccess = builder.refreshSuccess;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartQuotaUtilizationReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextRefreshTime
     */
    public String getNextRefreshTime() {
        return this.nextRefreshTime;
    }

    /**
     * @return refreshSuccess
     */
    public Boolean getRefreshSuccess() {
        return this.refreshSuccess;
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
        private String errorCode; 
        private String errorMsg; 
        private String message; 
        private String nextRefreshTime; 
        private Boolean refreshSuccess; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(StartQuotaUtilizationReportResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.message = model.message;
            this.nextRefreshTime = model.nextRefreshTime;
            this.refreshSuccess = model.refreshSuccess;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>The description of the request processing result, such as report generation started or the allowed refresh time not reached. Use RefreshSuccess to determine the submission result instead of relying on the prompt text for programmatic evaluation.</p>
         * 
         * <strong>example:</strong>
         * <p>Quota utilization report generation has started</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The UTC time when the next refresh can be initiated, in the yyyy-MM-dd\&quot;T\&quot;HH:mm:ss\&quot;Z\&quot; format, such as 2026-10-26T08:00:00Z. This parameter is returned when a task is not submitted due to refresh limits. This parameter is empty when a task is successfully submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-26T08:00:00Z</p>
         */
        public Builder nextRefreshTime(String nextRefreshTime) {
            this.nextRefreshTime = nextRefreshTime;
            return this;
        }

        /**
         * <p>Indicates whether the report generation task was successfully submitted. A value of true indicates that the asynchronous task was submitted, but the report is not yet generated. A value of false indicates that the refresh limit period has not ended and no new task was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder refreshSuccess(Boolean refreshSuccess) {
            this.refreshSuccess = refreshSuccess;
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
         * <p>Indicates whether the call was successful. Valid values:</p>
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

        public StartQuotaUtilizationReportResponseBody build() {
            return new StartQuotaUtilizationReportResponseBody(this);
        } 

    } 

}
