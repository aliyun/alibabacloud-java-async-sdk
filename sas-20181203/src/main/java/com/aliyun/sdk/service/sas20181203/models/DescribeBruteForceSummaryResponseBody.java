// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBruteForceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBruteForceSummaryResponseBody</p>
 */
public class DescribeBruteForceSummaryResponseBody extends TeaModel {
    @NameInMap("BruteForceSummary")
    private BruteForceSummary bruteForceSummary;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBruteForceSummaryResponseBody(Builder builder) {
        this.bruteForceSummary = builder.bruteForceSummary;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBruteForceSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return bruteForceSummary
     */
    public BruteForceSummary getBruteForceSummary() {
        return this.bruteForceSummary;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BruteForceSummary bruteForceSummary; 
        private String requestId; 

        /**
         * BruteForceSummary.
         */
        public Builder bruteForceSummary(BruteForceSummary bruteForceSummary) {
            this.bruteForceSummary = bruteForceSummary;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBruteForceSummaryResponseBody build() {
            return new DescribeBruteForceSummaryResponseBody(this);
        } 

    } 

    public static class BruteForceSummary extends TeaModel {
        @NameInMap("AllStrategyCount")
        private Integer allStrategyCount;

        @NameInMap("AntiBruteForceRuleCount")
        private String antiBruteForceRuleCount;

        @NameInMap("CustomEffectiveCount")
        private String customEffectiveCount;

        @NameInMap("CustomRecordCount")
        private String customRecordCount;

        @NameInMap("EffectiveCount")
        private Integer effectiveCount;

        @NameInMap("SystemEffectiveCount")
        private String systemEffectiveCount;

        @NameInMap("SystemRecordCount")
        private String systemRecordCount;

        private BruteForceSummary(Builder builder) {
            this.allStrategyCount = builder.allStrategyCount;
            this.antiBruteForceRuleCount = builder.antiBruteForceRuleCount;
            this.customEffectiveCount = builder.customEffectiveCount;
            this.customRecordCount = builder.customRecordCount;
            this.effectiveCount = builder.effectiveCount;
            this.systemEffectiveCount = builder.systemEffectiveCount;
            this.systemRecordCount = builder.systemRecordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BruteForceSummary create() {
            return builder().build();
        }

        /**
         * @return allStrategyCount
         */
        public Integer getAllStrategyCount() {
            return this.allStrategyCount;
        }

        /**
         * @return antiBruteForceRuleCount
         */
        public String getAntiBruteForceRuleCount() {
            return this.antiBruteForceRuleCount;
        }

        /**
         * @return customEffectiveCount
         */
        public String getCustomEffectiveCount() {
            return this.customEffectiveCount;
        }

        /**
         * @return customRecordCount
         */
        public String getCustomRecordCount() {
            return this.customRecordCount;
        }

        /**
         * @return effectiveCount
         */
        public Integer getEffectiveCount() {
            return this.effectiveCount;
        }

        /**
         * @return systemEffectiveCount
         */
        public String getSystemEffectiveCount() {
            return this.systemEffectiveCount;
        }

        /**
         * @return systemRecordCount
         */
        public String getSystemRecordCount() {
            return this.systemRecordCount;
        }

        public static final class Builder {
            private Integer allStrategyCount; 
            private String antiBruteForceRuleCount; 
            private String customEffectiveCount; 
            private String customRecordCount; 
            private Integer effectiveCount; 
            private String systemEffectiveCount; 
            private String systemRecordCount; 

            /**
             * AllStrategyCount.
             */
            public Builder allStrategyCount(Integer allStrategyCount) {
                this.allStrategyCount = allStrategyCount;
                return this;
            }

            /**
             * AntiBruteForceRuleCount.
             */
            public Builder antiBruteForceRuleCount(String antiBruteForceRuleCount) {
                this.antiBruteForceRuleCount = antiBruteForceRuleCount;
                return this;
            }

            /**
             * CustomEffectiveCount.
             */
            public Builder customEffectiveCount(String customEffectiveCount) {
                this.customEffectiveCount = customEffectiveCount;
                return this;
            }

            /**
             * CustomRecordCount.
             */
            public Builder customRecordCount(String customRecordCount) {
                this.customRecordCount = customRecordCount;
                return this;
            }

            /**
             * EffectiveCount.
             */
            public Builder effectiveCount(Integer effectiveCount) {
                this.effectiveCount = effectiveCount;
                return this;
            }

            /**
             * SystemEffectiveCount.
             */
            public Builder systemEffectiveCount(String systemEffectiveCount) {
                this.systemEffectiveCount = systemEffectiveCount;
                return this;
            }

            /**
             * SystemRecordCount.
             */
            public Builder systemRecordCount(String systemRecordCount) {
                this.systemRecordCount = systemRecordCount;
                return this;
            }

            public BruteForceSummary build() {
                return new BruteForceSummary(this);
            } 

        } 

    }
}
