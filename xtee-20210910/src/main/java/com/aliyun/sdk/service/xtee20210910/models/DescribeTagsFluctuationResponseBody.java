// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeTagsFluctuationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagsFluctuationResponseBody</p>
 */
public class DescribeTagsFluctuationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DescribeTagsFluctuationResponseBody(Builder builder) {
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

    public static DescribeTagsFluctuationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ResultObject> getResultObject() {
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
        private java.util.List<ResultObject> resultObject; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeTagsFluctuationResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
        } 

        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The input parameter data is not valid. order_storage_company_num component not found</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeTagsFluctuationResponseBody build() {
            return new DescribeTagsFluctuationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTagsFluctuationResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTagsFluctuationResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tableName")
        private String tableName;

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
            this.tableName = builder.tableName;
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
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
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
            private String tableName; 
            private Long todayNum; 
            private String withinSevenDayNum; 
            private String withinThirtyDayNum; 
            private String withinThreeDayNum; 
            private Long yesterdayNum; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.tableName = model.tableName;
                this.todayNum = model.todayNum;
                this.withinSevenDayNum = model.withinSevenDayNum;
                this.withinThirtyDayNum = model.withinThirtyDayNum;
                this.withinThreeDayNum = model.withinThreeDayNum;
                this.yesterdayNum = model.yesterdayNum;
            } 

            /**
             * <p>Tag name</p>
             * 
             * <strong>example:</strong>
             * <p>accountId</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>Data for today</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder todayNum(Long todayNum) {
                this.todayNum = todayNum;
                return this;
            }

            /**
             * <p>Data for the last seven days</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder withinSevenDayNum(String withinSevenDayNum) {
                this.withinSevenDayNum = withinSevenDayNum;
                return this;
            }

            /**
             * <p>Data for the last thirty days</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder withinThirtyDayNum(String withinThirtyDayNum) {
                this.withinThirtyDayNum = withinThirtyDayNum;
                return this;
            }

            /**
             * <p>Data for the last three days</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder withinThreeDayNum(String withinThreeDayNum) {
                this.withinThreeDayNum = withinThreeDayNum;
                return this;
            }

            /**
             * <p>Data for yesterday</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
