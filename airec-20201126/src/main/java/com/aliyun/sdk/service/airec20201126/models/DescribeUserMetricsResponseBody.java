// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserMetricsResponseBody</p>
 */
public class DescribeUserMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private DescribeUserMetricsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserMetricsResponseBody create() {
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalServerError</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>An internal server error occurred</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public DescribeUserMetricsResponseBody build() {
            return new DescribeUserMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserMetricsResponseBody</p>
     */
    public static class DataPoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("val")
        private Float val;

        private DataPoints(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.val = builder.val;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPoints create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return val
         */
        public Float getVal() {
            return this.val;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 
            private Float val; 

            /**
             * <p>The end time. The value is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1567152000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time. The value is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1567152000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The value of the corresponding metric.</p>
             * 
             * <strong>example:</strong>
             * <p>84.6</p>
             */
            public Builder val(Float val) {
                this.val = val;
                return this;
            }

            public DataPoints build() {
                return new DataPoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUserMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserMetricsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataPoints")
        private java.util.List < DataPoints> dataPoints;

        @com.aliyun.core.annotation.NameInMap("sceneId")
        private String sceneId;

        private Result(Builder builder) {
            this.dataPoints = builder.dataPoints;
            this.sceneId = builder.sceneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return dataPoints
         */
        public java.util.List < DataPoints> getDataPoints() {
            return this.dataPoints;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        public static final class Builder {
            private java.util.List < DataPoints> dataPoints; 
            private String sceneId; 

            /**
             * <p>The returned metrics.</p>
             */
            public Builder dataPoints(java.util.List < DataPoints> dataPoints) {
                this.dataPoints = dataPoints;
                return this;
            }

            /**
             * <p>The scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
