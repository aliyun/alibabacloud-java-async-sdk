// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDashboardDetailsFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardDetailsFlowsResponseBody</p>
 */
public class ListDashboardDetailsFlowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ListDashboardDetailsFlowsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardDetailsFlowsResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

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
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListDashboardDetailsFlowsResponseBody build() {
            return new ListDashboardDetailsFlowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDashboardDetailsFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDashboardDetailsFlowsResponseBody</p>
     */
    public static class MetricData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metricRes")
        private java.util.Map < String, ? > metricRes;

        @com.aliyun.core.annotation.NameInMap("sceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("traceId")
        private String traceId;

        private MetricData(Builder builder) {
            this.metricRes = builder.metricRes;
            this.sceneId = builder.sceneId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricData create() {
            return builder().build();
        }

        /**
         * @return metricRes
         */
        public java.util.Map < String, ? > getMetricRes() {
            return this.metricRes;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private java.util.Map < String, ? > metricRes; 
            private String sceneId; 
            private String traceId; 

            /**
             * metricRes.
             */
            public Builder metricRes(java.util.Map < String, ? > metricRes) {
                this.metricRes = metricRes;
                return this;
            }

            /**
             * sceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * traceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public MetricData build() {
                return new MetricData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDashboardDetailsFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDashboardDetailsFlowsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metricData")
        private java.util.List < MetricData> metricData;

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
        public java.util.List < MetricData> getMetricData() {
            return this.metricData;
        }

        /**
         * @return metricType
         */
        public String getMetricType() {
            return this.metricType;
        }

        public static final class Builder {
            private java.util.List < MetricData> metricData; 
            private String metricType; 

            /**
             * metricData.
             */
            public Builder metricData(java.util.List < MetricData> metricData) {
                this.metricData = metricData;
                return this;
            }

            /**
             * metricType.
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
