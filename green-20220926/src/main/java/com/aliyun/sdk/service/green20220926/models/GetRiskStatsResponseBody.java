// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetRiskStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRiskStatsResponseBody</p>
 */
public class GetRiskStatsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskStats")
    private java.util.List<RiskStats> riskStats;

    private GetRiskStatsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskStats = builder.riskStats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRiskStatsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskStats
     */
    public java.util.List<RiskStats> getRiskStats() {
        return this.riskStats;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<RiskStats> riskStats; 

        private Builder() {
        } 

        private Builder(GetRiskStatsResponseBody model) {
            this.requestId = model.requestId;
            this.riskStats = model.riskStats;
        } 

        /**
         * <p>The ID assigned by the backend to uniquely identify the request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of risk posture statistics.</p>
         */
        public Builder riskStats(java.util.List<RiskStats> riskStats) {
            this.riskStats = riskStats;
            return this;
        }

        public GetRiskStatsResponseBody build() {
            return new GetRiskStatsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRiskStatsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRiskStatsResponseBody</p>
     */
    public static class RiskStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestCount")
        private Long requestCount;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Long riskCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RiskStats(Builder builder) {
            this.requestCount = builder.requestCount;
            this.riskCount = builder.riskCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskStats create() {
            return builder().build();
        }

        /**
         * @return requestCount
         */
        public Long getRequestCount() {
            return this.requestCount;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long requestCount; 
            private Long riskCount; 
            private String type; 

            private Builder() {
            } 

            private Builder(RiskStats model) {
                this.requestCount = model.requestCount;
                this.riskCount = model.riskCount;
                this.type = model.type;
            } 

            /**
             * <p>The total number of requests.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * <p>The number of detected risks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>prompt_attack</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RiskStats build() {
                return new RiskStats(this);
            } 

        } 

    }
}
