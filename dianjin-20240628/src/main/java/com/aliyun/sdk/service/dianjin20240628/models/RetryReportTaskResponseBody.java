// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link RetryReportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>RetryReportTaskResponseBody</p>
 */
public class RetryReportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("outRequestNo")
    private String outRequestNo;

    @com.aliyun.core.annotation.NameInMap("retryAvailable")
    private Boolean retryAvailable;

    @com.aliyun.core.annotation.NameInMap("retryCount")
    private Integer retryCount;

    @com.aliyun.core.annotation.NameInMap("taskStatus")
    private String taskStatus;

    private RetryReportTaskResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.outRequestNo = builder.outRequestNo;
        this.retryAvailable = builder.retryAvailable;
        this.retryCount = builder.retryCount;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryReportTaskResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return outRequestNo
     */
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    /**
     * @return retryAvailable
     */
    public Boolean getRetryAvailable() {
        return this.retryAvailable;
    }

    /**
     * @return retryCount
     */
    public Integer getRetryCount() {
        return this.retryCount;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String outRequestNo; 
        private Boolean retryAvailable; 
        private Integer retryCount; 
        private String taskStatus; 

        private Builder() {
        } 

        private Builder(RetryReportTaskResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.outRequestNo = model.outRequestNo;
            this.retryAvailable = model.retryAvailable;
            this.retryCount = model.retryCount;
            this.taskStatus = model.taskStatus;
        } 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * outRequestNo.
         */
        public Builder outRequestNo(String outRequestNo) {
            this.outRequestNo = outRequestNo;
            return this;
        }

        /**
         * retryAvailable.
         */
        public Builder retryAvailable(Boolean retryAvailable) {
            this.retryAvailable = retryAvailable;
            return this;
        }

        /**
         * retryCount.
         */
        public Builder retryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }

        /**
         * taskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public RetryReportTaskResponseBody build() {
            return new RetryReportTaskResponseBody(this);
        } 

    } 

}
