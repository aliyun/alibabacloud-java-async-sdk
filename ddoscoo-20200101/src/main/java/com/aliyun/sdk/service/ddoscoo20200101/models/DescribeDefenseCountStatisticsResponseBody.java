// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
         * The statistics on the number of advanced mitigation sessions.
         */
        public Builder defenseCountStatistics(DefenseCountStatistics defenseCountStatistics) {
            this.defenseCountStatistics = defenseCountStatistics;
            return this;
        }

        /**
         * The ID of the request.
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

        @NameInMap("SecHighSpeedCountRemain")
        private Integer secHighSpeedCountRemain;

        private DefenseCountStatistics(Builder builder) {
            this.defenseCountTotalUsageOfCurrentMonth = builder.defenseCountTotalUsageOfCurrentMonth;
            this.flowPackCountRemain = builder.flowPackCountRemain;
            this.maxUsableDefenseCountCurrentMonth = builder.maxUsableDefenseCountCurrentMonth;
            this.secHighSpeedCountRemain = builder.secHighSpeedCountRemain;
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

        /**
         * @return secHighSpeedCountRemain
         */
        public Integer getSecHighSpeedCountRemain() {
            return this.secHighSpeedCountRemain;
        }

        public static final class Builder {
            private Integer defenseCountTotalUsageOfCurrentMonth; 
            private Integer flowPackCountRemain; 
            private Integer maxUsableDefenseCountCurrentMonth; 
            private Integer secHighSpeedCountRemain; 

            /**
             * The number of advanced mitigation sessions that are used within the current calendar month.
             */
            public Builder defenseCountTotalUsageOfCurrentMonth(Integer defenseCountTotalUsageOfCurrentMonth) {
                this.defenseCountTotalUsageOfCurrentMonth = defenseCountTotalUsageOfCurrentMonth;
                return this;
            }

            /**
             * The number of available global advanced mitigation sessions for the Insurance mitigation plan.
             */
            public Builder flowPackCountRemain(Integer flowPackCountRemain) {
                this.flowPackCountRemain = flowPackCountRemain;
                return this;
            }

            /**
             * The maximum number of advanced mitigation sessions available for the current calendar month. The advanced mitigation sessions include the advanced mitigation sessions that are provided free of charge and the global advanced mitigation sessions that you purchase.
             */
            public Builder maxUsableDefenseCountCurrentMonth(Integer maxUsableDefenseCountCurrentMonth) {
                this.maxUsableDefenseCountCurrentMonth = maxUsableDefenseCountCurrentMonth;
                return this;
            }

            /**
             * The number of available global advanced mitigation sessions for the Secure Chinese Mainland Acceleration (Sec-CMA) mitigation plan.
             */
            public Builder secHighSpeedCountRemain(Integer secHighSpeedCountRemain) {
                this.secHighSpeedCountRemain = secHighSpeedCountRemain;
                return this;
            }

            public DefenseCountStatistics build() {
                return new DefenseCountStatistics(this);
            } 

        } 

    }
}
