// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleBarChartResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleBarChartResponseBody</p>
 */
public class DescribeRuleBarChartResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DescribeRuleBarChartResponseBody(Builder builder) {
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

    public static DescribeRuleBarChartResponseBody create() {
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
    public ResultObject getResultObject() {
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
        private ResultObject resultObject; 
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
        public Builder resultObject(ResultObject resultObject) {
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

        public DescribeRuleBarChartResponseBody build() {
            return new DescribeRuleBarChartResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("num")
        private Long num;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.eventName = builder.eventName;
            this.num = builder.num;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return num
         */
        public Long getNum() {
            return this.num;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String eventName; 
            private Long num; 
            private String ruleName; 
            private String status; 

            /**
             * eventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * num.
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            /**
             * ruleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < Data> data;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Series(Builder builder) {
            this.data = builder.data;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < Data> data; 
            private String type; 

            /**
             * data.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    public static class Yaxis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < String > data;

        private Yaxis(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Yaxis create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < String > getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < String > data; 

            /**
             * data.
             */
            public Builder data(java.util.List < String > data) {
                this.data = data;
                return this;
            }

            public Yaxis build() {
                return new Yaxis(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List < Series> series;

        @com.aliyun.core.annotation.NameInMap("yaxis")
        private Yaxis yaxis;

        private ResultObject(Builder builder) {
            this.series = builder.series;
            this.yaxis = builder.yaxis;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return series
         */
        public java.util.List < Series> getSeries() {
            return this.series;
        }

        /**
         * @return yaxis
         */
        public Yaxis getYaxis() {
            return this.yaxis;
        }

        public static final class Builder {
            private java.util.List < Series> series; 
            private Yaxis yaxis; 

            /**
             * series.
             */
            public Builder series(java.util.List < Series> series) {
                this.series = series;
                return this;
            }

            /**
             * yaxis.
             */
            public Builder yaxis(Yaxis yaxis) {
                this.yaxis = yaxis;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
