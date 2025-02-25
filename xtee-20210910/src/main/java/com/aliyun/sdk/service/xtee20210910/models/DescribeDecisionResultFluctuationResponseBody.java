// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDecisionResultFluctuationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDecisionResultFluctuationResponseBody</p>
 */
public class DescribeDecisionResultFluctuationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DescribeDecisionResultFluctuationResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDecisionResultFluctuationResponseBody create() {
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
     * @return resultObject
     */
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
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
        private java.util.List < ResultObject> resultObject; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDecisionResultFluctuationResponseBody build() {
            return new DescribeDecisionResultFluctuationResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("todayNum")
        private Long todayNum;

        @com.aliyun.core.annotation.NameInMap("withinSevenDayNum")
        private String withinSevenDayNum;

        @com.aliyun.core.annotation.NameInMap("withinThirtyDayNum")
        private String withinThirtyDayNum;

        @com.aliyun.core.annotation.NameInMap("withinThreeDayNum")
        private String withinThreeDayNum;

        @com.aliyun.core.annotation.NameInMap("yesterdayNum")
        private Long yesterdayNum;

        private ResultObject(Builder builder) {
            this.status = builder.status;
            this.todayNum = builder.todayNum;
            this.withinSevenDayNum = builder.withinSevenDayNum;
            this.withinThirtyDayNum = builder.withinThirtyDayNum;
            this.withinThreeDayNum = builder.withinThreeDayNum;
            this.yesterdayNum = builder.yesterdayNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return todayNum
         */
        public Long getTodayNum() {
            return this.todayNum;
        }

        /**
         * @return withinSevenDayNum
         */
        public String getWithinSevenDayNum() {
            return this.withinSevenDayNum;
        }

        /**
         * @return withinThirtyDayNum
         */
        public String getWithinThirtyDayNum() {
            return this.withinThirtyDayNum;
        }

        /**
         * @return withinThreeDayNum
         */
        public String getWithinThreeDayNum() {
            return this.withinThreeDayNum;
        }

        /**
         * @return yesterdayNum
         */
        public Long getYesterdayNum() {
            return this.yesterdayNum;
        }

        public static final class Builder {
            private String status; 
            private Long todayNum; 
            private String withinSevenDayNum; 
            private String withinThirtyDayNum; 
            private String withinThreeDayNum; 
            private Long yesterdayNum; 

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * todayNum.
             */
            public Builder todayNum(Long todayNum) {
                this.todayNum = todayNum;
                return this;
            }

            /**
             * withinSevenDayNum.
             */
            public Builder withinSevenDayNum(String withinSevenDayNum) {
                this.withinSevenDayNum = withinSevenDayNum;
                return this;
            }

            /**
             * withinThirtyDayNum.
             */
            public Builder withinThirtyDayNum(String withinThirtyDayNum) {
                this.withinThirtyDayNum = withinThirtyDayNum;
                return this;
            }

            /**
             * withinThreeDayNum.
             */
            public Builder withinThreeDayNum(String withinThreeDayNum) {
                this.withinThreeDayNum = withinThreeDayNum;
                return this;
            }

            /**
             * yesterdayNum.
             */
            public Builder yesterdayNum(Long yesterdayNum) {
                this.yesterdayNum = yesterdayNum;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
