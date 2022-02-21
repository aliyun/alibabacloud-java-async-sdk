// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardDetailsResponseBody</p>
 */
public class ListDashboardDetailsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListDashboardDetailsResponseBody(Builder builder) {
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
        private String requestId; 
        private java.util.List < Result> result; 

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

        public ListDashboardDetailsResponseBody build() {
            return new ListDashboardDetailsResponseBody(this);
        } 

    } 

    public static class MetricRes extends TeaModel {
        @NameInMap("Detail")
        private java.util.Map < String, ? > detail;

        @NameInMap("Total")
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
             * Detail.
             */
            public Builder detail(java.util.Map < String, ? > detail) {
                this.detail = detail;
                return this;
            }

            /**
             * Total.
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
    public static class Result extends TeaModel {
        @NameInMap("MetricRes")
        private MetricRes metricRes;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("TraceId")
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
             * MetricRes.
             */
            public Builder metricRes(MetricRes metricRes) {
                this.metricRes = metricRes;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * TraceId.
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
