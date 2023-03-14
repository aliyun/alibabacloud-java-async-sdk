// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseCountStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseCountStatisticsResponseBody</p>
 */
public class DescribeDefenseCountStatisticsResponseBody extends TeaModel {
    @NameInMap("DefenseCountStatistics")
    private DefenseCountStatistics defenseCountStatistics;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDefenseCountStatisticsResponseBody(Builder builder) {
        this.defenseCountStatistics = builder.defenseCountStatistics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseCountStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return defenseCountStatistics
     */
    public DefenseCountStatistics getDefenseCountStatistics() {
        return this.defenseCountStatistics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DefenseCountStatistics defenseCountStatistics; 
        private String requestId; 

        /**
         * DefenseCountStatistics.
         */
        public Builder defenseCountStatistics(DefenseCountStatistics defenseCountStatistics) {
            this.defenseCountStatistics = defenseCountStatistics;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDefenseCountStatisticsResponseBody build() {
            return new DescribeDefenseCountStatisticsResponseBody(this);
        } 

    } 

    public static class DefenseCountStatistics extends TeaModel {
        @NameInMap("DefenseCountTotalUsageOfCurrentMonth")
        private Integer defenseCountTotalUsageOfCurrentMonth;

        @NameInMap("FlowPackCountRemain")
        private Integer flowPackCountRemain;

        @NameInMap("MaxUsableDefenseCountCurrentMonth")
        private Integer maxUsableDefenseCountCurrentMonth;

        private DefenseCountStatistics(Builder builder) {
            this.defenseCountTotalUsageOfCurrentMonth = builder.defenseCountTotalUsageOfCurrentMonth;
            this.flowPackCountRemain = builder.flowPackCountRemain;
            this.maxUsableDefenseCountCurrentMonth = builder.maxUsableDefenseCountCurrentMonth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefenseCountStatistics create() {
            return builder().build();
        }

        /**
         * @return defenseCountTotalUsageOfCurrentMonth
         */
        public Integer getDefenseCountTotalUsageOfCurrentMonth() {
            return this.defenseCountTotalUsageOfCurrentMonth;
        }

        /**
         * @return flowPackCountRemain
         */
        public Integer getFlowPackCountRemain() {
            return this.flowPackCountRemain;
        }

        /**
         * @return maxUsableDefenseCountCurrentMonth
         */
        public Integer getMaxUsableDefenseCountCurrentMonth() {
            return this.maxUsableDefenseCountCurrentMonth;
        }

        public static final class Builder {
            private Integer defenseCountTotalUsageOfCurrentMonth; 
            private Integer flowPackCountRemain; 
            private Integer maxUsableDefenseCountCurrentMonth; 

            /**
             * DefenseCountTotalUsageOfCurrentMonth.
             */
            public Builder defenseCountTotalUsageOfCurrentMonth(Integer defenseCountTotalUsageOfCurrentMonth) {
                this.defenseCountTotalUsageOfCurrentMonth = defenseCountTotalUsageOfCurrentMonth;
                return this;
            }

            /**
             * FlowPackCountRemain.
             */
            public Builder flowPackCountRemain(Integer flowPackCountRemain) {
                this.flowPackCountRemain = flowPackCountRemain;
                return this;
            }

            /**
             * MaxUsableDefenseCountCurrentMonth.
             */
            public Builder maxUsableDefenseCountCurrentMonth(Integer maxUsableDefenseCountCurrentMonth) {
                this.maxUsableDefenseCountCurrentMonth = maxUsableDefenseCountCurrentMonth;
                return this;
            }

            public DefenseCountStatistics build() {
                return new DefenseCountStatistics(this);
            } 

        } 

    }
}
