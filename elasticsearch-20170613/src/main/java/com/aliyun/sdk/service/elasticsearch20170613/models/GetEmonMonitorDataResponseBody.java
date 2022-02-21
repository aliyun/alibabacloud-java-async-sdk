// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEmonMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetEmonMonitorDataResponseBody</p>
 */
public class GetEmonMonitorDataResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private GetEmonMonitorDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEmonMonitorDataResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEmonMonitorDataResponseBody build() {
            return new GetEmonMonitorDataResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("dps")
        private java.util.Map < String, ? > dps;

        @NameInMap("integrity")
        private Float integrity;

        @NameInMap("messageWatermark")
        private Long messageWatermark;

        @NameInMap("metric")
        private String metric;

        @NameInMap("summary")
        private Float summary;

        @NameInMap("tags")
        private java.util.Map < String, ? > tags;

        private Result(Builder builder) {
            this.dps = builder.dps;
            this.integrity = builder.integrity;
            this.messageWatermark = builder.messageWatermark;
            this.metric = builder.metric;
            this.summary = builder.summary;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return dps
         */
        public java.util.Map < String, ? > getDps() {
            return this.dps;
        }

        /**
         * @return integrity
         */
        public Float getIntegrity() {
            return this.integrity;
        }

        /**
         * @return messageWatermark
         */
        public Long getMessageWatermark() {
            return this.messageWatermark;
        }

        /**
         * @return metric
         */
        public String getMetric() {
            return this.metric;
        }

        /**
         * @return summary
         */
        public Float getSummary() {
            return this.summary;
        }

        /**
         * @return tags
         */
        public java.util.Map < String, ? > getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.Map < String, ? > dps; 
            private Float integrity; 
            private Long messageWatermark; 
            private String metric; 
            private Float summary; 
            private java.util.Map < String, ? > tags; 

            /**
             * dps.
             */
            public Builder dps(java.util.Map < String, ? > dps) {
                this.dps = dps;
                return this;
            }

            /**
             * integrity.
             */
            public Builder integrity(Float integrity) {
                this.integrity = integrity;
                return this;
            }

            /**
             * messageWatermark.
             */
            public Builder messageWatermark(Long messageWatermark) {
                this.messageWatermark = messageWatermark;
                return this;
            }

            /**
             * metric.
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * summary.
             */
            public Builder summary(Float summary) {
                this.summary = summary;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
