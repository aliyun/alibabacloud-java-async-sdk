// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDashboardMetricsFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardMetricsFlowsResponseBody</p>
 */
public class ListDashboardMetricsFlowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListDashboardMetricsFlowsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardMetricsFlowsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * <p>The ID of the request.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDashboardMetricsFlowsResponseBody build() {
            return new ListDashboardMetricsFlowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDashboardMetricsFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDashboardMetricsFlowsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metricData")
        private java.util.Map < String, ? > metricData;

        @com.aliyun.core.annotation.NameInMap("metricType")
        private String metricType;

        private Result(Builder builder) {
            this.metricData = builder.metricData;
            this.metricType = builder.metricType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return metricData
         */
        public java.util.Map < String, ? > getMetricData() {
            return this.metricData;
        }

        /**
         * @return metricType
         */
        public String getMetricType() {
            return this.metricType;
        }

        public static final class Builder {
            private java.util.Map < String, ? > metricData; 
            private String metricType; 

            /**
             * <p><strong>null</strong></p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder metricData(java.util.Map < String, ? > metricData) {
                this.metricData = metricData;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
