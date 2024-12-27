// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ExecuteAITeacherGrammarCheckResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteAITeacherGrammarCheckResponseBody</p>
 */
public class ExecuteAITeacherGrammarCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ExecuteAITeacherGrammarCheckResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteAITeacherGrammarCheckResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ExecuteAITeacherGrammarCheckResponseBody build() {
            return new ExecuteAITeacherGrammarCheckResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteAITeacherGrammarCheckResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteAITeacherGrammarCheckResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysis")
        private String analysis;

        @com.aliyun.core.annotation.NameInMap("correction")
        private String correction;

        @com.aliyun.core.annotation.NameInMap("correctionStatus")
        private String correctionStatus;

        @com.aliyun.core.annotation.NameInMap("errorReason")
        private String errorReason;

        private Data(Builder builder) {
            this.analysis = builder.analysis;
            this.correction = builder.correction;
            this.correctionStatus = builder.correctionStatus;
            this.errorReason = builder.errorReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analysis
         */
        public String getAnalysis() {
            return this.analysis;
        }

        /**
         * @return correction
         */
        public String getCorrection() {
            return this.correction;
        }

        /**
         * @return correctionStatus
         */
        public String getCorrectionStatus() {
            return this.correctionStatus;
        }

        /**
         * @return errorReason
         */
        public String getErrorReason() {
            return this.errorReason;
        }

        public static final class Builder {
            private String analysis; 
            private String correction; 
            private String correctionStatus; 
            private String errorReason; 

            /**
             * analysis.
             */
            public Builder analysis(String analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * correction.
             */
            public Builder correction(String correction) {
                this.correction = correction;
                return this;
            }

            /**
             * correctionStatus.
             */
            public Builder correctionStatus(String correctionStatus) {
                this.correctionStatus = correctionStatus;
                return this;
            }

            /**
             * errorReason.
             */
            public Builder errorReason(String errorReason) {
                this.errorReason = errorReason;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
