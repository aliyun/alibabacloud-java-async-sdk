// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDashboardDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardDetailsResponseBody</p>
 */
public class ListDashboardDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListDashboardDetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardDetailsResponseBody create() {
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
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDashboardDetailsResponseBody build() {
            return new ListDashboardDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDashboardDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDashboardDetailsResponseBody</p>
     */
    public static class MetricRes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
        private java.util.Map < String, ? > detail;

        @com.aliyun.core.annotation.NameInMap("total")
        private java.util.Map < String, ? > total;

        private MetricRes(Builder builder) {
            this.detail = builder.detail;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricRes create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.Map < String, ? > getDetail() {
            return this.detail;
        }

        /**
         * @return total
         */
        public java.util.Map < String, ? > getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.Map < String, ? > detail; 
            private java.util.Map < String, ? > total; 

            /**
             * detail.
             */
            public Builder detail(java.util.Map < String, ? > detail) {
                this.detail = detail;
                return this;
            }

            /**
             * total.
             */
            public Builder total(java.util.Map < String, ? > total) {
                this.total = total;
                return this;
            }

            public MetricRes build() {
                return new MetricRes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDashboardDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDashboardDetailsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("metricRes")
        private MetricRes metricRes;

        @com.aliyun.core.annotation.NameInMap("sceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("traceId")
        private String traceId;

        private Result(Builder builder) {
            this.metricRes = builder.metricRes;
            this.sceneId = builder.sceneId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return metricRes
         */
        public MetricRes getMetricRes() {
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
            private MetricRes metricRes; 
            private String sceneId; 
            private String traceId; 

            /**
             * metricRes.
             */
            public Builder metricRes(MetricRes metricRes) {
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
