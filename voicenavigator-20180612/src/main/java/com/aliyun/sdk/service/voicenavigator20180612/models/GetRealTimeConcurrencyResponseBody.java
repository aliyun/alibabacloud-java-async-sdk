// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link GetRealTimeConcurrencyResponseBody} extends {@link TeaModel}
 *
 * <p>GetRealTimeConcurrencyResponseBody</p>
 */
public class GetRealTimeConcurrencyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
    private Long maxConcurrency;

    @com.aliyun.core.annotation.NameInMap("RealTimeConcurrency")
    private Long realTimeConcurrency;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private Long timestamp;

    private GetRealTimeConcurrencyResponseBody(Builder builder) {
        this.maxConcurrency = builder.maxConcurrency;
        this.realTimeConcurrency = builder.realTimeConcurrency;
        this.requestId = builder.requestId;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealTimeConcurrencyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxConcurrency
     */
    public Long getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * @return realTimeConcurrency
     */
    public Long getRealTimeConcurrency() {
        return this.realTimeConcurrency;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private Long maxConcurrency; 
        private Long realTimeConcurrency; 
        private String requestId; 
        private Long timestamp; 

        private Builder() {
        } 

        private Builder(GetRealTimeConcurrencyResponseBody model) {
            this.maxConcurrency = model.maxConcurrency;
            this.realTimeConcurrency = model.realTimeConcurrency;
            this.requestId = model.requestId;
            this.timestamp = model.timestamp;
        } 

        /**
         * <p>The maximum concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder maxConcurrency(Long maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * <p>The real-time concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder realTimeConcurrency(Long realTimeConcurrency) {
            this.realTimeConcurrency = realTimeConcurrency;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E6E61E1A-D2DC-5ACF-AED4-A115B6691F98</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timestamp of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1661584255029</p>
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public GetRealTimeConcurrencyResponseBody build() {
            return new GetRealTimeConcurrencyResponseBody(this);
        } 

    } 

}
