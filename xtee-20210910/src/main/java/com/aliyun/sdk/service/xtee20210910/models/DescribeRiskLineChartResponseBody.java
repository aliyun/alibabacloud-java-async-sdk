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
 * {@link DescribeRiskLineChartResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskLineChartResponseBody</p>
 */
public class DescribeRiskLineChartResponseBody extends TeaModel {
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

    private DescribeRiskLineChartResponseBody(Builder builder) {
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

    public static DescribeRiskLineChartResponseBody create() {
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

        private Builder() {
        } 

        private Builder(DescribeRiskLineChartResponseBody model) {
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
         * <p>Returned object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeRiskLineChartResponseBody build() {
            return new DescribeRiskLineChartResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRiskLineChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskLineChartResponseBody</p>
     */
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<String> data;

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
        public java.util.List<String> getData() {
            return this.data;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> data; 
            private String name; 

            private Builder() {
            } 

            private Builder(Series model) {
                this.data = model.data;
                this.name = model.name;
            } 

            /**
             * <p>Line chart data</p>
             */
            public Builder data(java.util.List<String> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Title of the line segment in the line chart</p>
             * 
             * <strong>example:</strong>
             * <p>rm0102</p>
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
    /**
     * 
     * {@link DescribeRiskLineChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskLineChartResponseBody</p>
     */
    public static class Xaxis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<String> data;

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
        public java.util.List<String> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<String> data; 

            private Builder() {
            } 

            private Builder(Xaxis model) {
                this.data = model.data;
            } 

            /**
             * <p>Returns x-axis data points</p>
             */
            public Builder data(java.util.List<String> data) {
                this.data = data;
                return this;
            }

            public Xaxis build() {
                return new Xaxis(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRiskLineChartResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRiskLineChartResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("series")
        private java.util.List<Series> series;

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
        public java.util.List<Series> getSeries() {
            return this.series;
        }

        /**
         * @return xaxis
         */
        public Xaxis getXaxis() {
            return this.xaxis;
        }

        public static final class Builder {
            private java.util.List<Series> series; 
            private Xaxis xaxis; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.series = model.series;
                this.xaxis = model.xaxis;
            } 

            /**
             * <p>Data list</p>
             */
            public Builder series(java.util.List<Series> series) {
                this.series = series;
                return this;
            }

            /**
             * <p>Details of xaxis node.</p>
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
