// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDefenseCountStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDefenseCountStatisticsResponseBody</p>
 */
public class DescribeDefenseCountStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefenseCountStatistics")
    private DefenseCountStatistics defenseCountStatistics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The statistics on the number of advanced mitigation sessions.</p>
         */
        public Builder defenseCountStatistics(DefenseCountStatistics defenseCountStatistics) {
            this.defenseCountStatistics = defenseCountStatistics;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>310A41FD-0990-5610-92E0-A6A55D7C6444</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDefenseCountStatisticsResponseBody build() {
            return new DescribeDefenseCountStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDefenseCountStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDefenseCountStatisticsResponseBody</p>
     */
    public static class DefenseCountStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenseCountTotalUsageOfCurrentMonth")
        private Integer defenseCountTotalUsageOfCurrentMonth;

        @com.aliyun.core.annotation.NameInMap("FlowPackCountRemain")
        private Integer flowPackCountRemain;

        @com.aliyun.core.annotation.NameInMap("MaxUsableDefenseCountCurrentMonth")
        private Integer maxUsableDefenseCountCurrentMonth;

        @com.aliyun.core.annotation.NameInMap("SecHighSpeedCountRemain")
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
             * <p>The number of advanced mitigation sessions that are used within the current calendar month.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder defenseCountTotalUsageOfCurrentMonth(Integer defenseCountTotalUsageOfCurrentMonth) {
                this.defenseCountTotalUsageOfCurrentMonth = defenseCountTotalUsageOfCurrentMonth;
                return this;
            }

            /**
             * <p>The number of available global advanced mitigation sessions for the Insurance mitigation plan.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder flowPackCountRemain(Integer flowPackCountRemain) {
                this.flowPackCountRemain = flowPackCountRemain;
                return this;
            }

            /**
             * <p>The maximum number of advanced mitigation sessions available for the current calendar month. The advanced mitigation sessions include the advanced mitigation sessions that are provided free of charge and the global advanced mitigation sessions that you purchase.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxUsableDefenseCountCurrentMonth(Integer maxUsableDefenseCountCurrentMonth) {
                this.maxUsableDefenseCountCurrentMonth = maxUsableDefenseCountCurrentMonth;
                return this;
            }

            /**
             * <p>The number of available global advanced mitigation sessions for the Secure Chinese Mainland Acceleration (Sec-CMA) mitigation plan.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
