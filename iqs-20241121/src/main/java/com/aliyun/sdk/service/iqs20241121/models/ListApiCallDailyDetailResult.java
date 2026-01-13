// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link ListApiCallDailyDetailResult} extends {@link TeaModel}
 *
 * <p>ListApiCallDailyDetailResult</p>
 */
public class ListApiCallDailyDetailResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("details")
    private java.util.List<Details> details;

    private ListApiCallDailyDetailResult(Builder builder) {
        this.details = builder.details;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiCallDailyDetailResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return details
     */
    public java.util.List<Details> getDetails() {
        return this.details;
    }

    public static final class Builder {
        private java.util.List<Details> details; 

        private Builder() {
        } 

        private Builder(ListApiCallDailyDetailResult model) {
            this.details = model.details;
        } 

        /**
         * details.
         */
        public Builder details(java.util.List<Details> details) {
            this.details = details;
            return this;
        }

        public ListApiCallDailyDetailResult build() {
            return new ListApiCallDailyDetailResult(this);
        } 

    } 

    /**
     * 
     * {@link ListApiCallDailyDetailResult} extends {@link TeaModel}
     *
     * <p>ListApiCallDailyDetailResult</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("apiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("avgLatency")
        private Integer avgLatency;

        @com.aliyun.core.annotation.NameInMap("billDate")
        private String billDate;

        @com.aliyun.core.annotation.NameInMap("engineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("failedCount")
        private Integer failedCount;

        @com.aliyun.core.annotation.NameInMap("p90Latency")
        private Integer p90Latency;

        @com.aliyun.core.annotation.NameInMap("p95Latency")
        private Integer p95Latency;

        @com.aliyun.core.annotation.NameInMap("requestMaxQps")
        private Integer requestMaxQps;

        @com.aliyun.core.annotation.NameInMap("subAccountId")
        private String subAccountId;

        @com.aliyun.core.annotation.NameInMap("successCount")
        private Integer successCount;

        private Details(Builder builder) {
            this.apiName = builder.apiName;
            this.avgLatency = builder.avgLatency;
            this.billDate = builder.billDate;
            this.engineType = builder.engineType;
            this.failedCount = builder.failedCount;
            this.p90Latency = builder.p90Latency;
            this.p95Latency = builder.p95Latency;
            this.requestMaxQps = builder.requestMaxQps;
            this.subAccountId = builder.subAccountId;
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return avgLatency
         */
        public Integer getAvgLatency() {
            return this.avgLatency;
        }

        /**
         * @return billDate
         */
        public String getBillDate() {
            return this.billDate;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return failedCount
         */
        public Integer getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return p90Latency
         */
        public Integer getP90Latency() {
            return this.p90Latency;
        }

        /**
         * @return p95Latency
         */
        public Integer getP95Latency() {
            return this.p95Latency;
        }

        /**
         * @return requestMaxQps
         */
        public Integer getRequestMaxQps() {
            return this.requestMaxQps;
        }

        /**
         * @return subAccountId
         */
        public String getSubAccountId() {
            return this.subAccountId;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private String apiName; 
            private Integer avgLatency; 
            private String billDate; 
            private String engineType; 
            private Integer failedCount; 
            private Integer p90Latency; 
            private Integer p95Latency; 
            private Integer requestMaxQps; 
            private String subAccountId; 
            private Integer successCount; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.apiName = model.apiName;
                this.avgLatency = model.avgLatency;
                this.billDate = model.billDate;
                this.engineType = model.engineType;
                this.failedCount = model.failedCount;
                this.p90Latency = model.p90Latency;
                this.p95Latency = model.p95Latency;
                this.requestMaxQps = model.requestMaxQps;
                this.subAccountId = model.subAccountId;
                this.successCount = model.successCount;
            } 

            /**
             * apiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * avgLatency.
             */
            public Builder avgLatency(Integer avgLatency) {
                this.avgLatency = avgLatency;
                return this;
            }

            /**
             * billDate.
             */
            public Builder billDate(String billDate) {
                this.billDate = billDate;
                return this;
            }

            /**
             * engineType.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * failedCount.
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * p90Latency.
             */
            public Builder p90Latency(Integer p90Latency) {
                this.p90Latency = p90Latency;
                return this;
            }

            /**
             * p95Latency.
             */
            public Builder p95Latency(Integer p95Latency) {
                this.p95Latency = p95Latency;
                return this;
            }

            /**
             * requestMaxQps.
             */
            public Builder requestMaxQps(Integer requestMaxQps) {
                this.requestMaxQps = requestMaxQps;
                return this;
            }

            /**
             * subAccountId.
             */
            public Builder subAccountId(String subAccountId) {
                this.subAccountId = subAccountId;
                return this;
            }

            /**
             * successCount.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
}
