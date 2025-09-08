// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeDefenseRuleStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseRuleStatisticsResponseBody</p>
 */
public class DescribeDefenseRuleStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatisticsInfos")
    private java.util.List<StatisticsInfos> statisticsInfos;

    private DescribeDefenseRuleStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statisticsInfos = builder.statisticsInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseRuleStatisticsResponseBody create() {
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
     * @return statisticsInfos
     */
    public java.util.List<StatisticsInfos> getStatisticsInfos() {
        return this.statisticsInfos;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StatisticsInfos> statisticsInfos; 

        private Builder() {
        } 

        private Builder(DescribeDefenseRuleStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.statisticsInfos = model.statisticsInfos;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatisticsInfos.
         */
        public Builder statisticsInfos(java.util.List<StatisticsInfos> statisticsInfos) {
            this.statisticsInfos = statisticsInfos;
            return this;
        }

        public DescribeDefenseRuleStatisticsResponseBody build() {
            return new DescribeDefenseRuleStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefenseRuleStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseRuleStatisticsResponseBody</p>
     */
    public static class StatisticsInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("FourthValue")
        private String fourthValue;

        @com.aliyun.core.annotation.NameInMap("PrimaryValue")
        private String primaryValue;

        @com.aliyun.core.annotation.NameInMap("SecondaryValue")
        private String secondaryValue;

        @com.aliyun.core.annotation.NameInMap("ThirdValue")
        private String thirdValue;

        private StatisticsInfos(Builder builder) {
            this.count = builder.count;
            this.fourthValue = builder.fourthValue;
            this.primaryValue = builder.primaryValue;
            this.secondaryValue = builder.secondaryValue;
            this.thirdValue = builder.thirdValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatisticsInfos create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return fourthValue
         */
        public String getFourthValue() {
            return this.fourthValue;
        }

        /**
         * @return primaryValue
         */
        public String getPrimaryValue() {
            return this.primaryValue;
        }

        /**
         * @return secondaryValue
         */
        public String getSecondaryValue() {
            return this.secondaryValue;
        }

        /**
         * @return thirdValue
         */
        public String getThirdValue() {
            return this.thirdValue;
        }

        public static final class Builder {
            private Long count; 
            private String fourthValue; 
            private String primaryValue; 
            private String secondaryValue; 
            private String thirdValue; 

            private Builder() {
            } 

            private Builder(StatisticsInfos model) {
                this.count = model.count;
                this.fourthValue = model.fourthValue;
                this.primaryValue = model.primaryValue;
                this.secondaryValue = model.secondaryValue;
                this.thirdValue = model.thirdValue;
            } 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * FourthValue.
             */
            public Builder fourthValue(String fourthValue) {
                this.fourthValue = fourthValue;
                return this;
            }

            /**
             * PrimaryValue.
             */
            public Builder primaryValue(String primaryValue) {
                this.primaryValue = primaryValue;
                return this;
            }

            /**
             * SecondaryValue.
             */
            public Builder secondaryValue(String secondaryValue) {
                this.secondaryValue = secondaryValue;
                return this;
            }

            /**
             * ThirdValue.
             */
            public Builder thirdValue(String thirdValue) {
                this.thirdValue = thirdValue;
                return this;
            }

            public StatisticsInfos build() {
                return new StatisticsInfos(this);
            } 

        } 

    }
}
