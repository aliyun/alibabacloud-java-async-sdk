// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link GetIqsUsageResult} extends {@link TeaModel}
 *
 * <p>GetIqsUsageResult</p>
 */
public class GetIqsUsageResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("records")
    private java.util.List<Records> records;

    private GetIqsUsageResult(Builder builder) {
        this.records = builder.records;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIqsUsageResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    public static final class Builder {
        private java.util.List<Records> records; 

        private Builder() {
        } 

        private Builder(GetIqsUsageResult model) {
            this.records = model.records;
        } 

        /**
         * <p>The daily call volume records.</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        public GetIqsUsageResult build() {
            return new GetIqsUsageResult(this);
        } 

    } 

    /**
     * 
     * {@link GetIqsUsageResult} extends {@link TeaModel}
     *
     * <p>GetIqsUsageResult</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("api")
        private String api;

        @com.aliyun.core.annotation.NameInMap("billingQps")
        private Integer billingQps;

        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("engineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("failedCalls")
        private Integer failedCalls;

        @com.aliyun.core.annotation.NameInMap("ladderType")
        private String ladderType;

        @com.aliyun.core.annotation.NameInMap("mainAccountId")
        private String mainAccountId;

        @com.aliyun.core.annotation.NameInMap("subAccountId")
        private String subAccountId;

        @com.aliyun.core.annotation.NameInMap("successCalls")
        private Integer successCalls;

        @com.aliyun.core.annotation.NameInMap("totalBillStatCalls")
        private Integer totalBillStatCalls;

        @com.aliyun.core.annotation.NameInMap("totalCalls")
        private Integer totalCalls;

        @com.aliyun.core.annotation.NameInMap("valueAddedAdvanced")
        private Integer valueAddedAdvanced;

        @com.aliyun.core.annotation.NameInMap("valueAddedSummary")
        private Integer valueAddedSummary;

        private Records(Builder builder) {
            this.api = builder.api;
            this.billingQps = builder.billingQps;
            this.date = builder.date;
            this.engineType = builder.engineType;
            this.failedCalls = builder.failedCalls;
            this.ladderType = builder.ladderType;
            this.mainAccountId = builder.mainAccountId;
            this.subAccountId = builder.subAccountId;
            this.successCalls = builder.successCalls;
            this.totalBillStatCalls = builder.totalBillStatCalls;
            this.totalCalls = builder.totalCalls;
            this.valueAddedAdvanced = builder.valueAddedAdvanced;
            this.valueAddedSummary = builder.valueAddedSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return api
         */
        public String getApi() {
            return this.api;
        }

        /**
         * @return billingQps
         */
        public Integer getBillingQps() {
            return this.billingQps;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return failedCalls
         */
        public Integer getFailedCalls() {
            return this.failedCalls;
        }

        /**
         * @return ladderType
         */
        public String getLadderType() {
            return this.ladderType;
        }

        /**
         * @return mainAccountId
         */
        public String getMainAccountId() {
            return this.mainAccountId;
        }

        /**
         * @return subAccountId
         */
        public String getSubAccountId() {
            return this.subAccountId;
        }

        /**
         * @return successCalls
         */
        public Integer getSuccessCalls() {
            return this.successCalls;
        }

        /**
         * @return totalBillStatCalls
         */
        public Integer getTotalBillStatCalls() {
            return this.totalBillStatCalls;
        }

        /**
         * @return totalCalls
         */
        public Integer getTotalCalls() {
            return this.totalCalls;
        }

        /**
         * @return valueAddedAdvanced
         */
        public Integer getValueAddedAdvanced() {
            return this.valueAddedAdvanced;
        }

        /**
         * @return valueAddedSummary
         */
        public Integer getValueAddedSummary() {
            return this.valueAddedSummary;
        }

        public static final class Builder {
            private String api; 
            private Integer billingQps; 
            private String date; 
            private String engineType; 
            private Integer failedCalls; 
            private String ladderType; 
            private String mainAccountId; 
            private String subAccountId; 
            private Integer successCalls; 
            private Integer totalBillStatCalls; 
            private Integer totalCalls; 
            private Integer valueAddedAdvanced; 
            private Integer valueAddedSummary; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.api = model.api;
                this.billingQps = model.billingQps;
                this.date = model.date;
                this.engineType = model.engineType;
                this.failedCalls = model.failedCalls;
                this.ladderType = model.ladderType;
                this.mainAccountId = model.mainAccountId;
                this.subAccountId = model.subAccountId;
                this.successCalls = model.successCalls;
                this.totalBillStatCalls = model.totalBillStatCalls;
                this.totalCalls = model.totalCalls;
                this.valueAddedAdvanced = model.valueAddedAdvanced;
                this.valueAddedSummary = model.valueAddedSummary;
            } 

            /**
             * <p>The API name.</p>
             * 
             * <strong>example:</strong>
             * <p>UnifiedSearch</p>
             */
            public Builder api(String api) {
                this.api = api;
                return this;
            }

            /**
             * <p>The queries per second (QPS) for tiered billing.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder billingQps(Integer billingQps) {
                this.billingQps = billingQps;
                return this;
            }

            /**
             * <p>The metering date in the YYYYMMDD format.</p>
             * 
             * <strong>example:</strong>
             * <p>20250716</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The search engine type.</p>
             * 
             * <strong>example:</strong>
             * <p>Generic</p>
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * <p>The number of failed calls.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedCalls(Integer failedCalls) {
                this.failedCalls = failedCalls;
                return this;
            }

            /**
             * <p>The matched metering tier. Valid values: 1001, 1002, 1003, and 1004.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder ladderType(String ladderType) {
                this.ladderType = ladderType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>138608930******0</p>
             */
            public Builder mainAccountId(String mainAccountId) {
                this.mainAccountId = mainAccountId;
                return this;
            }

            /**
             * <p>The sub-account that initiates the call (RAM user or API key identifier).</p>
             * 
             * <strong>example:</strong>
             * <p>2193843763***9272</p>
             */
            public Builder subAccountId(String subAccountId) {
                this.subAccountId = subAccountId;
                return this;
            }

            /**
             * <p>The number of successful calls.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder successCalls(Integer successCalls) {
                this.successCalls = successCalls;
                return this;
            }

            /**
             * <p>The total number of calls.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalBillStatCalls(Integer totalBillStatCalls) {
                this.totalBillStatCalls = totalBillStatCalls;
                return this;
            }

            /**
             * <p>The total number of calls.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalCalls(Integer totalCalls) {
                this.totalCalls = totalCalls;
                return this;
            }

            /**
             * <p>The value-added package usage for calling enhanced APIs.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder valueAddedAdvanced(Integer valueAddedAdvanced) {
                this.valueAddedAdvanced = valueAddedAdvanced;
                return this;
            }

            /**
             * <p>The number of value-added package calls used for the summarization feature.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder valueAddedSummary(Integer valueAddedSummary) {
                this.valueAddedSummary = valueAddedSummary;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
