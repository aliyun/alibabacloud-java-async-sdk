// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

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
 * {@link GetMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetMonitorDataResponseBody</p>
 */
public class GetMonitorDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetMonitorDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonitorDataResponseBody create() {
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
    public java.util.List<Result> getResult() {
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
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMonitorDataResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

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
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMonitorDataResponseBody build() {
            return new GetMonitorDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetMonitorDataResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dps")
        private java.util.Map<String, ?> dps;

        @com.aliyun.core.annotation.NameInMap("integrity")
        private Float integrity;

        @com.aliyun.core.annotation.NameInMap("messageWatermark")
        private Long messageWatermark;

        @com.aliyun.core.annotation.NameInMap("metric")
        private String metric;

        @com.aliyun.core.annotation.NameInMap("summary")
        private Float summary;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.Map<String, ?> tags;

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
        public java.util.Map<String, ?> getDps() {
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
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.Map<String, ?> dps; 
            private Float integrity; 
            private Long messageWatermark; 
            private String metric; 
            private Float summary; 
            private java.util.Map<String, ?> tags; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.dps = model.dps;
                this.integrity = model.integrity;
                this.messageWatermark = model.messageWatermark;
                this.metric = model.metric;
                this.summary = model.summary;
                this.tags = model.tags;
            } 

            /**
             * dps.
             */
            public Builder dps(java.util.Map<String, ?> dps) {
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
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
