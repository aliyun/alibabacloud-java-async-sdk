// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainTransactionStatisticsV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainTransactionStatisticsV2ResponseBody</p>
 */
public class DescribeAntChainTransactionStatisticsV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAntChainTransactionStatisticsV2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainTransactionStatisticsV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 
        private String resultCode; 
        private String resultMessage; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAntChainTransactionStatisticsV2ResponseBody build() {
            return new DescribeAntChainTransactionStatisticsV2ResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AntChainId")
        private String antChainId;

        @com.aliyun.core.annotation.NameInMap("CreatTime")
        private Long creatTime;

        @com.aliyun.core.annotation.NameInMap("Dt")
        private Long dt;

        @com.aliyun.core.annotation.NameInMap("LastSumBlockHeight")
        private Long lastSumBlockHeight;

        @com.aliyun.core.annotation.NameInMap("TransCount")
        private Long transCount;

        private Result(Builder builder) {
            this.antChainId = builder.antChainId;
            this.creatTime = builder.creatTime;
            this.dt = builder.dt;
            this.lastSumBlockHeight = builder.lastSumBlockHeight;
            this.transCount = builder.transCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return antChainId
         */
        public String getAntChainId() {
            return this.antChainId;
        }

        /**
         * @return creatTime
         */
        public Long getCreatTime() {
            return this.creatTime;
        }

        /**
         * @return dt
         */
        public Long getDt() {
            return this.dt;
        }

        /**
         * @return lastSumBlockHeight
         */
        public Long getLastSumBlockHeight() {
            return this.lastSumBlockHeight;
        }

        /**
         * @return transCount
         */
        public Long getTransCount() {
            return this.transCount;
        }

        public static final class Builder {
            private String antChainId; 
            private Long creatTime; 
            private Long dt; 
            private Long lastSumBlockHeight; 
            private Long transCount; 

            /**
             * AntChainId.
             */
            public Builder antChainId(String antChainId) {
                this.antChainId = antChainId;
                return this;
            }

            /**
             * CreatTime.
             */
            public Builder creatTime(Long creatTime) {
                this.creatTime = creatTime;
                return this;
            }

            /**
             * Dt.
             */
            public Builder dt(Long dt) {
                this.dt = dt;
                return this;
            }

            /**
             * LastSumBlockHeight.
             */
            public Builder lastSumBlockHeight(Long lastSumBlockHeight) {
                this.lastSumBlockHeight = lastSumBlockHeight;
                return this;
            }

            /**
             * TransCount.
             */
            public Builder transCount(Long transCount) {
                this.transCount = transCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
