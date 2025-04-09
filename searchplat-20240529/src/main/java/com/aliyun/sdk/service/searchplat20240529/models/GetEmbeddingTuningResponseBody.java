// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

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
 * {@link GetEmbeddingTuningResponseBody} extends {@link TeaModel}
 *
 * <p>GetEmbeddingTuningResponseBody</p>
 */
public class GetEmbeddingTuningResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private GetEmbeddingTuningResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEmbeddingTuningResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latency
     */
    public Integer getLatency() {
        return this.latency;
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

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private Integer latency; 
        private String requestId; 
        private Result result; 
        private Usage usage; 

        private Builder() {
        } 

        private Builder(GetEmbeddingTuningResponseBody model) {
            this.latency = model.latency;
            this.requestId = model.requestId;
            this.result = model.result;
            this.usage = model.usage;
        } 

        /**
         * latency.
         */
        public Builder latency(Integer latency) {
            this.latency = latency;
            return this;
        }

        /**
         * request_id.
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

        /**
         * usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public GetEmbeddingTuningResponseBody build() {
            return new GetEmbeddingTuningResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEmbeddingTuningResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmbeddingTuningResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("output")
        private java.util.List<java.util.List<Float>> output;

        private Result(Builder builder) {
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public java.util.List<java.util.List<Float>> getOutput() {
            return this.output;
        }

        public static final class Builder {
            private java.util.List<java.util.List<Float>> output; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.output = model.output;
            } 

            /**
             * output.
             */
            public Builder output(java.util.List<java.util.List<Float>> output) {
                this.output = output;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEmbeddingTuningResponseBody} extends {@link TeaModel}
     *
     * <p>GetEmbeddingTuningResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("doc_count")
        private Integer docCount;

        private Usage(Builder builder) {
            this.docCount = builder.docCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return docCount
         */
        public Integer getDocCount() {
            return this.docCount;
        }

        public static final class Builder {
            private Integer docCount; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.docCount = model.docCount;
            } 

            /**
             * doc_count.
             */
            public Builder docCount(Integer docCount) {
                this.docCount = docCount;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
