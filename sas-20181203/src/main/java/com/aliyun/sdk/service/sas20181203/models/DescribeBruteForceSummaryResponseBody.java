// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeBruteForceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBruteForceSummaryResponseBody</p>
 */
public class DescribeBruteForceSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BruteForceSummary")
    private BruteForceSummary bruteForceSummary;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The statistics of IP address blocking policies.</p>
         */
        public Builder bruteForceSummary(BruteForceSummary bruteForceSummary) {
            this.bruteForceSummary = bruteForceSummary;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AE60EAE3-ABD0-897C-B0F16CAC6C7D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBruteForceSummaryResponseBody build() {
            return new DescribeBruteForceSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBruteForceSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBruteForceSummaryResponseBody</p>
     */
    public static class BruteForceSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllStrategyCount")
        private Integer allStrategyCount;

        @com.aliyun.core.annotation.NameInMap("AntiBruteForceRuleCount")
        private String antiBruteForceRuleCount;

        @com.aliyun.core.annotation.NameInMap("CustomEffectiveCount")
        private String customEffectiveCount;

        @com.aliyun.core.annotation.NameInMap("CustomRecordCount")
        private String customRecordCount;

        @com.aliyun.core.annotation.NameInMap("EffectiveCount")
        private Integer effectiveCount;

        @com.aliyun.core.annotation.NameInMap("SystemEffectiveCount")
        private String systemEffectiveCount;

        @com.aliyun.core.annotation.NameInMap("SystemRecordCount")
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
             * <p>The number of anti-brute force IP blocking policies.</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder allStrategyCount(Integer allStrategyCount) {
                this.allStrategyCount = allStrategyCount;
                return this;
            }

            /**
             * <p>The number of defense policies.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder antiBruteForceRuleCount(String antiBruteForceRuleCount) {
                this.antiBruteForceRuleCount = antiBruteForceRuleCount;
                return this;
            }

            /**
             * <p>The number of custom blocking rules that are in effect.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder customEffectiveCount(String customEffectiveCount) {
                this.customEffectiveCount = customEffectiveCount;
                return this;
            }

            /**
             * <p>The number of custom blocking rules.</p>
             * 
             * <strong>example:</strong>
             * <p>19730</p>
             */
            public Builder customRecordCount(String customRecordCount) {
                this.customRecordCount = customRecordCount;
                return this;
            }

            /**
             * <p>The number of anti-brute force IP blocking policies enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder effectiveCount(Integer effectiveCount) {
                this.effectiveCount = effectiveCount;
                return this;
            }

            /**
             * <p>The number of system blocking rules that are in effect.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder systemEffectiveCount(String systemEffectiveCount) {
                this.systemEffectiveCount = systemEffectiveCount;
                return this;
            }

            /**
             * <p>The number of system blocking rules.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
