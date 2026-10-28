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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NextRefreshTime.
         */
        public Builder nextRefreshTime(String nextRefreshTime) {
            this.nextRefreshTime = nextRefreshTime;
            return this;
        }

        /**
         * RefreshSuccess.
         */
        public Builder refreshSuccess(Boolean refreshSuccess) {
            this.refreshSuccess = refreshSuccess;
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

        public StartQuotaUtilizationReportResponseBody build() {
            return new StartQuotaUtilizationReportResponseBody(this);
        } 

    } 

}
