// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link GetValidateFileStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetValidateFileStatusResponseBody</p>
 */
public class GetValidateFileStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatchAllNum")
    private String catchAllNum;

    @com.aliyun.core.annotation.NameInMap("CompleteTime")
    private String completeTime;

    @com.aliyun.core.annotation.NameInMap("DoNotMailNum")
    private String doNotMailNum;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("InvalidNum")
    private String invalidNum;

    @com.aliyun.core.annotation.NameInMap("Percentage")
    private String percentage;

    @com.aliyun.core.annotation.NameInMap("ProcessedNum")
    private String processedNum;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private String totalNum;

    @com.aliyun.core.annotation.NameInMap("UnknownNum")
    private String unknownNum;

    @com.aliyun.core.annotation.NameInMap("UploadTime")
    private String uploadTime;

    @com.aliyun.core.annotation.NameInMap("ValidNum")
    private String validNum;

    private GetValidateFileStatusResponseBody(Builder builder) {
        this.catchAllNum = builder.catchAllNum;
        this.completeTime = builder.completeTime;
        this.doNotMailNum = builder.doNotMailNum;
        this.fileName = builder.fileName;
        this.invalidNum = builder.invalidNum;
        this.percentage = builder.percentage;
        this.processedNum = builder.processedNum;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.totalNum = builder.totalNum;
        this.unknownNum = builder.unknownNum;
        this.uploadTime = builder.uploadTime;
        this.validNum = builder.validNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetValidateFileStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catchAllNum
     */
    public String getCatchAllNum() {
        return this.catchAllNum;
    }

    /**
     * @return completeTime
     */
    public String getCompleteTime() {
        return this.completeTime;
    }

    /**
     * @return doNotMailNum
     */
    public String getDoNotMailNum() {
        return this.doNotMailNum;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return invalidNum
     */
    public String getInvalidNum() {
        return this.invalidNum;
    }

    /**
     * @return percentage
     */
    public String getPercentage() {
        return this.percentage;
    }

    /**
     * @return processedNum
     */
    public String getProcessedNum() {
        return this.processedNum;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalNum
     */
    public String getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return unknownNum
     */
    public String getUnknownNum() {
        return this.unknownNum;
    }

    /**
     * @return uploadTime
     */
    public String getUploadTime() {
        return this.uploadTime;
    }

    /**
     * @return validNum
     */
    public String getValidNum() {
        return this.validNum;
    }

    public static final class Builder {
        private String catchAllNum; 
        private String completeTime; 
        private String doNotMailNum; 
        private String fileName; 
        private String invalidNum; 
        private String percentage; 
        private String processedNum; 
        private String requestId; 
        private String status; 
        private String totalNum; 
        private String unknownNum; 
        private String uploadTime; 
        private String validNum; 

        private Builder() {
        } 

        private Builder(GetValidateFileStatusResponseBody model) {
            this.catchAllNum = model.catchAllNum;
            this.completeTime = model.completeTime;
            this.doNotMailNum = model.doNotMailNum;
            this.fileName = model.fileName;
            this.invalidNum = model.invalidNum;
            this.percentage = model.percentage;
            this.processedNum = model.processedNum;
            this.requestId = model.requestId;
            this.status = model.status;
            this.totalNum = model.totalNum;
            this.unknownNum = model.unknownNum;
            this.uploadTime = model.uploadTime;
            this.validNum = model.validNum;
        } 

        /**
         * CatchAllNum.
         */
        public Builder catchAllNum(String catchAllNum) {
            this.catchAllNum = catchAllNum;
            return this;
        }

        /**
         * CompleteTime.
         */
        public Builder completeTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }

        /**
         * DoNotMailNum.
         */
        public Builder doNotMailNum(String doNotMailNum) {
            this.doNotMailNum = doNotMailNum;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * InvalidNum.
         */
        public Builder invalidNum(String invalidNum) {
            this.invalidNum = invalidNum;
            return this;
        }

        /**
         * Percentage.
         */
        public Builder percentage(String percentage) {
            this.percentage = percentage;
            return this;
        }

        /**
         * ProcessedNum.
         */
        public Builder processedNum(String processedNum) {
            this.processedNum = processedNum;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(String totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * UnknownNum.
         */
        public Builder unknownNum(String unknownNum) {
            this.unknownNum = unknownNum;
            return this;
        }

        /**
         * UploadTime.
         */
        public Builder uploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }

        /**
         * ValidNum.
         */
        public Builder validNum(String validNum) {
            this.validNum = validNum;
            return this;
        }

        public GetValidateFileStatusResponseBody build() {
            return new GetValidateFileStatusResponseBody(this);
        } 

    } 

}
