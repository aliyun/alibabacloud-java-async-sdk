// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link QuerySourceUsageTrendResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySourceUsageTrendResponseBody</p>
 */
public class QuerySourceUsageTrendResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("trend")
    private java.util.List<Trend> trend;

    private QuerySourceUsageTrendResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.trend = builder.trend;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySourceUsageTrendResponseBody create() {
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
     * @return trend
     */
    public java.util.List<Trend> getTrend() {
        return this.trend;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.List<Trend> trend; 

        private Builder() {
        } 

        private Builder(QuerySourceUsageTrendResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.trend = model.trend;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error details.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The trend details.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;bucketStart&quot;:&quot;2026-11-01T00:00:00Z&quot;,&quot;retrievalCount&quot;:12,&quot;usageCount&quot;:5}]</p>
         */
        public Builder trend(java.util.List<Trend> trend) {
            this.trend = trend;
            return this;
        }

        public QuerySourceUsageTrendResponseBody build() {
            return new QuerySourceUsageTrendResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySourceUsageTrendResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySourceUsageTrendResponseBody</p>
     */
    public static class Trend extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucketStart")
        private String bucketStart;

        @com.aliyun.core.annotation.NameInMap("retrievalCount")
        private Long retrievalCount;

        @com.aliyun.core.annotation.NameInMap("retrievedSourceCount")
        private Long retrievedSourceCount;

        @com.aliyun.core.annotation.NameInMap("sourceCount")
        private Long sourceCount;

        @com.aliyun.core.annotation.NameInMap("usageCount")
        private Long usageCount;

        @com.aliyun.core.annotation.NameInMap("usedSourceCount")
        private Long usedSourceCount;

        private Trend(Builder builder) {
            this.bucketStart = builder.bucketStart;
            this.retrievalCount = builder.retrievalCount;
            this.retrievedSourceCount = builder.retrievedSourceCount;
            this.sourceCount = builder.sourceCount;
            this.usageCount = builder.usageCount;
            this.usedSourceCount = builder.usedSourceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trend create() {
            return builder().build();
        }

        /**
         * @return bucketStart
         */
        public String getBucketStart() {
            return this.bucketStart;
        }

        /**
         * @return retrievalCount
         */
        public Long getRetrievalCount() {
            return this.retrievalCount;
        }

        /**
         * @return retrievedSourceCount
         */
        public Long getRetrievedSourceCount() {
            return this.retrievedSourceCount;
        }

        /**
         * @return sourceCount
         */
        public Long getSourceCount() {
            return this.sourceCount;
        }

        /**
         * @return usageCount
         */
        public Long getUsageCount() {
            return this.usageCount;
        }

        /**
         * @return usedSourceCount
         */
        public Long getUsedSourceCount() {
            return this.usedSourceCount;
        }

        public static final class Builder {
            private String bucketStart; 
            private Long retrievalCount; 
            private Long retrievedSourceCount; 
            private Long sourceCount; 
            private Long usageCount; 
            private Long usedSourceCount; 

            private Builder() {
            } 

            private Builder(Trend model) {
                this.bucketStart = model.bucketStart;
                this.retrievalCount = model.retrievalCount;
                this.retrievedSourceCount = model.retrievedSourceCount;
                this.sourceCount = model.sourceCount;
                this.usageCount = model.usageCount;
                this.usedSourceCount = model.usedSourceCount;
            } 

            /**
             * <p>The start time of the natural bucket with the selected time zone. The first bucket may start earlier than the startTime.</p>
             * 
             * <strong>example:</strong>
             * <p>Start time of the natural bucket with the selected time zone. The first bucket may start earlier than the startTime</p>
             */
            public Builder bucketStart(String bucketStart) {
                this.bucketStart = bucketStart;
                return this;
            }

            /**
             * <p>The number of retrieval recalls.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retrievalCount(Long retrievalCount) {
                this.retrievalCount = retrievalCount;
                return this;
            }

            /**
             * <p>The deduplicated number of sources with retrieval events.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder retrievedSourceCount(Long retrievedSourceCount) {
                this.retrievedSourceCount = retrievedSourceCount;
                return this;
            }

            /**
             * <p>The number of rows in the source data.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder sourceCount(Long sourceCount) {
                this.sourceCount = sourceCount;
                return this;
            }

            /**
             * <p>The number of times used by the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder usageCount(Long usageCount) {
                this.usageCount = usageCount;
                return this;
            }

            /**
             * <p>The deduplicated number of sources with usage events.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder usedSourceCount(Long usedSourceCount) {
                this.usedSourceCount = usedSourceCount;
                return this;
            }

            public Trend build() {
                return new Trend(this);
            } 

        } 

    }
}
