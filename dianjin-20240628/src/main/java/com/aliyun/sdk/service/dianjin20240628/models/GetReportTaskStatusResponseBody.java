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
 * {@link GetReportTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetReportTaskStatusResponseBody</p>
 */
public class GetReportTaskStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("outRequestNo")
    private String outRequestNo;

    @com.aliyun.core.annotation.NameInMap("taskStatus")
    private String taskStatus;

    private GetReportTaskStatusResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.outRequestNo = builder.outRequestNo;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReportTaskStatusResponseBody create() {
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
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return outRequestNo
     */
    public String getOutRequestNo() {
        return this.outRequestNo;
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
        private String gmtCreate; 
        private String gmtModified; 
        private String outRequestNo; 
        private String taskStatus; 

        private Builder() {
        } 

        private Builder(GetReportTaskStatusResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.outRequestNo = model.outRequestNo;
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
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
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
         * taskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public GetReportTaskStatusResponseBody build() {
            return new GetReportTaskStatusResponseBody(this);
        } 

    } 

}
