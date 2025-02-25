// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDashboardMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDashboardMetricsResponseBody</p>
 */
public class ListDashboardMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListDashboardMetricsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardMetricsResponseBody create() {
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
         * <p><strong>null</strong></p>
         * 
         * <strong>example:</strong>
         * <p>InternalServerError</p>
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
         * <p>The specific value of the metric.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDashboardMetricsResponseBody build() {
            return new ListDashboardMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDashboardMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDashboardMetricsResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("val")
        private String val;

        private Detail(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.val = builder.val;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return val
         */
        public String getVal() {
            return this.val;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 
            private String val; 

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>1586673466</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>1586673466</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder val(String val) {
                this.val = val;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDashboardMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDashboardMetricsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("detail")
        private java.util.List < Detail> detail;

        @com.aliyun.core.annotation.NameInMap("total")
        private java.util.Map < String, ? > total;

        private Result(Builder builder) {
            this.detail = builder.detail;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List < Detail> getDetail() {
            return this.detail;
        }

        /**
         * @return total
         */
        public java.util.Map < String, ? > getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < Detail> detail; 
            private java.util.Map < String, ? > total; 

            /**
             * <p>The end time. The value is a timestamp in seconds.</p>
             */
            public Builder detail(java.util.List < Detail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The start time. The value is a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder total(java.util.Map < String, ? > total) {
                this.total = total;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
