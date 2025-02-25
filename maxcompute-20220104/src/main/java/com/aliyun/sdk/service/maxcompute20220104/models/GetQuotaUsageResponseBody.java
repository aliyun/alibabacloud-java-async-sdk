// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetQuotaUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaUsageResponseBody</p>
 */
public class GetQuotaUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetQuotaUsageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OBJECT_NOT_EXIST</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>This object does not exist.</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>1xx: informational response. The request is received and is being processed.</li>
         * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
         * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
         * <li>4xx: client error. The request contains invalid request parameters and syntaxes, or specific request conditions cannot be met.</li>
         * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0b87b7a416652014358483492eea0b</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQuotaUsageResponseBody build() {
            return new GetQuotaUsageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQuotaUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaUsageResponseBody</p>
     */
    public static class Plot extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("yAxis")
        private java.util.List<String> yAxis;

        private Plot(Builder builder) {
            this.title = builder.title;
            this.type = builder.type;
            this.yAxis = builder.yAxis;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Plot create() {
            return builder().build();
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return yAxis
         */
        public java.util.List<String> getYAxis() {
            return this.yAxis;
        }

        public static final class Builder {
            private String title; 
            private String type; 
            private java.util.List<String> yAxis; 

            /**
             * <p>The title of the chart.</p>
             * 
             * <strong>example:</strong>
             * <p>request</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The type of the chart.</p>
             * 
             * <strong>example:</strong>
             * <p>request</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The data metric field.</p>
             */
            public Builder yAxis(java.util.List<String> yAxis) {
                this.yAxis = yAxis;
                return this;
            }

            public Plot build() {
                return new Plot(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQuotaUsageResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaUsageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metrics")
        private java.util.Map<String, ?> metrics;

        @com.aliyun.core.annotation.NameInMap("plot")
        private java.util.List<Plot> plot;

        private Data(Builder builder) {
            this.metrics = builder.metrics;
            this.plot = builder.plot;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return metrics
         */
        public java.util.Map<String, ?> getMetrics() {
            return this.metrics;
        }

        /**
         * @return plot
         */
        public java.util.List<Plot> getPlot() {
            return this.plot;
        }

        public static final class Builder {
            private java.util.Map<String, ?> metrics; 
            private java.util.List<Plot> plot; 

            /**
             * <p>The metric results.</p>
             */
            public Builder metrics(java.util.Map<String, ?> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>The information about the chart.</p>
             */
            public Builder plot(java.util.List<Plot> plot) {
                this.plot = plot;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
