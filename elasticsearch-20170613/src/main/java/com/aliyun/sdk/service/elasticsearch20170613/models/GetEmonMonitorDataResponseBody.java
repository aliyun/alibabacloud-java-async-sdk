// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link GetEmonMonitorDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetEmonMonitorDataResponseBody</p>
 */
public class GetEmonMonitorDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder(GetEmonMonitorDataResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The request result.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2D184B55-FA51-43F7-A1EF-E68A0545****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetEmonMonitorDataResponseBody build() {
            return new GetEmonMonitorDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEmonMonitorDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmonMonitorDataResponseBody</p>
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
             * <p>The real-time metric monitoring data. Format: <code>{timestamp:data}</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;1586249280&quot;: 465.1980465119913, &quot;1586249300&quot;: 213.45243650423305 }</p>
             */
            public Builder dps(java.util.Map<String, ?> dps) {
                this.dps = dps;
                return this;
            }

            /**
             * <p>The completeness of time series data points in the metric query result. A value of 1.0 indicates 100% completeness.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder integrity(Float integrity) {
                this.integrity = integrity;
                return this;
            }

            /**
             * <p>The timestamp when the request reaches the server. This is used for troubleshooting.</p>
             * 
             * <strong>example:</strong>
             * <p>1522127381471</p>
             */
            public Builder messageWatermark(Long messageWatermark) {
                this.messageWatermark = messageWatermark;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>elasticbuild.elasticsearch.source.total_doc_count</p>
             */
            public Builder metric(String metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>If the queries contain wildcards, the result includes multiple matching time series data sequences. The summary is the aggregation of the values across these time series at each time point, based on the aggregator type specified in the query. Currently, only avg is supported as the aggregation method.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder summary(Float summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The query tags.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;taskName&quot;:&quot;et-xxx&quot;,&quot;userId&quot;:&quot;123456&quot;}</p>
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
