// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardDetailsFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardDetailsFlowsResponseBody</p>
 */
public class ListDashboardDetailsFlowsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListDashboardDetailsFlowsResponseBody(Builder builder) {
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
        private String requestId; 
        private Result result; 

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
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListDashboardDetailsFlowsResponseBody build() {
            return new ListDashboardDetailsFlowsResponseBody(this);
        } 

    } 

    public static class MetricData extends TeaModel {
        @NameInMap("MetricRes")
        private java.util.Map < String, ? > metricRes;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("TraceId")
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
             * MetricRes.
             */
            public Builder metricRes(java.util.Map < String, ? > metricRes) {
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

            public MetricData build() {
                return new MetricData(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("MetricData")
        private java.util.List < MetricData> metricData;

        @NameInMap("MetricType")
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
             * MetricData.
             */
            public Builder metricData(java.util.List < MetricData> metricData) {
                this.metricData = metricData;
                return this;
            }

            /**
             * MetricType.
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
