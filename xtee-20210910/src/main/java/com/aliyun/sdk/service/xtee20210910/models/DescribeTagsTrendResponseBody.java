// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTagsTrendResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTagsTrendResponseBody</p>
 */
public class DescribeTagsTrendResponseBody extends TeaModel {
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

    private DescribeTagsTrendResponseBody(Builder builder) {
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

    public static DescribeTagsTrendResponseBody create() {
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

        public DescribeTagsTrendResponseBody build() {
            return new DescribeTagsTrendResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("num")
        private Long num;

        @com.aliyun.core.annotation.NameInMap("scale")
        private String scale;

        private Data(Builder builder) {
            this.num = builder.num;
            this.scale = builder.scale;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return num
         */
        public Long getNum() {
            return this.num;
        }

        /**
         * @return scale
         */
        public String getScale() {
            return this.scale;
        }

        public static final class Builder {
            private Long num; 
            private String scale; 

            /**
             * num.
             */
            public Builder num(Long num) {
                this.num = num;
                return this;
            }

            /**
             * scale.
             */
            public Builder scale(String scale) {
                this.scale = scale;
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

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Series(Builder builder) {
            this.data = builder.data;
            this.name = builder.name;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < Data> data; 
            private String name; 

            /**
             * data.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    public static class Xaxis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List < String > data;

        private Xaxis(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Xaxis create() {
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

            public Xaxis build() {
                return new Xaxis(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List < Series> series;

        @com.aliyun.core.annotation.NameInMap("xaxis")
        private Xaxis xaxis;

        private ResultObject(Builder builder) {
            this.series = builder.series;
            this.xaxis = builder.xaxis;
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
         * @return xaxis
         */
        public Xaxis getXaxis() {
            return this.xaxis;
        }

        public static final class Builder {
            private java.util.List < Series> series; 
            private Xaxis xaxis; 

            /**
             * series.
             */
            public Builder series(java.util.List < Series> series) {
                this.series = series;
                return this;
            }

            /**
             * xaxis.
             */
            public Builder xaxis(Xaxis xaxis) {
                this.xaxis = xaxis;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
